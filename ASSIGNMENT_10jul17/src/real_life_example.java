abstract class CAR {
    abstract void Carstart();
    abstract void Carstop();
}


class BMW extends CAR {
    @Override
    void Carstart() {
        System.out.println("BMW START :- BURRRH.........BURRRHH......");
    }

    @Override
    void Carstop() {
        System.out.println("BMW'S ENGINE STOP.");
    }
}


class FARARI extends CAR {
    @Override
    void Carstart() {
        System.out.println("FARARI START :- BRRUMM.....BRRUMMMM...BRUMMMMMMMMMM");
    }

    @Override
    void Carstop() {
        System.out.println("FARARI'S ENGINE STOP.");
    }
}



public class real_life_example {
    public static void main(String[] args) {
        CAR mycar = new BMW();
        mycar.Carstart();
        mycar.Carstop();

        System.out.println();


        CAR myfarari = new FARARI();
        myfarari.Carstart();
        myfarari.Carstop();
}
}