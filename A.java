package p1;

public class A {
	
	public byte[] fetch(Feed feed) {
		byte[] icon = fetch(feed.getLink());
		if (icon == null) {
			icon = fetch(feed.getUrl());
		}
		return icon;
	}
	
	
	
}