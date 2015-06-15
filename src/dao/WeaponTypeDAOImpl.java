package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.WeaponType;

@Repository
public class WeaponTypeDAOImpl implements WeaponTypeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addWeaponType(WeaponType weaponType) {
		sessionFactory.getCurrentSession().save(weaponType);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WeaponType> listWeaponType() {
		return sessionFactory.getCurrentSession()
				.createQuery("from weapon_type where title").list();
	}

	@Override
	public void editWeaponType(WeaponType weaponType) {
		sessionFactory.getCurrentSession().createQuery("edit weapon where ");
	}

	@Override
	public void removeWeaponType(int idWeaponType) {
		WeaponType weaponType = (WeaponType) sessionFactory.getCurrentSession().load(
				WeaponType.class, idWeaponType);
		if (null != weaponType) {
			sessionFactory.getCurrentSession().delete(weaponType);
		}
	}

}
