package tugas2;

public class TVModern extends TV{
    
    public TVModern(String p, String deskripsi, int jumlahChannel) {
        super(p, deskripsi, jumlahChannel);
    }
    
    static String TELETEXT = "TELETEXT";
    static String TV = "TV";
    
    /*
        TELETEXT
    */
    public void setModusTampilan(String t) {
        this.TELETEXT = t;
    }
    
    public void getModusTampilan() {
        System.out.println("Modus tampilan : " + TELETEXT);
    }
    
    public void setHalamanTeletext(int h) {
        System.out.println("Berpindah ke halaman teletext " + h);
    }
    
    /*
        CD
    */
    String cd = "";
    public void setDiscTray(String e) {
        this.cd = e;
    }
    
    public void playCD() {
        if (cd.equals("")) {
            System.out.println("Tidak ada CD di dalam disc tray!");
        } else {
            System.out.println("Memutar film " + cd);
        }
    }
    
    
    public static void main(String[] args) {
        
        TVModern user = new TVModern("Rokhis", "TV Politron", 10);
 
        String[] channel = {
          "RCTI", "INDOSIAR", "TV ONE", "MNC", "TRANS 7",
          "ANTV", "NET", "METRO TV", "BAYUANGGA", "GTV"
        };
        
        
        user.getDeskripsi();
        user.getChannel();
        user.setChannels(channel);
        
        user.setChannelAktif(2);
        user.setVolume(89);
        user.setChannelAktif(1);
        user.setChannelAktif(3);
        
        // teletext con
        user.setModusTampilan(TVModern.TELETEXT);
        user.getModusTampilan();
        user.setHalamanTeletext(250);
        user.setModusTampilan(TVModern.TV);
        user.getModusTampilan();
        
        // CD
        user.playCD();
        user.setDiscTray("Titanic");
        user.playCD();
        
    }
    
}
