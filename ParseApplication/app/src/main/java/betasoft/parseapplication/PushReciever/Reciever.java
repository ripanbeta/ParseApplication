package betasoft.parseapplication.PushReciever;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.parse.ParsePushBroadcastReceiver;
import betasoft.parseapplication.activity.MainActivity;

/**
 * Created by ripan on 28/8/15.
 */
public class Reciever extends ParsePushBroadcastReceiver {

    @Override
    protected void onPushOpen(Context arg0, Intent arg1) {
        // TODO Auto-generated method stub
        Intent i = new Intent(arg0, MainActivity.class);
        i.putExtras(arg1.getExtras());
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        arg0.startActivity(i);

    }

    @Override
    protected void onPushReceive(Context context, Intent intent) {
        super.onPushReceive(context, intent);
        Log.d("hello","hello");
    }
}


