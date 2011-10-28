package net.jessechen.fragments;

import java.io.IOException;
import java.net.MalformedURLException;

import com.facebook.android.Facebook;

import net.jessechen.socialalarmclock.R;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PostFragment extends Fragment {

	private Context ctx;
	private Facebook facebook;

	public PostFragment(Context c, Facebook fb) {
		ctx = c;
		facebook = fb;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.postfrag, container, false);
		TextView textView = (TextView) view.findViewById(R.id.textview);
		textView.setText("Post");
		textView.setTextColor(Color.WHITE);
		textView.setTextSize(30);
		return view;
	}

	private String getAppUsers() throws MalformedURLException, IOException {
		Bundle params = new Bundle();
		params.putString("method", "friends.getAppUsers");
		return facebook.request(params);
	}
}
