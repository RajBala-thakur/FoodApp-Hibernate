package com.ty.dao;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Menu;

	public class FoodOrderDao {
		
		public FoodOrder saveMenu(FoodOrder foodOrder) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(foodOrder);
			entityTransaction.commit();

			return foodOrder;
		}

	}


