package br.com.Alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/NovaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		String novaEmpresa = req.getParameter("nome");
		Empresa e = new Empresa();
		e.setNome(novaEmpresa);
		
		Banco banco = new Banco();
		banco.adicionaEmpresa(e);
		req.setAttribute("empresa", e.getNome()); // pendurar nome da empresa na requisição
		resp.sendRedirect("listaEmpresas");
		
//		RequestDispatcher rd  = req.getRequestDispatcher("/listaEmpresas"); // despachador de requisição
//		req.setAttribute("empresa", e.getNome());
//		rd.forward(req, resp);
		
	}

}
