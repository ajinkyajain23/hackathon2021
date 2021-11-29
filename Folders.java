package com.bulk.scan.ep.bdsresponse.objects;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Folders {
	
	List<Folder> folders;

	@XmlElement
	public List<Folder> getFolders() {
		return folders;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}
	

}
