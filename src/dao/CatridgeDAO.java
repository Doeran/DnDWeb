package dao;

import java.util.List;

import domain.Catridge;

public interface CatridgeDAO {

	public void addCatridge(Catridge catridge);

	public List<Catridge> listCatridge();

	public void editCatridge(Catridge catridge);

	public void removeCatridge(int idCatridge);
}
