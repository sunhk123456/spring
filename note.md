## 常用依赖
```xml
       <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.16</version>
        </dependency>
</dependencies>
```
##  注解说明

-  @autowire通过byType实现，而且必须要求这个对象存在
- @resource默认通过byName实现，如果找不到，通过byType实现
- @Nullable 字段标志的注解，说明这个字段可以为null