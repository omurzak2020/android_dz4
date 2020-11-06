package com.example.dz4;

import android.os.Parcel;
import android.os.Parcelable;

import java.lang.reflect.ParameterizedType;

public class TitleModel implements Parcelable {
    private String title;

    public TitleModel( String title) {
        this.title = title;

    }

    protected TitleModel(Parcel in) {
        title = in.readString();
    }

    public static final Creator<TitleModel> CREATOR = new Creator<TitleModel>() {
        @Override
        public TitleModel createFromParcel(Parcel in) {
            return new TitleModel(in);
        }

        @Override
        public TitleModel[] newArray(int size) {
            return new TitleModel[size];
        }
    };

    public String getTitle() {
        return title;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
    }
}
