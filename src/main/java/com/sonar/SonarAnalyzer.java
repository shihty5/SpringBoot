package com.sonar;

import java.io.IOException;

public class SonarAnalyzer {

    public static void main(String[] args) throws IOException {
        SonarUtil.getReq("http://localhost:9090/api/resources");
    }

}
