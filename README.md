ReverseDrawerLayout
===================

Modified Android DrawerLayout -- main content view goes on drawer, navigation content lies underneath

<img src="https://raw.githubusercontent.com/mattlogan/ReverseDrawerLayout/master/github-assets/Screenshot_2014-06-28-23-37-48.png" height="540"/>
<img src="https://raw.githubusercontent.com/mattlogan/ReverseDrawerLayout/master/github-assets/Screenshot_2014-06-28-23-37-52.png" height="540" align="right"/>

## How to Use

This is an example of a layout file for an activity that use ReverseDrawerLayout.  The first child should be used for navigation (or other) content, and is initially hidden below the second child -- the main content view.

This is a fork of [Android DrawerLayout](https://developer.android.com/reference/android/support/v4/widget/DrawerLayout.html), so all the [documentation](https://developer.android.com/reference/android/support/v4/widget/DrawerLayout.html) for that should apply here as well.

```xml
<!--Use the namespace "http://schemas.android.com/apk/res-auto" to set the custom-->
<!--attribute, drawerOverhang.  This determines how much of the main content view-->
<!--is shown when it slides out to display the navigation view underneath.-->
<com.matthewlogan.reversedrawerlayout.library.ReverseDrawerLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/reverse_drawer_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:drawerOverhang="30dp">

    <!--The first child of ReverseDrawerLayout is the navigation (or other) content,-->
    <!--which will initially be hidden.  As the second child of ReverseDrawerLayout-->
    <!--(the main content view) slides out, this view will be revealed underneath it.-->
    <RelativeLayout
        android:id="@+id/bottom_content"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#999">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:text="This is the drawer content"
            android:textColor="#fff"
            android:textSize="30sp" />

    </RelativeLayout>

    <!--The second child of ReverseDrawerLayout is the main content view.  This can be a-->
    <!--container for a fragment or any other type of view.  This will slide in and out-->
    <!--to reveal the navigation (or other) content underneath.-->
    <FrameLayout
        android:id="@+id/fragment_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="right" />

</com.matthewlogan.reversedrawerlayout.library.ReverseDrawerLayout>
```

## Sample

See the [sample app](https://github.com/mattlogan/ReverseDrawerLayout/tree/master/app) for a standard use of this library.

## License

The MIT License (MIT)

Copyright (c) 2014 Matthew Logan

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
