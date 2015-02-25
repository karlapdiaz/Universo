package mx.uv.universo.interfaces;

    import java.util.List;

    import mx.uv.universo.model.entities.Publication;
    import retrofit.http.GET;

public interface PublicationsListService {
    public static final String BASE_URL = "http://www.uv.mx/universo/json/";

    @GET("previo/")
    List<Publication> getPublications();

}
