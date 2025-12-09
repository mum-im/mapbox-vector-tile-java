package de.mum.mapbox.vectortile.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.mum.mapbox.vectortile.util.MvtUtil;

/**
 * Test zig zag encoding function.
 */
@SuppressWarnings({ "javadoc", "static-method" })
public final class ZigZagTest
{
	@Test
	public void encodeAndDecode()
	{
		assertEquals(0, MvtUtil.decodeZigZag(MvtUtil.encodeZigZag(0)));
		assertEquals(10018754, MvtUtil.decodeZigZag(MvtUtil.encodeZigZag(10018754)));
	}
}
