package com.auramarket_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "scan_logs")
public class ScanLog {

    @Id
    private String id;

    private String productId;

    private String userId;

    private String scanLocation;

    private String deviceType;

    private String ipAddress;

    private String scanTime;
}