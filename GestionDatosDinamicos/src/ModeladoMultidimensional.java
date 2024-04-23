class Pareja<T, U> {
    private T primerElemento;
    private U segundoElemento;

    public Pareja(T primerElemento, U segundoElemento) {
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }

    public T getPrimerElemento() {
        return primerElemento;
    }

    public void setPrimerElemento(T primerElemento) {
        this.primerElemento = primerElemento;
    }

    public U getSegundoElemento() {
        return segundoElemento;
    }

    public void setSegundoElemento(U segundoElemento) {
        this.segundoElemento = segundoElemento;
    }
}

class DatosMultidimensionales {
    public static void main(String[] args) {
      
        Pareja<String, Integer> dato1 = new Pareja<>("A", 10);
        Pareja<String, Integer> dato2 = new Pareja<>("B", 20);

        System.out.println("Primer elemento de dato1: " + dato1.getPrimerElemento());
        System.out.println("Segundo elemento de dato2: " + dato2.getSegundoElemento());
    }
}
