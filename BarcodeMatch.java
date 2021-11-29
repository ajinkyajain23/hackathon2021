package com.bulk.scan.ep.bdsresponse.objects;

import javax.xml.bind.annotation.XmlAttribute;

public class BarcodeMatch {
	private String bottom;

	private String confidence;

	private String left;

	private String originalDecodedValue;

	private String right;

	private String templateId;

	private String templateName;

	private String top;

	private String virtualBarcode;

	@XmlAttribute
	public String getBottom() {
		return bottom;
	}

	public void setBottom(String bottom) {
		this.bottom = bottom;
	}

	@XmlAttribute
	public String getConfidence() {
		return confidence;
	}

	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}

	@XmlAttribute
	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	@XmlAttribute
	public String getOriginalDecodedValue() {
		return originalDecodedValue;
	}

	public void setOriginalDecodedValue(String originalDecodedValue) {
		this.originalDecodedValue = originalDecodedValue;
	}

	@XmlAttribute
	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}

	@XmlAttribute
	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	@XmlAttribute
	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	@XmlAttribute
	public String getTop() {
		return top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	@XmlAttribute
	public String getVirtualBarcode() {
		return virtualBarcode;
	}

	public void setVirtualBarcode(String virtualBarcode) {
		this.virtualBarcode = virtualBarcode;
	}
}
