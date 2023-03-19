package com.jacaranda.datos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.jacaranda.model.Alumno;

public class EscribeArchivo {

	public static void add(Alumno a, String path) throws IOException{
		 File archivo;
		 FileWriter fw=null;
		 PrintWriter pw=null;
		 try{
			 archivo = new File(path);
			 fw = new FileWriter(archivo, true);
			 pw = new PrintWriter( fw );
			 pw.println(a.getNombre()+","+a.getApellidos()+"," +a.getPromedio() );
		 }catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 try{
				 if( pw != null)
					 pw.close();
			 } catch(Exception e2){
				 e2.printStackTrace();}
		 	}
	}
}
