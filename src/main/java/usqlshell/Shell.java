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

/**
 * A basic shell implementation.
 */
public class Shell {
	
	/**
	 * Default constructor for shell instances.
	 */
	public Shell() {
		this.printer = new Printer(System.out);
		this.reader = new Reader(System.in);
	}
	
	public int run() {
		Printer printer = getPrinter();
		Reader reader = getReader();
		
		int exitCode = 0;
		do {
			printer.println("Prompt> ");
			
			Expression expression = reader.read();
			if (expression == null)
				break;
			exitCode = expression.eval(printer,  reader);
			
		} while(true);
		
		return exitCode;
	}

	/**
	 * @return A reference to the internal shell printer.
	 */
	protected Printer getPrinter() {
		return this.printer;
	}

	/**
	 * @return A reference to the internal shell reader.
	 */
	protected Reader getReader() {
		return this.reader;
	}
	
	/** A reference the shell's reader. */
	private final Reader reader;

	/** A reference the shell's printer. */
	private final Printer printer;
}

/* EOF */