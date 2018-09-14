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
 * The internal representation of a shell expression.
 */
public class Expression {

	/**
	 * Build an instance from given input text.
	 * 
	 * @param text
	 *            The raw input text.
	 */
	public Expression(final String text) {
		this.text = text;
	}

	/**
	 * Evaluate the expression with given printer and reader.
	 */
	public int eval(final Printer printer, final Reader reader) {
		printer.println("Hello, world!: " + getText());
		return 0;
	}

	/**
	 * @return A reference of the raw input text.
	 */
	protected String getText() {
		return this.text;
	}

	/** A copy of the raw expression text. */
	private final String text;
}

/* EOF */