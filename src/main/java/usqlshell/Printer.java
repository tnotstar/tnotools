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

import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * A layer between an external output stream and the shell objects.
 */
public class Printer {

	/**
	 * Build an instance with given output stream.
	 */
	public Printer(final OutputStream output) {
		this.writer = new PrintWriter(output);
	}

	/**
	 * Write a given line string to the external output stream.
	 * 
	 * @param line
	 *            The line to be written.
	 */
	public void println(final String line) {
		getWriter().println(line);
		getWriter().flush();
	}

	/**
	 * @return A reference to its output writer.
	 */
	protected PrintWriter getWriter() {
		return this.writer;
	}

	/** A reference to the output writer. */
	private final PrintWriter writer;
}

/* EOF */