public class Avaliador {

    private static final double Zero = 0;
    private double maiorDeTodos = 0;
    private double menorDeTodos = Double.MAX_VALUE;
    private double usuarioInexistente = 0;

    public void avalia(Leilao leilao) {
        for (Lance lance : leilao.getLances()) {
            if (lance.getValor() > maiorDeTodos) {
                maiorDeTodos = lance.getValor();
            } if (lance.getValor() < menorDeTodos) {
                menorDeTodos = lance.getValor();
            }
        }
    }

    public double getUsuarioinexistente() {
        return usuarioInexistente;
    }

    public void setUsuarioinexistente(double usuarioinexistente) {
        this.usuarioInexistente = usuarioinexistente;
    }

    public double getMaiorLance() {
        return maiorDeTodos;
    }

    public double getMenorLance() {
        return menorDeTodos;
    }

    public double get0Lance() {
        return Zero;
    }
}