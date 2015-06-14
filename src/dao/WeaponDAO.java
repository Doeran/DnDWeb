package dao;

import java.util.List;

import domain.Weapon;

public interface WeaponDAO {

	public void addWeapon(Weapon weapon);

	public List<Weapon> listWeapon();

	public void editWeapon(Weapon weapon);

	public void removeWeapon(int idWeapon);

}
