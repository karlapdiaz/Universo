package mx.uv.universo.model.services;


import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import mx.uv.universo.events.PublicationsDownloadedEvent;
import mx.uv.universo.model.entities.PublicationsList;
import retrofit.RestAdapter;
import mx.uv.universo.interfaces.PublicationsListService;
import mx.uv.universo.model.entities.Publication;
import mx.uv.universo.events.BusProvider;

public class ServiceMain extends IntentService {

    public ServiceMain(String name) {
        super(name);
    }
    public static void callService(Activity activity) {
        Intent intent = new Intent(activity, ServiceMain.class);
        activity.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        PublicationsList publicationsList= new PublicationsList();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://www.uv.mx/universo/json/")
                .build();
        PublicationsListService service=  restAdapter.create(PublicationsListService.class);
        boolean errorDownload =false;
        List<Publication> publications=null;

        try {
            publications = service.getPublications();
            publicationsList.setPublications(publications);
        }catch (Exception e){
            publications= new ArrayList<Publication>();
            errorDownload=true;
        }

        if (errorDownload==true){
            BusProvider.getInstance().post(new PublicationsDownloadedEvent(false, "Error de conexion", publicationsList));
        }else
            BusProvider.getInstance().post(new PublicationsDownloadedEvent(true, "", publicationsList));
        }

    }

