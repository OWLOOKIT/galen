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
package net.mindengine.galen.components.validation;

import net.mindengine.galen.page.PageElement;
import net.mindengine.galen.page.Rect;

import java.util.HashMap;
import java.util.Map;

public class MockedPageElement implements PageElement {

    private Rect rect;
    private String innerText;
    private Map<String, String> cssProperties = new HashMap<String, String>();

    public MockedPageElement(int left, int top, int width, int height) {
        this.rect = new Rect(left, top, width, height);
    }

    @Override
    public Rect getArea() {
        return rect;
    }

    @Override
    public boolean isPresent() {
        return true;
    }

    @Override
    public boolean isVisible() {
        return true;
    }

    @Override
    public int getWidth() {
        return getArea().getWidth();
    }

    @Override
    public int getHeight() {
        return getArea().getHeight();
    }

    @Override
    public int getLeft() {
        return getArea().getLeft();
    }

    @Override
    public int getTop() {
        return getArea().getTop();
    }

    public MockedPageElement withText(String text) {
        this.innerText = text;
        return this;
    }
    
    @Override
    public String getText() {
        return this.innerText;
    }

    @Override
    public String getCssProperty(String cssPropertyName) {
        return this.cssProperties.get(cssPropertyName);
    }

    public PageElement withCssProperty(String cssPropertyName, String value) {
        this.cssProperties.put(cssPropertyName, value);
        return this;
    }
}
