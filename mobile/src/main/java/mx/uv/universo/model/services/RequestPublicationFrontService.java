package mx.uv.universo.model.services;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import mx.uv.universo.events.BusProvider;
import mx.uv.universo.events.PublicationsDownloadedEvent;
import mx.uv.universo.interfaces.PublicationFrontService;
import mx.uv.universo.model.entities.Publication;
import mx.uv.universo.model.entities.PublicationFront;
import retrofit.RestAdapter;

public class RequestPublicationFrontService extends IntentService {
    protected final static String ID="ID";
    public RequestPublicationFrontService(String name) {
        super(name);
    }
    public static void callService(Activity activity, int id) {
        Intent intent = new Intent(activity, RequestPublicationFrontService.class);
        intent.putExtra(ID, id);
        activity.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        PublicationFront publicationFront= new PublicationFront();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://www.uv.mx/universo/json/")
                .build();
        PublicationFrontService service=  restAdapter.create(PublicationFrontService.class);
        boolean errorDownload =false;
        Publication publication=null;

        try {
            publication = service.getPublicationFront(intent.getIntExtra(ID,0));
            publicationFront.setPublication(publication);
        }catch (Exception e){
            publication= new Publication();
            errorDownload=true;
        }

        if (errorDownload==true){
            BusProvider.getInstance().post(new PublicationsDownloadedEvent(false, "Error de conexion", publicationFront));
        }else
            BusProvider.getInstance().post(new PublicationsDownloadedEvent(true, "", publicationFront));
    }

}
