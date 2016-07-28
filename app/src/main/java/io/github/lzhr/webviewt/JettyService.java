package io.github.lzhr.webviewt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class JettyService extends Service {
    public JettyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
