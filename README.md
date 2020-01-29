安装gradle
---
- https://gradle.org/下载并安装gradle
- 配置gradle环境：
```
mac: brew install gradle

```
下载源码
---
- 从https://github.com/spring-projects/spring-framework下载项目或者使用我已经编译好的：https://github.com/zhangleqi1/spring-framework


使用idea加载代码
---


构建项目
---
- 首先构建core和oxm包
![image](http://note.youdao.com/yws/res/21532/37B1F6EC539D4076AF1D9DEB4229F143)

![image](http://note.youdao.com/yws/res/21535/5731FED269434C0F84D23C9E4141E68C)


安装aspectj
---
-  下载appectj：https://www.eclipse.org/aspectj/downloads.php
-  执行：java -jar aspectxxx.jar进行安装
![image](http://note.youdao.com/yws/res/21539/2FC41F3D3F6F4742A03BBB4B868336F4)

- 点击下一步
![image](https://note.youdao.com/src/3CA72DA4D2894B3084E9302B2123785E)

- 选择jdk安装位置，选择next即可

![image](http://note.youdao.com/yws/res/21544/1EF5BD2CCABE4B4E9530C1507FEDD13B)


使用aspect构建apo.main 和aspects.main模块
---
- 添加aspect构建模块，并删除原来的kotlin构建
![image](https://note.youdao.com/src/E22ED81FDE634A5C9C4DF49EBFDE997B)

- 选择ajc进行编译，并且选择aspectjtools.jar所在位置，并选中Delegate to doc
![image](https://note.youdao.com/src/C0E340CD2B704215857D77770C14BB95)

删除无效test类
---
执行过程中会出现一些test类编译错误，删除即可
