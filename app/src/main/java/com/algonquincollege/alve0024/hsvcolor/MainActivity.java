/**
 *  Color picker Android app
 *  @author Leonardo Alps (alve0024)
 */
package com.algonquincollege.alve0024.hsvcolor;

import android.app.DialogFragment;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import java.util.Observable;
import java.util.Observer;

import model.HSVModel;

/**
 * MainActivity (Controller) - Implementing Observer's Interface
 *
 * Responsible to make the communication between the View and the Model
 *
 */
public class MainActivity extends AppCompatActivity
        implements Observer
        , SeekBar.OnSeekBarChangeListener {

    private static final String ABOUT_DIALOG_TAG;

    static {
        ABOUT_DIALOG_TAG = "About Dialog";
    }

    // Define the TextView from the View
    private TextView mColorSwatch;
    private TextView mHueLabel;
    private TextView mSaturationLabel;
    private TextView mLightnessLabel;
    // Define the SeekBar from the View
    private SeekBar mHueSeekBar;
    private SeekBar mSaturationSeekBar;
    private SeekBar mLightnessSeekBar;
    // Define the Button from the View
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
    // Define the Model
    private HSVModel mModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate the Model Class
        // Initiate with Black - Hue: 0° Sat: 0%  Val: 0%
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

        // Set max values to the SeekBar components from the Model
        mHueSeekBar.setMax(mModel.MAX_HUE);
        mSaturationSeekBar.setMax(mModel.MAX_SATURATION);
        mLightnessSeekBar.setMax(mModel.MAX_LIGHTNESS);

        // Set the Even Listener to the SeekBar
        mHueSeekBar.setOnSeekBarChangeListener(this);
        mSaturationSeekBar.setOnSeekBarChangeListener(this);
        mLightnessSeekBar.setOnSeekBarChangeListener(this);

        // BlackButton Event Listener
        mBlackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color = getResources().getColor(R.color.black);
                updateSeekBarProgress(color);
            }
        });

        /**
         * Implementation of the Event onClick of the Color Buttons
         * After read the color, the updateSeekBarProgress() method is called
         * and the Model and the View is updated
         */
        mRedButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.red);
                updateSeekBarProgress(color);
            }
        });


        mLimeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.lime);
                updateSeekBarProgress(color);
            }
        });

        mBlueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.blue);
                updateSeekBarProgress(color);
            }
        });

        mYellowButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.yellow);
                updateSeekBarProgress(color);
            }
        });

        mCyanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.cyan);
                updateSeekBarProgress(color);
            }
        });

        mMagentaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.margenta);
                updateSeekBarProgress(color);
            }
        });

        mSilverButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.silver);
                updateSeekBarProgress(color);
            }
        });

        mGrayButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.gray);
                updateSeekBarProgress(color);
            }
        });

        mMaroonButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.marron);
                updateSeekBarProgress(color);
            }
        });

        mOliveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.olive);
                updateSeekBarProgress(color);
            }
        });

        mGreenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.green);
                updateSeekBarProgress(color);
            }
        });

        mPurpleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color =  getResources().getColor(R.color.purple);
                updateSeekBarProgress(color);
            }
        });

        mTealButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color = getResources().getColor(R.color.teal);
                updateSeekBarProgress(color);
            }
        });

        mNavyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int color = getResources().getColor(R.color.navy);
                updateSeekBarProgress(color);
            }
        });


        /**
         * Set the Event OnLongClick of the Color Swatch displaying a toast message
         */
        mColorSwatch.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText( getApplicationContext(), "H: "+mModel.getHue()+"\u00B0 "+
                                                         "S: "+mModel.getSaturation()+"% "+
                                                         "V: "+mModel.getLightness()+"% ", Toast.LENGTH_SHORT ).show();

                return false;
            }
        });

        this.updateView();
    }

    /**
     * Event handler for the <SeekBar>s: Hue, Saturation and Lightness
     */
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        // Determine which <SeekBark> caused the event (switch + case)
        // GET the SeekBar's progress, and SET the model to it's new value
        if(fromUser) {
            switch (seekBar.getId()) {
                case R.id.hueSB:
                    mModel.setHue(mHueSeekBar.getProgress());
                    CharSequence hueLabel = getResources().getText(R.string.hue_label);
                    mHueLabel.setText(hueLabel + " " + mHueSeekBar.getProgress()+"\u00B0");
                    break;

                case R.id.saturationSB:
                    mModel.setSaturation(mSaturationSeekBar.getProgress());
                    CharSequence saturationLabel = getResources().getText(R.string.saturation_label);
                    mSaturationLabel.setText(saturationLabel + " " + mSaturationSeekBar.getProgress()+"%");
                    break;

                case R.id.lightnessSB:
                    mModel.setLightness(mLightnessSeekBar.getProgress());
                    CharSequence lightnessLabel = getResources().getText(R.string.lightness_label);
                    mLightnessLabel.setText(lightnessLabel + " " + mLightnessSeekBar.getProgress()+"%");
                    break;
            }
        } else {
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
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // No code in here
    }

    /**
     * This method is called automatically after the user releases SeekBar
     * Upates the label informing the user the status of the HSV
     * @param seekBar
     */
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        mHueLabel.setText(getResources().getText(R.string.hue_label));
        mSaturationLabel.setText(getResources().getText(R.string.saturation_label));
        mLightnessLabel.setText(getResources().getText(R.string.lightness_label));

    }

    // The Model has changed state!
    // Refresh the View to display the current values of the Model.
    @Override
    public void update(Observable observable, Object o) {
        this.updateView();
    }


    /**
     * Update the progress of the Hue SeekBar
     */
    private void updateHueSB() {
        mHueSeekBar.setProgress(mModel.getHue());

    }

    /**
     * Update the progress of the Saturation SeekBar
     */
    private void updateSaturationSB() {
        mSaturationSeekBar.setProgress(mModel.getSaturation());

    }

    /**
     * Update the progress of the Lightness SeekBar
     */
    private void updateLightnessSB() {
        mLightnessSeekBar.setProgress(mModel.getLightness());

    }

    /**
     * Update Color Swatch (TextView)
     */
    private void updateColorSwatch() {
        mColorSwatch.setBackgroundColor(mModel.getColorFromHSV());
    }

    /**
     * Synchronize each View component with the Model
     */
    public void updateView() {
        this.updateColorSwatch();
        this.updateHueSB();
        this.updateSaturationSB();
        this.updateLightnessSB();
    }


    /**
     * Create the options menu
     * @param menu
     * @return always true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


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

    /**
     * Method called onClick of each button
     * @param color is passed to be converted to HSV
     * and the View is updated.
     */
    public void updateSeekBarProgress(int color) {
        float[] hsv = new float[3];
        Color.colorToHSV(color, hsv);

        mHueSeekBar.setProgress((int) hsv[0]);
        mSaturationSeekBar.setProgress((int) (hsv[1] * 100));
        mLightnessSeekBar.setProgress((int) (hsv[2] * 100));
        Toast.makeText( getApplicationContext(), "H: "+(int) hsv[0]+"\u00B0 "+
                "S: "+(int) hsv[1]*100+"% "+
                "V: "+(int) hsv[2]*100+"% ", Toast.LENGTH_SHORT ).show();

    }
}
