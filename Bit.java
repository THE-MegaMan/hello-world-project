import java.io.* ;
public class Bit {
boolean state;
public Bit(boolean startstate) {
this.state=startstate;
}
public boolean  get_state(){
return state;
}
public void setState(boolean newState){
this.state=newState;
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

