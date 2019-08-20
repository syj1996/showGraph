package main.webapp.getdatabase;

public class sessionEdge {
    @Override
    public String toString() {
        return "sessionEdge{" +
                "SIP='" + SIP + '\'' +
                ", DIP='" + DIP + '\'' +
                ", SDcount=" + SDcount +
                ", DScount=" + DScount +
                '}';
    }

    public sessionEdge(String SIP, String DIP, Integer SDcount, Integer DScount) {
        this.SIP = SIP;
        this.DIP = DIP;
        this.SDcount = SDcount;
        this.DScount = DScount;
    }

    public Integer getSDcount() {
        return SDcount;
    }

    public void setSDcount(Integer SDcount) {
        this.SDcount = SDcount;
    }

    public Integer getDScount() {
        return DScount;
    }

    public void setDScount(Integer DScount) {
        this.DScount = DScount;
    }

    public sessionEdge() {
    }

    public String getSIP() {
        return SIP;
    }

    public void setSIP(String SIP) {
        this.SIP = SIP;
    }

    public String getDIP() {
        return DIP;
    }

    public void setDIP(String DIP) {
        this.DIP = DIP;
    }

    private String SIP;
    private String DIP;
    private Integer SDcount;
    private Integer DScount;

}
