package mx.uv.universo.interfaces;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

public interface GeneralSectionService {
    public static final String BASE_URL = "http://www.uv.mx/universo/json/";

    @GET("id}/general/")
    List<Object> getGeneralSection(@Path("id") int id);

}
