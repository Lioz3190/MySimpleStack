package dcll.ddan.MySimpleStack;

import org.omg.CORBA.Object;

/**
 * Created by Lioz-MBPR on 24/02/16.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }
    /**
     *  j'ai modifié ça
     *  @return
     */
    public Object getValue(){
        return value;
    }
    public void setValue(Object value){
        this.value = value;
    }

}
