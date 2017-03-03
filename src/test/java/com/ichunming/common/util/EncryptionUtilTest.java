/**
 * @author ming
 * @date 2017年3月3日 上午10:35:24
 */
package com.ichunming.common.util;

import org.junit.Test;

import com.ichunming.common.util.EncryptionUtil;

public class EncryptionUtilTest {

	@Test
	public void sendTest() {
		// test method
		String encode = EncryptionUtil.encode("test");

		// verify result
		System.out.println(encode);
	}
}
