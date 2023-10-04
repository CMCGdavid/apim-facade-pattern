package com.apim.apimfacadepattern.deisign;

public class EventFacade {
    private static final EventFacade INSTANCE = new EventFacade();
    private AuthenService authenService;
    private HrService hrService;
    private AreaService areaService;
    private ScheduleService scheduleService;
    private  NotificationService notificationService;

    public EventFacade() {
        this.authenService = new AuthenService();
        this.hrService = new HrService();
        this.areaService = new AreaService();
        this.scheduleService = new ScheduleService();
        this.notificationService = new NotificationService();
    }

    public static EventFacade getInstance(){
        return INSTANCE;
    }
    public void meeting(){
        authenService.checkAuthen();
        hrService.getUserInfo();
        areaService.getMeetingRoom();
        scheduleService.addEvent();
        notificationService.sendMail();
        System.out.println("Done\n");
    }
    public void meetingOnline(){
        authenService.checkAuthen();
        hrService.getUserInfo();
        areaService.getVirtualRoom();
        scheduleService.addEvent();
        notificationService.sendMail();
        System.out.println("Done\n");
    }
}
