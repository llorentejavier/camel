/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.msk.MSK2Component;

/**
 * The aws2-msk is used for managing Amazon MSK
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2MskComponentBuilderFactory {

    /**
     * AWS 2 MSK (camel-aws2-msk)
     * The aws2-msk is used for managing Amazon MSK
     * 
     * Category: cloud,management
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-msk
     */
    static Aws2MskComponentBuilder aws2Msk() {
        return new Aws2MskComponentBuilderImpl();
    }

    /**
     * Builder for the AWS 2 MSK component.
     */
    interface Aws2MskComponentBuilder extends ComponentBuilder<MSK2Component> {
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2MskComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2MskComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use a existing configured AWS MSK as client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.kafka.KafkaClient</code> type.
         * 
         * Group: producer
         */
        default Aws2MskComponentBuilder mskClient(
                software.amazon.awssdk.services.kafka.KafkaClient mskClient) {
            doSetProperty("mskClient", mskClient);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.msk.MSK2Operations</code> type.
         * 
         * Group: producer
         */
        default Aws2MskComponentBuilder operation(
                org.apache.camel.component.aws2.msk.MSK2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the MSK client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2MskComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the MSK client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default Aws2MskComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the MSK client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Aws2MskComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which MSK client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2MskComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2MskComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default Aws2MskComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The AWS MSK default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.msk.MSK2Configuration</code>
         * type.
         * 
         * Group: advanced
         */
        default Aws2MskComponentBuilder configuration(
                org.apache.camel.component.aws2.msk.MSK2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    }

    class Aws2MskComponentBuilderImpl
            extends
                AbstractComponentBuilder<MSK2Component>
            implements
                Aws2MskComponentBuilder {
        @Override
        protected MSK2Component buildConcreteComponent() {
            return new MSK2Component();
        }
        private org.apache.camel.component.aws2.msk.MSK2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.msk.MSK2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.msk.MSK2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "accessKey": ((MSK2Component) component).setAccessKey((java.lang.String) value); return true;
            case "lazyStartProducer": ((MSK2Component) component).setLazyStartProducer((boolean) value); return true;
            case "mskClient": getOrCreateConfiguration((MSK2Component) component).setMskClient((software.amazon.awssdk.services.kafka.KafkaClient) value); return true;
            case "operation": getOrCreateConfiguration((MSK2Component) component).setOperation((org.apache.camel.component.aws2.msk.MSK2Operations) value); return true;
            case "proxyHost": getOrCreateConfiguration((MSK2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((MSK2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((MSK2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "region": getOrCreateConfiguration((MSK2Component) component).setRegion((java.lang.String) value); return true;
            case "secretKey": ((MSK2Component) component).setSecretKey((java.lang.String) value); return true;
            case "basicPropertyBinding": ((MSK2Component) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((MSK2Component) component).setConfiguration((org.apache.camel.component.aws2.msk.MSK2Configuration) value); return true;
            default: return false;
            }
        }
    }
}