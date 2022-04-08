package pl.lublin.wsei.java.cwiczenia.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    public Infografika (String tekst) {
        Pattern pat= Pattern.compile("<title<!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);
        String tytul;
        if (m.find())
            tytul=m.group(1);
        else
            tytul="Brak";

        String limk = "";
        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);
        if (m.find())
            limk=m.group(1);
        else
            limk="Brak";

        String image = "";
        pat = Pattern.compile("<media:content url=\"(.*)\" type");
        m = pat.matcher(tekst);
        if (m.find()) {
        }
        else
            image="Brak";

        String icon = "";
        pat = Pattern.compile("<media:thumbnail url=\"(.*)\" />");
        m = pat.matcher(tekst);
        if (m.find())
            icon=m.group(1);
        else
            icon="Brak";

        String height = "";
        pat = Pattern.compile("height=\"(.*)\"/>");
        m = pat.matcher(tekst);
        if (m.find())
            height=m.group(1);
        else
            height="Brak";

        String width = "";
        pat = Pattern.compile("width=\"(.*)\" he");
        m = pat.matcher(tekst);
        if (m.find())
            width=m.group(1);
        else
            width="Brak";

        String size = width+"x"+height;
        if (width=="Brak") size="Brak";

    }
}
