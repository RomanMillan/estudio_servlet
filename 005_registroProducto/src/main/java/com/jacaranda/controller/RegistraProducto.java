package com.jacaranda.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jacaranda.data.EscribeArchivo;
import com.jacaranda.model.Producto;

@WebServlet("/RegistraProducto")
public class RegistraProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistraProducto() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		obtenemos los parametros de index.jsp
		String clave = request.getParameter("clave");
		String nombre = request.getParameter("nombre");
		Double precio = Double.parseDouble(request.getParameter("precio"));
		int cantidad = Integer.parseInt(request.getParameter("cantidad"));
		
//		creamos con esos parametros un objeto producto.
		Producto producto = new Producto(clave, nombre, precio, cantidad);
		
//		guardamos el producto en una base de datos (archivo txt)
		String path = "C:\\Users\\roman\\OneDrive\\Escritorio\\DAW2\\Desarrollo web Ent servidor\\2do Trimestre\\estudio_JSP-SERVLET\\005_registroProducto\\src\\main\\webapp\\productos.txt";
		path = path.replace("\\", "/");
		
		EscribeArchivo.add(producto, path);
		
//		Enviamos la respuesta (el objeto producto)
		request.setAttribute("atributeProducto",producto);
		request.getRequestDispatcher("/muestraRegistro.jsp").forward(request, response);
		
	}

}
