# cat_scan
> 带上信仰，去寻找属于你自己的国吧！哪怕倾尽一生.（风之谷）.


  ![cat_scan snapshot][10]


----

# How to use

* AndroidStudio using Gradle build add dependent (recommended)
```groovy
compile 'com.mistyrain.cat:library:1.0.0'
```
* Download the latest JAR or grab via Maven:
```groovy
<dependency>
<groupId>com.mistyrain.cat</groupId>
<artifactId>library</artifactId>
<version>1.0.0</version>
<type>pom</type>
 </dependency>
```

# Download Demo
[Download Demo APK][9]  

# Permission
```xml
    <uses-permission android:name="android.permission.CAMERA"/>
    <uses-permission android:name="android.permission.VIBRATE"/>
    <uses-feature android:name="android.hardware.camera"/>
    <uses-feature android:name="android.hardware.camera.autofocus"/>
```

# cat_scan features
* Android 平台二维码、条形码扫描组件，底层主要采用zxing、zbar两种主流解析方式，提升扫描解析速度，组件支持arm、x86、x64 等！

* Android platform qrcode、barcode scan module, use zxing and zbar , support arm、x86、x64 more.

* 支持打开本地二维码、条形码照片，自动识别二维码、条形码，支持打开闪光灯

* Support qrcode、barcode image for local，open light



# 1. Start CaptureActivity
```java
Intent intent = new Intent(this,CaptureActivity.class);
startActivity(intent);

```

# 2. Result callback
```java
implements ResultActivity.Callback
......
```


#License
```text
Copyright 2016 misty-rain

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

[1]: https://github.com/yanzhenjie/NoHttp/
[2]: https://github.com/yanzhenjie/SkillGroupRule
[3]: http://blog.csdn.net/yanzhenjie1003
[4]: http://pan.baidu.com/s/1miEOtwG
[5]: http://www.nohttp.net
[6]: http://doc.nohttp.net
[7]: https://github.com/yanzhenjie/NoHttp/issues
[8]: https://github.com/yanzhenjie/NoHttp/blob/master/Jar/nohttp1.0.4.jar?raw=true
[9]:
[10]:http://misty-rain.github.io/images/scan.png
[11]: https://github.com/yanzhenjie/NoHttp/blob/master/Jar/nohttp1.0.4-include-source.jar?raw=true
[12]: http://www.yanzhenjie.com
[13]: https://codeload.github.com/yanzhenjie/NoHttp/zip/1.0.4
[14]: https://github.com/yanzhenjie/NoHttp/blob/master/README-cn.md
[15]: http://www.ietf.org/rfc/rfc2616.txt
