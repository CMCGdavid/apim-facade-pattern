package com.apim.apimfacadepattern.deisign;

public class EventFeatureClient {
    public static void main(String[] args) {
        EventFacade.getInstance().meeting();
        EventFacade.getInstance().meetingOnline();
    }
}
