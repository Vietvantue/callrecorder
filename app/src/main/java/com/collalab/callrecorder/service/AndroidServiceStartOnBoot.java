package com.collalab.callrecorder.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.collalab.callrecord.CallRecord;

public class AndroidServiceStartOnBoot extends Service {

    CallRecord mCallRecord;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mCallRecord = new CallRecord.Builder(this)
                .setRecordFileName("CallRecorderFile")
                .setRecordDirName("CallRecorderDir")
                .setShowSeed(true)
                .build();
        mCallRecord.startCallReceiver();

    }

}
