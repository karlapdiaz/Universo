package mx.uv.universo.events;

import mx.uv.universo.model.entities.PublicationFront;
import mx.uv.universo.model.entities.PublicationsList;
import mx.uv.universo.model.entities.Sections;

public class PublicationsDownloadedEvent {
    private boolean downloaded = false;
    private String message = "";
    private PublicationsList publicationslist = new PublicationsList();
    private PublicationFront publicationFront = new PublicationFront();
    private Sections sections = new Sections();

    public boolean isDownloaded() {
        return downloaded;
    }

    public void setDownloaded(boolean downloaded) {
        this.downloaded = downloaded;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PublicationsList getPublicationslist() {
        return publicationslist;
    }

    public void setPublicationslist(PublicationsList publicationslist) {
        this.publicationslist = publicationslist;
    }

    public PublicationFront getPublicationFront() {
        return publicationFront;
    }

    public void setPublicationFront(PublicationFront publicationFront) {
        this.publicationFront = publicationFront;
    }

    public Sections getSections() {
        return sections;
    }

    public void setSections(Sections sections) {
        this.sections = sections;
    }

    public PublicationsDownloadedEvent(boolean downloaded, String message, PublicationsList publicationslist ) {
        super();
        this.downloaded = downloaded;
        this.message = message;
        this.publicationslist = publicationslist;
    }

    public PublicationsDownloadedEvent(boolean downloaded, String message, PublicationFront publicationFront ) {
        super();
        this.downloaded = downloaded;
        this.message = message;
        this.publicationFront = publicationFront;
    }

    public PublicationsDownloadedEvent(boolean downloaded, String message, Sections sections ) {
        super();
        this.downloaded = downloaded;
        this.message = message;
        this.sections = sections;
    }
}
