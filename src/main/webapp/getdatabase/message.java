package main.webapp.getdatabase;

/**
 * message 报文类
 */
public class message {
    private Integer Number=null;
    private String Protocolname=null;
    private String Time=null;
    private String Packetlength=null;
    private String Datalength=null;
    private String SMAC=null;
    private String DMAC=null;
    private String SIP=null;
    private String DIP=null;
    private String DPort=null;
    private String Rand=null;
    private String ChartID=null;
    private String sgID=null;

    @Override
    public String toString() {
        return "message{" +
                "Number=" + Number +
                ", Protocolname='" + Protocolname + '\'' +
                ", Time='" + Time + '\'' +
                ", Packetlength='" + Packetlength + '\'' +
                ", Datalength='" + Datalength + '\'' +
                ", SMAC='" + SMAC + '\'' +
                ", DMAC='" + DMAC + '\'' +
                ", SIP='" + SIP + '\'' +
                ", DIP='" + DIP + '\'' +
                ", DPort='" + DPort + '\'' +
                ", Rand='" + Rand + '\'' +
                ", ChartID='" + ChartID + '\'' +
                ", sgID='" + sgID + '\'' +
                '}';
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public String getProtocolname() {
        return Protocolname;
    }

    public void setProtocolname(String protocolname) {
        Protocolname = protocolname;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getPacketlength() {
        return Packetlength;
    }

    public void setPacketlength(String packetlength) {
        Packetlength = packetlength;
    }

    public String getDatalength() {
        return Datalength;
    }

    public void setDatalength(String datalength) {
        Datalength = datalength;
    }

    public String getSMAC() {
        return SMAC;
    }

    public void setSMAC(String SMAC) {
        this.SMAC = SMAC;
    }

    public String getDMAC() {
        return DMAC;
    }

    public void setDMAC(String DMAC) {
        this.DMAC = DMAC;
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

    public String getDPort() {
        return DPort;
    }

    public void setDPort(String DPort) {
        this.DPort = DPort;
    }

    public String getRand() {
        return Rand;
    }

    public void setRand(String rand) {
        Rand = rand;
    }

    public String getChartID() {
        return ChartID;
    }

    public void setChartID(String chartID) {
        ChartID = chartID;
    }

    public String getSgID() {
        return sgID;
    }

    public void setSgID(String sgID) {
        this.sgID = sgID;
    }

    public message() {
    }
}
