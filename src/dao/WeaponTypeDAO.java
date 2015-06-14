package dao;

import java.util.List;

import domain.WeaponType;

public interface WeaponTypeDAO {

	public void addWeaponType(WeaponType weaponType);

	public List<WeaponType> listWeaponType();

	public void editWeaponType(WeaponType weaponType);

	public void removeWeaponType(int idWeaponType);
}
