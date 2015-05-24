package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "bullets")
public class Bullets {

	@Column (name = "calibre")
	private String calibre;
	
	@Column (name = "adddamedge")
	private int addOfDamage;
	
	@Column (name = "addcrit")
	private int addOfCrit;
}
