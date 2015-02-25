package mx.uv.universo.interfaces;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

public interface SportSectionService {
    public static final String BASE_URL = "http://www.uv.mx/universo/json/";

    @GET("id}/deportes/")
    List<Object> getSportSection(@Path("id") int id);
    
}
