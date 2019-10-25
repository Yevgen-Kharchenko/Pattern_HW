package factorymetod.figures;

public abstract class Figure {
    private char[][] type;
    public static char a = 8440;

    public Figure(char[][] type){
        this.type = type;
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        for (char[] chars : type){
            for (char chars2 : chars){
                res.append(chars2);
            }
            res.append("\n");
        }
        return res.toString();
    }
}
