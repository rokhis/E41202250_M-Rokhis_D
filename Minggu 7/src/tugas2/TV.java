
package tugas2;

public class TV {
    String deskripsi = "";
    int jmlChannel = 0;
    String[] channels = new String[jmlChannel];
    int channelAktif = 0;
    int volume = 0;
    String pembeli = "";
    
    // constructor
    TV(final String p, final String deskripsi, final int jmlChannel) {
        this.pembeli = p;
        this.deskripsi = deskripsi;
        this.jmlChannel = jmlChannel;
    }
    
    // set deskripsi
    public void getDeskripsi() { 
        System.out.println(pembeli + " membeli " + deskripsi);
    }
    
    // set channel
    public void setChannels(String[] channels) {
        if (channels.length > this.jmlChannel) {
            System.out.println("maaf Tv ini hanya dapat menampung " + this.jmlChannel + " channel");
        } else {
            this.channels = channels;
            System.out.println("informasi channel berhasil di-update!");
        }
    }
    
    // get channel aktif
    public void getChannel() {
        if(this.channels.length == 0) {
            System.out.println("Belum ada channel yang di-set!");
        } else {
            String data = "";
            for (String channel : this.channels) {
                data += channel + " ";
            }
            System.out.println("Channel yang ada : [ " + data + "]");
        }
    }
    
    // set channel aktif
    public void setChannelAktif(int e) {
        this.channelAktif = e;
        int data = e;
        System.out.println("Pindah ke channel : " + this.channels[e-1]);
    }
    
    // set volume
    public void setVolume(int v) {
        System.out.println("Intensitas volume sekarang : " + v);
    }
}
class User {
    public static void main(String[] args) {
        
        TV user = new TV("Rokhis", "TV Politron, 20 inch", 10);
        String[] channel = {
          "RCTI", "INDOSIAR", "TV ONE", "MNC", "TRANS 7",
          "ANTV", "NET", "METRO TV", "BAYUANGGA", "GTV"
        };
        
        user.getDeskripsi();
        user.getChannel();
        user.setChannels(channel);
        
        user.setChannelAktif(2);
        user.setVolume(100);
        user.setChannelAktif(1);
        user.setChannelAktif(10);
        
    }
}