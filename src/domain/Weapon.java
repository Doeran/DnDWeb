/**
 * 
 */
package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author bombus
 *
 */

@Entity
@Table (name = "weapontabl")
public class Weapon {
	
	@Column (name = "model")
	private String model;
	
	@Column (name = "calibre")
	private String calibre;
	
	@Column (name = "type")
	private String type;
	
	@Column (name = "numberDice")
	private int numberOfDices;
	
	@Column (name = "typedice")
	private int typeOfDices;
	
	@Column (name = "catridge")
	private int catridge;
	
	@Column (name = "modishoot")
	private int modOfShoot;
	
	@Column (name = "miss")
	private int miss;
	
	@Column (name = "crit")
	private int critical;
	
	@Column (name = "addcatridge")
	private int addCatridge;
	
	@Column (name = "moddamadge")
	private int modOfDamage;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfDices() {
		return numberOfDices;
	}

	public void setNumberOfDices(int numberOfDices) {
		this.numberOfDices = numberOfDices;
	}

	public int getTypeOfDices() {
		return typeOfDices;
	}

	public void setTypeOfDices(int typeOfDices) {
		this.typeOfDices = typeOfDices;
	}

	public int getCatridge() {
		return catridge;
	}

	public void setCatridge(int catridge) {
		this.catridge = catridge;
	}

	public int getModOfShoot() {
		return modOfShoot;
	}

	public void setModOfShoot(int modOfShoot) {
		this.modOfShoot = modOfShoot;
	}

	public int getMiss() {
		return miss;
	}

	public void setMiss(int miss) {
		this.miss = miss;
	}

	public int getCritical() {
		return critical;
	}

	public void setCritical(int critical) {
		this.critical = critical;
	}

	public int getAddCatridge() {
		return addCatridge;
	}

	public void setAddCatridge(int addCatridge) {
		this.addCatridge = addCatridge;
	}

	public int getModOfDamage() {
		return modOfDamage;
	}

	public void setModOfDamage(int modOfDamage) {
		this.modOfDamage = modOfDamage;
	}
	
	

}
