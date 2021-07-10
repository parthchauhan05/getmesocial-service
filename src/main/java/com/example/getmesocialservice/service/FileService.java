package com.example.getmesocialservice.service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileService {
    public boolean upload(MultipartFile file) {
        BasicAWSCredentials credentials = new BasicAWSCredentials("AKIAZSEW2EGPI7MBGCEW", "gT4zdjzNWPPBu2WVOYQGQkoeiU+uwfJzFDobbr5y");
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials)).withRegion(Regions.US_EAST_2).build();
        try {
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(file.getSize());
            metadata.setContentType(file.getContentType());
            s3.putObject("getmesocial-bucket", file.getOriginalFilename(), file.getInputStream(), metadata);
        } catch (AmazonServiceException | IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public S3Object getFile(String key) {
        BasicAWSCredentials credentials = new BasicAWSCredentials("AKIAZSEW2EGPI7MBGCEW", "gT4zdjzNWPPBu2WVOYQGQkoeiU+uwfJzFDobbr5y");
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials)).withRegion(Regions.US_EAST_2).build();
        return s3.getObject("getmesocial-bucket", key);
    }

    public void deleteFile(String key) {
        BasicAWSCredentials credentials = new BasicAWSCredentials("AKIAZSEW2EGPI7MBGCEW", "gT4zdjzNWPPBu2WVOYQGQkoeiU+uwfJzFDobbr5y");
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials)).withRegion(Regions.US_EAST_2).build();
        s3.deleteObject("getmesocial-bucket", key);
    }
}
