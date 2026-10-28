import javax.management.Attribute;
import com.diogonunes.jcolor.AnsiFormat;
import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class ControlAccesoQR {
    public static void main(String[] args) {
        System.out.println("Verificacion del entorno de IntelliJ en Java JDK 21");
        System.out.println("Desrrollador: Derek Torres Stanciu");
        System.out.println("Todo el sistema OK");

        System.out.println(colorize("This text will be yellow on magenta", YELLOW_TEXT(), MAGENTA_BACK()));
        System.out.println("\n");

        AnsiFormat fWarning = new AnsiFormat(WHITE_TEXT(), GREEN_BACK(), BOLD());
        System.out.println(colorize("AnsiFormat is just a pretty way to declare formats", fWarning));
        System.out.println(fWarning.format("...and use those formats without calling colorize() directly"));
        System.out.println("\n");

    }
}
