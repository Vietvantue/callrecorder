# Anroid Call Recorder

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Call%20Recorder-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/4544)

Android incomig and outgoing call recorder at any time.

# How to Use

```
callRecord = new CallRecord.Builder(this)
       .setRecordFileName("RecordFileName")
       .setRecordDirName("RecordDirName")
       .setRecordDirPath(Environment.getExternalStorageDirectory().getPath()) // optional & default value
       .setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB) // optional & default value
       .setOutputFormat(MediaRecorder.OutputFormat.AMR_NB) // optional & default value
       .setAudioSource(MediaRecorder.AudioSource.VOICE_COMMUNICATION) // optional & default value
       .setShowSeed(true) // optional & default value ->Ex: RecordFileName_incoming.amr || RecordFileName_outgoing.amr
       .build();


callRecord.startCallReceiver();
```

OR

```
callRecord = CallRecord.init(this);
```


**Stop CallRecord**

```
callRecord.stopCallReceiver();
```


---

If you wish run in Service;

```
callRecord = new CallRecord.Builder(this)
   .setRecordFileName("RecordFileName")
   .setRecordDirName("RecordDirName")
   .setRecordDirPath(Environment.getExternalStorageDirectory().getPath()) // optional & default value
   .setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB) // optional & default value
   .setOutputFormat(MediaRecorder.OutputFormat.AMR_NB) // optional & default value
   .setAudioSource(MediaRecorder.AudioSource.VOICE_COMMUNICATION) // optional & default value
   .setShowSeed(true) // optional & default value ->Ex: RecordFileName_incoming.amr || RecordFileName_outgoing.amr
   .buildService();


callRecord.startCallRecordService();
```


# Optimize

If you wish stop save CallRecord file;

```
callRecord.disableSaveFile();
```

and

```
callRecord.enableSaveFile();
```



If you wish change save file name after initialize CallRecorder,

```
callRecord.changeRecordFileName("NewFileName");
```
or
```
callRecord.changeRecordDirName("NewDirName");
```
or
```
callRecord.changeRecordDirPath("NewDirPath");
```


---

**Custom CallRecordReceiver**

```
callRecord.changeReceiver(new MyCallRecordReceiver(callRecord));
```


# Installation

Gradle

Add it as a dependency in your app's build.gradle file

```
compile 'com.aykuttasil:callrecord:1.2.4'

```


# Sample

You can see sample project in app folder.




