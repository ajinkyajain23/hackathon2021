package com.bulk.scan.ep.bdsresponse.objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BoundaryDetectionResults {

	private Folders folders;

	@XmlElement
	public Folders getFolders() {
		return folders;
	}

	public void setFolders(Folders folders) {
		this.folders = folders;
	}

}
