# 使用 JDK 11 作为基础镜像
FROM meddream/jdk17

# 将 JAR 文件复制到容器中的 /app 目录
COPY target/MyDockerApplication-0.0.1-SNAPSHOT.jar /app/

# 设置工作目录为 /app
WORKDIR /app

# 运行 Spring Boot 应用程序
CMD ["java", "-jar", "MyDockerApplication-0.0.1-SNAPSHOT.jar"]