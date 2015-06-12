/**
 * 
 */
package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * @author bombus
 * 
 */

@Entity
@Table(name = "weapons")
public class Weapon implements Serializable {

	private static final long serialVersionUID = -1106211065892994L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idweapon", unique = true, nullable = false)
	private int idWeapon;

	@Column(name = "model", nullable = false)
	private String model;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "calibre_idcalibre", nullable = false)
	private Calibre calibre;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "weapon_type_idweapon_type", nullable = false)
	private WeaponType weaponType;

	@Column(name = "type_of_dice", nullable = false)
	private int typeOfDice;

	@Column(name = "number_of_dice", nullable = false)
	private int numberOfDice;

	@Column(name = "add_weapon_damage", nullable = false)
	private int addWeaponDamage;

	@Column(name = "penalty", nullable = false)
	private int penalty;

	@Column(name = "rate_of_fire", nullable = false)
	private float rateOfFire;

	@Column(name = "single_fire", nullable = false, columnDefinition = "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean singleFire;

	@Column(name = "automatic_fire", nullable = false, columnDefinition = "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean automaticFire;

	@Column(name = "burst_fire", nullable = false)
	private int burstFire;

	@Column(name = "range", nullable = false)
	private int range;

	@Column(name = "weight_of_weapon", nullable = false)
	private float weightOfWeapon;

	@Column(name = "critical_hit", nullable = false)
	private int criticalHit;

	@Column(name = "critical_miss", nullable = false)
	private int criticalMiss;

	@Column(name = "price_weapon", nullable = false)
	private int priceOfWeapon;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "calibreCatridge")
	private List<Catridge> catridge;

	public Weapon() {

	}

	public Weapon(String model, Calibre calibre, WeaponType weaponType,
			int typeOfDice, int numberOfDice, int addWeaponDamage, int penalty,
			float rateOfFire, boolean singleFire, boolean automaticFire,
			int burstFire, int range, float weightOfWeapon, int criticalHit,
			int criticalMiss, int priceOfWeapon) {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Calibre getCalibre() {
		return calibre;
	}

	public void setCalibre(Calibre calibre) {
		this.calibre = calibre;
	}

	public WeaponType getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	public int getTypeOfDice() {
		return typeOfDice;
	}

	public void setTypeOfDice(int typeOfDice) {
		this.typeOfDice = typeOfDice;
	}

	public int getNumberOfDice() {
		return numberOfDice;
	}

	public void setNumberOfDice(int numberOfDice) {
		this.numberOfDice = numberOfDice;
	}

	public int getAddWeaponDamage() {
		return addWeaponDamage;
	}

	public void setAddWeaponDamage(int addWeaponDamage) {
		this.addWeaponDamage = addWeaponDamage;
	}

	public int getPenalty() {
		return penalty;
	}

	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}

	public float getRateOfFire() {
		return rateOfFire;
	}

	public void setRateOfFire(float rateOfFire) {
		this.rateOfFire = rateOfFire;
	}

	public boolean isSingleFire() {
		return singleFire;
	}

	public void setSingleFire(boolean singleFire) {
		this.singleFire = singleFire;
	}

	public boolean isAutomaticFire() {
		return automaticFire;
	}

	public void setAutomaticFire(boolean automaticFire) {
		this.automaticFire = automaticFire;
	}

	public int getBurstFire() {
		return burstFire;
	}

	public void setBurstFire(int burstFire) {
		this.burstFire = burstFire;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public float getWeightOfWeapon() {
		return weightOfWeapon;
	}

	public void setWeightOfWeapon(float weightOfWeapon) {
		this.weightOfWeapon = weightOfWeapon;
	}

	public int getCriticalHit() {
		return criticalHit;
	}

	public void setCriticalHit(int criticalHit) {
		this.criticalHit = criticalHit;
	}

	public int getCriticalMiss() {
		return criticalMiss;
	}

	public void setCriticalMiss(int criticalMiss) {
		this.criticalMiss = criticalMiss;
	}

	public int getPriceOfWeapon() {
		return priceOfWeapon;
	}

	public void setPriceOfWeapon(int priceOfWeapon) {
		this.priceOfWeapon = priceOfWeapon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
