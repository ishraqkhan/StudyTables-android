package edu.purdue.cs.sigapp.studytables.general;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Ishraq on 2/14/2017.
 */

public class NewEventData implements Parcelable {
    private String title, location, course, date, time, length, repeat, reminder;

    public NewEventData(String title, String location, String course, String date, String time, String length, String repeat, String reminder){
        this.title = title;
        this.location = location;
        this.course = course;
        this.date = date;
        this.time = time;
        this.length = length;
        this.repeat = repeat;
        this.reminder = reminder;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.location);
        dest.writeString(this.course);
        dest.writeString(this.date);
        dest.writeString(this.time);
        dest.writeString(this.length);
        dest.writeString(this.repeat);
        dest.writeString(this.reminder);
    }

    protected NewEventData(Parcel in) {
        this.title = in.readString();
        this.location = in.readString();
        this.course = in.readString();
        this.date = in.readString();
        this.time = in.readString();
        this.length = in.readString();
        this.repeat = in.readString();
        this.reminder = in.readString();
    }

    public static final Parcelable.Creator<NewEventData> CREATOR = new Parcelable.Creator<NewEventData>() {
        @Override
        public NewEventData createFromParcel(Parcel source) {
            return new NewEventData(source);
        }

        @Override
        public NewEventData[] newArray(int size) {
            return new NewEventData[size];
        }
    };
}
