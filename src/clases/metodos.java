package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class metodos {

    public static void agregarDatos(Object[] datos, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo, true)) {
            for (Object dato : datos) {
                writer.write(dato.toString());
                writer.write("\t"); // Separador de columnas (puedes cambiarlo a tu preferencia)
            }
            writer.write(System.lineSeparator()); // Nueva línea

            System.out.println("Los datos se han agregado al archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al agregar los datos al archivo: " + nombreArchivo);
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    //ejemplo de la aplicacion del metodo
    //busscarDatoArchivo("reservas",1,"5");
    public static boolean buscarDatoEnArchivo(String nombreArchivo, int numeroColumna, String datoBuscado) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] columnas = linea.split("\t");
                if (columnas.length > numeroColumna - 1 && columnas[numeroColumna - 1].equals(datoBuscado)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return false;
    }
    
    
    public static void mostrarDatosEnTabla(JTable tabla, String nombreArchivo) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] columnas = linea.split("\t");
                model.addRow(columnas);
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void guardarDatosTabla(JTable table, String filePath) {
        try {
            try (FileWriter writer = new FileWriter(filePath)) {
                int rowCount = table.getRowCount();
                int colCount = table.getColumnCount();

                // Escribir datos de la tabla (sin encabezados)
                for (int row = 0; row < rowCount; row++) {
                    for (int col = 0; col < colCount; col++) {
                        Object value = table.getValueAt(row, col);
                        writer.write(value.toString() + "\t");
                    }
                    writer.write("\n");
                }
            }
//            System.out.println("Tabla guardada exitosamente en: " + filePath);
        } catch (IOException e) {
            System.err.println("Error al guardar la tabla en el archivo: " + e.getMessage());
        }
    }

    public static double sumarColumna(String nombreArchivo, int numeroColumna) {
        double suma = 0.0;
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] columnas = linea.split("\t");
                if (columnas.length > numeroColumna - 1) {
                    try {
                        double dato = Double.parseDouble(columnas[numeroColumna - 1]);
                        suma += dato;
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: No se pudo convertir a double en la línea: " + linea);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return suma;
    }

}
