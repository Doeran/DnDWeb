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
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Weapon> listWeapon() {
		return sessionFactory.getCurrentSession()
				.createQuery("from weapon").list();
	}

	@Override
	public void editWeapon(Weapon weapon) {
		sessionFactory.getCurrentSession().createQuery("edit weapon where ");
	}

	@Override
	public void removeWeapon(int idWeapon) {
		Weapon weapon = (Weapon) sessionFactory.getCurrentSession().load(
				Weapon.class, idWeapon);
		if (null != weapon) {
			sessionFactory.getCurrentSession().delete(weapon);
		}
	}
}