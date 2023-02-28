package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        //mapLooping();
        //mapDuplication();
        objectMaps();
    }

    public static void mapLooping() {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Peter");
        map.put(1, "John");
        map.put(2, "James");
        // HashMap does not guarantee the sorting of the entries
        System.out.println("unsorted map: " + map);
        // for-each loop when dealing with maps:
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
        System.out.println("***********************************************************");
        // better for-each loop:
        for(Integer key: map.keySet()) {
            System.out.println("key: " + key + " value: " + map.get(key));
        }
        System.out.println("***********************************************************");
        // looping thru map using iterator
        Iterator<Map.Entry<Integer, String>> entry = map.entrySet().iterator();
        while(entry.hasNext()) {
            Map.Entry<Integer, String> temp = entry.next();
            System.out.println("key: " + temp.getKey() + " value: " + temp.getValue());
        }
    }

    public static void mapDuplication() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(2, "mbili");
        map.put(3, "three");
        // notice the lack of duplication for keys
        System.out.println("map: " + map);
    }

    public static void objectMaps() {
        //Map<Code, String> map = new HashMap<>();
        Map<Code, String> map = new TreeMap<>();
        map.put(new Code("S01", "L01"), "Generics");
        map.put(new Code("S01", "L02"), "OOP");
        map.put(new Code("S02", "L01"), "Network Programming");
        // notice that duplicates are not removed when the map is a HashMap
        // but are removed when it's a TreeMap
        map.put(new Code("S01", "L01"), "Collections");
        for(Code key: map.keySet()) {
            System.out.println("key: " + key + " value: " + map.get(key));
        }
    }

    static class Code implements Comparable<Code> {
        private String sectionNo;
        private String lectureNo;

        public Code(String sectionNo, String lectureNo) {
            this.sectionNo = sectionNo;
            this.lectureNo = lectureNo;
        }

        public String getSectionNo() {
            return sectionNo;
        }

        public String getLectureNo() {
            return lectureNo;
        }

        @Override
        public String toString() {
            return "Code{" +
                    "sectionNo='" + sectionNo + '\'' +
                    ", lectureNo='" + lectureNo + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Code o) {
            String code1 = this.sectionNo.concat(this.lectureNo);
            String code2 = o.sectionNo.concat(o.lectureNo);
            return code1.compareTo(code2);
        }
    }
}
