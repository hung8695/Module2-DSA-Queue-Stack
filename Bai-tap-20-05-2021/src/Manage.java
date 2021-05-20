import java.util.*;

public class Manage {
    public List<Student> listStudent;
    public Manage(){
       listStudent=new ArrayList<>();
    }
    public void add(Student student){
        listStudent.add(student);
    }
    public int findByName(String name){
        for (int i = 0; i <listStudent.size() ; i++) {
            if(listStudent.get(i).getName().equals(name)){
               return i;
            }
        }
        return -1;
    }
    void delete(String id){
        for (int i = 0; i <listStudent.size() ; i++) {
            if(listStudent.get(i).getId().equals(id)){
                listStudent.remove(i);
            }
        }
    }
    public void display(){
        Iterator<Student> itr= listStudent.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
    void update(String name,Student student){
        int index=findByName(name);
        if(index==-1){
            System.out.println("Không có tên này!");
        } else
            listStudent.set(index,student);

    }
    void sortStudent(){
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
