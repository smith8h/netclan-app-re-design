package smith.app.netclanredesign;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import smith.app.netclanredesign.databinding.ExploreScreenBinding;

public class ScreenExplore extends AppCompatActivity {

    ExploreScreenBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ExploreScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.profiles.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        var profiles = new ArrayList<Profile>();

        Profile profile1 = new Profile();
        profile1.setProfileImage(R.drawable.user_1);
        profile1.setProfileName("Arabella Lynn");
        profile1.setProfileLocation("London, within 4Km.");
        profile1.setProfileDistance(4);
        profile1.setProfilePurpose("Coffee, Friendship, Movies..");
        profile1.setProfileMessage("Hi Community!\nI,m open for new connections.");
        profile1.setInvited(true);
        profiles.add(profile1);

        Profile profile2 = new Profile();
        profile2.setProfileImage(R.drawable.user_2);
        profile2.setProfileName("Kieran Morphy");
        profile2.setProfileLocation("London, within 14Km.");
        profile2.setProfileDistance(14);
        profile2.setProfilePurpose("Coffee, Dinning, Friendship, Business..");
        profile2.setProfileMessage("Hi Community!\nI,m open for new connections.");
        profile2.setInvited(true);
        profiles.add(profile2);

        Profile profile3 = new Profile();
        profile3.setProfileImage(R.drawable.user_3);
        profile3.setProfileName("Leigh Ibarra");
        profile3.setProfileLocation("London, within 13Km.");
        profile3.setProfileDistance(13);
        profile3.setProfilePurpose("Coffee, Friendship, Dating..");
        profile3.setProfileMessage("Hi Community!\nI,m open for new connections.");
        profile3.setInvited(false);
        profiles.add(profile3);

        binding.profiles.setAdapter(new ExploreAdapter(this, profiles));
    }
}
