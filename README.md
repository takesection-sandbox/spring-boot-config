Spring Boot の auto-configuration の作り方
=====================================

# Overview

* Spring Boot 1.4.2.RELEASE

# 作り方

auto-configuration の作成方法は、リファレンスの [43. Creating your own auto-configuration](http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-auto-configuration.html)
に書かれています。

リファレンスの説明にある通り、spring-boot-autoconfigure と spring-boot-starter の2つのモジュールを作成することが推奨されていますが、
spring-boot-starter だけにすることもできると書かれていますので、このプロジェクトでは、demo-spring-boot-starter を作成して、
demo-spring-boot-autoconfigure は作成していません。

demo-spring-boot-starter に DemoAutoConfiguration クラスを作成し、META-INF/spring.factories を次の内容で作成しています。

```
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
jp.pigumer.boot.autoconfigure.DemoAutoConfiguration
```

