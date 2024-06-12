## 说明
此工程从Adjust官方Github的4.38.4版本 fork出来，进行差异化修改。主要是为了在GooglePlay上架时避开静态检查，因为Adjust可能是阻碍GooglePlay上架的一个因素。

版本号说明：为了方便知道fork的sdk来自哪一个官方版本，我们工程的版本号就在原Adjust官方版本的后面多加一个号段，如：4.38.4.3表示来自官方4.38.4版本。

Adjust官网：https://github.com/adjust/android_sdk

## 发布
sdk-plugin-samsung-clouddev模块需要引入三星的SDK，目前这个SDK没有在三星官网公开，需要三星公司单独提供，因此这个模块目前无法编译。

以下命令负责发布模块：

- sdk-core
- sdk-plugin-criteo
- sdk-plugin-imei
- sdk-plugin-oaid
- sdk-plugin-samsung-referrer
- sdk-plugin-sociomantic
- sdk-plugin-trademob
- sdk-plugin-vivo-referrer
- sdk-plugin-webbridge
- sdk-plugin-xiaomi-referrer
```
./gradlew sdk-core:publishAllPublicationsToMavenRepository 
sdk-plugin-criteo:publishAllPublicationsToMavenRepository \
sdk-plugin-imei:publishAllPublicationsToMavenRepository \
sdk-plugin-oaid:publishAllPublicationsToMavenRepository \
sdk-plugin-samsung-referrer:publishAllPublicationsToMavenRepository \
sdk-plugin-sociomantic:publishAllPublicationsToMavenRepository \
sdk-plugin-trademob:publishAllPublicationsToMavenRepository \
sdk-plugin-vivo-referrer:publishAllPublicationsToMavenRepository \
sdk-plugin-webbridge:publishAllPublicationsToMavenRepository \
sdk-plugin-xiaomi-referrer:publishAllPublicationsToMavenRepository
```

## 历史版本

### 4.38.4.2
- 基于Adjust 4.38.4初始化版本
- 去掉了UrlStrategy中的中国服务器地址
- 更改了类的路径，从com.adjust.sdk更改为com.bumptech.sdk
- 修改了混淆规则，允许混淆原com.adjust.sdk路径下的类

### 4.38.4.3
- Sdk传到服务器的版本号恢复为4.38.4，修复版本号验证失败的问题
