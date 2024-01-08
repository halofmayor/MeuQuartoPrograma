public class MeuQuartoPrograma {
    public static void main(String[] args) {
        calc(7,6);
    }

    static void calc(int x, int y) {
        //static void => declaracao padrao (falaremos depois sobre, mas precisa!)
        //sum => nome da funcao, geralmente usamos verbos para definir o que a funcao faz
        //() => usamos para definir o que chegara naquela funcao
        //(tipo nomeDaVariavel
        //{} => bloco de codigo que sera executado
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
    }
}
