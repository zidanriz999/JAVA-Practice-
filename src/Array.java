public class Array {
    public static void main(String[] args) {

        int [] array= {90,80,70,85,85};
        System.out.println("Here the index:"+ array[3]);
        System.out.println("Here the array length: " +array.length);

        //System.out.println(Arrays.toString(array));

        for(int element:array){

            System.out.println(element);

        }

        System.out.println();

        for(int i= 0;i<5;i++) {
            System.out.println(array[i]);
        }

        System.out.println("Here the reverse array:");
            for (int j = array.length - 1; j>=0; j--) {
                System.out.println(array[j]);

            }


        System.out.println();

        String[]student_name={"Zidan","Rin","Ruhani","Zaien"};
        System.out.println("Here the index of Student Name: "+student_name[2]);
        System.out.println("Here the student length: "+student_name.length);

        for(int i= 0;i<4;i++) {
            System.out.println(student_name[i]);
        }

        System.out.print("\n");

        System.out.println("Here the reverse array:");
        for (int k = student_name.length - 1; k>=0; k--) {
            System.out.println(student_name[k]);

        }


    }
}
