package sg.edu.rp.c346.id20007386.mylocalbanks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Bank1;
    TextView Bank2;
    TextView Bank3;
    String wordClicked ="";
    boolean togglefavouriteBank1=false;
    boolean togglefavouriteBank2=false;
    boolean togglefavouriteBank3=false;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Bank1=findViewById(R.id.Bank1);
            Bank2=findViewById(R.id.Bank2);
            Bank3=findViewById(R.id.Bank3);
            registerForContextMenu(Bank1);
            registerForContextMenu(Bank2);
            registerForContextMenu(Bank3);

        }

        public void onCreateContextMenu(ContextMenu menu, View v,
                                        ContextMenu.ContextMenuInfo menuInfo) {
            super.onCreateContextMenu(menu, v, menuInfo);

            getMenuInflater().inflate(R.menu.menu_tools, menu);

            if (v==Bank1){
                wordClicked="DBS";
            }
            else if(v==Bank2){
                wordClicked="OCBC";
            }
            else if(v==Bank3){
                wordClicked="UOB";
            }

        }

        public boolean onCreateOptionsMenu(Menu menu) {

            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        public boolean onContextItemSelected(MenuItem item) {
            int id=item.getItemId();
            if(wordClicked.equalsIgnoreCase("DBS")){
                if (id==R.id.Website) { //check whether the selected menu item ID is 0
                    //code for action

                    String website1=getString(R.string.URL1);
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse((website1)));
                    startActivity(intent);
                    return true; //menu item successfully handled
                } else if (id==R.id.ContactBank) { //check if the selected menu item ID is 1
                    //code for action
                    String phone1=getString(R.string.Number1);
                    Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse(phone1));
                    startActivity(intent);
                    return true;  //menu item successfully handled
                }
                else if(id==R.id.Toggle){
                    if(!togglefavouriteBank1){
                        togglefavouriteBank1=true;
                        Bank1.setTextColor(Color.RED);
                    }
                    else{
                        togglefavouriteBank1=false;
                        Bank1.setTextColor(Color.BLACK);
                    }
                }
            }
            else if(wordClicked.equalsIgnoreCase("OCBC")){
                if (id==R.id.Website) { //check whether the selected menu item ID is 0
                    //code for action

    String website2=getString(R.string.URL2);
    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse((website2)));
    startActivity(intent);
                return true; //menu item successfully handled
} else if (id==R.id.ContactBank) { //check if the selected menu item ID is 1
        //code for action
        String phone2=getString(R.string.Number2);
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse((phone2)));
        startActivity(intent);
        return true;  //menu item successfully handled
        }
        else if(id==R.id.Toggle){
        if(!togglefavouriteBank2){
            togglefavouriteBank2=true;
        Bank2.setTextColor(Color.RED);
        }
        else{
            togglefavouriteBank2=false;
            Bank2.setTextColor(Color.BLACK);
        }
        }
        }
        else if(wordClicked.equalsIgnoreCase("UOB")){
        if (id==R.id.Website) { //check whether the selected menu item ID is 0
        //code for action
        String website3=getString(R.string.URL3);
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse((website3)));
        startActivity(intent);
        return true; //menu item successfully handled
        } else if (id==R.id.ContactBank) { //check if the selected menu item ID is 1
        //code for action
        String phone3=getString(R.string.Number3);
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse((phone3)));
        startActivity(intent);
        return true;  //menu item successfully handled
        }
        else if(id==R.id.Toggle){
        if(!togglefavouriteBank3){
            togglefavouriteBank3=true;
        Bank3.setTextColor(Color.RED);
        }
        else{
            togglefavouriteBank3=false;
            Bank3.setTextColor(Color.BLACK);
        }
        }

        }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
        }





public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
        String bankname1=getString(R.string.bankDBS);
        String bankname2=getString(R.string.bankOCBC);
        String bankname3=getString(R.string.bankUOB);



        Bank1.setText(bankname1);
        Bank2.setText(bankname2);
        Bank3.setText(bankname3);
        return true;
        } else if (id == R.id.ChineseSelection) {
        String banknamec1=getString(R.string.bankC1);
        String banknamec2=getString(R.string.bankC2);
        String banknamec3=getString(R.string.bankC3);


        Bank1.setText(banknamec1);
        Bank2.setText(banknamec2);
        Bank3.setText(banknamec3);
        return true;
        } else {

        String error=getString(R.string.error);
        Bank1.setText(error);
        Bank2.setText(error);
        Bank3.setText(error);
        }

        return super.onOptionsItemSelected(item);
        }


        }