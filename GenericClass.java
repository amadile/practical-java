public class GenericClass<G,L> implements GenericInterface<G>, AnotherGeneric<L> {
    public G methodGeneric(G value){
        return value;
    }
    public void myProcess(L val){
        System.out.println(val);
    }

    public static void main(String[] args) {
        GenericClass<String,Double> obj = new GenericClass<>();
        String r=obj.methodGeneric("Java programming");
        System.out.println(r);
        obj.myProcess(6.90);
    }
}

