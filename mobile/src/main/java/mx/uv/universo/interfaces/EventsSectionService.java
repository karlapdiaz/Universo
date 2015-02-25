package mx.uv.universo.interfaces;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

public interface EventsSectionService {
    public static final String BASE_URL = "http://www.uv.mx/universo/json/";

    @GET("{id}/eventos/")
    List<Object> getEventsSection(@Path("id") int id);
}
