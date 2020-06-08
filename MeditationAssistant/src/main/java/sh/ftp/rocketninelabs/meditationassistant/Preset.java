package net.gnu.meditationassistant;

import org.json.JSONException;
import org.json.JSONObject;

public class Preset {
    public String modeandduration = "";
    public String introduction = "";
    public String delay = "";
    public String startsound = "";
    public String startsoundcustom = "";
    public String intervalduration = "";
    public String intervalsound = "";
    public String intervalsoundcustom = "";
    public String intervalcount = "";
    public String completesound = "";
    public String completesoundcustom = "";
    public String ringtone = "";
    public int volume = 50;
    public boolean endless = false;
    public boolean vibrate = false;

    public JSONObject export() {
        JSONObject jobj = new JSONObject();
        try {
            jobj.put("modeandduration", modeandduration);
            jobj.put("introduction", introduction);
            jobj.put("delay", delay);
            jobj.put("startsound", startsound);
            jobj.put("startsoundcustom", startsoundcustom);
            jobj.put("intervalduration", intervalduration);
            jobj.put("intervalsound", intervalsound);
            jobj.put("intervalsoundcustom", intervalsoundcustom);
            jobj.put("intervalcount", intervalcount);
            jobj.put("completesound", completesound);
            jobj.put("completesoundcustom", completesoundcustom);
            jobj.put("ringtone", ringtone);
            jobj.put("volume", volume);
            jobj.put("endless", endless);
            jobj.put("vibrate", vibrate);
        } catch (JSONException e1) {
            e1.printStackTrace();
        }
        return jobj;
    }
}
