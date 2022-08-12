public class Gest implements Comparable<Gest> {
    int ID;
    int PW;
    int Cash;

    public Gest(int ID, int PW) {
        this.ID = ID;
        this.PW = PW;
        this.Cash = 1000;
    }

    @Override
    public int compareTo(Gest o) {
        // TODO Auto-generated method stub
        return Cash = o.Cash;
    }

}
