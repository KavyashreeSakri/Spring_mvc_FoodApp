package springmvc_food_app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc_food_app.dto.Menu;

@Repository
public class MenuDao {

	@Autowired
	private EntityManager entityManager;

	public Menu saveMenu(Menu menu) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return menu;

	}

	public Menu getMenuById(int id) {
		return entityManager.find(Menu.class, id);
	}
	


}
