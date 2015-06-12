package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "armor")
public class Armor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3915913233399843007L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idarmor", nullable = false, unique = true)
	private int idArmor;

	@Column(name = "title", nullable = false, length = 45)
	private String title;

	@Column(name = "armor_class", nullable = false)
	private float armorClass;

	@Column(name = "weight_of_armor", nullable = false)
	private float weightOfArmor;

	@Column(name = "bonus_protection", nullable = false)
	private int bonusProtection;

	@Column(name = "penalty_to_skills", nullable = false)
	private int penaltyToSkills;

	@Column(name = "light", nullable = false, columnDefinition = "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean lightArmor;

	@Column(name = "medium", nullable = false, columnDefinition = "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean mediumArmor;

	@Column(name = "single_fire", nullable = false, columnDefinition = "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean heavyArmor;

	@Column(name = "price_armor", nullable = false)
	private int priceArmor;

	public Armor() {
	}

	public Armor(String title, float armorClass, float weightOfArmor,
			int bonusProtection, int penaltyToSkills, boolean lightArmor,
			boolean mediumArmor, boolean heavyArmor, int priceArmor) {
		this.title = title;
		this.armorClass = armorClass;
		this.weightOfArmor = weightOfArmor;
		this.bonusProtection = bonusProtection;
		this.penaltyToSkills = penaltyToSkills;
		this.lightArmor = lightArmor;
		this.mediumArmor = mediumArmor;
		this.heavyArmor = heavyArmor;
		this.priceArmor = priceArmor;
	}

	public int getIdArmor() {
		return idArmor;
	}

	public void setIdArmor(int idArmor) {
		this.idArmor = idArmor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(float armorClass) {
		this.armorClass = armorClass;
	}

	public float getWeightOfArmor() {
		return weightOfArmor;
	}

	public void setWeightOfArmor(float weightOfArmor) {
		this.weightOfArmor = weightOfArmor;
	}

	public int getBonusProtection() {
		return bonusProtection;
	}

	public void setBonusProtection(int bonusProtection) {
		this.bonusProtection = bonusProtection;
	}

	public int getPenaltyToSkills() {
		return penaltyToSkills;
	}

	public void setPenaltyToSkills(int penaltyToSkills) {
		this.penaltyToSkills = penaltyToSkills;
	}

	public boolean isLightArmor() {
		return lightArmor;
	}

	public void setLightArmor(boolean lightArmor) {
		this.lightArmor = lightArmor;
	}

	public boolean isMediumArmor() {
		return mediumArmor;
	}

	public void setMediumArmor(boolean mediumArmor) {
		this.mediumArmor = mediumArmor;
	}

	public boolean isHeavyArmor() {
		return heavyArmor;
	}

	public void setHeavyArmor(boolean heavyArmor) {
		this.heavyArmor = heavyArmor;
	}

	public int getPriceArmor() {
		return priceArmor;
	}

	public void setPriceArmor(int priceArmor) {
		this.priceArmor = priceArmor;
	}

}
