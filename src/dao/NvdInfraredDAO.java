package dao;

import java.util.List;

import domain.NvdInfrared;

public interface NvdInfraredDAO {

	public void addNVDInfrared(NvdInfrared nvdInfrared);

	public List<NvdInfrared> listNvdInfrared();

	public void editNvdInfrared(NvdInfrared nvdInfrared);

	public void removeNvdInfrared(int idNVDInfrared);
}
