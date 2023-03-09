package com.jacaranda.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jacaranda.model.Alumno;

/**
 * Servlet implementation class MostarRegistro
 */
@WebServlet("/MostarRegistro")
public class MostarRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MostarRegistro() {
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
		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		Double promedio = Double.parseDouble(request.getParameter("promedio"));
		
		Alumno alumno = new Alumno(nombre,apellidos,promedio);
		
		request.setAttribute("atribAlumn",alumno);
		request.getRequestDispatcher("/mostrarDatos.jsp").forward(request, response);
		
		
	}

}
