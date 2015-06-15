package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Ammo;

@Repository
public class AmmoDAOImpl implements AmmoDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addAmmo(Ammo ammo) {
		sessionFactory.getCurrentSession().save(ammo);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Ammo> listAmmo() {
		return sessionFactory.getCurrentSession().createQuery("from ammo")
				.list();
	}

	@Override
	public void editAmmo(Ammo ammo) {
		sessionFactory.getCurrentSession().createQuery("edit ammo where ");
	}

	@Override
	public void removeAmmo(int idAmmo) {
		Ammo ammo = (Ammo) sessionFactory.getCurrentSession().load(Ammo.class,
				idAmmo);
		if (null != ammo) {
			sessionFactory.getCurrentSession().delete(ammo);
		}
	}

}
