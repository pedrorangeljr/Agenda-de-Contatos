package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BeanContatos;
import dao.DaoContatos;

/**
 * Servlet implementation class ServletContato
 */
@WebServlet("/cadastroContatos")
public class ServletContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private DaoContatos daoContatos = new DaoContatos();
	
    public ServletContato() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			
			String acao = request.getParameter("acao");
			String contato = request.getParameter("contato");
			
			if(acao.equalsIgnoreCase("delete")) { // delete
				
				daoContatos.deletar(contato);
				
				RequestDispatcher view = request.getRequestDispatcher("principal.jsp");
				request.setAttribute("contatos", daoContatos.listar());
				view.forward(request, response);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		
		BeanContatos contatos = new BeanContatos();
		
		
		contatos.setNome(nome);
		contatos.setTelefone(telefone);
		contatos.setEmail(email);
		
		daoContatos.salvar(contatos);
		
		try {
			
			RequestDispatcher view = request.getRequestDispatcher("principal.jsp");
			request.setAttribute("contatos", daoContatos.listar());
			view.forward(request, response);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
