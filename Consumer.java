package com.bulk.scan.ep;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Consumer {

	@KafkaListener(topics = "bulk_scan_topic")
	public void processMessage(String bulkScanMessageStr) {
		System.out.println("Message received: " + bulkScanMessageStr);
//		BulkScanMessage bulkScanMessage = (BulkScanMessage)bulkScanMessageStr;
//		System.out.println("Message received: " + bulkScanMessage);
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BulkScanMessage bulkScanMessage = objectMapper.readValue(bulkScanMessageStr, BulkScanMessage.class);
			System.out.println("bulk scan message : "+bulkScanMessage);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
