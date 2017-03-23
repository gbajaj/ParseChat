package codepath.gauravbajaj.com.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.interceptors.ParseLogInterceptor;

/**
 * Created by gauravb on 3/22/17.
 */

public class ChatApplication extends Application {
    public ChatApplication() {
    }
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models here
        ParseObject.registerSubclass(Message.class);
        // Existing initialization happens after all classes are registered

        // For open-source Parse backend
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YOUR_APPLICATION_ID") // should correspond to APP_ID env variable
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server("https://myparseapp.herokuapp.com/parse/").build());

    }
}
