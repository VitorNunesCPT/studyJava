import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        // ola {nome}, hoje é {dia da semana}, bom dia
        String nome = "Vitor";
        //Caixa alta
        System.out.println(nome.toUpperCase());
        //Caixa baixa
        System.out.println(nome.toLowerCase());
        //tamanho letra
        System.out.println(nome.length());

        String nomeOutro = "vitor";
        // comando equal compara em espaço na memória  e retorna booleano
        System.out.println(nome.equals(nomeOutro));

        // equalsIgnoreCase -> letras são iguais
        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        //ISO DATE -> Data Padrão / Lib para datas / Ano mes Dia
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        Locale brasil = new Locale("pt", "BR");
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String horario;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            horario = "Bom Dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18 ) {
            horario = "Boa Tarde";
        }else {
            horario = "Boa Noite";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaDaSemana,horario.toLowerCase());
    }
}
