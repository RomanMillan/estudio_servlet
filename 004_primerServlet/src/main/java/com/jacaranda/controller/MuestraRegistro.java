package com.jacaranda.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jacaranda.model.Alumno;

/**
 * Servlet implementation class MuestraRegistro
 */
@WebServlet("/MuestraRegistro")
public class MuestraRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MuestraRegistro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		int cont = 0;
		String contador;
		
//		ServletContext sc = this.getServletContext(); 
		String path = "C:\\Users\\roman\\OneDrive\\Escritorio\\DAW2\\Desarrollo web Ent servidor\\estudio_servlet\\004_primerServlet\\src\\main\\webapp\\Promedios.txt";
		path = path.replace('\\','/');
		alumnos = LeeArchivo.leeAlumnos(path);
		
		// Resetea la variable estática
		 LeeArchivo.clearCont();
		 cont = LeeArchivo.getCont();
		 contador = String.valueOf(cont);
		 
		 
		 request.setAttribute("Alumnos",alumnos);
		 request.setAttribute("contador", contador);
		 request.getRequestDispatcher("/alumnosRegistrados.jsp").forward(request, response);
		
	}

}
