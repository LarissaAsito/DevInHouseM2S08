package repository;

import java.util.ArrayList;

import model.Empresa;

public class EmpresaRepository {
private static ArrayList<Empresa> empresas = new ArrayList<>();
	
	public static boolean addEmpresa(Empresa empresa) {
		return empresas.add(empresa);
	}
	
	public static ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

}
