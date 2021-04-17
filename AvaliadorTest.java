import java.beans.Transient;

import jdk.jfr.Timestamp;

public class AvaliadorTest {

    private Object Assert;
    
    @Test
    public void testSeMenorValorEstaSendoAvaliado() {
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");
        
        Leilao leilao = new Leilao("Playstation 3 Novo");
        leilao.propoe(new Lance(joao, 100.0));
        leilao.propoe(new Lance(jose, 400.0));
        leilao.propoe(new Lance(maria, 250.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);		
        assertEquals(100.0, leiloeiro.getMenorLance(), 0.01);        
    }

    private void assertEquals(double d, double menorLance, double e) {
    }

    @Test
    public void testSeMaiorValorEstaSendoAvaliado() {
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");
        
        Leilao leilao = new Leilao("Playstation 3 Novo");
        leilao.propoe(new Lance(joao, 100.0));
        leilao.propoe(new Lance(jose, 400.0));
        leilao.propoe(new Lance(maria, 250.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);		
        assertEquals(400.0, leiloeiro.getMaiorLance(), 0.01);        
    }
    
    @Test

    public void testUsuarioInexistente() {
        Usuario marcos = new Usuario("Marcos");

        Leilao leilao = new Leilao("Playstation 3 Novo");
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);		
        assertEquals(200.0, leiloeiro.getMaiorLance(), 0.01); 

    }

    @Test
    
    public void testIsEmpty(); {
        boolean b;

        b = StringUtil.IsEmpty(null);
        Assert.assertFalse(b);

    }
    
    @Test
    
    public void testUsuario() {
        Usuario joao = new Usuario("João");

        Leilao leilao = new Leilao("Playstation 3 Novo");
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);		
        assertEquals(0.0); 
    }

    @Test

    public void testLeilao() {
        double menorLance;
        
        Leilao leilao = new Leilao(null);
        double sun = leilao.sun(100, 250);
        assertEquals(100, menorLance, 250);
    }

    @Test

    public void testLeilao() {
        double maiorLance;
        
        Leilao leilao = new Leilao(null);
        double sun = leilao.sun(250, 100);
        assertEquals(250, maiorLance, 100);
    }

    @Test

    public void testeAll() {

        Usuario u = new Usuario();
        
        assertEquals("João", 100);
        assertEquals("José", 400);
        assertEquals("Maria", 250);

        assertTrue((u.Usuario(1)));
        assertTrue((u.Usuario(2)));
        assertTrue((u.Usuario(3)));
    }

    private void assertEquals(String string, int i) {
    }

    @Test 

    public void testValoresEstaoSendoAvaliado() {
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");
        Usuario lucas = new Usuario("Lucas");
        Usuario rafaela = new Usuario("Rafaela");
        Usuario larissa = new Usuario("Larissa");
        
        Leilao leilao = new Leilao("Playstation 3 Novo");
        leilao.propoe(new Lance(joao, 90.0));
        leilao.propoe(new Lance(jose, 400.0));
        leilao.propoe(new Lance(maria, 250.0));
        leilao.propoe(new Lance(lucas, 300.0));
        leilao.propoe(new Lance(rafaela, 700.0));
        leilao.propoe(new Lance(larissa, 850.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);		
        assertEquals(90.0, leiloeiro.getMenorLance(), 0.01);    
    }

    @Test

    public void testSe1ValorEstaSendoAvaliado() {
        Usuario joao = new Usuario("João");
        
        Leilao leilao = new Leilao("Playstation 3 Novo");
        leilao.propoe(new Lance(joao, 90.0));
    
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);		
        assertEquals(90.0, leiloeiro.getMenorLance(), 0.01);    
    }
}