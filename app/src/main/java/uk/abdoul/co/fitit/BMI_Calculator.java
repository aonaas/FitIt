package uk.abdoul.co.fitit;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by abdoul on 08/03/2018.
 */

public class BMI_Calculator extends Activity {
    EditText height,weight;
    TextView bmi_result;
    Button button;
    // Toast needs context
    final Context context = this;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_calculator);

        // Find UI elements by ID and save to variable
         height = (EditText) findViewById(R.id.height_input);
        weight = (EditText) findViewById(R.id.weight_input);
        bmi_result = (TextView) findViewById(R.id.bmi_result);
        button = (Button) findViewById(R.id.bmi_calc_button);



        // Listen for our click event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = height.getText().toString();
                String weightStr = weight.getText().toString();

                // Check for null
                if (height.getText().toString().length() < 1)
                {
                    sendToast("You must enter your height!");
                    // Abort the onClick if null
                    return;
                }
                if (weight.getText().toString().length() < 1)
                {
                    sendToast("You must enter your weight, sorry!");
                    // Abort the onClick if null
                    return;
                }
                // Passed the null checks, let's do some math!



                /***
                 * Android is funny this way, but you have
                 * to convert it back and forth from integer/float
                 * to strings, you'll get used to it. ;)
                 */
                // Convert height from string to float
                float h = Float.valueOf(height.getText().toString());
                float w = Float.valueOf(weight.getText().toString());

                /***
                 * Time for math!
                 * BMI is calculated
                 * (weigth in kg / (height in meter * height in meter)
                 * But since we want the user to input in CM, we just
                 * multiply it with 10 000 to get the correct value.
                 *
                 *
                 *
                 */


               if (heightStr != null && !"".equals(heightStr)
                        && weightStr != null  &&  !"".equals(weightStr)) {
                    float heightValue = Float.parseFloat(heightStr) / 100;
                    float weightValue = Float.parseFloat(weightStr);

                    float bmi = weightValue / (heightValue * heightValue);

                   displayBMI(bmi);
                }
              //  float BMI = w / (h * h) * 10000;

                // Set the bmi_result view item of the value of our BMI
               // bmi_result.setText(String.valueOf(BMI));

            }
        });


    }

    /***
     * This method will send the user a Toast
     * which is a small black popup that is
     * only visible for a few seconds.
     *
     * Our method takes one argument of a
     * String with the message.
     *
     * @param msg
     */


    public void sendToast(String msg)
    {
        // Get the message from our method call
        CharSequence text = msg;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }



    private void displayBMI(float bmi) {
        String bmiLabel = "";

        if (Float.compare(bmi, 15f) <= 0) {
            bmiLabel ="Very Severely Underweight";
        } else if (Float.compare(bmi, 15f) > 0  &&  Float.compare(bmi, 16f) <= 0) {
            bmiLabel = "Severely Underweight";
        } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
            bmiLabel = "Underweight";
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
            bmiLabel ="Normal";
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
            bmiLabel ="Overweight";
        } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
            bmiLabel ="Obese Class I(Moderate Obese)";
        } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
            bmiLabel = "Obese Class II(Severely Obese)";
        } else {
            bmiLabel = "Obese Class III(Very Severely Obese)";
        }

        bmiLabel = bmi + "\n\n" + bmiLabel;
        bmi_result.setText(bmiLabel);
    }
}
