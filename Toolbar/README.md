# Toolbar

Simple example for Toolbar with NavigationView

### Android Developer Version Info
- Build Tool Version = 26.0.1
- Compile SDK Version = 26
- Target SDK Version = 26
- Android Studio = 3.0 beta 2

### User Library Version
- Kotlin version = 1.1.4
- support library Version = 26.0.1

### Dependencies
    implementation 'com.android.support:appcompat-v7:26.0.1'
    implementation 'com.android.support:design:26.0.1'

## Guide

### step1. Change AppTheme to AppTheme.NoActionBar

### step2. Add Toolbar and NavigationView in your layout

### step3. Create menus for Toolbar and NavigationView

### step4. Set listener

### etc
##### app:showAsAction
```xml
app:showAsAction="always"    // 항상 보이도록 표시
app:showAsAction="naver"     // 항상 overflow 공간에 표시
app:showAsAction="ifRoom"    // Toolbar에 공간이 있다면 보이도록 표시
app:showAsAction="withText"  // Toolbar에 Icon과 Text를 함께 표시
```