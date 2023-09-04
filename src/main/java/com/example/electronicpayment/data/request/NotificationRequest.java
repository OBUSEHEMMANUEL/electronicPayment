package com.example.electronicpayment.data.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class NotificationRequest {

    private String id;
    private String sessionId;
    private String sourceBankCode;
    private String customerId;
    private String  customerName;
    private String paymentReference;
    private String narration;
    private BigDecimal amount;
    private LocalDateTime dateEntered;
    private LocalDateTime datePosted;
    private String remark;
    private Boolean processed;
}
