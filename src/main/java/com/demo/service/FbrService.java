package com.demo.service;

import com.demo.model.InvoiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;
import tools.jackson.databind.ObjectMapper;

@Service
public class FbrService {

    @Autowired
    private RestClient restClient;

    public String sendInvoiceToFbr(InvoiceRequest invoiceRequest) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonBody = mapper.writeValueAsString(invoiceRequest);
            System.out.println("=== Sending Request to FBR ===");
            System.out.println("JSON Body: " + jsonBody);
            System.out.println("==============================");
            String response = restClient.post()
                    .uri("/di_data/v1/di/postinvoicedata_sb")
                    .header("Authorization", "Bearer bdab7f8a-c9ae-318a-a20a-56ae2cd0d251")
                    .header("Content-Type", "application/json")
                   // .header("regNo", "1728512")     // <-- REQUIRED
                 //   .header("channel", "POS")       // <-- REQUIRED
                 //   .header("source", "POS")
                    .header("Accept", "*/*")
                    .header("Cache-Control", "no-cache")
                    .body(invoiceRequest)
                    .retrieve()
                    .body(String.class);

            System.out.println("FBR Response: " + response);
            return response;

        }  catch (HttpClientErrorException e) {
            System.err.println("HTTP Error Status: " + e.getStatusCode());
            System.err.println("Error Response Body: " + e.getResponseBodyAsString());
            return e.getResponseBodyAsString();

        }

        catch (Exception e) {
            System.err.println("Error sending invoice to FBR: " + e.getMessage());
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
    }
