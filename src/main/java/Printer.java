public class Printer {

    private int paperLeft;
    private int toner;

    public Printer(int paperLeft, int toner){
        this.paperLeft = paperLeft;
        this.toner = toner;
    }

    public int print(int pages, int copies){
        int paperRequired = pages * copies;
        if (this.paperLeft > paperRequired){
            this.toner -= paperRequired;
            return (this.paperLeft - paperRequired);
        } else {
            return this.paperLeft;
        }
    }

    public int getToner(){
        return this.toner;
    }

}
