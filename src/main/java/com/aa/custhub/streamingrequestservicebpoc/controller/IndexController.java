package com.aa.custhub.streamingrequestservicebpoc.controller;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ListBucketsRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.var;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController("/")
public class IndexController {
    private final AmazonS3 amazonS3Client;

    IndexController(AmazonS3 amazonS3Client) {
        this.amazonS3Client = amazonS3Client;
    }
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> index()
            throws IOException {
        var buckets = amazonS3Client.listBuckets();
        if(buckets.isEmpty()) {
            amazonS3Client.createBucket("test");
            buckets = amazonS3Client.listBuckets();
        }
        return ResponseEntity.ok(new ObjectMapper().writeValueAsString(buckets));
    }
}

