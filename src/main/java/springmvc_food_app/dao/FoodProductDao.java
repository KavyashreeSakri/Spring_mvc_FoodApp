package springmvc_food_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc_food_app.dto.FoodProduct;
import springmvc_food_app.dto.Menu;

@Repository
public class FoodProductDao {
	@Autowired
	private EntityManager eManager;
	
	public FoodProduct savefoodProduct(FoodProduct foodProduct,Menu menu) {
		  EntityTransaction eTransaction=eManager.getTransaction();
		   foodProduct.setMenu(menu);
		   eTransaction.begin();
		   eManager.persist(foodProduct);
		   eTransaction.commit();
		   return foodProduct;
	}
	
	public FoodProduct updateFoodProduct(FoodProduct foodProduct,Menu menu) {
		EntityTransaction eTransaction=eManager.getTransaction();
		     foodProduct.setMenu(menu);
		   eTransaction.begin();
		   eManager.merge(foodProduct);
		   eTransaction.commit();
		   return foodProduct;
		
	}
	
	public boolean deleteFoodProduct(int id) {
		 EntityTransaction eTransaction=eManager.getTransaction();
		  FoodProduct foodProduct=eManager.find(FoodProduct.class, id);
		  if(foodProduct!=null) {
			  eTransaction.begin();
			  eManager.remove(foodProduct);
			  eTransaction.commit();
			  return true;
			   
		  }
		  else 
			  return false;
	}
	
	public List<FoodProduct> getAllFoodProducts(){
		 Query query=eManager.createQuery("select f from FoodProduct f ");
		  List<FoodProduct> list=query.getResultList();
		  return list;
	}
	
	public FoodProduct getFoodProductById(int id) {
		return eManager.find(FoodProduct.class, id);
	}
	
	

}
