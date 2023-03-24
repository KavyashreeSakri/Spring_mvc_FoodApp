package springmvc_food_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc_food_app.dto.Branch;
import springmvc_food_app.dto.User;
@Repository
public class BranchDao {

	@Autowired
	private EntityManager eManager;

	public Branch saveBranch(Branch branch,User user) {
		EntityTransaction eTransaction = eManager.getTransaction();
		branch.setUser(user);
		eTransaction.begin();
		eManager.persist(branch);
		eTransaction.commit();
		return branch;
	}

	public List<Branch> getAllBranch() {
		Query query = eManager.createQuery("select b from Branch b");
		List<Branch> list = query.getResultList();
		return list;
	}

	public Branch getBranchById(int id) {
		return eManager.find(Branch.class, id);
	}

	public Branch updateBranch(int id) {
		EntityTransaction eTransaction = eManager.getTransaction();
		Branch branch = eManager.find(Branch.class, id);
		eTransaction.begin();
		eManager.merge(branch);
		eTransaction.commit();
		return branch;
	}

	public boolean deleteBranch(int id) {
		EntityTransaction eTransaction = eManager.getTransaction();
		Branch branch = eManager.find(Branch.class, id);
		if (branch != null) {
			eTransaction.begin();
			eManager.remove(branch);
			eTransaction.commit();
			return true;
		} else
			return false;
	}
}
