package c.h.jdbm;

/**
 * Created by jiang on 2016/12/16 0016.
 */
public class Mytest {
    public static void main(String[] args) {
        //Open database using builder pattern.
//All options are available with code autocompletion.
        DB db = DBMaker.openFile("test")
//                .deleteFilesAfterClose()
                .enableEncryption("password",false)
                .make();

//open an collection, TreeMap has better performance then HashMap
//        SortedMap<Integer,String> map = db.createTreeMap("collectionName");
//
//        map.put(1,"one");
//        map.put(2,"two");
//map.keySet() is now [1,2] even before commit

//        db.commit();  //persist changes into disk
//
//        map.put(3,"three");
//map.keySet() is now [1,2,3]
//        db.rollback(); //revert recent changes
//map.keySet() is now [1,2]
//        System.out.println(map.keySet());
//        System.out.println(db.calculateStatistics());
//
        System.out.println(0x122);
//        db.close();
    }
}
