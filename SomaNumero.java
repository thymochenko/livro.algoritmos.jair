//importa as bibliotecas de entrada e saida padrão do java
/**
*
* Explicação a da wikipedia a respeito dos buffers
*
 (1)Em ciência da computação, buffer(Memória Principal) é uma região de memória físi
 ca utilizada para armazenar temporariamente os dados enquanto eles estão sendo
 movidos de um lugar para outro. Normalmente, os dados são armazenados em um bu
 ffer enquanto eles são recuperados de um dispositivo de entrada (como um microf
 one) ou pouco antes de serem enviados para um dispositivo de saída (como auto-
 falantes). Contudo, um buffer pode ser utilizado quando movem-se dados entre pr
 ocessos dentro de um computador. Isto é comparável com os buffers de telecomunicações. Os buffers podem ser implementados em um local de memória fixa no hardware - ou utilizando-se um buffer de dados virtual em software, apontando para um local na memória física. Em todos os casos, os dados armazenados em um buffer de dados são armazenados em um meio de armazenamento físico. A maioria dos buffers são implementados em software, que normalmente usa a RAM mais rápida para armazenar dados estáveis, devido ao tempo de acesso muito mais rápido comparado com as unidade
 s de disco rígido. Os buffers normalmente são usados quando há uma diferença e
 ntre a taxa a qual os dados são recebidos e a taxa a qual eles podem ser proce
 ssados, ou no caso em que estas taxas são variáveis, por exemplo em um spooler
 de impressão ou em streaming de vídeos online.

Um buffer frequentemente ajusta o tempo pela implementação de um algoritmo de
fila (ou FIFO) na memória, simultaneamente escrevendo dados na fila em uma taxa
e lendo-os em outra taxa.
*/
import java.io.*;

public class SomaNumero {

  public static void main(String[] args) {
    try {
      //lê a entrada padrão de dados
      String a, b;
      int aint, bint, result;

      InputStreamReader read  = new InputStreamReader(System.in);
      //(1)
      BufferedReader buffer = new BufferedReader(read);
      System.out.println("Informe um número A");
      a = buffer.readLine();
      System.out.println("Informe o número B");
      b = buffer.readLine();
      aint = Integer.parseInt(a);
      bint = Integer.parseInt(b);
      result = aint + bint;
      System.out.println("A soma dos númeoros é : " +  result);
    }
    catch(Exception e){}
    }
}
