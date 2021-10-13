package calculadoraBasesDiferentes;

public class Operacoes {

    private String nuA;
    private String nuB;
    private int baseAtual;
    private int baseConv;


    public String getNuA() {
        return nuA;
    }

    public void setNuA(String nuA) {
        this.nuA = nuA;
    }

    public String getNuB() {
        return nuB;
    }

    public void setNuB(String nuB) {
        this.nuB = nuB;
    }

    public void setBaseAtual(int baseAtual) {
        this.baseAtual = baseAtual;
    }

    public void setBaseConv(int baseConv) {
        this.baseConv = baseConv;
    }


    //metodo de conversão
    public String converteNu (){
        Integer conversao = Integer.parseInt(nuA, baseAtual);
        return conversao.toString(conversao, baseConv);
    }


    //metodos de operaçoes matematicas devolvendo mesma base
    public String somarMesma(){
        int convA = Integer.parseInt(nuA, baseAtual);
        int convB = Integer.parseInt(nuB, baseAtual);
        Integer soma = convA + convB;

        return soma.toString(soma, baseAtual);
    }

    public String substracaoMesma(){
        int convA = Integer.parseInt(nuA, baseAtual);
        int convB = Integer.parseInt(nuB, baseAtual);
        Integer subtracao = convA - convB;
        return  subtracao.toString(subtracao, baseAtual);
    }

    public String multiplicacaoMesma(){
        int convA = Integer.parseInt(nuA, baseAtual);
        int convB = Integer.parseInt(nuB, baseAtual);
        Integer multiplicaçao = convA * convB;
        return  multiplicaçao.toString(multiplicaçao, baseAtual);
    }

    public String divisaoMesma(){
        int convA = Integer.parseInt(nuA, baseAtual);
        int convB = Integer.parseInt(nuB, baseAtual);
        Integer divisao = convA / convB;
        return divisao.toString(divisao, baseAtual);
    }

    //metodos de operaçoes matematicas devolvendo base diferente
    public String somarDiferente(){
        int convA = Integer.parseInt(nuA, baseAtual);
        int convB = Integer.parseInt(nuB, baseAtual);
        Integer soma = convA + convB;

        return soma.toString(soma, baseConv);
    }

    public String substracaoDiferente(){
        int convA = Integer.parseInt(nuA, baseAtual);
        int convB = Integer.parseInt(nuB, baseAtual);
        Integer subtracao = convA - convB;

        return  subtracao.toString(subtracao, baseConv);
    }

    public String multiplicacaoDiferente(){
        int convA = Integer.parseInt(nuA, baseAtual);
        int convB = Integer.parseInt(nuB, baseAtual);
        Integer multiplicaçao = convA * convB;

        return  multiplicaçao.toString(multiplicaçao, baseConv);
    }

    public String divisaoDiferente(){
        int convA = Integer.parseInt(nuA, baseAtual);
        int convB = Integer.parseInt(nuB, baseAtual);
        Integer divisao = convA / convB;

        return divisao.toString(divisao, baseConv);
    }







}
