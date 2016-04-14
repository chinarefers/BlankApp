# BlankApp

[![Join the chat at https://gitter.im/lijy91/BlankApp](https://badges.gitter.im/lijy91/BlankApp.svg)](https://gitter.im/lijy91/BlankApp?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://api.travis-ci.org/lijy91/BlankApp.svg?branch=master)](https://travis-ci.org/lijy91/BlankApp)

## 如何使用

1、只需将 [mvn-repo](github.com/lijy91/mvn-repo/) 地址添加到您的项目根目录 build.gradle 文件：
```
repositories {
    maven { url 'https://raw.githubusercontent.com/lijy91/mvn-repo/master/' }
    jcenter()
}
```

2、在要集成的模块 build.gradle 文件中添加依赖，如下：
```
dependencies {
    compile 'org.blankapp:blankapp:0.0.1-alpha@aar'
}
```

## License

    Copyright (C) 2015 JianyingLi <lijy91@foxmail.com>

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
