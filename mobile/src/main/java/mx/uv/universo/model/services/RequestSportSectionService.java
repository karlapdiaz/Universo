package mx.uv.universo.model.services;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import mx.uv.universo.events.BusProvider;
import mx.uv.universo.events.PublicationsDownloadedEvent;
import mx.uv.universo.interfaces.SportSectionService;
import mx.uv.universo.model.entities.Sections;
import retrofit.RestAdapter;

public class RequestSportSectionService extends IntentService {
    protected final static String ID="ID";

    public RequestSportSectionService(String name) {
        super(name);
    }

    public static void callService(Activity activity, int id) {
        Intent intent = new Intent(activity, RequestSportSectionService.class);
        intent.putExtra(ID, id);
        activity.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Sections section= new Sections();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://www.uv.mx/universo/json/")
                .build();
        SportSectionService service=  restAdapter.create(SportSectionService.class);
        boolean errorDownload =false;
        List<Object> articles =null;

        try {
            articles = service.getSportSection(intent.getIntExtra(ID, 0));
            section.setArticles(articles);
        }catch (Exception e){
            articles= new ArrayList<Object>();
            errorDownload=true;
        }

        if (errorDownload==true){
            BusProvider.getInstance().post(new PublicationsDownloadedEvent(false, "Error de conexion", section));
        }else
            BusProvider.getInstance().post(new PublicationsDownloadedEvent(true, "", section));

    }
}
