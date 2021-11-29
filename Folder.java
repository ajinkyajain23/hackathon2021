package com.bulk.scan.ep.bdsresponse.objects;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Folder {

	private String conf;
	
	private String folderAttribute;
	
	private String folderAttributeValue;	
	
	private String manuallyValidated;
	
	private String matchedBarcodeTemplateName;
	
	private String pageCount;
	
	private String status;
	
	List<Page> pages;
	
	public void setConf(String conf) {
		this.conf = conf;
	}
	
	@XmlAttribute
	public String getConf() {
		return conf;
	}

	

	@XmlAttribute
	public String getFolderAttribute() {
		return folderAttribute;
	}

	public void setFolderAttribute(String folderAttribute) {
		this.folderAttribute = folderAttribute;
	}

	@XmlAttribute
	public String getFolderAttributeValue() {
		return folderAttributeValue;
	}

	public void setFolderAttributeValue(String folderAttributeValue) {
		this.folderAttributeValue = folderAttributeValue;
	}

	@XmlAttribute
	public String getManuallyValidated() {
		return manuallyValidated;
	}

	public void setManuallyValidated(String manuallyValidated) {
		this.manuallyValidated = manuallyValidated;
	}

	@XmlAttribute
	public String getMatchedBarcodeTemplateName() {
		return matchedBarcodeTemplateName;
	}

	public void setMatchedBarcodeTemplateName(String matchedBarcodeTemplateName) {
		this.matchedBarcodeTemplateName = matchedBarcodeTemplateName;
	}

	@XmlAttribute
	public String getPageCount() {
		return pageCount;
	}

	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}

	@XmlAttribute
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	

	@XmlElement
	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
}
