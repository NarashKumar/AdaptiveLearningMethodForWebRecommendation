/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.customsearch.Customsearch;
import com.google.api.services.customsearch.model.Result;
import com.google.api.services.customsearch.model.Search;

import java.io.IOException;
import java.util.List;
/**
 *
 * @author Java
 */
public class Custom {

    static public String[] search(String query)
    {
 String a="";
 String b="";
 String c="";
  String d="";
 String e="";
 String f="";
  String g="";
 String h="";
 String i="";
  String j="";
 String k="";
 String l="";
  String m="";
 String n="";
 String o="";
  String p="";
 String q="";
 String r="";
  String s="";
 String t="";
 String u="";
  String v="";
 String w="";
 String x="";
  String y="";
 String z="";
 String aa="";
  String bb="";
 String cc="";
String dd="";

 
 
     Customsearch customsearch = new Customsearch(new NetHttpTransport(), new JacksonFactory(), new HttpRequestInitializer() {
            @Override
            public void initialize(HttpRequest httpRequest) throws IOException {

            }
        });
 String[] aaa = new String[20];
 String[] bbb = new String[20];
 String[] ccc = new String[20];

        try {
            com.google.api.services.customsearch.Customsearch.Cse.List list = customsearch.cse().list(query);
            list.setKey("AIzaSyBM2RwKYQ79Ni1YkghlCA4a5Pa50Q3tMgg");
            list.setCx("012717866225345692672:eyopo45yhi8");
            Search results = list.execute();
            List<Result> items = results.getItems();


            int ii=1;
            for(Result result: items)
            {
                System.out.println(ii);
//                System.out.println(result.getHtmlTitle());
//                System.out.println(result.getHtmlSnippet());
//                System.out.println(result.getFormattedUrl());
                aaa[ii]=result.getHtmlTitle();
                bbb[ii]=result.getHtmlSnippet();
                ccc[ii]=result.getFormattedUrl();
//                System.out.println(result);
                ++ii;

            }

        } catch (IOException ee) {
            // TODO Auto-generated catch block
            ee.printStackTrace();
        }
        a=aaa[1];
        b=bbb[1];
        c=ccc[1].replace("http://","").replace("https://","");
        d=aaa[2];
        e=bbb[2];
        f=ccc[2].replace("http://","").replace("https://","");
        g=aaa[3];
        h=bbb[3];
        i=ccc[3].replace("http://","").replace("https://","");
        j=aaa[4];
        k=bbb[4];
        l=ccc[4].replace("http://","").replace("https://","");
        m=aaa[5];
        n=bbb[5];
        o=ccc[5].replace("http://","").replace("https://","");
        p=aaa[6];
        q=bbb[6];
        r=ccc[6].replace("http://","").replace("https://","");
        s=aaa[7];
        t=bbb[7];
        u=ccc[7].replace("http://","").replace("https://","");
        v=aaa[8];
        w=bbb[8];
        x=ccc[8].replace("http://","").replace("https://","");
        y=aaa[9];
        z=bbb[9];
        aa=ccc[9].replace("http://","").replace("https://","");
        bb=aaa[10];
        cc=bbb[10];
        dd=ccc[10].replace("http://","").replace("https://","");
                
                
     return new String[] {a, b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,aa,bb,cc,dd};
}
}