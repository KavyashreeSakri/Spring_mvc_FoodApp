package springmvc_food_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc_food_app.dto.Branch;

@Repository
public class BranchDao {

	@Autowired
	private EntityManager entityManager;

	public List<Branch> getAllBranches() {
		Query query = entityManager.createQuery("SELECT b FROM Branch b");
		List<Branch> list = query.getResultList();
		return list;

	}

}
