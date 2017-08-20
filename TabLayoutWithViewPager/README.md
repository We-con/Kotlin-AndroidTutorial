# TapLayout with ViewPager

Simple example for TabLayout width ViewPager

## Dependencies

build.gradle (Module: app)
```gradle
    dependencis {
        // Support libraries
        implementation 'com.android.support:appcompat-v7:26.0.1'
        implementation 'com.android.support:support-v4:26.0.1'
        implementation 'com.android.support:design:26.0.1'
        implementation 'com.android.support.constraint:constraint-layout:1.0.2

        // Kotlin
        implementation "org.jetbrains.kotlin:kotlin-stdlib-jre7:1.1.4"

        ...
    }
```

## Application Theme

AndroidManifest.xml
```xml
    android:theme="@style/AppTheme.NoActionBar"
```

Styles.xml
```xml
    <style name="AppTheme.NoActionBar">
        <item name="windowNoTitle">true</item>
        <item name="windowActionBar">false</item>
    </style>
```

Colors.xml
```xml
    <resources>
        <color name="colorPrimary">#424242</color>
        <color name="colorPrimaryDark">#1b1b1b</color>
        <color name="colorPrimaryLight">#6d6d6d</color>
        <color name="colorAccent">#fdd835</color>
        <color name="colorTitle">#ffffff</color>
        <color name="colorWallPaper">#f5f5f5</color>
    </resources>
```