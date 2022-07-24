package br.com.inatel.linguagens;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "linguagens")
public class Linguagem {
    @Id
    private String id;
    private String name;
    private String logoUrl;
    private int ranking;
    
    public Linguagem() {
    }

    public Linguagem(String id, String name, String logoUrl, int position) {
        this.name = name;
        this.logoUrl = logoUrl;
        this.ranking = position;
    }
    
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLogoUrl() {
        return logoUrl;
    }
    public int getRanking() {
        return ranking;
    }
}
