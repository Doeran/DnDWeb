package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Hats;

@Repository
public class HatsDAOImpl implements HatsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addHats(Hats hats) {
		sessionFactory.getCurrentSession().save(hats);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Hats> listHats() {
		return sessionFactory.getCurrentSession().createQuery("from hats")
				.list();
	}

	@Override
	public void editHats(Hats hats) {
		sessionFactory.getCurrentSession().createQuery("edit weapon where ");
	}

	@Override
	public void removeHats(int idHats) {
		Hats hats = (Hats) sessionFactory.getCurrentSession().load(Hats.class,
				idHats);
		if (null != hats) {
			sessionFactory.getCurrentSession().delete(hats);
		}
	}

}
