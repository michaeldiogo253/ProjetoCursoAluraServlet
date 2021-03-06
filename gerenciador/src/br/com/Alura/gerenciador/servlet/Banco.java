package br.com.Alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	static {
		Empresa e1 = new Empresa();
		e1.setNome("Google");
		e1.setId(chaveSequencial++);
		Empresa e2 = new Empresa();
		e2.setId(chaveSequencial++);
		e2.setNome("Apple");
		
		lista.add(e2);
		lista.add(e1);
	}

	public void adicionaEmpresa(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);

	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		 Iterator<Empresa> it = lista.iterator();

		    while(it.hasNext()) { 
		        Empresa emp = it.next();

		        if(emp.getId() == id ) {
		            it.remove();
		        }
		    }
	}

	public Empresa buscaEmpresaId(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	

}
