package generics_collections;

public class NewObject<T>{
    T newAttribute;

    public NewObject(){}

    public NewObject(T newAttribute){
        this.newAttribute = newAttribute;
    }

    public T getNewAttribute(){
        return this.newAttribute;
    }

    public void m(T t1, T t2){
        System.out.println(t1 + " " + t2);
    }
}
