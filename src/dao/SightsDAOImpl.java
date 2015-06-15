package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Sights;

@Repository
public class SightsDAOImpl implements SightsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addSight(Sights sights) {
		sessionFactory.getCurrentSession().save(sights);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sights> listSights() {
		return sessionFactory.getCurrentSession().createQuery("from sights")
				.list();
	}

	@Override
	public void editSight(Sights sight) {
		sessionFactory.getCurrentSession().createQuery(
				"edit sights where title ");
	}

	@Override
	public void removeSight(int idSights) {
		Sights sights = (Sights) sessionFactory.getCurrentSession().load(
				Sights.class, idSights);
		if (null != sights) {
			sessionFactory.getCurrentSession().delete(sights);
		}
	}

}
