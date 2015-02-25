package mx.uv.universo.interfaces;

import mx.uv.universo.model.entities.PublicationFront;
import retrofit.http.GET;
import retrofit.http.Path;

public interface PublicationFrontService {
    public static final String BASE_URL = "http://www.uv.mx/universo/json/";

    @GET("{id}/main/")
    PublicationFront getPublicationFront(@Path("id") int id);
}
