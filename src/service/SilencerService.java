package service;

import java.util.List;

import domain.Silencer;

public interface SilencerService {

	public void addSilencer(Silencer silencer);

	public List<Silencer> listSilencer();

	public void editSilencer(Silencer silencer);

	public void removeSilencer(String calibre);

}
