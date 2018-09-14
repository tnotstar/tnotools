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

import java.io.InputStream;
import java.util.Scanner;

/**
 * A layer between an external input stream and the shell objects.
 */
public class Reader {

	/**
	 * Build an instance with given input stream.
	 */
	public Reader(final InputStream input) {
		this.scanner = new Scanner(input);
	}

	/**
	 * Read the next line available from the input scanner.
	 * 
	 * @return The string read from the scanner or {@code null}.
	 */
	public Expression read() {
		Scanner scanner = getScanner();
		if (!scanner.hasNextLine())
			return null;
		return new Expression(scanner.nextLine());
	}

	/**
	 * @return A reference to its input scanner.
	 */
	protected Scanner getScanner() {
		return this.scanner;
	}

	/** A reference to the input scanner. */
	private final Scanner scanner;
}

/* EOF */