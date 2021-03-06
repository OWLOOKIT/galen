/*******************************************************************************
* Copyright 2014 Ivan Shubin http://mindengine.net
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
******************************************************************************/
package net.mindengine.galen.parser;

import net.mindengine.galen.suite.reader.Line;

public class SyntaxException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 421348434010710101L;

    private Line line;
    
    public SyntaxException(Line line) {
        super();
        this.line = line; 
    }

    public SyntaxException(Line line, String paramString, Throwable paramThrowable) {
        super(paramString, paramThrowable);
        this.line = line;
    }

    public SyntaxException(Line line, String paramString) {
        super(paramString);
        this.line = line;
    }

    public SyntaxException(Line line, Throwable paramThrowable) {
        super(paramThrowable);
        this.line = line;
    }
    
    public SyntaxException(String message) {
		this(null, message);
	}

	public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
}
