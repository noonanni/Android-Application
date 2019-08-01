package com.example.hookhockey;

import java.util.List;

public abstract class SRssCallback {

	public abstract void onFeedParsed(List<RSSItem> items);

	public abstract void onError(Exception ex);
}
