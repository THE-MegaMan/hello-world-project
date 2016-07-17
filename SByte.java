import java.io.*;
public class SByte{
Nybble nybble1;
Nybble nybble2;

public SByte(	Nybble first, Nybble second){
this.nybble1=first;
this.nybble2=second;
}
public Nybble get_state1(){
return nybble1;
}
public Nybble get_state2(){
return nybble2;
}
public void setStates(Nybble first, Nybble second){
this.nybble1=first;
this.nybble2=second;
}
public void dump(File file){
try{

ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file,true));
out.writeObject(this);
out.flush();
out.close();

}
catch (FileNotFoundException ex) {

System.err.println("Sorry, this file doesn't exist");
ex.printStackTrace();

}
catch (Exception ex) {
System.err.println("An error occured. Please try again later");
}

}

}



