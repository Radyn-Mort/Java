import java.util.HashMap;
import java.util.Set;
public class HappyMappy{
    public static void main(String[] args){
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("JumpyJuice", "Juice is raining form the sky ");
        trackList.put("SuperSoda","You make me carbonate, So i can't hate ");
        trackList.put("WeirdWater","There must be something in this water, its making everything weird");
        trackList.put("MegaMocha","You make hyper just like my Mega Mocha");
        Set<String> keys = trackList.keySet();
        System.out.println(trackList.get("JumpyJuice"));
        for(String key: keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}