node {

    stage 'Clone from Git'
    git url: 'https://github.com/michaellihs/testing-with-spring.git'

    stage 'Build with Maven'
    sh 'mvn install -DskipTests'

    stage 'Run Unit Tests with Maven'
    sh 'mvn test -P UnitTests'

    stage 'Run Integration Tests with Maven'
    sh 'mvn test -P IntegrationTests'

}