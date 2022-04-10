package pl.lublin.wsei.java.cwiczenia;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    String tytul = "";
    String limk = "";
    String image = "";
    String icon = "";
    String height = "";
    String size="";
    String width = "";

    public Infografika (String tekst) {
        Pattern pat= Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);

        if (m.find())
            tytul=m.group(1);
        else
            tytul="Brak";

        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);
        if (m.find())
            limk=m.group(1);
        else
            limk="Brak";

        pat = Pattern.compile("<media:content url=\"(.*)\" type");
        m = pat.matcher(tekst);
        if (m.find()) {
            image= m.group(1);
        }
        else
            image="Brak";

        pat = Pattern.compile("<media:thumbnail url=\"(.*)\" />");
        m = pat.matcher(tekst);
        if (m.find())
            icon=m.group(1);
        else
            icon="Brak";


        pat = Pattern.compile("height=\"(.*)\"/>");
        m = pat.matcher(tekst);
        if (m.find())
            height=m.group(1);
        else
            height="Brak";


        pat = Pattern.compile("width=\"(.*)\" he");
        m = pat.matcher(tekst);
        if (m.find())
            width=m.group(1);
        else
            width="Brak";

        size = width+"x"+height;
        if (width=="Brak") size="Brak";

    }

    public void print() {
        String text= "\ntytul: "+ tytul+"\n adres strony: "+ limk+ "\n adres grafiki: "+image+ "\n adres miniaturki: "+ icon+"\n rozmiar: "+size;
        System.out.print(text);
    }
}
