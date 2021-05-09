package ru.myitacademy.samsung.alarmtests

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.NOTIFICATION_SERVICE
import android.content.ContextWrapper
import android.content.Intent
import android.os.Build
import android.view.View
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat.getSystemService


class AlarmReceiverNotify : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
val CID = "TestNotify"
        val penIntent = PendingIntent.getActivity(context,1,
            Intent(context,ArtActivity::class.java), PendingIntent.FLAG_UPDATE_CURRENT)
        val builder = NotificationCompat.Builder(context,CID)
            .setSmallIcon(android.R.drawable.ic_dialog_email)
            .setContentTitle("Вам письмо")
            .setAutoCancel(true)
            .setContentText("Примите самые искренние пожелания добра и удачи!")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(penIntent)
            .build()
        with(NotificationManagerCompat.from(context)) {
            notify(102, builder)}

   }

}

