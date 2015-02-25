package mx.uv.universo.model.entities;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

public class Sections {
    private List<Object> articles = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Object> getArticles() {
        return articles;
    }

    public void setArticles(List<Object> articles) {
        this.articles = articles;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
