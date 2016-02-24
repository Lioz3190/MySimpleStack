package dcll.ddan.MySimpleStack;

/**
 * Created by Lioz-MBPR on 24/02/16.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }
    /**
     *  Un commentaire à l'exigence #1
     *  @return
     */
    public Object getValue(){
        return value;
    }
    public void setValue(Object value){
        this.value = value;
    }

}
