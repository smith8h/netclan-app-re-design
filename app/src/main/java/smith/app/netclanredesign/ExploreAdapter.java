package smith.app.netclanredesign;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.Holder> {

    private Context context;
    private List<Profile> profiles;

    public ExploreAdapter(Context context, List<Profile> profiles) {
        this.context = context;
        this.profiles = profiles;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(context).inflate(R.layout.item_people, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        var params = new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT,
                RecyclerView.LayoutParams.WRAP_CONTENT);
        holder.itemView.setLayoutParams(params);

        var profile = profiles.get(position);

        updateInviteButton(holder, profile.isInvited());
        holder.profileImage.setImageResource(profile.getProfileImage());
        holder.profileName.setText(profile.getProfileName());
        holder.profileLocation.setText(profile.getProfileLocation());
        holder.profileDistance.setProgress(profile.getProfileDistance());
        holder.profilePurpose.setText(profile.getProfilePurpose());
        holder.profileMessage.setText(profile.getProfileMessage());
    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    private void updateInviteButton(Holder holder, boolean invited) {
        if (invited) {
            holder.profileInvitation.setTextColor(ContextCompat.getColor(context, R.color.onSurfaceVariant));
            holder.profileInvitation.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_surface_variant));
            holder.profileInvitation.setText("PENDING");
        } else {
            holder.profileInvitation.setTextColor(ContextCompat.getColor(context, R.color.onPrimary));
            holder.profileInvitation.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_primary));
            holder.profileInvitation.setText("INVITE");
        }
    }

    public static class Holder extends RecyclerView.ViewHolder {

        public CircleImageView profileImage;
        public TextView profileName, profileLocation, profilePurpose, profileMessage, profileInvitation;
        public ProgressBar profileDistance;

        public Holder(@NonNull View itemView) {
            super(itemView);

            profileImage = itemView.findViewById(R.id.profile_image);
            profileName = itemView.findViewById(R.id.profile_name);
            profileLocation = itemView.findViewById(R.id.profile_location);
            profilePurpose = itemView.findViewById(R.id.profile_purpose);
            profileMessage = itemView.findViewById(R.id.profile_message);
            profileInvitation = itemView.findViewById(R.id.profile_invite);
            profileDistance = itemView.findViewById(R.id.profile_distance);
        }
    }
}
