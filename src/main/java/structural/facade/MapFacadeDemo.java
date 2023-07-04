package structural.facade;

import java.util.List;

public class MapFacadeDemo {
    public static void main(String[] args) {
        MapFacade facade = new MapFacade();
        facade.createDb();
        facade.insertRecord();
        List<MapFacade.Address> records = facade.getRecords();
        System.out.println(records);
    }
}
