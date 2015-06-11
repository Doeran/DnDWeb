package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "silencers")
public class Silencer {
	
	@Id
	@GeneratedValue
	@Column (name = "idsilencers")
	private int idSilencers;
	
	@Column (name = "penalty_damage")
	private int silencersPenaltyDamage;

	public int getIdSilencers() {
		return idSilencers;
	}

	public void setIdSilencers(int idSilencers) {
		this.idSilencers = idSilencers;
	}

	public int getSilencersPenaltyDamage() {
		return silencersPenaltyDamage;
	}

	public void setSilencersPenaltyDamage(int silencersPenaltyDamage) {
		this.silencersPenaltyDamage = silencersPenaltyDamage;
	}

}
