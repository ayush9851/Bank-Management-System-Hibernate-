package com.bms.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("bmsPU");

	public static EntityManagerFactory getEMF() {
		return emf;
	}
}