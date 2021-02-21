# 2021.02.21
## 1. 设置主程序入口映射地址
在 HelloController 中设置程序主入口，添加注解 **@RequestMapping("/hello")**，该方法下的所有请求皆由 ./hello/ 进入。
## 2. 更改 banner 字符
banner是springboot启动时出现的由字符组成的Spring符号，
在 resources 目录下建立文件 banner.txt, 可以根据自己兴趣更改banner字符样式。
## 3. 更改端口号
在 **resources/application.properties** 文件中添加语句 **server.port=8081** 可将端口更改为 8081
运行程序查看 端口变为8081，程序入口 http://localhost:8081/hello/hello
