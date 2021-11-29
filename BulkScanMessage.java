package com.bulk.scan.ep;

public class BulkScanMessage 
{
	String bulkScanId;
	
	String originalBulkFilePath;
	
	String finalBulkFilePath;
	
	public BulkScanMessage()
	{
		
	}
	
	protected BulkScanMessage(String bulkScanId, String originalBulkFilePath, String finalBulkFilePath) {
		super();
		this.bulkScanId = bulkScanId;
		this.originalBulkFilePath = originalBulkFilePath;
		this.finalBulkFilePath = finalBulkFilePath;
	}

	public String getBulkScanId() {
		return bulkScanId;
	}

	public String getOriginalBulkFilePath() {
		return originalBulkFilePath;
	}

	public String getFinalBulkFilePath() {
		return finalBulkFilePath;
	}

	@Override
	public String toString() {
		return "BulkScanMessage [bulkScanId=" + bulkScanId + ", originalBulkFilePath=" + originalBulkFilePath
				+ ", finalBulkFilePath=" + finalBulkFilePath + "]";
	}	
	
}
