package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int usuario = 2512;
		int contraseña = 2004;
		int usu;
		int contr;
		
		System.out.println("Bienvenido, inicie sesión por favor");
		
		System.out.println("Usuario: ");
		usu = Leer.datoInt();
		
		System.out.println("Contraseña: ");
		contr = Leer.datoInt();
		
		if (usuario == usu && contraseña == contr) {
			System.out.println("Has iniciado sesión");
		}else {
			System.out.println("El usuario o contraseña son incorrectos");
		}
	}

}
