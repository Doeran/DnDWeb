package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Catridge;

@Repository
public class CatridgeDAOImpl implements CatridgeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCatridge(Catridge catridge) {
		sessionFactory.getCurrentSession().save(catridge);

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Catridge> listCatridge() {
		return sessionFactory.getCurrentSession().createQuery("from catrige")
				.list();
	}

	@Override
	public void editCatridge(Catridge catridge) {
		sessionFactory.getCurrentSession().createQuery("edit weapon where ");
	}

	@Override
	public void removeCatridge(int idCatridge) {
		Catridge catridge = (Catridge) sessionFactory.getCurrentSession().load(
				Catridge.class, idCatridge);
		if (null != catridge) {
			sessionFactory.getCurrentSession().delete(catridge);
		}
	}

}
