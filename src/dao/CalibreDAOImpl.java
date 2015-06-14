package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Calibre;

@Repository
public class CalibreDAOImpl implements CalibreDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCalibre(Calibre calibre) {
		sessionFactory.getCurrentSession().save(calibre);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Calibre> listCalibre() {
		return sessionFactory.getCurrentSession().createQuery("from calibre")
				.list();
	}

	@Override
	public void editCalibre(Calibre calibre) {
		sessionFactory.getCurrentSession().createQuery("edit calibre where");
	}

	@Override
	public void removeBullet(int idcalibre) {
		Calibre calibre = (Calibre) sessionFactory.getCurrentSession().load(
				Calibre.class, idcalibre);
		if (null != calibre) {
			sessionFactory.getCurrentSession().delete(calibre);
		}
	}

}
