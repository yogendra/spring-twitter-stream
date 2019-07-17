package com.rawsanj.tweet.config;

import static org.slf4j.LoggerFactory.getLogger;

import lombok.Data;
import org.slf4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@Configuration
@ConfigurationProperties("vcap.services.twitter.credentials")
@Data
public class TwitterConfig {
    private static final Logger logger = getLogger(TwitterConfig.class);

    private String consumerKey;
    private String consumerSecret;
    private String accessToken;
    private String accessTokenSecret;

    @Bean
    TwitterTemplate twitterTemplate(){

        logger.info("consumerKey:{}", consumerKey);
        logger.info("consumerSecret:{}", consumerSecret);
        logger.info("accessToken:{}", accessToken);
        logger.info("accessTokenSecret:{}", accessTokenSecret);
        return new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
    }

}
