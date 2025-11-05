package com.mweinstein;

public class Browser {
    public void navigate(String address) {
        System.out.println("Navigating to " + address + "...");
        String ip = findIpAddress(address);
        System.out.println("Found IP: " + ip);
        String html = sendHttpRequest(ip);
        System.out.println("Received HTML:\n" + html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.01";
    }
}
