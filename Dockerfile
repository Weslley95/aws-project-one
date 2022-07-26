FROM openjdk:11
VOLUME /tmp
ARG DEPENDENCY=targ/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java", "-cp", "app:app/lib/*", "com.wpb.aws_project_one.AwsProjectOneApplication"]