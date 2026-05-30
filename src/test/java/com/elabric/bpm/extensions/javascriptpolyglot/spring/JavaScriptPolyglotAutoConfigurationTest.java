package com.elabric.bpm.extensions.javascriptpolyglot.spring;

import org.junit.jupiter.api.Test;
import com.elabric.bpm.extensions.javascriptpolyglot.JavaScriptPolyglotScriptEnvPlugin;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies Spring Boot classpath auto-registration of the process engine plugin.
 */
class JavaScriptPolyglotAutoConfigurationTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(JavaScriptPolyglotAutoConfiguration.class));

    @Test
    void registersProcessEnginePluginBean() {
        contextRunner.run(context -> assertThat(context).hasSingleBean(JavaScriptPolyglotScriptEnvPlugin.class));
    }
}
