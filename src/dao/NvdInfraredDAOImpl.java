package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.NvdInfrared;

@Repository
public class NvdInfraredDAOImpl implements NvdInfraredDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addNVDInfrared(NvdInfrared nvdInfrared) {
		sessionFactory.getCurrentSession().save(nvdInfrared);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NvdInfrared> listNvdInfrared() {
		return sessionFactory.getCurrentSession()
				.createQuery("from nvd_infrared").list();
	}

	@Override
	public void editNvdInfrared(NvdInfrared nvdInfrared) {
		sessionFactory.getCurrentSession().createQuery("edit  where title");
	}

	@Override
	public void removeNvdInfrared(int idNVDInfrared) {
		NvdInfrared nvdInfrared = (NvdInfrared) sessionFactory.getCurrentSession().load(
				NvdInfrared.class, idNVDInfrared);
		if (null != nvdInfrared) {
			sessionFactory.getCurrentSession().delete(nvdInfrared);
		}
	}

}
