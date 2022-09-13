package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.support.ui.Sleeper;
import pages.HomePage;
import runner.RunCucumberTest;

class DescontosSteps extends RunCucumberTest {

    HomePage homepage = new HomePage( driver);

    private Sleeper Theread;

    @Dado("^que estou no site da qazando$")
    public void acessar_site_qazando(){
        HomePage.AcessarAplicacao();
    }
    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_email()throws interruptedException{
        homepage.scrollDown();
        homepage.preencheEmail();

    }

    @E("^clico em ganhar  cupom$")
    public void clico_em_ganhar_cupom(){
        homepage.clickGanharDesconto();
    }
    @Entao("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto(){
        homepage.verificarCupomDesconto();

    }
}
