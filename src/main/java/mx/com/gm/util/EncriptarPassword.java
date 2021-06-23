package mx.com.gm.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
	public static void main(String[] args) {
	
		var password = "1234";
		System.out.print(encriptarPassword(password));
		//AGREGAR CREACION DE USUARIOS Y ENCRIPTACION
	} 
	
	public static String encriptarPassword(String password) {
		BCryptPasswordEncoder enconder = new BCryptPasswordEncoder();
		return enconder.encode(password);
	}
}
