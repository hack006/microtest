package cz.ondrajanata.microtest.contracts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ondrej Janata on 10.8.16.
 * - janaton1@fel.cvut.cz
 */
@Configuration
public class CommonConfig {
    @Bean
    @Profile(Profiles.DEV)
    public static PropertySourcesPlaceholderConfigurer defaultPropertySources() {
        return createPropertySourcePlaceholderForProfile(Profiles.DEV);
    }

    @Bean
    @Profile(Profiles.DOCKER)
    public static PropertySourcesPlaceholderConfigurer deckerPropertySources() {
        return createPropertySourcePlaceholderForProfile(Profiles.DOCKER);
    }

    @Bean
    @Profile(Profiles.APP_ENGINE)
    public static PropertySourcesPlaceholderConfigurer appEnginePropertySources() {
        return createPropertySourcePlaceholderForProfile(Profiles.APP_ENGINE);
    }

    private static PropertySourcesPlaceholderConfigurer createPropertySourcePlaceholderForFiles(@NotNull List<String> files) {
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        ClassPathResource[] classPathResources = files.stream().map(ClassPathResource::new).collect(Collectors.toList()).toArray(new ClassPathResource[files.size()]);
        pspc.setLocations(classPathResources);

        return pspc;
    }

    private static PropertySourcesPlaceholderConfigurer createPropertySourcePlaceholderForProfile(@NotNull String profile) {
        List<String> configFiles = new ArrayList<>();
        configFiles.add("common.properties");
        configFiles.add("common-"+ profile +".properties");
        configFiles.add("application.properties");

        return createPropertySourcePlaceholderForFiles(configFiles);
    }
}
