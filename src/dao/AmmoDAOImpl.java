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
		// TODO Auto-generated method stub

	}

	@Override
	public List<Ammo> listAmmo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editAmmo(Ammo ammo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAmmo(int idAmmo) {
		// TODO Auto-generated method stub

	}

}
