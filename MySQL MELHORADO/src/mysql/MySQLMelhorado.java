package mysql;

import java.util.ArrayList;
import java.util.Scanner;

import dao.UsuarioDAO;

public class MySQLMelhorado {

	public static void main(String[] args) {

		System.out.println("===== INSERIR USU�RIO=====");
		Scanner sc = new Scanner(System.in);
		System.out.println("Forne�a o email: ");
		String email = sc.nextLine();
		System.out.println("Forne�a a senha: ");
		String senha = sc.nextLine();

		Usuario u = new Usuario();
		u.setEmail(email);
		u.setSenha(senha);

		boolean inserido = UsuarioDAO.inserirUsuario(u);
		if (inserido) {
			System.out.println("Usu�rio cadastrado com sucesso.");
		} else {
			System.out.println("Erro ao cadastrar o usu�rio. Tente novamente.");
		}
	}

}
