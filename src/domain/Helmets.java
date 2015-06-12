package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "helmets")
public class Helmets implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 823709641137052775L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idhelmets", unique = true, nullable = false)
	private int idHelmets;

	@Column(name = "title", nullable = false, length = 45)
	private String titleOfHelmet;

	@Column(name = "armor_bonus", nullable = false)
	private int armorBonusOfHalmet;

	@Column(name = "weight_of_helmet", nullable = false)
	private float weightOfHalmet;

	@Column(name = "class_helmet", nullable = false)
	private float classOfHalmet;

	@Column(name = "bonus_protection_helmet", nullable = false)
	private int bonusOfProtectionHalmet;

	@Column(name = "penalty_skills_helmet", nullable = false)
	private int penaltySkillsHelmet;

	@Column(name = "price_helmet", nullable = false)
	private int priceOfHelmet;

	public Helmets() {
	}

	public Helmets(String titleOfHelmet, int armorBonusOfHelmet,
			float weightOfHelmet, float classOfHelmet,
			int bonusOfProtectionHalmet, int penaltySkillsHelmet,
			int priceOfHelmet) {
		this.titleOfHelmet = titleOfHelmet;
		this.armorBonusOfHalmet = armorBonusOfHelmet;
		this.weightOfHalmet = weightOfHelmet;
		this.classOfHalmet = classOfHelmet;
		this.bonusOfProtectionHalmet = bonusOfProtectionHalmet;
		this.penaltySkillsHelmet = penaltySkillsHelmet;
		this.priceOfHelmet = priceOfHelmet;
	}

	public int getIdHelmets() {
		return idHelmets;
	}

	public void setIdHelmets(int idHelmets) {
		this.idHelmets = idHelmets;
	}

	public String getTitleOfHelmet() {
		return titleOfHelmet;
	}

	public void setTitleOfHelmet(String titleOfHelmet) {
		this.titleOfHelmet = titleOfHelmet;
	}

	public int getArmorBonusOfHalmet() {
		return armorBonusOfHalmet;
	}

	public void setArmorBonusOfHalmet(int armorBonusOfHalmet) {
		this.armorBonusOfHalmet = armorBonusOfHalmet;
	}

	public float getWeightOfHalmet() {
		return weightOfHalmet;
	}

	public void setWeightOfHalmet(float weightOfHalmet) {
		this.weightOfHalmet = weightOfHalmet;
	}

	public float getClassOfHalmet() {
		return classOfHalmet;
	}

	public void setClassOfHalmet(float classOfHalmet) {
		this.classOfHalmet = classOfHalmet;
	}

	public int getBonusOfProtectionHalmet() {
		return bonusOfProtectionHalmet;
	}

	public void setBonusOfProtectionHalmet(int bonusOfProtectionHalmet) {
		this.bonusOfProtectionHalmet = bonusOfProtectionHalmet;
	}

	public int getPenaltySkillsHelmet() {
		return penaltySkillsHelmet;
	}

	public void setPenaltySkillsHelmet(int penaltySkillsHelmet) {
		this.penaltySkillsHelmet = penaltySkillsHelmet;
	}

	public int getPriceOfHelmet() {
		return priceOfHelmet;
	}

	public void setPriceOfHelmet(int priceOfHelmet) {
		this.priceOfHelmet = priceOfHelmet;
	}

}
