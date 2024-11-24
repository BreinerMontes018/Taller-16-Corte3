package Taller16Poo.Ejercicio2;

public class DocumentoPDF extends Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando contenido a PDF: " + contenido);

    }
}
