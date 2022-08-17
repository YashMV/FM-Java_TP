public class MIT {
    public static void main(String[] args) {
        Student s1 = new Student();  //Create strudent objects
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setName("Chris");  //Set name
        s1.setReg_no(1215478);  //Set registration number
        s1.setBranch("EEE");  //Set branch

        //Repeat the above process for other students also
        s2.setName("Steve");
        s2.setReg_no(1459597);
        s2.setBranch("CSE");

        s3.setName("Natasha");
        s3.setReg_no(1678615);
        s3.setBranch("IT");
    }
}