package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Helmets;

@Repository
public class HelmetsDAOImpl implements HelmetsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addHelmets(Helmets helmets) {
		sessionFactory.getCurrentSession().save(helmets);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Helmets> listHelmets() {
		return sessionFactory.getCurrentSession().createQuery("from helmets")
				.list();
	}

	@Override
	public void editHelmets(Helmets helmets) {
		sessionFactory.getCurrentSession().createQuery("edit helmets where ");
	}

	@Override
	public void removeHelmet(int idHelmets) {
		Helmets helmets = (Helmets) sessionFactory.getCurrentSession().load(
				Helmets.class, idHelmets);
		if (null != helmets) {
			sessionFactory.getCurrentSession().delete(helmets);
		}
	}

}
