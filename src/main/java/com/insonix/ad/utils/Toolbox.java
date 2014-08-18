/**
 * Copyright © 2014 Insonix

 * Permission is hereby granted, free of charge, to any person obtaining a copy of these 
 * Experiments and associated documentation files (the “Software”), to deal in the Software 
 * without restriction, including without limitation the rights to use, copy, modify, merge, 
 * publish, distribute, sub-license, and/or sell copies of the Software, and to permit persons 
 * to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or 
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING 
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.insonix.ad.utils;

import java.util.Random;

/**
 * This class works as a helper class and provides common utilities.
 * 
 * @author sunnydyal
 * @date 14-Aug-2014 12:12:55 pm
 * @year 2014
 * @version 1.0
 * @since 1.0
 */
public class Toolbox {
	/**
	 * Instance of this class is not required because all methods are static
	 */
	private Toolbox() {

	}
	/**
	 * This method generates random number based on minimum and maximum value.
	 * @param max
	 * @return
	 */
	public static int generateNumber(int max) throws Exception {
		Random random = new Random();
		if(max<=1) throw new Exception("max value must be greator then 1");
		int randomNumber = random.nextInt(max);
		while(randomNumber==0) {
			randomNumber = random.nextInt(max);
		}
		return randomNumber;
	}
	
	public static int generateNumber(int min, int max) throws Exception {
		return 0;
	}
	public static int generateNumber(int min, int max, int seed) throws Exception {
		return 0;
	}
	
	public static String generateNumber(int length, boolean alphaNumeric, boolean withSpecialChars) throws Exception {
		StringBuilder common = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		if(alphaNumeric) common.append("0123456789");
		if(withSpecialChars) common.append("`!@#$%^&*()=");
		return null;
	}
}
