package mx.uv.universo.interfaces;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

public interface CampusSectionService {
    public static final String BASE_URL = "http://www.uv.mx/universo/json/";

    @GET("{id}/campus/")
    List<Object> getCampusSection(@Path("id") int id);

}
