package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Armor;

@Repository
public class ArmorDAOImpl implements ArmorDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addArmor(ArmorDAO armor) {
		sessionFactory.getCurrentSession().save(armor);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ArmorDAO> listArmor() {
		return sessionFactory.getCurrentSession().createQuery("from armor")
				.list();
	}

	@Override
	public void editArmor(ArmorDAO armor) {
		sessionFactory.getCurrentSession().createQuery("edit armor where ");
	}

	@Override
	public void removeArmor(int idArmor) {
		Armor armor = (Armor) sessionFactory.getCurrentSession().load(
				Armor.class, idArmor);
		if (null != armor) {
			sessionFactory.getCurrentSession().delete(armor);
		}
	}

}
