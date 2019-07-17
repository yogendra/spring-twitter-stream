# Spring-Twitter-Stream [![Build Status](https://travis-ci.org/RawSanj/spring-twitter-stream.svg?branch=master)](https://travis-ci.org/RawSanj/spring-twitter-stream)

Spring Boot - Spring Social Twitter - D3.Js webapp for Streaming Live #HashTags and source location of Tweets.

## Demo - Live Demo @ [Heroku](https://twitter-stream-cloud.herokuapp.com)

![Spring Twitter Stream Demo](/demo.gif?raw=true "Spring Twitter Stream Demo")

## Installation

#### Clone the Github repository

```sh
$ git clone https://github.com/RawSanj/Spring-Twitter-Stream.git
```

#### Twitter App and Configuration

1. Login to https://apps.twitter.com
2. Create a New Application and note down the _Consumer Key, Consumer Secret, Access Token and Access Token Secret_.
3. Edit the `/src/main/resources/application.properties` and add above noted keys.

#### Run the application

```sh
$ mvn spring-boot:run \
  -Dvcap.services.twitter.credentials.consumerKey="CONSUMER KEY" \
  -Dvcap.services.twitter.credentials.consumerSecret="CONSUMER SECRET" \
  -Dvcap.services.twitter.credentials.accessToken="ACCESS TOKEN" \
  -Dvcap.services.twitter.credentials.accessTokenSecret="ACCESS TOKEN"
```

Then navigate to [http://localhost:8080](http://localhost:8080) in your browser.

## Deploy to Cloud Foundry

#### Package the application (creates spring-twitter-stream-0.1.0.war file)

```sh
$ mvn clean package
```

#### Pre-requisite:

1. Account @ http://run.pivotal.io. \$87 Credit Free Account.
2. cf cli is installed - http://docs.cloudfoundry.org/cf-cli

#### Login to Pivotal Cloud Foundry

```sh
$ cf login -a https://api.run.pivotal.io
```

#### Create service

```sh
cf cups twitter -p '{
  "consumerKey":"CONSUMER KEY",
  "consumerSecret":"CONSUMER SECRET",
  "accessToken":"ACCESS TOKEN",
  "accessTokenSecret":"ACCESS TOKEN SECRET"
}'

```

````
#### Deploy the application
```sh
$ cf push
````

## Tools and Tech

The following tools, technologies and libraries are used to create this project :

- [Spring Boot] - (Spring Social Twitter, Spring SseEmitter)
- [Thymeleaf] - (Thymeleaf is a template engine capable of processing and generating HTML, XML, JavaScript, CSS and text.)
- [D3Js] - D3.js is a JavaScript library for manipulating documents based on data.
- [Spring Tool Suite]
- [Git]

## License

---

The MIT License (MIT)

Copyright (c) 2017. Sanjay Rawat

[thymeleaf]: http://www.thymeleaf.org/
[spring boot]: http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/
[spring tool suite]: https://spring.io/tools
[git]: https://git-scm.com/
[d3js]: https://d3js.org/
