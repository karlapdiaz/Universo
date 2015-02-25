package mx.uv.universo.interfaces;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

public interface BackCoverService {
    public static final String BASE_URL = "http://www.uv.mx/universo/json/";

    @GET("{id}/contraportada/")
    List<Object> getBackCover(@Path("id") int id);

}
