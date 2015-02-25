package mx.uv.universo.model.entities;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.List;

public class Publication {
    private Integer id;
    private Integer year;
    private Integer date;
    private String title;
    private String thumbnail;
    private String urlPdf;
    private Main main;
    private List<Secondary> secondary = new ArrayList<Secondary>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUrlPdf() {
        return urlPdf;
    }

    public void setUrlPdf(String urlPdf) {
        this.urlPdf = urlPdf;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
