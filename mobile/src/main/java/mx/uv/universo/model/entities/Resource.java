package mx.uv.universo.model.entities;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

public class Resource {
    private Integer type;
    private String title;
    private String source150;
    private String source300;
    private String source600;
    private String source1024;

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    private List<Photo> photos = new ArrayList<Photo>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource150() {
        return source150;
    }

    public void setSource150(String source150) {
        this.source150 = source150;
    }

    public String getSource300() {
        return source300;
    }

    public void setSource300(String source300) {
        this.source300 = source300;
    }

    public String getSource600() {
        return source600;
    }

    public void setSource600(String source600) {
        this.source600 = source600;
    }

    public String getSource1024() {
        return source1024;
    }

    public void setSource1024(String source1024) {
        this.source1024 = source1024;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
