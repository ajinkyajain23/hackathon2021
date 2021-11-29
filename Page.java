package com.bulk.scan.ep.bdsresponse.objects;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Page {

	private String barcodeQuality;
	
	private String conf;
	
	private String coverSheet;
	private String id;
	
	private String orientation;
	
	private String pageFormat;
	
	private String undefined;	
	
	List<BarcodeMatches> barcodeMatches;

	@XmlAttribute
	public String getBarcodeQuality() {
		return barcodeQuality;
	}

	public void setBarcodeQuality(String barcodeQuality) {
		this.barcodeQuality = barcodeQuality;
	}

	@XmlAttribute
	public String getConf() {
		return conf;
	}
	
	public void setConf(String conf) {
		this.conf = conf;
	}

	@XmlAttribute
	public String getCoverSheet() {
		return coverSheet;
	}
	
	public void setCoverSheet(String coverSheet) {
		this.coverSheet = coverSheet;
	}

	@XmlAttribute
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlAttribute
	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	@XmlAttribute
	public String getPageFormat() {
		return pageFormat;
	}

	public void setPageFormat(String pageFormat) {
		this.pageFormat = pageFormat;
	}

	@XmlAttribute
	public String getUndefined() {
		return undefined;
	}

	public void setUndefined(String undefined) {
		this.undefined = undefined;
	}

	@XmlElement
	public List<BarcodeMatches> getBarcodeMatches() {
		return barcodeMatches;
	}

	public void setBarcodeMatches(List<BarcodeMatches> barcodeMatches) {
		this.barcodeMatches = barcodeMatches;
	}	
}
