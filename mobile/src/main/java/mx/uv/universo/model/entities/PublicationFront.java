package mx.uv.universo.model.entities;

    import java.util.HashMap;
    import java.util.Map;

public class PublicationFront extends Publication {
    private Publication publication;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}

