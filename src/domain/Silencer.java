package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "silencer")
public class Silencer {
	
	@Column (name = "calibre")
	private String calibre;
	
	@Column (name = "damadge")
	private int damage;

}
