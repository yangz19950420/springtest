/**
 * 
 */
package com.yangze.tt;

import org.springframework.stereotype.Component;

/**
 * @author yangwenzhu
 *
 */
@Component
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Peppers's Lonely Hearts Club Band";
	private String artist = "The beatles";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
