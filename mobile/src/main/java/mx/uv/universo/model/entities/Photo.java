package mx.uv.universo.model.entities;


import java.util.HashMap;
import java.util.Map;

public class Photo {
    private Integer ID;
    private String source150;
    private String source300;
    private String source600;
    private String source1024;
    private String titulo;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
