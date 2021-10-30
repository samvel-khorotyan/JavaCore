package figurePainter;

public class FigurePainterTest {

    public static void main(String[] args) {

        FigurePainter fp = new FigurePainter();

        fp.figureOne(5,'#');
        fp.figureTwo(6,'@');
        fp.figureThree(7,6,'?');
        fp.figurefour(8,'&');
        fp.figureFive(9,8,'^',8);
    }
}
