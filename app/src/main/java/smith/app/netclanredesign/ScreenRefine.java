package smith.app.netclanredesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.slider.Slider;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import smith.app.netclanredesign.databinding.RefineScreenBinding;

public class ScreenRefine extends AppCompatActivity {

    private RefineScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = RefineScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int height = binding.distance.getTrackHeight();
        binding.distance.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
            @Override public void onStartTrackingTouch(@NonNull Slider slider) {
                slider.setTrackHeight(50);
            }

            @Override public void onStopTrackingTouch(@NonNull Slider slider) {
                slider.setTrackHeight(height);
            }
        });
    }

    public void explore(View view) {
        startActivity(new Intent(this, ScreenExplore.class));
    }
}