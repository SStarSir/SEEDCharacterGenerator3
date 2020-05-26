package com.example.seedcharactergenerator3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;
import java.util.List;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
// import android.support.v7.app.AlertDialog;   no more supported?
// import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;








public class generator extends AppCompatActivity implements View.OnClickListener{
    private DatabaseManipulator dm;

    String[] names = {"Gigi","Bruno","Davide","Simone","Andrea","Alan","Barry","Bruce","Calvin","Clifford","Clinton","Clive","Colin","Dean","Dennis","Desmond","Donny ","Eric","Frank","Garry","Gene","Geoffrey","Gerald","Glenn ","Gregory","Jeremy","Jerry","Kenneth","Kevin ","Larry ","Leonard","Leslie ","Martin","Maurice","Morris","Micky","Ralph","Ray","Raymond","Rodney","Roger ","Roland","Ronald","Roy ","Royston ","Sidney","Terence","Terry ","Tony ","Trevor ","Janet","Alison","Andrea","Angela","Anita","Audrey","Betty","Cindy","Cynthia","Debbie","Deborah","Dora","Elaine","Gloria ","Gillian ","Jacqueline 	","Jean","Joy","Judith","Judy","Julie","June","Karen","Kathleen ","Kay","Linda ","Mandy","Marian","Marlene","Maxine","Minnie","Pamela ","Patricia","Patsy","Peggy","Rita","Rosemary","Sally","Sandy","Susan","Tina","Valerie","Vera","Veronica","Wendy ","Rufus","Salvator","Sebastian","Secundus","Septimus"};
    String[] ages = {"16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82","99"};
    String [] professions = {"Butcher", "Student", "Mage", "Thief", "Politician", "Falconer","Rat catcher","Fisherman","Miller","StoneMason","BlackSmith","Armorer","Falconer","Tailor","Carpenter","Plowman","Butcher","GoldSmith","MetalSmith","Groom","Squire","Page","SilverSmith","Grocer","Draper","Furrier","FishMonger","Baker","Weaver","Minstrel","Spinner","Plumber","Electrician","Police Officer","Researcher","Pilot","Lorry driver","Retail assistant","Shop Manager","Director","Actor","Unemployed","Ned","Hobo","Comedian","Lecturer","Carer","Doctor","Nurse","Receptionist","Game developer","Journalist","Player","Priest","Scammer"};
    String []appearances = {"ugly", "scary", "friendly", "polite", "dodgy", "adorable","fair","old-fashioned","alluring","fancy","perfect","attractive","filthy","plain","barbarous","fine","pleasant","beautiful","glamorous","precious","bloody","glowing","quaint","blushing","gorgeous","scruffy","boring","graceful","self-assured","bright","grotesque","shiny","clean","handsome","slender","clumsy","healthy","snobbish","colorful","hilarious","sparkling","confident","splendid","cultured","hurt","spotless","tall","lovely","dull","elegant","savvy","blunt","erratic","infected","zombie"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);
        Intent intent=getIntent();
        String customstringSeed = intent.getStringExtra("seed");
        EditText edSeed = (EditText) findViewById(R.id.edCustomSeed);
        edSeed.setText(customstringSeed);

                ;
        /*
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // qui mettere il codice della generazione

            }
        });
*/
        View saveButton = findViewById(R.id.button6);
        saveButton.setOnClickListener(this);
        View back = findViewById(R.id.button5);
        back.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openCameraActivity();// behaviour camera button




            }
        });

    }



            public void onClick(View v) {
             switch (v.getId()) {

                    case R.id.button5:
                        // try catch ensure that seed input is valid
                        try {
                            String customstringSeed = ((EditText) findViewById(R.id.edCustomSeed)).getText().toString();
                            int customSeed = Integer.parseInt(customstringSeed);

                            // use seed from input

                            if (customSeed != 0) {
                                Random randomName = new Random(customSeed);
                                Random randomAge = new Random(customSeed);
                                Random randomProfession = new Random(customSeed);
                                Random randomAppearance = new Random(customSeed);

                                int randomNameVal = randomName.nextInt(names.length);
                                int randomAgeVal = randomAge.nextInt(ages.length);
                                int randomProfessionVal = randomAge.nextInt(professions.length);
                                int randomAppearanceVal = randomAppearance.nextInt(appearances.length);

                                EditText edName = (EditText) findViewById(R.id.edName);
                                edName.setText(names[randomNameVal]);

                                EditText edAge = (EditText) findViewById(R.id.edAge);
                                edAge.setText(ages[randomAgeVal]);

                                EditText edProfession = (EditText) findViewById(R.id.edProfession);
                                edProfession.setText(professions[randomProfessionVal]);

                                EditText edAppearance = (EditText) findViewById(R.id.edAppearance);
                                edAppearance.setText(appearances[randomAppearanceVal]);

                                Toast.makeText(generator.this, "generating with seed " + customstringSeed,
                                        Toast.LENGTH_SHORT).show();
                            }

                            else

                                // use standard random seed

                                {
                                Random randomName = new Random();
                                Random randomAge = new Random();
                                Random randomProfession = new Random();
                                Random randomAppearance = new Random();

                                int randomNameVal = randomName.nextInt(names.length);
                                int randomAgeVal = randomAge.nextInt(ages.length);
                                int randomProfessionVal = randomAge.nextInt(professions.length);
                                int randomAppearanceVal = randomAppearance.nextInt(appearances.length);

                                EditText edName = (EditText) findViewById(R.id.edName);
                                edName.setText(names[randomNameVal]);

                                EditText edAge = (EditText) findViewById(R.id.edAge);
                                edAge.setText(ages[randomAgeVal]);

                                EditText edProfession = (EditText) findViewById(R.id.edProfession);
                                edProfession.setText(professions[randomProfessionVal]);

                                EditText edAppearance = (EditText) findViewById(R.id.edAppearance);
                                edAppearance.setText(appearances[randomAppearanceVal]);

                                Toast.makeText(generator.this, "generating with seed " + customstringSeed,
                                        Toast.LENGTH_SHORT).show();
                                // please note we need a try catch here because if the value is null or not an integer, app breaks.
                            }
                        }
                        catch (Exception e)

                        {  Toast.makeText(generator.this, "seed must be int within 0 and 999999999",
                                Toast.LENGTH_SHORT).show();     }

                        // this.finish();
                        break;

                    case R.id.button6:
                String name = ((EditText) findViewById(R.id.edName)).getText().toString();
                String age = ((EditText) findViewById(R.id.edAge)).getText().toString();
                String profession = ((EditText) findViewById(R.id.edProfession)).getText().toString();
                String appearance = ((EditText) findViewById(R.id.edAppearance)).getText().toString();
                dm = new DatabaseManipulator(this);
                dm.insert(name, age, profession, appearance);
                        Toast.makeText(generator.this, "Saved to characters",
                                Toast.LENGTH_SHORT).show();



                        break;

                 default:
                     throw new IllegalStateException("Unexpected value: " + v.getId());
             }



        }

    public void openCameraActivity() {
        Intent intent7 = new Intent(this, CameraActivity.class);
        startActivity(intent7);
    }

    }


