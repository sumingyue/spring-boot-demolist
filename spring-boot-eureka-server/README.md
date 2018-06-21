1、配置hosts
127.0.0.1       peer1
127.0.0.1       peer2
2、mvn clean install -Dmaven.test.skip=true
3、启动两个服务
java -jar target\spring-boot-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar target\spring-boot-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
4、访问http://127.0.0.1:1112/eureka/或者http://127.0.0.1:1111/eureka/