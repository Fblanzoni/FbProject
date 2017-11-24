

import com.inet.jortho.SpellChecker;
import com.inet.jortho.FileUserDictionary;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JTextPane;

public class CorretorOrtografico {
    
    public CorretorOrtografico(JTextPane teste){
        
        SpellChecker.setUserDictionaryProvider(new FileUserDictionary());
        
        try{
            SpellChecker.registerDictionaries(new URL("file", null, ""), "pt", "pt");
            SpellChecker.register(teste);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        
    }
    
}
