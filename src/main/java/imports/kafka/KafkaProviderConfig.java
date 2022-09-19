package imports.kafka;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-09-19T18:32:11.224Z")
@software.amazon.jsii.Jsii(module = imports.kafka.$Module.class, fqn = "Mongey_kafka.KafkaProviderConfig")
@software.amazon.jsii.Jsii.Proxy(KafkaProviderConfig.Jsii$Proxy.class)
public interface KafkaProviderConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * A list of kafka brokers.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#bootstrap_servers KafkaProvider#bootstrap_servers}
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getBootstrapServers();

    /**
     * Alias name.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#alias KafkaProvider#alias}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return null;
    }

    /**
     * CA certificate file to validate the server's certificate.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#ca_cert KafkaProvider#ca_cert}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCaCert() {
        return null;
    }

    /**
     * Path to a CA certificate file to validate the server's certificate.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#ca_cert_file KafkaProvider#ca_cert_file}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCaCertFile() {
        return null;
    }

    /**
     * The client certificate.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_cert KafkaProvider#client_cert}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientCert() {
        return null;
    }

    /**
     * Path to a file containing the client certificate.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_cert_file KafkaProvider#client_cert_file}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientCertFile() {
        return null;
    }

    /**
     * The private key that the certificate was issued for.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_key KafkaProvider#client_key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientKey() {
        return null;
    }

    /**
     * Path to a file containing the private key that the certificate was issued for.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_key_file KafkaProvider#client_key_file}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientKeyFile() {
        return null;
    }

    /**
     * The passphrase for the private key that the certificate was issued for.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_key_passphrase KafkaProvider#client_key_passphrase}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClientKeyPassphrase() {
        return null;
    }

    /**
     * SASL mechanism, can be plain, scram-sha512, scram-sha256.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#sasl_mechanism KafkaProvider#sasl_mechanism}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSaslMechanism() {
        return null;
    }

    /**
     * Password for SASL authentication.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#sasl_password KafkaProvider#sasl_password}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSaslPassword() {
        return null;
    }

    /**
     * Username for SASL authentication.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#sasl_username KafkaProvider#sasl_username}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSaslUsername() {
        return null;
    }

    /**
     * Set this to true only if the target Kafka server is an insecure development instance.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#skip_tls_verify KafkaProvider#skip_tls_verify}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSkipTlsVerify() {
        return null;
    }

    /**
     * Timeout in seconds.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#timeout KafkaProvider#timeout}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeout() {
        return null;
    }

    /**
     * Enable communication with the Kafka Cluster over TLS.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#tls_enabled KafkaProvider#tls_enabled}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTlsEnabled() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KafkaProviderConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KafkaProviderConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KafkaProviderConfig> {
        java.util.List<java.lang.String> bootstrapServers;
        java.lang.String alias;
        java.lang.String caCert;
        java.lang.String caCertFile;
        java.lang.String clientCert;
        java.lang.String clientCertFile;
        java.lang.String clientKey;
        java.lang.String clientKeyFile;
        java.lang.String clientKeyPassphrase;
        java.lang.String saslMechanism;
        java.lang.String saslPassword;
        java.lang.String saslUsername;
        java.lang.Object skipTlsVerify;
        java.lang.Number timeout;
        java.lang.Object tlsEnabled;

        /**
         * Sets the value of {@link KafkaProviderConfig#getBootstrapServers}
         * @param bootstrapServers A list of kafka brokers. This parameter is required.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#bootstrap_servers KafkaProvider#bootstrap_servers}
         * @return {@code this}
         */
        public Builder bootstrapServers(java.util.List<java.lang.String> bootstrapServers) {
            this.bootstrapServers = bootstrapServers;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getAlias}
         * @param alias Alias name.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#alias KafkaProvider#alias}
         * @return {@code this}
         */
        public Builder alias(java.lang.String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getCaCert}
         * @param caCert CA certificate file to validate the server's certificate.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#ca_cert KafkaProvider#ca_cert}
         * @return {@code this}
         */
        public Builder caCert(java.lang.String caCert) {
            this.caCert = caCert;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getCaCertFile}
         * @param caCertFile Path to a CA certificate file to validate the server's certificate.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#ca_cert_file KafkaProvider#ca_cert_file}
         * @return {@code this}
         */
        public Builder caCertFile(java.lang.String caCertFile) {
            this.caCertFile = caCertFile;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getClientCert}
         * @param clientCert The client certificate.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_cert KafkaProvider#client_cert}
         * @return {@code this}
         */
        public Builder clientCert(java.lang.String clientCert) {
            this.clientCert = clientCert;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getClientCertFile}
         * @param clientCertFile Path to a file containing the client certificate.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_cert_file KafkaProvider#client_cert_file}
         * @return {@code this}
         */
        public Builder clientCertFile(java.lang.String clientCertFile) {
            this.clientCertFile = clientCertFile;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getClientKey}
         * @param clientKey The private key that the certificate was issued for.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_key KafkaProvider#client_key}
         * @return {@code this}
         */
        public Builder clientKey(java.lang.String clientKey) {
            this.clientKey = clientKey;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getClientKeyFile}
         * @param clientKeyFile Path to a file containing the private key that the certificate was issued for.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_key_file KafkaProvider#client_key_file}
         * @return {@code this}
         */
        public Builder clientKeyFile(java.lang.String clientKeyFile) {
            this.clientKeyFile = clientKeyFile;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getClientKeyPassphrase}
         * @param clientKeyPassphrase The passphrase for the private key that the certificate was issued for.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_key_passphrase KafkaProvider#client_key_passphrase}
         * @return {@code this}
         */
        public Builder clientKeyPassphrase(java.lang.String clientKeyPassphrase) {
            this.clientKeyPassphrase = clientKeyPassphrase;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getSaslMechanism}
         * @param saslMechanism SASL mechanism, can be plain, scram-sha512, scram-sha256.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#sasl_mechanism KafkaProvider#sasl_mechanism}
         * @return {@code this}
         */
        public Builder saslMechanism(java.lang.String saslMechanism) {
            this.saslMechanism = saslMechanism;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getSaslPassword}
         * @param saslPassword Password for SASL authentication.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#sasl_password KafkaProvider#sasl_password}
         * @return {@code this}
         */
        public Builder saslPassword(java.lang.String saslPassword) {
            this.saslPassword = saslPassword;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getSaslUsername}
         * @param saslUsername Username for SASL authentication.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#sasl_username KafkaProvider#sasl_username}
         * @return {@code this}
         */
        public Builder saslUsername(java.lang.String saslUsername) {
            this.saslUsername = saslUsername;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getSkipTlsVerify}
         * @param skipTlsVerify Set this to true only if the target Kafka server is an insecure development instance.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#skip_tls_verify KafkaProvider#skip_tls_verify}
         * @return {@code this}
         */
        public Builder skipTlsVerify(java.lang.Boolean skipTlsVerify) {
            this.skipTlsVerify = skipTlsVerify;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getSkipTlsVerify}
         * @param skipTlsVerify Set this to true only if the target Kafka server is an insecure development instance.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#skip_tls_verify KafkaProvider#skip_tls_verify}
         * @return {@code this}
         */
        public Builder skipTlsVerify(com.hashicorp.cdktf.IResolvable skipTlsVerify) {
            this.skipTlsVerify = skipTlsVerify;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getTimeout}
         * @param timeout Timeout in seconds.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#timeout KafkaProvider#timeout}
         * @return {@code this}
         */
        public Builder timeout(java.lang.Number timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getTlsEnabled}
         * @param tlsEnabled Enable communication with the Kafka Cluster over TLS.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#tls_enabled KafkaProvider#tls_enabled}
         * @return {@code this}
         */
        public Builder tlsEnabled(java.lang.Boolean tlsEnabled) {
            this.tlsEnabled = tlsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link KafkaProviderConfig#getTlsEnabled}
         * @param tlsEnabled Enable communication with the Kafka Cluster over TLS.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#tls_enabled KafkaProvider#tls_enabled}
         * @return {@code this}
         */
        public Builder tlsEnabled(com.hashicorp.cdktf.IResolvable tlsEnabled) {
            this.tlsEnabled = tlsEnabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KafkaProviderConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KafkaProviderConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KafkaProviderConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KafkaProviderConfig {
        private final java.util.List<java.lang.String> bootstrapServers;
        private final java.lang.String alias;
        private final java.lang.String caCert;
        private final java.lang.String caCertFile;
        private final java.lang.String clientCert;
        private final java.lang.String clientCertFile;
        private final java.lang.String clientKey;
        private final java.lang.String clientKeyFile;
        private final java.lang.String clientKeyPassphrase;
        private final java.lang.String saslMechanism;
        private final java.lang.String saslPassword;
        private final java.lang.String saslUsername;
        private final java.lang.Object skipTlsVerify;
        private final java.lang.Number timeout;
        private final java.lang.Object tlsEnabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bootstrapServers = software.amazon.jsii.Kernel.get(this, "bootstrapServers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.alias = software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.caCert = software.amazon.jsii.Kernel.get(this, "caCert", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.caCertFile = software.amazon.jsii.Kernel.get(this, "caCertFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientCert = software.amazon.jsii.Kernel.get(this, "clientCert", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientCertFile = software.amazon.jsii.Kernel.get(this, "clientCertFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientKey = software.amazon.jsii.Kernel.get(this, "clientKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientKeyFile = software.amazon.jsii.Kernel.get(this, "clientKeyFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.clientKeyPassphrase = software.amazon.jsii.Kernel.get(this, "clientKeyPassphrase", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.saslMechanism = software.amazon.jsii.Kernel.get(this, "saslMechanism", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.saslPassword = software.amazon.jsii.Kernel.get(this, "saslPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.saslUsername = software.amazon.jsii.Kernel.get(this, "saslUsername", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.skipTlsVerify = software.amazon.jsii.Kernel.get(this, "skipTlsVerify", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.timeout = software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tlsEnabled = software.amazon.jsii.Kernel.get(this, "tlsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bootstrapServers = java.util.Objects.requireNonNull(builder.bootstrapServers, "bootstrapServers is required");
            this.alias = builder.alias;
            this.caCert = builder.caCert;
            this.caCertFile = builder.caCertFile;
            this.clientCert = builder.clientCert;
            this.clientCertFile = builder.clientCertFile;
            this.clientKey = builder.clientKey;
            this.clientKeyFile = builder.clientKeyFile;
            this.clientKeyPassphrase = builder.clientKeyPassphrase;
            this.saslMechanism = builder.saslMechanism;
            this.saslPassword = builder.saslPassword;
            this.saslUsername = builder.saslUsername;
            this.skipTlsVerify = builder.skipTlsVerify;
            this.timeout = builder.timeout;
            this.tlsEnabled = builder.tlsEnabled;
        }

        @Override
        public final java.util.List<java.lang.String> getBootstrapServers() {
            return this.bootstrapServers;
        }

        @Override
        public final java.lang.String getAlias() {
            return this.alias;
        }

        @Override
        public final java.lang.String getCaCert() {
            return this.caCert;
        }

        @Override
        public final java.lang.String getCaCertFile() {
            return this.caCertFile;
        }

        @Override
        public final java.lang.String getClientCert() {
            return this.clientCert;
        }

        @Override
        public final java.lang.String getClientCertFile() {
            return this.clientCertFile;
        }

        @Override
        public final java.lang.String getClientKey() {
            return this.clientKey;
        }

        @Override
        public final java.lang.String getClientKeyFile() {
            return this.clientKeyFile;
        }

        @Override
        public final java.lang.String getClientKeyPassphrase() {
            return this.clientKeyPassphrase;
        }

        @Override
        public final java.lang.String getSaslMechanism() {
            return this.saslMechanism;
        }

        @Override
        public final java.lang.String getSaslPassword() {
            return this.saslPassword;
        }

        @Override
        public final java.lang.String getSaslUsername() {
            return this.saslUsername;
        }

        @Override
        public final java.lang.Object getSkipTlsVerify() {
            return this.skipTlsVerify;
        }

        @Override
        public final java.lang.Number getTimeout() {
            return this.timeout;
        }

        @Override
        public final java.lang.Object getTlsEnabled() {
            return this.tlsEnabled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bootstrapServers", om.valueToTree(this.getBootstrapServers()));
            if (this.getAlias() != null) {
                data.set("alias", om.valueToTree(this.getAlias()));
            }
            if (this.getCaCert() != null) {
                data.set("caCert", om.valueToTree(this.getCaCert()));
            }
            if (this.getCaCertFile() != null) {
                data.set("caCertFile", om.valueToTree(this.getCaCertFile()));
            }
            if (this.getClientCert() != null) {
                data.set("clientCert", om.valueToTree(this.getClientCert()));
            }
            if (this.getClientCertFile() != null) {
                data.set("clientCertFile", om.valueToTree(this.getClientCertFile()));
            }
            if (this.getClientKey() != null) {
                data.set("clientKey", om.valueToTree(this.getClientKey()));
            }
            if (this.getClientKeyFile() != null) {
                data.set("clientKeyFile", om.valueToTree(this.getClientKeyFile()));
            }
            if (this.getClientKeyPassphrase() != null) {
                data.set("clientKeyPassphrase", om.valueToTree(this.getClientKeyPassphrase()));
            }
            if (this.getSaslMechanism() != null) {
                data.set("saslMechanism", om.valueToTree(this.getSaslMechanism()));
            }
            if (this.getSaslPassword() != null) {
                data.set("saslPassword", om.valueToTree(this.getSaslPassword()));
            }
            if (this.getSaslUsername() != null) {
                data.set("saslUsername", om.valueToTree(this.getSaslUsername()));
            }
            if (this.getSkipTlsVerify() != null) {
                data.set("skipTlsVerify", om.valueToTree(this.getSkipTlsVerify()));
            }
            if (this.getTimeout() != null) {
                data.set("timeout", om.valueToTree(this.getTimeout()));
            }
            if (this.getTlsEnabled() != null) {
                data.set("tlsEnabled", om.valueToTree(this.getTlsEnabled()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("Mongey_kafka.KafkaProviderConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KafkaProviderConfig.Jsii$Proxy that = (KafkaProviderConfig.Jsii$Proxy) o;

            if (!bootstrapServers.equals(that.bootstrapServers)) return false;
            if (this.alias != null ? !this.alias.equals(that.alias) : that.alias != null) return false;
            if (this.caCert != null ? !this.caCert.equals(that.caCert) : that.caCert != null) return false;
            if (this.caCertFile != null ? !this.caCertFile.equals(that.caCertFile) : that.caCertFile != null) return false;
            if (this.clientCert != null ? !this.clientCert.equals(that.clientCert) : that.clientCert != null) return false;
            if (this.clientCertFile != null ? !this.clientCertFile.equals(that.clientCertFile) : that.clientCertFile != null) return false;
            if (this.clientKey != null ? !this.clientKey.equals(that.clientKey) : that.clientKey != null) return false;
            if (this.clientKeyFile != null ? !this.clientKeyFile.equals(that.clientKeyFile) : that.clientKeyFile != null) return false;
            if (this.clientKeyPassphrase != null ? !this.clientKeyPassphrase.equals(that.clientKeyPassphrase) : that.clientKeyPassphrase != null) return false;
            if (this.saslMechanism != null ? !this.saslMechanism.equals(that.saslMechanism) : that.saslMechanism != null) return false;
            if (this.saslPassword != null ? !this.saslPassword.equals(that.saslPassword) : that.saslPassword != null) return false;
            if (this.saslUsername != null ? !this.saslUsername.equals(that.saslUsername) : that.saslUsername != null) return false;
            if (this.skipTlsVerify != null ? !this.skipTlsVerify.equals(that.skipTlsVerify) : that.skipTlsVerify != null) return false;
            if (this.timeout != null ? !this.timeout.equals(that.timeout) : that.timeout != null) return false;
            return this.tlsEnabled != null ? this.tlsEnabled.equals(that.tlsEnabled) : that.tlsEnabled == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bootstrapServers.hashCode();
            result = 31 * result + (this.alias != null ? this.alias.hashCode() : 0);
            result = 31 * result + (this.caCert != null ? this.caCert.hashCode() : 0);
            result = 31 * result + (this.caCertFile != null ? this.caCertFile.hashCode() : 0);
            result = 31 * result + (this.clientCert != null ? this.clientCert.hashCode() : 0);
            result = 31 * result + (this.clientCertFile != null ? this.clientCertFile.hashCode() : 0);
            result = 31 * result + (this.clientKey != null ? this.clientKey.hashCode() : 0);
            result = 31 * result + (this.clientKeyFile != null ? this.clientKeyFile.hashCode() : 0);
            result = 31 * result + (this.clientKeyPassphrase != null ? this.clientKeyPassphrase.hashCode() : 0);
            result = 31 * result + (this.saslMechanism != null ? this.saslMechanism.hashCode() : 0);
            result = 31 * result + (this.saslPassword != null ? this.saslPassword.hashCode() : 0);
            result = 31 * result + (this.saslUsername != null ? this.saslUsername.hashCode() : 0);
            result = 31 * result + (this.skipTlsVerify != null ? this.skipTlsVerify.hashCode() : 0);
            result = 31 * result + (this.timeout != null ? this.timeout.hashCode() : 0);
            result = 31 * result + (this.tlsEnabled != null ? this.tlsEnabled.hashCode() : 0);
            return result;
        }
    }
}
