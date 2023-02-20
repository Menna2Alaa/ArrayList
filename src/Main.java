import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Data obj=new Data();
        ArrayList<Data> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true)
        {
            Choice();
            int choose=in.nextInt();
            switch (choose)
            {
                case 1:
                    int new_id;
                    String new_name;
                    new_name=in.next();
                    new_id=in.nextInt();
                    for (int i=0 ; i<list.size() ;i++)
                    {
                        if(new_id==i)
                        {
                            new_name= obj.name;
                        }
                        else
                        {
                            
                        }
                    }
                    break;
                case 2:
                    int unknown_id;
                    unknown_id=in.nextInt();
                    for(int i=0 ; i<list.size() ;i++)
                    {
                        if(i==unknown_id)
                        {
                            System.out.println("name" +obj.name);
                            System.out.println("id" +obj.id);
                        }
                        else
                        {
                            System.out.println("id is not exist");
                        }
                    }
                    break;
            }
        }

    }
    static void Choice()
    {
        System.out.println("1-Add a new name\n" +
                "2-Get an existence name");
    }

}
