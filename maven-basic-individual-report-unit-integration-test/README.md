# Basic Maven Example with sonar-scanner cli and combined report


run project
```shell script
> mvn clean install
> sonar-scanner -Dproject.settings=sonar-project.properties
```

report can be accessed locally at
>   target/site/jacoco-coverage-ut/index.html
>   target/site/jacoco-coverage-it/index.html
>   target/site/jacoco-coverage-all/index.html