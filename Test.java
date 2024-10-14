package Third;

public class Test {
    public static void hashTableTest(){
        AHashTable<String, Integer> table = new AHashTable<>();
        System.out.println("Is table empty? " + table.isEmpty());
        table.put("sword", 1);
        table.put("gun", 2);
        table.put("gun", 1); //переписал
        table.put("knife", 47);
        table.put("shield", 3);
        System.out.println(table);
        System.out.println("sword - " + table.get("sword").getFirst().getValue());
        System.out.println("gun - " + table.get("gun").getFirst().getKey());
        System.out.println(table.get("knife"));
        System.out.println("tablesize - " + table.size());
        System.out.println("shield - " + table.get("shield").getFirst().getValue());
        System.out.println("");
        System.out.println("Is table empty? " + table.isEmpty());
        table.remove("shield");
        System.out.println(table);
    }
    public static void employeeDataTest(){
        EmployeeData data = new EmployeeData();
        data.add("0000", new Employee("Андрей", "Вейнмайер", "супер-пупер начальник", 19, 9999999f));
        data.add("0001", new Employee("Милена", "Кактус", "кактус на столе", 18, 1000000f));
        data.add("0002", new Employee("Максим", "Белов", "работяга", 19, 1f));
        System.out.println(data);
        System.out.println(data.get("0002"));
        data.remove("0002");
        System.out.println(data);
    }
}
