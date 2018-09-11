import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClasePpal {

	public static void main(String[] args) {
		String ruta="C:\\pisos\\";
		String[] nombre_imagenes=obtenerImagenes(ruta+"\\imagenes");
		String html_pagina=crearHTML(nombre_imagenes);
		generarFichero(ruta, html_pagina);
	}

	private static void generarFichero(String ruta, String html_pagina) {
		String nombre_fichero="inmobiliaria.html";
		try {
			FileWriter fw=new FileWriter(ruta+nombre_fichero, false);
			fw.write(html_pagina);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static String crearHTML(String[] nombre_imagenes) {
		String html="<html><head></head><body>";
		for (int i=0; i<nombre_imagenes.length; i++)
		{
			html+="<img src='imagenes\\"+nombre_imagenes[i]+"'><br>";
		}
		html+="</body></html>";
		return html;
	}

	private static String[] obtenerImagenes(String ruta) {
		File f=new File(ruta);
		return f.list();
	}

}
