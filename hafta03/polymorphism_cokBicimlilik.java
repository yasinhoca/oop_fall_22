package hafta03;

class animal {
    void ses() {
        System.out.println("Bu animal sınıfındaki ses methodu!");
    }
}

class kedi extends animal {
    void ses() {
        System.out.println("miyav");
    }
}

class kopek extends animal {
    void ses() {
        System.out.println("havhav");
    }
}

class kus extends animal {
    void ses() {
        System.out.println("cikcik");
    }
}

class animalVoice extends animal {
    static void ses(animal a) {
        a.ses();
    }
}

public class polymorphism_cokBicimlilik {
    public static void main(String[] args) {
        kedi k = new kedi();  // her bir ses için tek tek butun hayvanların nesnesi üretmem gerekiyor
        //k.ses();
        // kopek ko=new kopek();

        //animalVoice av = new animalVoice();
        animalVoice.ses(k);
        animalVoice.ses(new kopek()); //animalVoice(ko);
        animalVoice.ses(new kus());

    }
}
