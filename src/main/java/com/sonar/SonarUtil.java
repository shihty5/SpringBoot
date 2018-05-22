package com.sonar;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

public class SonarUtil {
    static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final Logger Logger = LoggerFactory.getLogger(SonarAnalyzer.class);

    public static void getRequest(String reqUrl) throws IOException {
        GenericUrl url = new GenericUrl(reqUrl);
        HttpRequest request = HTTP_TRANSPORT.createRequestFactory().buildGetRequest(url);
        HttpResponse response = request.execute();
        Gson gson = new GsonBuilder().create();

        Logger.info("Recevied with status = {}", response.getStatusCode());

        InputStream is = response.getContent();
        int ch;
        while ((ch = is.read()) != -1) {
            System.out.print((char) ch);
        }
        response.disconnect();
    }

    public static void getReq(String reqUrl) throws IOException {
        GenericUrl url = new GenericUrl(reqUrl);
        HttpRequest request = HTTP_TRANSPORT.createRequestFactory().buildGetRequest(url);
        HttpResponse response = request.execute();
        Gson gson = new GsonBuilder().create();

        Logger.info("Recevied with status = {}, ContentEncoding = {}.", response.getStatusCode(), response.getContentEncoding());
        Logger.info("Recevied with MediaType = {}", response.getMediaType());
        Logger.info("Recevied with status = {}", response.getStatusCode());

        response.disconnect();
    }
}
