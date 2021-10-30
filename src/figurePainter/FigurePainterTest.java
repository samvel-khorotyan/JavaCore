package figurePainter;

public class FigurePainterTest {

    public static void main(String[] args) {

        FigurePainter fp = new FigurePainter();

        fp.figureOne(5,'#');
        fp.figureTwo(5,'@');
        fp.figureThree(5,4,'?');
        fp.figurefour(5,'&');
        fp.figureFive(5,4,'^',4);
    }
}
