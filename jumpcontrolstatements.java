public class jumpcontrolstatements {
    public static void main(String[] args){
        int i = 0;
        while (i<6)
        {
            i++;
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
