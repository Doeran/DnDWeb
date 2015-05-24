package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Silencer;


@Repository
public class SilencerDAOImpl implements SilencerDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
		
	@Override
	public void addSilencer(Silencer silencer) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(silencer);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List <Silencer> listSilencer() {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().createQuery("from silencer").list();
	}

	@Override
	public void editSilencer(Silencer silencer) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().createQuery("edit silencer where");
	}

	@Override
	public void removeSilencer(String calibre) {
		// TODO Auto-generated method stub
		Silencer silencer = (Silencer) sessionfactory.getCurrentSession().load(Silencer.class, calibre);
		if (null != silencer) {
			sessionfactory.getCurrentSession().delete(silencer);
		}
	}

}
