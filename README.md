# sonar-maven basic project
examples of sonarqube integration with simple basic maven projects

Table of Contents
=================

   * [maven basic modules](#maven-basic-modules)
   * [maven multi-module project](#maven-multi-module-project)
   * [local setup](#local-setup)
      * [Prerequisite](#prerequisite)
      * [Usage](#usage)
      * [Documentation](#documentation)
      
# maven basic modules
## [maven-basic-maven-sonar-plugin](maven-basic-maven-sonar-plugin)
>   maven + sonar-maven-plugin

## [maven-basic-sonar-scanner-cli](maven-basic-sonar-scanner-cli)
>   maven + sonar-scanner

## [maven-basic-individual-report-unit-integration-test](maven-basic-individual-report-unit-integration-test)
>   maven + sonar-scanner

>   unit test coverage data + report

>   integration test coverage data + report

>   unit test + integration test combined report

## [maven-basic-combined-coverage-unit-integration-test](maven-basic-combined-coverage-unit-integration-test)
>   maven + sonar-scanner

>   unit test + integration test combined coverage ratio

# maven multi-module project

## [maven-multimodule-maven-sonar-plugin](maven-multimodule-maven-sonar-plugin)
>   maven + sonar-maven-plugin

## [maven-multimodule-sonar-scanner](maven-multimodule-sonar-scanner)
>   maven + sonar-scanner

## [maven-multimodule-individual-module-coverage](maven-multimodule-individual-module-coverage)
>   maven + sonar-scanner
>   unit test + integration test coverage ratio per module


# local setup

## Prerequisite
*   local setup if not having enterprise setup
    *   [setup/get-started-2-minutes](https://docs.sonarqube.org/latest/setup/get-started-2-minutes/)
    *   [OR] sonarqube server installation if not having.
    
        *   using docker  
            ```shell script
            docker pull sonarqube
            docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube
            ```        
        *   manual
            [manual setup](https://docs.sonarqube.org/latest/setup/get-started-2-minutes/)
        
*   setup sonar-scanner cli (when not using `maven-sonar-plugin`)
    ```shell script
    brew install sonar-scanner
    ```
## Usage

* Build the project, execute all the tests and analyze the project with SonarQube Scanner for Maven(from root  of the project):
    *   if using `maven-sonar-plugin`
        ```shell script
        > mvn clean verify sonar:sonar
        ```
        please note `maven-sonar-plugin` doesn't take `sonar-project.properties` and therefore all properties either needs to be defined
        in `pom.xml` or `command line argument` using `-D` option. like `-Dsonar.host.url=https://localhost:9000`
                
    *   if using `sonar-scanner cli command`
        ```shell script
        > mvn clean install
        > sonar-scanner -Dproject.settings=sonar-project.properties  
        ```
## Documentation

*   [SonarScanner for Maven Docs](https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-maven/)
*   [setup/get-started-2-minutes Docs](https://docs.sonarqube.org/latest/setup/get-started-2-minutes/)
