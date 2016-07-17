import java.util.HashMap;
public class ASCIITable {

public HashMap<Integer, Character> ascii = new HashMap<Integer, Character>();

public void init(){
for(int i=0;i<255;i++){
ascii.put(i,(char)i);
}
}
}
