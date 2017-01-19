# CustomFonts
Custom fonts

You can find more information in this **[blog](http://thedeveloperworldisyours.com/android/custom-fonts-in-android/#sthash.TplSUNFo.QiQjI5i0.dpbs)**

If you plan to add the same font to several views (Button, TextView...).  I suggest that you go all the way and implement subclass button:


```java

public class ButtonPlus extends Button {

    public ButtonPlus(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public ButtonPlus(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public ButtonPlus(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
            Typeface customFont = FontCache.getTypeface("fonts/candy.ttf", context);
            setTypeface(customFont);
        }
    }
```

And here's the FontCache to reduce memory usage on older devices:

```java
public class FontCache {

    private static Hashtable<String, Typeface> fontCache = new Hashtable<>();

    public static Typeface getTypeface(String name, Context context) {
        Typeface tf = fontCache.get(name);
        if(tf == null) {
            try {
                tf = Typeface.createFromAsset(context.getAssets(), name);
            }
            catch (Exception e) {
                return null;
            }
            fontCache.put(name, tf);
        }
        return tf;
    }
}
 ```

And finally an example use in a layout:
```xml
<com.my.package.buttons.ButtonPlus
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_sometext"/>
```

Also visit my blog: **[The developer world is yours](http://thedeveloperworldisyours.com/)**

# Requirements

    - Android Studio

    - Gradle


# Installation

    - Install Android Studio:

    https://developer.android.com/sdk/installing/index.html

    - Install gradle:

    http://gradle.org/docs/current/userguide/installation.html

# Usage
    Compile with Android Studio and gradle


Feel free to contribute, and contact me for any issues.

Developed By
------------
* Javier González Cabezas - <javiergonzalezcabezas@gmail.com>

<a href="https://es.linkedin.com/in/javier-gonz%C3%A1lez-cabezas-8b4b2231">
  <img alt="Add me to Linkedin" src="https://github.com/JorgeCastilloPrz/EasyMVP/blob/master/art/linkedin.png" />
</a>

License
-------

    Copyright 2017 Javier González Cabezas

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
