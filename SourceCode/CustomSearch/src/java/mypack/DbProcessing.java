/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author Java
 */
public class DbProcessing {
    
    public void Process()
    {
        
//        HttpSession session = request.getSession(true);
//        String l=session.getAttribute("l").toString();
        String text="";
    StopWordsManager sw=new StopWordsManager();
    text = sw.removeStopWords(text);
   
    }
}
