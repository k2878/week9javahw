package inheritenceq1;

public class codeBusterGroups extends codeBuster{
    codeBusterGroups(){

    }

    @Override
    public void groupName(){ System.out.println("nameOfGroup");



    }
    public static void main(String[] args){
        codeBusterGroups cons = new codeBusterGroups();
        cons.groupName();


    }


}
