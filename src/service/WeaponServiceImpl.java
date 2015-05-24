package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.WeaponDAO;
import domain.Weapon;


@Service
public class WeaponServiceImpl implements WeaponService {

	
	@Autowired
	private WeaponDAO weaponDAO;
	
	@Override
	@Transactional
	public void addWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		weaponDAO.addWeapon(weapon);
	}

	@Override
	@Transactional
	public List<Weapon> listWeapon() {
		// TODO Auto-generated method stub
		return weaponDAO.listWeapon();
	}

	@Override
	@Transactional
	public void editWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void removeWeapon(String model) {
		// TODO Auto-generated method stub
	weaponDAO.removeWeapon(model);
		
	}
	
	
	

}
