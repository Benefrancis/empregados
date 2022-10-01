package br.com.fiap.tads.ddd.empregados;

import br.com.fiap.tads.ddd.empregados.model.dao.EmpregadoDAO;

public class App {

	public static void main(String[] args) {

		EmpregadoDAO.findAll().stream().forEach(System.out::println);

	}

}
