package ng.com.donsoft.fitit.Grid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import ng.com.donsoft.fitit.R;

/**
 * Created by Donchi4all on 01/03/2018.
 */

public class Exercise_final_dash extends Activity {
    TextView  titleTextView,steps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash_layout);

        String title = getIntent().getStringExtra("txttitle");
        //  Bitmap bitmap = getIntent().getParcelableExtra("image");
        titleTextView = (TextView) findViewById(R.id.txtTitle);
        steps = (TextView) findViewById(R.id.steps);

        PasteData();

    }




    public void PasteData() {


        if (getIntent().getStringExtra("txttitle").equalsIgnoreCase("Dip")) {

            steps.setText("\1\n" +
                    "Find a bench to use for your bench dips. A regular exercise bench is preferred, but you can also use a wide chair or your couch if you don't have access to an exercise bench. Whatever item you're using for your bench dips, it should be two to three feet off of the ground. Make sure that whatever you're using for a bench is at least as wide is your shoulders and is absolutely stable.[1]\n" +
                    "\n" +
                    "    All gyms have exercise benches, and they can also be purchased online or at most fitness stores or big box stores.\n" +
                    "    You will be placing all your weight on one side of the bench, so make sure that whatever you use, it will not tip over.\n" +
                    "\n" +
                    "2\n" +
                    "Grip the edge of your bench with your hands. Place your hands onto the edge of your bench, one hand on each side of your hips. Your palms should be down, fingertips pointing forward and towards the floor, and thumbs next to your hips.\n" +
                    "\n" +
                    "3\n" +
                    "Lift your butt off of the bench. Use your arms to push your butt up and off the bench. Firmly grip the edge of the bench as you straighten your arms and extend your legs forward so that your knees are no longer bent. Walk your feet out slightly so that your butt is in front of the bench. This will be your starting position.\n" +
                    "\n" +
                    "4\n" +
                    "Try a more difficult version of a bench dip. To increase difficulty, do this exercise with your feet propped up on another exercise bench or chair instead of the floor. This will add more weight for your triceps to lift, resulting in a more intense workout. Make sure that the other bench or chair that you prop your feet on is sturdy, otherwise it could flip over.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").equalsIgnoreCase("Cable Rope Triceps Pushdown")) {

            steps.setText("    " +
                    "1.  Attach a rope attachment to a high pulley and grab with a neutral grip (palms facing each other).\n" +
                    "2.    Standing upright with the torso straight and a very small inclination forward, bring the upper arms close to your body and perpendicular to the floor. The forearms should be pointing up towards the pulley as they hold the rope with the palms facing each other. This is your starting position.\n" +
                    "3.    Using the triceps, bring the rope down as you bring each side of the rope to the side of your thighs. At the end of the movement the arms are fully extended and perpendicular to the floor. The upper arms should always remain stationary next to your torso and only the forearms should move. Exhale as you perform this movement.\n" +
                    "4.    After holding for a second, at the contracted position, bring the rope slowly up to the starting point. Breathe in as you perform this step.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "Variations: There are many variations to this movement. For instance you can use an E-Z bar attachment as well as a V-angled bar or straight bar.\n" +
                    "\n" +
                    "Same as the Triceps Pushdown except with the rope attachment.");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Cable triceps pushdown")) {

            steps.setText("How to do the Wide-Grip Lat Pulldown:\n" +
                    "\n" +
                    "    Step 1: Position yourself at a lat pulldown machine so that your thighs are under the leg pads.\n" +
                    "    Step 2: Grasp the bar with your arms fully extended, palms facing forward, and your hands wider than shoulder width apart.\n" +
                    "    Step 3: Curve your back approximately 30 degrees and protrude your chest. This is your starting position.\n" +
                    "    Step 4: Exhale as you lower the bar straight down to your chest.\n" +
                    "    Step 5: Contract your back muscles for a moment and then inhale as you reverse the motion back to the starting position.\n" +
                    "    Step 6: Repeat for a complete set.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }


        if (getIntent().getStringExtra("txttitle").contains("Cable triceps pushdown")) {

            steps.setText("      " +
                    "1.  Pick a couple of dumbbells and stand with a straight torso and the dumbbells by your side at arms length with the palms of the hand facing you. This will be your starting position.\n" +
                    "2.  While maintaining the torso in a stationary position (no swinging), lift the dumbbells to your side with a slight bend on the elbow and the hands slightly tilted forward as if pouring water in a glass. Continue to go up until you arms are parallel to the floor. Exhale as you execute this movement and pause for a second at the top.\n" +
                    "3.  Lower the dumbbells back down slowly to the starting position as you inhale.\n" +
                    "4.  Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "Variation: This exercise can also be performed sitting down");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Dumbbell Standing Triceps Extention")) {

            steps.setText("      " +
                    "1.    Begin with the barbell supported on top of the traps. The chest should be up and the head facing forward. Adopt a hip-width stance with the feet turned out as needed.\n" +
                    "2.    Descend by flexing the knees, refraining from moving the hips back as much as possible. This requires that the knees travel forward. Ensure that they stay align with the feet. The goal is to keep the torso as upright as possible.\n" +
                    "3.    Continue all the way down, keeping the weight on the front of the heel. At the moment the upper legs contact the lower legs reverse the motion, driving the weight upward. \n" +
                    "\n" +
                    "\n    This exercise is best performed inside a squat rack for safety purposes. To begin, first set the bar on a rack just below shoulder level. Once the correct height is chosen and the bar is loaded, step under the bar and place the back of your shoulders (slightly below the neck) across it.\n" +
                    "4.   Hold on to the bar using both arms at each side and lift it off the rack by first pushing with your legs and at the same time straightening your torso.\n" +
                    "5.   Step away from the rack and step forward with your right leg and squat down through your hips, while keeping the torso upright and maintaining balance. Inhale as you go down. Note: Do not allow your knee to go forward beyond your toes as you come down, as this will put undue stress on the knee joint. li>\n" +
                    "6.    Using mainly the heel of your foot, push up and go back to the starting position as you exhale.\n" +
                    "7.    Repeat the movement for the recommended amount of repetitions and then perform with the left leg.\n" +
                    "\n" +
                    "Caution: This is a movement that requires a great deal of balance so if you suffer from balance problems you may wish to either avoid it or just use your own bodyweight while holding on to a fixed object. Definitely never perform with a barbell on your back if you suffer from balance issues.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Barbell Close Grip Bench Press")) {

            steps.setText("Muscles\n" +
                    "\n" +
                    "Pectoralis major, anterior deltoid, triceps\n" +
                    "\n" +
                    "Procedure\n" +
                    "\n" +
                    "    Lie on your back with your feet flat on the floor. If your feet don’t reach the floor, use a stable board to accommodate size. Grasp the barbell with a wider than shoulder-width grip, wrapping thumbs around the bar. Hold the barbell at arm’s length above your upper-chest area.\n" +
                    "    Slowly lower the barbell to the middle of your chest. In the bottom position the forearms should be perpendicular to the floor. Pause briefly, then press the barbell to the starting position. During the movement, the upper arms should be about 45 to 60 degrees from the torso and the hips should remain on the bench.\n" +
                    "\n" +
                    "\n" +
                    "Technique Tips\n" +
                    "\n" +
                    "A spotter should be behind the lifter’s head and should assist the lifter with getting the barbell into the starting position and returning the barbell to the rack when finished. Impress on young weight trainers the importance of a spotter during the exercise because the bar is pressed over the lifter’s face, neck, and chest.\n" +
                    "\n" +
                    "Learn this exercise with an unloaded barbell or light weight.\n" +
                    "\n" +
                    "Do not bounce the barbell off the chest, and do not lift your buttocks off the bench during this exercise.\n" +
                    "\n" +
                    "To avoid hitting the upright supports, position your shoulders at least 3 inches (~8 cm) from the supports before you start.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Bench Dip")) {

            steps.setText("\n" +
                    "\n" +
                    " 1.   Load the bar to an appropriate weight for your training.\n" +
                    " 2.   Lay on the bench with your feet flat on the ground, driving through to your hips. Your back should be arched, and your shoulder blades retracted.\n" +
                    " 3.   Take a medium, pronated grip covering the rings on the bar. Remove the bar from the rack, holding the weight above your chest with your arms extended. This will be your starting position.\n" +
                    " 4.   Lower the bar to the sternum by flexing the elbows. Maintain control and do not bounce the bar off of your chest. Your lats should stay tight and elbows slightly drawn in.\n" +
                    " 5.   After touching your torso with the bar, extend the elbows to return the bar to the starting position.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }
        if (getIntent().getStringExtra("txttitle").contains("Barbell Tricep Extention")) {

            steps.setText(" " +
                    "1.    While holding a barbell or EZ Curl bar with a pronated grip (palms facing forward), lie on your back on a flat bench with your head close to the end of the bench. Tip: If you are holding a barbell grab it using a shoulder-width grip and if you are using an E-Z Bar grab it on the inner handles.\n" +
                    "2.    Extend your arms in front of you and slowly bring the bar back in a semi circular motion (while keeping the arms extended) to a position over your head. At the end of this step your arms should be overhead and perpendicular to the floor. This will be your starting position. Tip: Keep your elbows in at all times.\n" +
                    "3.    As you inhale, lower the bar by bending at the elbows and while keeping the upper arm stationary. Keep lowering the bar until your forearms are perpendicular to the floor.\n" +
                    "4.    As you exhale bring the bar back up to the starting position by pushing the bar up in a semi-circular motion until the lower arms are also parallel to the floor. Contract the triceps hard at the top of the movement for a second. Tip: Again, only the forearms should move. The upper arms should remain stationary at all times.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "Variation: You can use dumbbells to make the exercise more challenging.");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }


        if (getIntent().getStringExtra("txttitle").contains("Dumbbell Tricep Kickback")) {

            steps.setText(" " +
                    "1. Walk to the bar. Stand with your mid-foot under the bar. Your shins shouldn’t touch it yet. Put your heels hip-width apart, narrower than on Squats. Point your toes out 15°.\n" +
                    "2. Grab the bar. Bend over without bending your legs. Grip the bar narrow, about shoulder-width apart like on the Overhead Press. Your arms must be vertical when looking from the front.\n" +
                    "3. Bend your knees. Drop into position by bending your knees until your shins touch the bar. Do NOT let the bar move away from your mid-foot. If it moves, start from scratch with step one.\n" +
                    "4. Lift your chest. Straighten your back by raising you chest. Do not change your position – keep the bar over your mid-foot, your shins against the bar, and your hips where they are.\n" +
                    "5. Pull. Take a big breath, hold it and stand up with the weight. Keep the bar in contact with your legs while you pull. Don’t shrug or lean back at the top. Lock your hips and knees.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }


        if (getIntent().getStringExtra("txttitle").equalsIgnoreCase("FOREARM")) {

            steps.setText(" " +
                    "1. Walk to the bar. Stand with your mid-foot under the bar. Your shins shouldn’t touch it yet. Put your heels hip-width apart, narrower than on Squats. Point your toes out 15°.\n" +
                    "2. Grab the bar. Bend over without bending your legs. Grip the bar narrow, about shoulder-width apart like on the Overhead Press. Your arms must be vertical when looking from the front.\n" +
                    "3. Bend your knees. Drop into position by bending your knees until your shins touch the bar. Do NOT let the bar move away from your mid-foot. If it moves, start from scratch with step one.\n" +
                    "4. Lift your chest. Straighten your back by raising you chest. Do not change your position – keep the bar over your mid-foot, your shins against the bar, and your hips where they are.\n" +
                    "5. Pull. Take a big breath, hold it and stand up with the weight. Keep the bar in contact with your legs while you pull. Don’t shrug or lean back at the top. Lock your hips and knees.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }


        if (getIntent().getStringExtra("txttitle").equalsIgnoreCase("GLUTES")) {

            steps.setText(" " +
                    "1. Walk to the bar. Stand with your mid-foot under the bar. Your shins shouldn’t touch it yet. Put your heels hip-width apart, narrower than on Squats. Point your toes out 15°.\n" +
                    "2. Grab the bar. Bend over without bending your legs. Grip the bar narrow, about shoulder-width apart like on the Overhead Press. Your arms must be vertical when looking from the front.\n" +
                    "3. Bend your knees. Drop into position by bending your knees until your shins touch the bar. Do NOT let the bar move away from your mid-foot. If it moves, start from scratch with step one.\n" +
                    "4. Lift your chest. Straighten your back by raising you chest. Do not change your position – keep the bar over your mid-foot, your shins against the bar, and your hips where they are.\n" +
                    "5. Pull. Take a big breath, hold it and stand up with the weight. Keep the bar in contact with your legs while you pull. Don’t shrug or lean back at the top. Lock your hips and knees.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("back")) {

            steps.setText("    " +
                    "1.  Attach a rope attachment to a high pulley and grab with a neutral grip (palms facing each other).\n" +
                    "2.    Standing upright with the torso straight and a very small inclination forward, bring the upper arms close to your body and perpendicular to the floor. The forearms should be pointing up towards the pulley as they hold the rope with the palms facing each other. This is your starting position.\n" +
                    "3.    Using the triceps, bring the rope down as you bring each side of the rope to the side of your thighs. At the end of the movement the arms are fully extended and perpendicular to the floor. The upper arms should always remain stationary next to your torso and only the forearms should move. Exhale as you perform this movement.\n" +
                    "4.    After holding for a second, at the contracted position, bring the rope slowly up to the starting point. Breathe in as you perform this step.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "Variations: There are many variations to this movement. For instance you can use an E-Z bar attachment as well as a V-angled bar or straight bar.\n" +
                    "\n" +
                    "Same as the Triceps Pushdown except with the rope attachment.");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }



        if (getIntent().getStringExtra("txttitle").contains("Cable Rope Overheaded Triceps Extention")) {

            steps.setText("    " +
                    "1.  Attach a rope attachment to a high pulley and grab with a neutral grip (palms facing each other).\n" +
                    "2.    Standing upright with the torso straight and a very small inclination forward, bring the upper arms close to your body and perpendicular to the floor. The forearms should be pointing up towards the pulley as they hold the rope with the palms facing each other. This is your starting position.\n" +
                    "3.    Using the triceps, bring the rope down as you bring each side of the rope to the side of your thighs. At the end of the movement the arms are fully extended and perpendicular to the floor. The upper arms should always remain stationary next to your torso and only the forearms should move. Exhale as you perform this movement.\n" +
                    "4.    After holding for a second, at the contracted position, bring the rope slowly up to the starting point. Breathe in as you perform this step.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "Variations: There are many variations to this movement. For instance you can use an E-Z bar attachment as well as a V-angled bar or straight bar.\n" +
                    "\n" +
                    "Same as the Triceps Pushdown except with the rope attachment.");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }







        if (getIntent().getStringExtra("txttitle").contains("Chest Lat Pulldown")) {

            steps.setText("How to do the Wide-Grip Lat Pulldown:\n" +
                    "\n" +
                    "    Step 1: Position yourself at a lat pulldown machine so that your thighs are under the leg pads.\n" +
                    "    Step 2: Grasp the bar with your arms fully extended, palms facing forward, and your hands wider than shoulder width apart.\n" +
                    "    Step 3: Curve your back approximately 30 degrees and protrude your chest. This is your starting position.\n" +
                    "    Step 4: Exhale as you lower the bar straight down to your chest.\n" +
                    "    Step 5: Contract your back muscles for a moment and then inhale as you reverse the motion back to the starting position.\n" +
                    "    Step 6: Repeat for a complete set.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }




        if (getIntent().getStringExtra("txttitle").contains("Barbell Shoulder Press")) {

            steps.setText("" +
                    "1.     Sit on a bench with back support in a squat rack. Position a barbell at a height that is just above your head. Grab the barbell with a pronated grip (palms facing forward).\n" +
                    "2.    Once you pick up the barbell with the correct grip width, lift the bar up over your head by locking your arms. Hold at about shoulder level and slightly in front of your head. This is your starting position.\n" +
                    "3.    Lower the bar down to the shoulders slowly as you inhale.\n" +
                    "4.    Lift the bar back up to the starting position as you exhale.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }





        if (getIntent().getStringExtra("txttitle").contains("chest")) {

            steps.setText("" +
                    "1.     Sit on a bench with back support in a squat rack. Position a barbell at a height that is just above your head. Grab the barbell with a pronated grip (palms facing forward).\n" +
                    "2.    Once you pick up the barbell with the correct grip width, lift the bar up over your head by locking your arms. Hold at about shoulder level and slightly in front of your head. This is your starting position.\n" +
                    "3.    Lower the bar down to the shoulders slowly as you inhale.\n" +
                    "4.    Lift the bar back up to the starting position as you exhale.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }







        if (getIntent().getStringExtra("txttitle").contains("shoulder")) {

            steps.setText("" +
                    "1.     Sit on a bench with back support in a squat rack. Position a barbell at a height that is just above your head. Grab the barbell with a pronated grip (palms facing forward).\n" +
                    "2.    Once you pick up the barbell with the correct grip width, lift the bar up over your head by locking your arms. Hold at about shoulder level and slightly in front of your head. This is your starting position.\n" +
                    "3.    Lower the bar down to the shoulders slowly as you inhale.\n" +
                    "4.    Lift the bar back up to the starting position as you exhale.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }



        if (getIntent().getStringExtra("txttitle").contains("Biceps")) {

            steps.setText("" +
                    "1.     Sit on a bench with back support in a squat rack. Position a barbell at a height that is just above your head. Grab the barbell with a pronated grip (palms facing forward).\n" +
                    "2.    Once you pick up the barbell with the correct grip width, lift the bar up over your head by locking your arms. Hold at about shoulder level and slightly in front of your head. This is your starting position.\n" +
                    "3.    Lower the bar down to the shoulders slowly as you inhale.\n" +
                    "4.    Lift the bar back up to the starting position as you exhale.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }



        if (getIntent().getStringExtra("txttitle").contains("abs")) {

            steps.setText("" +
                    "1.     Sit on a bench with back support in a squat rack. Position a barbell at a height that is just above your head. Grab the barbell with a pronated grip (palms facing forward).\n" +
                    "2.    Once you pick up the barbell with the correct grip width, lift the bar up over your head by locking your arms. Hold at about shoulder level and slightly in front of your head. This is your starting position.\n" +
                    "3.    Lower the bar down to the shoulders slowly as you inhale.\n" +
                    "4.    Lift the bar back up to the starting position as you exhale.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }














































        if (getIntent().getStringExtra("txttitle").contains("Cable Rope Biceps")) {

            steps.setText("Muscles\n" +
                    "\n" +
                    "Pectoralis major, anterior deltoid, triceps\n" +
                    "\n" +
                    "Procedure\n" +
                    "\n" +
                    "    Lie on your back with your feet flat on the floor. If your feet don’t reach the floor, use a stable board to accommodate size. Grasp the barbell with a wider than shoulder-width grip, wrapping thumbs around the bar. Hold the barbell at arm’s length above your upper-chest area.\n" +
                    "    Slowly lower the barbell to the middle of your chest. In the bottom position the forearms should be perpendicular to the floor. Pause briefly, then press the barbell to the starting position. During the movement, the upper arms should be about 45 to 60 degrees from the torso and the hips should remain on the bench.\n" +
                    "\n" +
                    "\n" +
                    "Technique Tips\n" +
                    "\n" +
                    "A spotter should be behind the lifter’s head and should assist the lifter with getting the barbell into the starting position and returning the barbell to the rack when finished. Impress on young weight trainers the importance of a spotter during the exercise because the bar is pressed over the lifter’s face, neck, and chest.\n" +
                    "\n" +
                    "Learn this exercise with an unloaded barbell or light weight.\n" +
                    "\n" +
                    "Do not bounce the barbell off the chest, and do not lift your buttocks off the bench during this exercise.\n" +
                    "\n" +
                    "To avoid hitting the upright supports, position your shoulders at least 3 inches (~8 cm) from the supports before you start.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        //covenant edit starts here
        if (getIntent().getStringExtra("txttitle").contains("Barbell Incline Bench Press")) {

            steps.setText("\n" +
                    "\n" +
                    " 1.   Load the bar to an appropriate weight for your training.\n" +
                    " 2.   Lay on the bench with your feet flat on the ground, driving through to your hips. Your back should be arched, and your shoulder blades retracted.\n" +
                    " 3.   Take a medium, pronated grip covering the rings on the bar. Remove the bar from the rack, holding the weight above your chest with your arms extended. This will be your starting position.\n" +
                    " 4.   Lower the bar to the sternum by flexing the elbows. Maintain control and do not bounce the bar off of your chest. Your lats should stay tight and elbows slightly drawn in.\n" +
                    " 5.   After touching your torso with the bar, extend the elbows to return the bar to the starting position.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }




        if (getIntent().getStringExtra("txttitle").contains("Machine Fly")) {

            steps.setText(" Instructions\n" +
                    "\n" +
                    " 1.   This movement is performed on a seated fly machine or pec dec.\n" +
                    " 2.   Sit on the seat provided. Be sure that your feet a flat on the ground, adjust the seat if necessary.\n" +
                    " 3.   Grasp the handles of the machine. Be sure that your hands are level with your shoulders. Keeping your elbows slightly bent, bring your hands together.\n" +
                    " 4.   Hold for 1-2 seconds, contract your pectorals. Then slowly release back to the starting position.\n" +
                    "\n" +
                    "Tips\n" +
                    "\n" +
                    "    This is a great exercise for training both the outer and inner pectorals. Keep good form at all times.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Barbell Lying Triceps Extension")) {

            steps.setText(" " +
                    "1.    While holding a barbell or EZ Curl bar with a pronated grip (palms facing forward), lie on your back on a flat bench with your head close to the end of the bench. Tip: If you are holding a barbell grab it using a shoulder-width grip and if you are using an E-Z Bar grab it on the inner handles.\n" +
                    "2.    Extend your arms in front of you and slowly bring the bar back in a semi circular motion (while keeping the arms extended) to a position over your head. At the end of this step your arms should be overhead and perpendicular to the floor. This will be your starting position. Tip: Keep your elbows in at all times.\n" +
                    "3.    As you inhale, lower the bar by bending at the elbows and while keeping the upper arm stationary. Keep lowering the bar until your forearms are perpendicular to the floor.\n" +
                    "4.    As you exhale bring the bar back up to the starting position by pushing the bar up in a semi-circular motion until the lower arms are also parallel to the floor. Contract the triceps hard at the top of the movement for a second. Tip: Again, only the forearms should move. The upper arms should remain stationary at all times.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "Variation: You can use dumbbells to make the exercise more challenging.");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

                  if (getIntent().getStringExtra("txttitle").contains("Triceps Pushdown - Rope")) {

                steps.setText("    " +
                        "1.  Attach a rope attachment to a high pulley and grab with a neutral grip (palms facing each other).\n" +
                        "2.    Standing upright with the torso straight and a very small inclination forward, bring the upper arms close to your body and perpendicular to the floor. The forearms should be pointing up towards the pulley as they hold the rope with the palms facing each other. This is your starting position.\n" +
                        "3.    Using the triceps, bring the rope down as you bring each side of the rope to the side of your thighs. At the end of the movement the arms are fully extended and perpendicular to the floor. The upper arms should always remain stationary next to your torso and only the forearms should move. Exhale as you perform this movement.\n" +
                        "4.    After holding for a second, at the contracted position, bring the rope slowly up to the starting point. Breathe in as you perform this step.\n" +
                        "5.    Repeat for the recommended amount of repetitions.\n" +
                        "\n" +
                        "Variations: There are many variations to this movement. For instance you can use an E-Z bar attachment as well as a V-angled bar or straight bar.\n" +
                        "\n" +
                        "Same as the Triceps Pushdown except with the rope attachment.");

                titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                        "Equipment: Body only\n" +
                        "Exercise Type: Strength");


            }

        if (getIntent().getStringExtra("txttitle").contains("Barbell Deadlift")) {

            steps.setText(" " +
                    "1. Walk to the bar. Stand with your mid-foot under the bar. Your shins shouldn’t touch it yet. Put your heels hip-width apart, narrower than on Squats. Point your toes out 15°.\n" +
                    "2. Grab the bar. Bend over without bending your legs. Grip the bar narrow, about shoulder-width apart like on the Overhead Press. Your arms must be vertical when looking from the front.\n" +
                    "3. Bend your knees. Drop into position by bending your knees until your shins touch the bar. Do NOT let the bar move away from your mid-foot. If it moves, start from scratch with step one.\n" +
                    "4. Lift your chest. Straighten your back by raising you chest. Do not change your position – keep the bar over your mid-foot, your shins against the bar, and your hips where they are.\n" +
                    "5. Pull. Take a big breath, hold it and stand up with the weight. Keep the bar in contact with your legs while you pull. Don’t shrug or lean back at the top. Lock your hips and knees.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Barbell Bent Over Row")) {

            steps.setText("The Barbell Bent Over Row is an excellent exercise to build a powerful back, core and arms. Maintaining core tension will alleviate pressure on the lower back . It is a fantastic back and biceps workout that can be used well with your current routine or by itself.  During the Barbell Bent Over Row you will also have the added benefit of a strong grip and forearms.\n" +
                    "Exercise Steps\n" +
                    "\n" +
                    "Step 1: Grab the Barbell with a shoulder width grip, and your knees bent.\n" +
                    "\n" +
                    "Step 2: Bend over at the waist with your arms hanging down.\n" +
                    "\n" +
                    "Step 3: With a straight back and tight core, pull the bar to your chest and then lower back down.\n" +
                    "\n" +
                    "Tips & Safety: Maintain core tension throughout the duration of the exercise. Squeeze your upper back as you lift the barbell to your chest, try not to round your back during the lift.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Wide-Grip Lat Pulldown")) {

            steps.setText("How to do the Wide-Grip Lat Pulldown:\n" +
                    "\n" +
                    "    Step 1: Position yourself at a lat pulldown machine so that your thighs are under the leg pads.\n" +
                    "    Step 2: Grasp the bar with your arms fully extended, palms facing forward, and your hands wider than shoulder width apart.\n" +
                    "    Step 3: Curve your back approximately 30 degrees and protrude your chest. This is your starting position.\n" +
                    "    Step 4: Exhale as you lower the bar straight down to your chest.\n" +
                    "    Step 5: Contract your back muscles for a moment and then inhale as you reverse the motion back to the starting position.\n" +
                    "    Step 6: Repeat for a complete set.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Barbell Curl Steps")) {

            steps.setText("Many people focus on dumbbell curls for their biceps, which is all well and good, but if you want to really attack the biceps, as well as give your forearms a heck of a workout too, then the barbell curl is absolutely ideal, and is a lot harder than it looks too. Here’s a step by step guide on how to perform it.\n" +
                    "\n" +
                    "–        Begin by grabbing a barbell with an underhand grip, with your hands placed roughly shoulder width apart.\n" +
                    "\n" +
                    "–        Next, stand up straight, with your feet close together, making sure that your arms are fully extended.\n" +
                    "\n" +
                    "–        Ensure that the bar is not quite touching your body, and keeping your eyes forward dead ahead and your elbows tucked in at your sides, slowly curl the bar upwards, making sure to keep your body as still as possible.\n" +
                    "\n" +

                    "Use the biceps to generate the power to curl the weight, and squeeze them at the top of the movement and hold for a second or two. The bar should be roughly level with your chin once you’ve curled the weight upwards.\n" +
                    "\n" +
                    "–        Slowly lower the barbell back downwards to the initial starting position, and then repeat for the necessary amount of reps required.");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Incline Dumbbell Curl")) {

            steps.setText("    " +
                    "1.    Sit back on an incline bench with a dumbbell in each hand held at arms length. Keep your elbows close to your torso and rotate the palms of your hands until they are facing forward. This will be your starting position.\n" +
                    "2.    While holding the upper arm stationary, curl the weights forward while contracting the biceps as you breathe out. Only the forearms should move. Continue the movement until your biceps are fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a second.\n" +
                    "3.    Slowly begin to bring the dumbbells back to starting position as your breathe in.\n" +
                    "4.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Alternate Hammer Curl")) {

            steps.setText("     " +
                    "1.    Stand up with your torso upright and a dumbbell in each hand being held at arms length. The elbows should be close to the torso.\n" +
                    "2.    The palms of the hands should be facing your torso. This will be your starting position.\n" +
                    "3.    While holding the upper arm stationary, curl the right weight forward while contracting the biceps as you breathe out. Continue the movement until your biceps is fully contracted and the dumbbells are at shoulder level. Hold the contracted position for a second as you squeeze the biceps. Tip: Only the forearms should move.\n" +
                    "4.    Slowly begin to bring the dumbbells back to starting position as your breathe in.\n" +
                    "5.    Repeat the movement with the left hand. This equals one repetition.\n" +
                    "6.    Continue alternating in this manner for the recommended amount of repetitions.\n" +
                    "\n" +
                    "Variations: There are many possible variations for this movement. For instance, you can perform the exercise sitting down on a bench with or without back support and you can also perform it by doing both arms at the same time.");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Barbell Squat")) {

            steps.setText("      " +
                    "1.    Begin with the barbell supported on top of the traps. The chest should be up and the head facing forward. Adopt a hip-width stance with the feet turned out as needed.\n" +
                    "2.    Descend by flexing the knees, refraining from moving the hips back as much as possible. This requires that the knees travel forward. Ensure that they stay align with the feet. The goal is to keep the torso as upright as possible.\n" +
                    "3.    Continue all the way down, keeping the weight on the front of the heel. At the moment the upper legs contact the lower legs reverse the motion, driving the weight upward. \n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Barbell Lunge")) {

            steps.setText("      " +
                    "1.    Begin with the barbell supported on top of the traps. The chest should be up and the head facing forward. Adopt a hip-width stance with the feet turned out as needed.\n" +
                    "2.    Descend by flexing the knees, refraining from moving the hips back as much as possible. This requires that the knees travel forward. Ensure that they stay align with the feet. The goal is to keep the torso as upright as possible.\n" +
                    "3.    Continue all the way down, keeping the weight on the front of the heel. At the moment the upper legs contact the lower legs reverse the motion, driving the weight upward. \n" +
                    "\n" +
                    "\n    This exercise is best performed inside a squat rack for safety purposes. To begin, first set the bar on a rack just below shoulder level. Once the correct height is chosen and the bar is loaded, step under the bar and place the back of your shoulders (slightly below the neck) across it.\n" +
                    "4.   Hold on to the bar using both arms at each side and lift it off the rack by first pushing with your legs and at the same time straightening your torso.\n" +
                    "5.   Step away from the rack and step forward with your right leg and squat down through your hips, while keeping the torso upright and maintaining balance. Inhale as you go down. Note: Do not allow your knee to go forward beyond your toes as you come down, as this will put undue stress on the knee joint. li>\n" +
                    "6.    Using mainly the heel of your foot, push up and go back to the starting position as you exhale.\n" +
                    "7.    Repeat the movement for the recommended amount of repetitions and then perform with the left leg.\n" +
                    "\n" +
                    "Caution: This is a movement that requires a great deal of balance so if you suffer from balance problems you may wish to either avoid it or just use your own bodyweight while holding on to a fixed object. Definitely never perform with a barbell on your back if you suffer from balance issues.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Lying Leg Curls")) {

            steps.setText("     " +
                    "1.  Adjust the machine lever to fit your height and lie face down on the leg curl machine with the pad of the lever on the back of your legs (just a few inches under the calves). Tip: Preferably use a leg curl machine that is angled as opposed to flat since an angled position is more favorable for hamstrings recruitment.\n" +
                    "2.    Keeping the torso flat on the bench, ensure your legs are fully stretched and grab the side handles of the machine. Position your toes straight (or you can also use any of the other two stances described on the foot positioning section). This will be your starting position.\n" +
                    "3.    As you exhale, curl your legs up as far as possible without lifting the upper legs from the pad. Once you hit the fully contracted position, hold it for a second.\n" +
                    "4.    As you inhale, bring the legs back to the initial position. Repeat for the recommended amount of repetitions.\n" +
                    "\n"
            );

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Barbell Shoulder Press")) {

            steps.setText("" +
                    "1.     Sit on a bench with back support in a squat rack. Position a barbell at a height that is just above your head. Grab the barbell with a pronated grip (palms facing forward).\n" +
                    "2.    Once you pick up the barbell with the correct grip width, lift the bar up over your head by locking your arms. Hold at about shoulder level and slightly in front of your head. This is your starting position.\n" +
                    "3.    Lower the bar down to the shoulders slowly as you inhale.\n" +
                    "4.    Lift the bar back up to the starting position as you exhale.\n" +
                    "5.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Dumbbell Shoulder Press")) {

            steps.setText("    " +
                    "1.    While holding a dumbbell in each hand, sit on a military press bench or utility bench that has back support. Place the dumbbells upright on top of your thighs.\n" +
                    "2.    Now raise the dumbbells to shoulder height one at a time using your thighs to help propel them up into position.\n" +
                    "3.    Make sure to rotate your wrists so that the palms of your hands are facing forward. This is your starting position.\n" +
                    "4.    Now, exhale and push the dumbbells upward until they touch at the top.\n" +
                    "5.    Then, after a brief pause at the top contracted position, slowly lower the weights back down to the starting position while inhaling.\n" +
                    "6.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Dumbbell Lateral Raise")) {

            steps.setText("      " +
                    "1.  Pick a couple of dumbbells and stand with a straight torso and the dumbbells by your side at arms length with the palms of the hand facing you. This will be your starting position.\n" +
                    "2.  While maintaining the torso in a stationary position (no swinging), lift the dumbbells to your side with a slight bend on the elbow and the hands slightly tilted forward as if pouring water in a glass. Continue to go up until you arms are parallel to the floor. Exhale as you execute this movement and pause for a second at the top.\n" +
                    "3.  Lower the dumbbells back down slowly to the starting position as you inhale.\n" +
                    "4.  Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "Variation: This exercise can also be performed sitting down");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Barbell Shrug")) {

            steps.setText("\n" +
                    "1.    Stand with your feet shoulder width apart. Hold the barrel in front of you, with the overhand grip of your hands on the barrel. Position your hands at a distance more than the shoulder’s width.\n" +
                    "2.    Starting position: Position your arms in an extended form straight towards the floor. Your arms should be facing your thighs.\n" +
                    "3.    By raising your shoulders and not using your elbows, pull the barbell up.\n" +
                    "4.    Stay paused in the same position till the count of one.\n" +
                    "5.    Inhale your breath and retract to the initial/starting position.\n" +
                    "6.    Pause for a while after one rep and then continue.\n" +
                    "\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Oblique Crunches")) {

            steps.setText("    " +
                    "1.  Start out by lying on your right side with your legs lying on top of each other. Make sure your knees are bent a little bit.\n" +
                    "2.  Place your left hand behind your head.\n" +
                    "3.  Once you are in this set position, begin by moving your left elbow up as you would perform a normal crunch except this time the main emphasis is on your obliques.\n" +
                    "4.  Crunch as high as you can, hold the contraction for a second and then slowly drop back down into the starting position.\n" +
                    "5.  Remember to breathe in during the eccentric (lowering) part of the exercise and to breathe out during the concentric (elevation) part of the exercise.\n" +
                    "\n" +
                    "Note: While you cannot add resistance to this exercise you can concentrate on perfect execution and slow speed.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Leg Raise")) {

            steps.setText("" +
                    " 1. Lie on your back, legs straight and together. \n" +
                    "\n" +
                    "2. Keep your legs straight and lift them all the way up to the ceiling until your butt comes off the floor. \n" +
                    "\n" +
                    "3. Slowly lower your legs back down till they’re just above the floor. Hold for a moment.\n" +
                    "\n" +
                    "4. Raise your legs back up. Repeat.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Air Bike")) {

            steps.setText("1.) Start off lying flat as if you were going to perform a sit up putting your hands behind your your head and lifting your shoulders into a crunch position.\n" +
                    "\n" +
                    "2.) Bring your knees up so that they are perpendicular with the floor and your lower legs are parallel with the ground as this will be your starting position.\n" +
                    "\n" +
                    "3.) Slowly go through a cycle pedal motion kicking forward with your right leg and bringing in the knee of the left leg.\n" +
                    "\n" +
                    "4.) Next bring your right elbow close to your left knee by crunching to the side.\n" +
                    "\n" +
                    "5.) Return back to the starting position as you breathe in then crunch to the opposite side as you cycle your legs and bring your left elbow close to your right knee.\n" +
                    "\n" +
                    "6.) Repeat with each side for as many reps and sets as desired.\n" +
                    "\n" +
                    "Tips :\n" +
                    "\n" +
                    "1.) Reduce the speed of the exercise for more intensity and better results.");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Hanging Leg Raise")) {

            steps.setText("   " +
                    "1.  Hang from a chin-up bar with both arms extended at arms length in top of you using either a wide grip or a medium grip. The legs should be straight down with the pelvis rolled slightly backwards. This will be your starting position.\n" +
                    "2.    Raise your legs until the torso makes a 90-degree angle with the legs. Exhale as you perform this movement and hold the contraction for a second or so.\n" +
                    "3.    Go back slowly to the starting position as you breathe in.\n" +
                    "4.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "Caution: Perform this exercise slowly and deliberately as it takes some getting used to. Also, do not be hasty and try to use weights on the first time; you'll have enough in your hands by holding your weight and also learning how to balance yourself so that you avoid swinging your torso. As you get more advanced you can hold a dumbbell in between your feet. However, you have to be very careful when adding weight to this exercise as if you add too much too quickly you could get a hernia.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }

        if (getIntent().getStringExtra("txttitle").contains("Decline Crunch")) {

            steps.setText("    " +
                    "1.   Secure your legs at the end of the decline bench and lie down.\n" +
                    "2.    Now place your hands lightly on either side of your head keeping your elbows in. Tip: Don't lock your fingers behind your head.\n" +
                    "3.    While pushing the small of your back down in the bench to better isolate your abdominal muscles, begin to roll your shoulders off it.\n" +
                    "4.    Continue to push down as hard as you can with your lower back as you contract your abdominals and exhale. Your shoulders should come up off the bench only about four inches, and your lower back should remain on the bench. At the top of the movement, contract your abdominals hard and keep the contraction for a second. Tip: Focus on slow, controlled movement - don't cheat yourself by using momentum.\n" +
                    "5.    After the one second contraction, begin to come down slowly again to the starting position as you inhale.\n" +
                    "6.    Repeat for the recommended amount of repetitions.\n" +
                    "\n" +
                    "Variations: There are many variations for the crunch. You can perform the exercise with weights, or on top of an exercise ball or on a flat bench.\n" +
                    "\n");

            titleTextView.setText("Main Muscle: " + getIntent().getStringExtra("txttitle") + "\n" +
                    "Equipment: Body only\n" +
                    "Exercise Type: Strength");


        }




        //covenant edit ends here

    }
}
