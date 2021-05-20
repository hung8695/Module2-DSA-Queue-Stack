public class Main {
    public static void main(String[] args) {
        Manage manage=new Manage();
        manage.add(new Student("Hihi",15,"Đực","HN"));
        manage.add(new Student("Huhu",19,"Cái","HN"));
        manage.add(new Student("Hehe",13,"Null","HN"));
        manage.add(new Student("Haha",16,"Cái","HN"));
        manage.add(new Student("Hoho",45,"Đực","HN"));
        manage.add(new Student("Hiha",30,"Đực","HN"));
        manage.add(new Student("Hahu",10,"Null","HN"));
        manage.add(new Student("Hiho",20,"Đực","HN"));
        manage.add(new Student("Hoha",100,"Đực","HN"));
        manage.display();
        System.out.println("-------------------------------------");
        System.out.println(manage.listStudent.get(manage.findByName("Hiha")));
        System.out.println("--------------------------------------");
        System.out.println("Danh sách sau khi sắp xếp là: ");
        manage.sortStudent();
        manage.display();
        System.out.println("---------------------------------------");
        manage.update("Huhu",new Student("Hiệu",19,"Null","Codegym"));
        manage.display();
    }
}
