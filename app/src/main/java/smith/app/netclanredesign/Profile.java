package smith.app.netclanredesign;

public class Profile {

    private int profileImage;
    private String profileName, profileLocation, profilePurpose, profileMessage;
    private int profileDistance;
    private boolean invited;

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileLocation() {
        return profileLocation;
    }

    public void setProfileLocation(String profileLocation) {
        this.profileLocation = profileLocation;
    }

    public String getProfilePurpose() {
        return profilePurpose;
    }

    public void setProfilePurpose(String profilePurpose) {
        this.profilePurpose = profilePurpose;
    }

    public String getProfileMessage() {
        return profileMessage;
    }

    public void setProfileMessage(String profileMessage) {
        this.profileMessage = profileMessage;
    }

    public int getProfileDistance() {
        return profileDistance;
    }

    public void setProfileDistance(int profileDistance) {
        this.profileDistance = profileDistance;
    }

    public boolean isInvited() {
        return invited;
    }

    public void setInvited(boolean invited) {
        this.invited = invited;
    }
}
