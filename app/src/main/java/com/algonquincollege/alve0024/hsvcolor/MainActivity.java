/**
 *  Color picker Android app
 *  @author Leonardo Alps (alve0024)
 */
package com.algonquincollege.alve0024.hsvcolor;

import android.app.DialogFragment;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import android.graphics.drawable.Drawable;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Observable;
import java.util.Observer;

import model.HSVModel;

public class MainActivity extends AppCompatActivity
        implements Observer
        , SeekBar.OnSeekBarChangeListener {

    private static final String ABOUT_DIALOG_TAG;

    static {
        ABOUT_DIALOG_TAG = "About Dialog";
    }

    private TextView mColorSwatch;
    private SeekBar mHueSeekBar;
    private SeekBar mSaturationSeekBar;
    private SeekBar mLightnessSeekBar;
    private TextView mHueLabel;
    private TextView mSaturationLabel;
    private TextView mLightnessLabel;
    private Button mBlackButton;
    private Button mRedButton;
    private Button mLimeButton;
    private Button mBlueButton;
    private Button mYellowButton;
    private Button mCyanButton;
    private Button mMagentaButton;
    private Button mSilverButton;
    private Button mGrayButton;
    private Button mMaroonButton;
    private Button mOliveButton;
    private Button mGreenButton;
    private Button mPurpleButton;
    private Button mTealButton;
    private Button mNavyButton;
    private HSVModel mModel;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mModel = new HSVModel(0, 0, 0);
        mModel.addObserver(this);


        mColorSwatch = (TextView) findViewById(R.id.colorSwatch);
        // Label
        mHueLabel = (TextView) findViewById(R.id.hueLabel);
        mSaturationLabel = (TextView) findViewById(R.id.saturationLabel);
        mLightnessLabel = (TextView) findViewById(R.id.lightnessLabel);
        // SeekBar
        mHueSeekBar = (SeekBar) findViewById(R.id.hueSB);
        mSaturationSeekBar = (SeekBar) findViewById(R.id.saturationSB);
        mLightnessSeekBar = (SeekBar) findViewById(R.id.lightnessSB);
        // Button
        mBlackButton = (Button) findViewById(R.id.blackButton);
        mRedButton = (Button) findViewById(R.id.redButton);
        mLimeButton = (Button) findViewById(R.id.limeButton);
        mBlueButton = (Button) findViewById(R.id.blueButton);
        mYellowButton = (Button) findViewById(R.id.yellowButton);
        mCyanButton = (Button) findViewById(R.id.cyanButton);
        mMagentaButton = (Button) findViewById(R.id.margentaButton);
        mSilverButton = (Button) findViewById(R.id.silverButton);
        mGrayButton = (Button) findViewById(R.id.grayButton);
        mMaroonButton = (Button) findViewById(R.id.marronButton);
        mOliveButton = (Button) findViewById(R.id.oliveButton);
        mGreenButton = (Button) findViewById(R.id.greenButton);
        mPurpleButton = (Button) findViewById(R.id.purpleButton);
        mTealButton = (Button) findViewById(R.id.tealButton);
        mNavyButton = (Button) findViewById(R.id.navyButton);

        mHueSeekBar.setMax(mModel.MAX_HUE);
        mSaturationSeekBar.setMax(mModel.MAX_SATURATION);
        mLightnessSeekBar.setMax(mModel.MAX_LIGHTNESS);

        mHueSeekBar.setOnSeekBarChangeListener(this);
        mSaturationSeekBar.setOnSeekBarChangeListener(this);
        mLightnessSeekBar.setOnSeekBarChangeListener(this);


        mBlackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color = getResources().getColor(R.color.black);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mRedButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.red);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mLimeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.lime);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mBlueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.blue);
                float[] hsv = new float[4];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mYellowButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.yellow);
                float[] hsv = new float[4];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mCyanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.cyan);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mMagentaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.margenta);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mSilverButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.silver);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mGrayButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.gray);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mMaroonButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.marron);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mOliveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.olive);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mGreenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.green);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mPurpleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.purple);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mTealButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color = getResources().getColor(R.color.teal);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });

        mNavyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color = getResources().getColor(R.color.navy);
                float[] hsv = new float[3];
                Color.colorToHSV(color, hsv);
                mHueSeekBar.setProgress((int) hsv[0]);
                mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
                mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
                System.out.println("Hue: "+hsv[0]+" Sat: "+hsv[1]+" Lig: "+hsv[2]+" Col: "+color);
                Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+
                        "° S: "+(int) hsv[1]*100+"%"+
                        " V: "+(int) hsv[2]*100+"%", Toast.LENGTH_LONG ).show();
            }
        });


        mColorSwatch.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText( getApplicationContext(), "H: "+mModel.getHue()+
                                                         "° S: "+mModel.getSaturation()+
                                                         " V: "+mModel.getLightness(), Toast.LENGTH_LONG ).show();

                return false;
            }
        });

        this.updateView();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * Event handler for the <SeekBar>s: Hue, Saturation and Lightness
     */
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        // Did the user cause this event?
        // YES > continue
        // NO  > leave this method
//        if ( fromUser == false ) {
//            return;
//        }
        // Determine which <SeekBark> caused the event (switch + case)
        // GET the SeekBar's progress, and SET the model to it's new value
        switch (seekBar.getId()) {
            case R.id.hueSB:
                mModel.setHue(mHueSeekBar.getProgress());
                break;

            case R.id.saturationSB:
                mModel.setSaturation(mSaturationSeekBar.getProgress());
                break;

            case R.id.lightnessSB:
                mModel.setLightness(mLightnessSeekBar.getProgress());
                break;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // No-Operation
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // No-Operation
    }

    // The Model has changed state!
    // Refresh the View to display the current values of the Model.
    @Override
    public void update(Observable observable, Object o) {
        this.updateView();
    }

    private void updateHueSB() {
        mHueSeekBar.setProgress(mModel.getHue());
        CharSequence hueLabel = getResources().getText(R.string.hue_label);
        mHueLabel.setText(hueLabel + " " + mHueSeekBar.getProgress()+"°");
    }

    private void updateSaturationSB() {
        mSaturationSeekBar.setProgress(mModel.getSaturation());
        CharSequence saturationLabel = getResources().getText(R.string.saturation_label);
        mSaturationLabel.setText(saturationLabel + " " + mSaturationSeekBar.getProgress()+"%");
    }

    private void updateLightnessSB() {
        mLightnessSeekBar.setProgress(mModel.getLightness());
        CharSequence lightnessLabel = getResources().getText(R.string.lightness_label);
        mLightnessLabel.setText(lightnessLabel + " " + mLightnessSeekBar.getProgress()+"%");
    }

    private void updateColorSwatch() {
        int ColorSwatch = mModel.getColorFromHSV();
        System.out.println("ColorSwatch: "+ColorSwatch);
        mColorSwatch.setBackgroundColor(mModel.getColorFromHSV());
    }

    // synchronize each View component with the Model
    public void updateView() {
        this.updateColorSwatch();
        this.updateHueSB();
        this.updateSaturationSB();
        this.updateLightnessSB();
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }


    // Create the options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // TODO: add this method to handle when the user selects a menu item
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.about_dlg) {
            DialogFragment newFragment = new AboutDialogFragment();
            newFragment.show( getFragmentManager(), ABOUT_DIALOG_TAG );
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
