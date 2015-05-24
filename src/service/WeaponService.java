package service;

import java.util.List;

import domain.Weapon;

public interface WeaponService {

	public void addWeapon(Weapon weapon);

	public List<Weapon> listWeapon();

	public void editWeapon(Weapon weapon);

	public void removeWeapon(String model);

}
