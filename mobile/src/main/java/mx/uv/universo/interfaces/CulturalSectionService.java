package mx.uv.universo.interfaces;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

public interface CulturalSectionService {
    public static final String BASE_URL = "http://www.uv.mx/universo/json/";

    @GET("{id}/cultura/")
    List<Object> getCulturalSection(@Path("id") int id);

}
