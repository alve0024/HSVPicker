/**
 * Created by Leonardo Alps (alve0024@algonquinlive.com)
 *
 * Implementation of the HSV Model
 *
 */

package model;


import java.util.Observable;
import android.graphics.Color;


public class HSVModel extends Observable {

    // CLASS VARIABLES
    public static final Integer MAX_HUE = 359;
    public static final Integer MAX_SATURATION = 100;  // This is in %
    public static final Integer MAX_LIGHTNESS = 100;   // This is in %
    public static final Integer MIN_HUE = 0;
    public static final Integer MIN_SATURATION = 0;    // This is in %
    public static final Integer MIN_LIGHTNESS = 0;     // This is in %

    // INSTANCE VARIABLES
    private Integer hue;
    private Integer saturation;
    private Integer lightness;

    public HSVModel() {
        this(MIN_HUE, MIN_SATURATION, MIN_LIGHTNESS);
    }

    public HSVModel(Integer hue, Integer saturation, Integer lightness ) {
        this.hue = hue;
        this.saturation = saturation;
        this.lightness = lightness;
    }

    // Setters
    public void setHue(Integer hue) {
        this.hue = hue;
        this.updateObservers();
    }

    public void setSaturation(Integer saturation) {
        this.saturation = saturation;
        this.updateObservers();
    }

    public void setLightness(Integer lightness) {
        this.lightness = lightness;
        this.updateObservers();
    }

    // Getters
    public Integer getHue() {
        return hue;
    }

    public Integer getSaturation() {
        return saturation;
    }

    public Integer getLightness() {
        return lightness;
    }

    public int getColorFromHSV() {
        int alpha = 0xFF;
        float[] hsv = new float[3];

        hsv[0] = this.hue;
        hsv[1] = (float) this.saturation / 100;
        hsv[2] = (float) this.lightness  / 100;
        return Color.HSVToColor(alpha, hsv);
    }

    // the model has changed!
    // broadcast the update method to all registered observers
    private void updateObservers() {
        this.setChanged();
        this.notifyObservers();
    }

}
