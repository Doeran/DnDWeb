package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

import domain.Weapon;

@Repository
public class WeaponDAOImpl implements WeaponDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addWeapon(Weapon weapon) {
		sessionFactory.getCurrentSession().save(weapon);
		// TODO Auto-generated method stub
		
	}

	@Override
	@SuppressWarnings ("unchecked")
	public List<Weapon> listWeapon() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from weapontabl").list();
	}

	@Override
	public void editWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("edit weapon where ");
		
	}

	@Override
	public void removeWeapon(String model) {
		// TODO Auto-generated method stub
		Weapon weapon =(Weapon) sessionFactory.getCurrentSession().load(Weapon.class, model);
		if (null != weapon) {
			sessionFactory.getCurrentSession().delete(weapon);
		}
	}
	
}
