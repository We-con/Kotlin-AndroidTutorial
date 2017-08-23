# Pop up Activity

Simple example for Pop up Activity

## Dependencies

## Application Theme

AndroidManifest.xml
```xml
        <activity android:name=".PopupActivity"
            android:theme="@style/AppTheme.PopUpDialog" />
```

Styles.xml
```xml
     <style name="AppTheme.PopUpDialog" parent="@style/Theme.AppCompat.Dialog">
        <item name="windowNoTitle">true</item>
        <item name="android:background">@color/colorWallPaper</item>
        <item name="android:textColor">@color/colorText</item>
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

        <color name="colorText">#6d6d6d</color>
        <color name="colorTextAccent">#1b1b1b</color>
    </resources>
```