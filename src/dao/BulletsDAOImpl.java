package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Bullets;


@Repository
public class BulletsDAOImpl implements BulletsDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
	
	@Override
	public void addBullet(Bullets bullet) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(bullet);
		
	}
	
	@SuppressWarnings ("unchecked")
	@Override
	public List<Bullets> listBullets() {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().createQuery("from bullets").list();
	}

	@Override
	public void editByllets(Bullets bullet) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().createQuery("edit bullets where");
		
	}

	@Override
	public void removeBullet(String calibre) {
		// TODO Auto-generated method stub
		Bullets bullet = (Bullets) sessionfactory.getCurrentSession().load(Bullets.class, calibre);
		if (null != bullet){
			sessionfactory.getCurrentSession().delete(bullet);
		}
		
	}

}
