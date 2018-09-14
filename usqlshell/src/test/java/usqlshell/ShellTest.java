/*
 * Copyright (c) 2016 Antonio Alvarado Hernández - All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package usqlshell;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for the class {@link Shell}.
 */
public class ShellTest extends TestCase {

	/**
	 * Initialize the test case instance.
	 *
	 * @param testName
	 *            the name of this test case.
	 */
	public ShellTest(String testName) {
		super(testName);
	}

	/**
	 * @return the generated test suite.
	 */
	public static Test suite() {
		return new TestSuite(ShellTest.class);
	}

	/**
	 * Test a simple run.
	 */
	public void testRun() {
		Shell shell = new Shell();
		assertFalse(shell.run() != 0);
	}
}

/* EOF */