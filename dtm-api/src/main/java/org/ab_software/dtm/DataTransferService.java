package org.ab_software.dtm;

public interface DataTransferService {

	public void sendDataToRemote(byte[] data, String remoteHost, int port);

	public byte[] getDataFromRemote(String remoteHost, int port);

}
