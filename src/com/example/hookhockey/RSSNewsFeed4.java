package com.example.hookhockey;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.util.Linkify;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class RSSNewsFeed4 extends Activity {

	private Context mContext;
	private String etFeedUrl;
	private Button btnLoad4;
	private ListView lvFeedItems;
	private SRssCallback mCallback;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main4);

		mContext = this;

		initViews();
		
		SRssParser parser = new SRssParser(etFeedUrl.toString(),
				getCallback());
		parser.parseAsync();
		
	}

	private SRssCallback getCallback() {
		if (mCallback == null) {
			mCallback = new SRssCallback() {

				@Override
				public void onFeedParsed(List<RSSItem> items) {
					for (int i = 0; i < items.size(); i++) {
						Log.d("SimpleRssParserDemo", items.get(i).getTitle());
					}

					lvFeedItems.setAdapter(new MyListAdapter(mContext,
							R.layout.list_item, (ArrayList<RSSItem>) items));
				}

				@Override
				public void onError(Exception ex) {
					Toast.makeText(mContext, ex.getMessage(),
							Toast.LENGTH_SHORT).show();
				}
			};
		}

		return mCallback;
	}

	private void initViews() {
		etFeedUrl = "http://www.sportsmanager.ie/cake/hockey/ireland/rss/";

		// (EditText) findViewById(R.id.etFeedUrl);
		btnLoad4 = (Button) findViewById(R.id.btnLoad4);
		lvFeedItems = (ListView) findViewById(R.id.lvFeedItems);

		btnLoad4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				SRssParser parser = new SRssParser(etFeedUrl.toString(),
						getCallback());
				parser.parseAsync();
			}
		});
	}

	private class MyListAdapter extends ArrayAdapter<RSSItem> {

		private ArrayList<RSSItem> items;
		private Context ctx;
		private int layout;

		public MyListAdapter(Context context, int layout,
				ArrayList<RSSItem> items) {
			super(context, layout, items);
			this.items = items;
			this.ctx = context;
			this.layout = layout;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			View v = convertView;
			if (v == null) {
				LayoutInflater vi = (LayoutInflater) ctx
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				v = vi.inflate(layout, null);
			}

			RSSItem o = items.get(position);
			if (o != null) {
				TextView tvPubDate = ((TextView) v.findViewById(R.id.tvPubDate));
				TextView tvTitle = ((TextView) v.findViewById(R.id.tvTitle));
				// TextView tvDescription = ((TextView)
				// v.findViewById(R.id.tvDescription));//
				TextView tvLnk = ((TextView) v.findViewById(R.id.tvLnk));

				if (tvPubDate != null) {
					tvPubDate.setText(o.getDate());
				}

				if (tvTitle != null) {
					tvTitle.setText(o.getTitle());
				}

				// if (tvDescription != null) {
				// tvDescription.setText(o.getContent());
				// }

				if (tvLnk != null) {
					tvLnk.setText(o.getLink().toExternalForm());
					Linkify.addLinks(tvLnk, Linkify.ALL);
				}
			}

			return v;
		}
	}
}
