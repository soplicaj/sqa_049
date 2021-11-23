package oop.abstract_concepts.interfaces;

public class LambdaTutor {
    public static void main(String[] args) {
        Instrument i1 = new Instrument(){
            @Override
            public void play(){
                System.out.println("General sound of an instrument");
            }
        };
        i1.play();

        //Lambda expression
        Instrument i2 = () -> System.out.println("General sound of an instrument");
        i2.play();
        //i1 and i2 are identical in regards to their implementation and execution
        //The only difference is related to the syntax
        Instrument i3 = () -> System.out.println("Sound of a different instrument");
        i3.play();
        Instrument i4 = () -> {
            System.out.println("First instruction");
            System.out.println("Second instruction");
        };
        i4.play();
    }
}
