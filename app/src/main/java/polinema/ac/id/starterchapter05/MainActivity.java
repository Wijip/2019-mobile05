package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.Fragments.dips;
import polinema.ac.id.starterchapter05.Fragments.handStand;
import polinema.ac.id.starterchapter05.Fragments.pushups;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_pushups(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if (fragment == null || fragment instanceof handStand || fragment instanceof dips){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new pushups());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void btn_dips(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if (fragment == null || fragment instanceof handStand || fragment instanceof pushups){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new dips());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handstand(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if (fragment == null || fragment instanceof pushups || fragment instanceof dips){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new handStand());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
