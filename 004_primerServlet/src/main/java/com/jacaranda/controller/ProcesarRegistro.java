package com.jacaranda.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jacaranda.datos.EscribeArchivo;
import com.jacaranda.model.Alumno;

/**
 * Servlet implementation class MostarRegistro
 */
@WebServlet("/ProcesarRegistro")
public class ProcesarRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ProcesarRegistro() {
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		Double promedio = Double.parseDouble(request.getParameter("promedio"));
		
		Alumno alumno = new Alumno(nombre,apellidos,promedio);
		
		// ServletContext sc = this.getServletContext(); 
		String path = "C:\\Users\\roman\\OneDrive\\Escritorio\\DAW2\\Desarrollo web Ent servidor\\estudio_servlet\\004_primerServlet\\src\\main\\webapp\\Promedios.txt";
		path = path.replace('\\','/');
		
		// Guardar en archivo
		 EscribeArchivo.add(alumno, path);
		
		
		request.setAttribute("atribAlumn",alumno);
		request.getRequestDispatcher("/mostrarDatos.jsp").forward(request, response);
		
	}

}
