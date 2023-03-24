package springmvc_food_app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc_food_app.dto.User;

@Repository
public class UserDao {

	@Autowired
	private EntityManager entityManager;

	public User saveUser(User user) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUserByEmail(String email) {
		Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email=?1");
		query.setParameter(1, email);
		User user = (User) query.getSingleResult();
		
		return user;
	}
	public User getAdmin(String role) {
		Query query=entityManager.createQuery("select u from User u where u.role=?1");
		query.setParameter(1, role);
		User user= (User)query.getSingleResult();
		return user;
	}

}
