/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;
import java.util.ArrayList;

/**
 *
 * @author Java
 */
public class StopWordsManager {
    
    public  ArrayList<String> stopWords;
    public  StopWordsManager instance;
    public ArrayList<String> pontuation;
    public  StopWordsManager() {
        stopWords = new ArrayList();
        stopWords.add(" de ");
        stopWords.add(" a ");
        stopWords.add(" o ");
        stopWords.add(" que ");
        stopWords.add(" e ");
        stopWords.add(" do ");
        stopWords.add(" da ");
        stopWords.add(" em ");
        stopWords.add(" um ");
        stopWords.add(" para ");
        stopWords.add(" é ");
        stopWords.add(" com ");
        stopWords.add(" não ");
        stopWords.add(" uma ");
        stopWords.add(" os ");
        stopWords.add(" no ");
        stopWords.add(" se ");
        stopWords.add(" na ");
        stopWords.add(" por ");
        stopWords.add(" mais ");
        stopWords.add(" as ");
        stopWords.add(" dos ");
        stopWords.add(" como ");
        stopWords.add(" mas ");
        stopWords.add(" foi ");
        stopWords.add(" ao ");
        stopWords.add(" ele ");
        stopWords.add(" das ");
        stopWords.add(" tem ");
        stopWords.add(" free ");
        stopWords.add(" à ");
        stopWords.add(" seu ");
        stopWords.add(" sua ");
        stopWords.add(" ou ");
        stopWords.add(" ser ");
        stopWords.add(" quando ");
        stopWords.add(" muito ");
        stopWords.add(" há ");
        stopWords.add(" nos ");
        stopWords.add(" já ");
        stopWords.add(" está ");
        stopWords.add(" eu ");
        stopWords.add(" também ");
        stopWords.add(" só ");
        stopWords.add(" pelo ");
        stopWords.add(" pela ");
        stopWords.add(" até ");
        stopWords.add(" isso ");
        stopWords.add(" ela ");
        stopWords.add(" entre ");
        stopWords.add(" era ");
        stopWords.add(" depois ");
        stopWords.add(" sem ");
        stopWords.add(" mesmo ");
        stopWords.add(" aos ");
        stopWords.add(" ter ");
        stopWords.add(" seus ");
        stopWords.add(" quem ");
        stopWords.add(" nas ");
        stopWords.add(" me ");
        stopWords.add(" esse ");
        stopWords.add(" eles ");
        stopWords.add(" estão ");
        stopWords.add(" você ");
        stopWords.add(" tinha ");
        stopWords.add(" foram ");
        stopWords.add(" essa ");
        stopWords.add(" num ");
        stopWords.add(" nem ");
        stopWords.add(" suas ");
        stopWords.add(" meu ");
        stopWords.add(" às ");
        stopWords.add(" minha ");
        stopWords.add(" têm ");
        stopWords.add(" numa ");
        stopWords.add(" pelos ");
        stopWords.add(" elas ");
        stopWords.add(" havia ");
        stopWords.add(" seja ");
        stopWords.add(" qual ");
        stopWords.add(" será ");
        stopWords.add(" nós ");
        stopWords.add(" tenho ");
        stopWords.add(" lhe ");
        stopWords.add(" deles ");
        stopWords.add(" essas ");
        stopWords.add(" esses ");
        stopWords.add(" pelas ");
        stopWords.add(" este ");
        stopWords.add(" fosse ");
        stopWords.add(" dele ");
        stopWords.add(" tu ");
        stopWords.add(" te ");
        stopWords.add(" vocês ");
        stopWords.add(" vos ");
        stopWords.add(" lhes ");
        stopWords.add(" meus ");
        stopWords.add(" minhas ");
        stopWords.add(" teu ");
        stopWords.add(" tua ");
        stopWords.add(" teus ");
        stopWords.add(" tuas ");
        stopWords.add(" nosso ");
        stopWords.add(" nossa ");
        stopWords.add(" nossos ");
        stopWords.add(" nossas ");
        stopWords.add(" dela ");
        stopWords.add(" delas ");
        stopWords.add(" esta ");
        stopWords.add(" estes ");
        stopWords.add(" estas ");
        stopWords.add(" aquele ");
        stopWords.add(" aquela ");
        stopWords.add(" aqueles ");
        stopWords.add(" aquelas ");
        stopWords.add(" isto ");
        stopWords.add(" aquilo ");
        stopWords.add(" estou ");
        stopWords.add(" está ");
        stopWords.add(" estamos ");
        stopWords.add(" estão ");
        stopWords.add(" estive ");
        stopWords.add(" esteve ");
        stopWords.add(" estivemos ");
        stopWords.add(" estiveram ");
        stopWords.add(" estava ");
        stopWords.add(" estávamos ");
        stopWords.add(" estavam ");
        stopWords.add(" estivera ");
        stopWords.add(" estivéramos ");
        stopWords.add(" esteja ");
        stopWords.add(" estejamos ");
        stopWords.add(" estejam ");
        stopWords.add(" estivesse ");
        stopWords.add(" estivéssemos ");
        stopWords.add(" estivessem ");
        stopWords.add(" estiver ");
        stopWords.add(" estivermos ");
        stopWords.add(" estiverem ");
        stopWords.add(" hei ");
        stopWords.add(" há ");
        stopWords.add(" havemos ");
        stopWords.add(" hão ");
        stopWords.add(" houve ");
        stopWords.add(" houvemos ");
        stopWords.add(" houveram ");
        stopWords.add(" houvera ");
        stopWords.add(" houvéramos ");
        stopWords.add(" haja ");
        stopWords.add(" hajamos ");
        stopWords.add(" hajam ");
        stopWords.add(" houvesse ");
        stopWords.add(" houvéssemos ");
        stopWords.add(" houvessem ");
        stopWords.add(" houver ");
        stopWords.add(" houvermos ");
        stopWords.add(" houverem ");
        stopWords.add(" houverei ");
        stopWords.add(" houverá ");
        stopWords.add(" houveremos ");
        stopWords.add(" houverão ");
        stopWords.add(" houveria ");
        stopWords.add(" houveríamos ");
        stopWords.add(" houveriam ");
        stopWords.add(" sou ");
        stopWords.add(" somos ");
        stopWords.add(" era ");
        stopWords.add(" éramos ");
        stopWords.add(" eram ");
        stopWords.add(" fui ");
        stopWords.add(" foi ");
        stopWords.add(" fomos ");
        stopWords.add(" foram ");
        stopWords.add(" fora ");
        stopWords.add(" fôramos ");
        stopWords.add(" seja ");
        stopWords.add(" sejamos ");
        stopWords.add(" sejam ");
        stopWords.add(" fosse ");
        stopWords.add(" fôssemos ");
        stopWords.add(" fossem ");
        stopWords.add(" for ");
        stopWords.add(" formos ");
        stopWords.add(" forem ");
        stopWords.add(" serei ");
        stopWords.add(" será ");
        stopWords.add(" seremos ");
        stopWords.add(" serão ");
        stopWords.add(" seria ");
        stopWords.add(" seríamos ");
        stopWords.add(" seriam ");
        stopWords.add(" tenho ");
        stopWords.add(" tem ");
        stopWords.add(" temos ");
        stopWords.add(" tém ");
        stopWords.add(" tinha ");
        stopWords.add(" tínhamos ");
        stopWords.add(" tinham ");
        stopWords.add(" tive ");
        stopWords.add(" teve ");
        stopWords.add(" tivemos ");
        stopWords.add(" tiveram ");
        stopWords.add(" tivera ");
        stopWords.add(" tivéramos ");
        stopWords.add(" tenha ");
        stopWords.add(" tenhamos ");
        stopWords.add(" tenham ");
        stopWords.add(" tivesse ");
        stopWords.add(" tivéssemos ");
        stopWords.add(" tivessem ");
        stopWords.add(" tiver ");
        stopWords.add(" tivermos ");
        stopWords.add(" tiverem ");
        stopWords.add(" terei ");
        stopWords.add(" terá ");
        stopWords.add(" teremos ");
        stopWords.add(" terão ");
        stopWords.add(" teria ");
        stopWords.add(" teríamos ");
        stopWords.add(" teriam ");
        pontuation = new ArrayList();
        pontuation.add(",");
        pontuation.add("\\.");
        pontuation.add("\\?");
        pontuation.add("!");
        pontuation.add("<b>");
        pontuation.add("</b>");
        pontuation.add("-");

    }
    public  StopWordsManager getInstance() {
        if(instance == null ){
            instance = new StopWordsManager();
        }
        return instance;
    }

    public  String removeStopWords(String text){
        for(String word: stopWords) {
            text = text.replaceAll(word, " ");
        }
        for(String word: pontuation) {
            text = text.replaceAll(word, "");
        }
        RemoveStopWord ss=new RemoveStopWord();
        text=RemoveStopWord.removeStopWords(text);
        return text;
    }
    
}