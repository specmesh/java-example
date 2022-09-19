package imports.kafka;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/kafka kafka}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-09-19T18:32:11.221Z")
@software.amazon.jsii.Jsii(module = imports.kafka.$Module.class, fqn = "Mongey_kafka.KafkaProvider")
public class KafkaProvider extends com.hashicorp.cdktf.TerraformProvider {

    protected KafkaProvider(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KafkaProvider(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.kafka.KafkaProvider.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/kafka kafka} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public KafkaProvider(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.kafka.KafkaProviderConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAlias() {
        software.amazon.jsii.Kernel.call(this, "resetAlias", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCaCert() {
        software.amazon.jsii.Kernel.call(this, "resetCaCert", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCaCertFile() {
        software.amazon.jsii.Kernel.call(this, "resetCaCertFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientCert() {
        software.amazon.jsii.Kernel.call(this, "resetClientCert", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientCertFile() {
        software.amazon.jsii.Kernel.call(this, "resetClientCertFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientKey() {
        software.amazon.jsii.Kernel.call(this, "resetClientKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientKeyFile() {
        software.amazon.jsii.Kernel.call(this, "resetClientKeyFile", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientKeyPassphrase() {
        software.amazon.jsii.Kernel.call(this, "resetClientKeyPassphrase", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSaslMechanism() {
        software.amazon.jsii.Kernel.call(this, "resetSaslMechanism", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSaslPassword() {
        software.amazon.jsii.Kernel.call(this, "resetSaslPassword", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSaslUsername() {
        software.amazon.jsii.Kernel.call(this, "resetSaslUsername", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkipTlsVerify() {
        software.amazon.jsii.Kernel.call(this, "resetSkipTlsVerify", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeout() {
        software.amazon.jsii.Kernel.call(this, "resetTimeout", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTlsEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetTlsEnabled", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getAliasInput() {
        return software.amazon.jsii.Kernel.get(this, "aliasInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBootstrapServersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "bootstrapServersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCaCertFileInput() {
        return software.amazon.jsii.Kernel.get(this, "caCertFileInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCaCertInput() {
        return software.amazon.jsii.Kernel.get(this, "caCertInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientCertFileInput() {
        return software.amazon.jsii.Kernel.get(this, "clientCertFileInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientCertInput() {
        return software.amazon.jsii.Kernel.get(this, "clientCertInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientKeyFileInput() {
        return software.amazon.jsii.Kernel.get(this, "clientKeyFileInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "clientKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientKeyPassphraseInput() {
        return software.amazon.jsii.Kernel.get(this, "clientKeyPassphraseInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSaslMechanismInput() {
        return software.amazon.jsii.Kernel.get(this, "saslMechanismInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSaslPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "saslPasswordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSaslUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "saslUsernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipTlsVerifyInput() {
        return software.amazon.jsii.Kernel.get(this, "skipTlsVerifyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTlsEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "tlsEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    @Override
    public @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    @Override
    public void setAlias(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "alias", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBootstrapServers() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "bootstrapServers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setBootstrapServers(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "bootstrapServers", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCaCert() {
        return software.amazon.jsii.Kernel.get(this, "caCert", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCaCert(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "caCert", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCaCertFile() {
        return software.amazon.jsii.Kernel.get(this, "caCertFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCaCertFile(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "caCertFile", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientCert() {
        return software.amazon.jsii.Kernel.get(this, "clientCert", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientCert(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientCert", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientCertFile() {
        return software.amazon.jsii.Kernel.get(this, "clientCertFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientCertFile(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientCertFile", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientKey() {
        return software.amazon.jsii.Kernel.get(this, "clientKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientKey(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientKey", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientKeyFile() {
        return software.amazon.jsii.Kernel.get(this, "clientKeyFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientKeyFile(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientKeyFile", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientKeyPassphrase() {
        return software.amazon.jsii.Kernel.get(this, "clientKeyPassphrase", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientKeyPassphrase(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientKeyPassphrase", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSaslMechanism() {
        return software.amazon.jsii.Kernel.get(this, "saslMechanism", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSaslMechanism(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "saslMechanism", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSaslPassword() {
        return software.amazon.jsii.Kernel.get(this, "saslPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSaslPassword(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "saslPassword", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSaslUsername() {
        return software.amazon.jsii.Kernel.get(this, "saslUsername", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSaslUsername(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "saslUsername", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSkipTlsVerify() {
        return software.amazon.jsii.Kernel.get(this, "skipTlsVerify", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSkipTlsVerify(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "skipTlsVerify", value);
    }

    public void setSkipTlsVerify(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "skipTlsVerify", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeout() {
        return software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTimeout(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "timeout", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTlsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "tlsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setTlsEnabled(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "tlsEnabled", value);
    }

    public void setTlsEnabled(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "tlsEnabled", value);
    }

    /**
     * A fluent builder for {@link imports.kafka.KafkaProvider}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.kafka.KafkaProvider> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.kafka.KafkaProviderConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.kafka.KafkaProviderConfig.Builder();
        }

        /**
         * A list of kafka brokers.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#bootstrap_servers KafkaProvider#bootstrap_servers}
         * <p>
         * @return {@code this}
         * @param bootstrapServers A list of kafka brokers. This parameter is required.
         */
        public Builder bootstrapServers(final java.util.List<java.lang.String> bootstrapServers) {
            this.config.bootstrapServers(bootstrapServers);
            return this;
        }

        /**
         * Alias name.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#alias KafkaProvider#alias}
         * <p>
         * @return {@code this}
         * @param alias Alias name. This parameter is required.
         */
        public Builder alias(final java.lang.String alias) {
            this.config.alias(alias);
            return this;
        }

        /**
         * CA certificate file to validate the server's certificate.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#ca_cert KafkaProvider#ca_cert}
         * <p>
         * @return {@code this}
         * @param caCert CA certificate file to validate the server's certificate. This parameter is required.
         */
        public Builder caCert(final java.lang.String caCert) {
            this.config.caCert(caCert);
            return this;
        }

        /**
         * Path to a CA certificate file to validate the server's certificate.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#ca_cert_file KafkaProvider#ca_cert_file}
         * <p>
         * @return {@code this}
         * @param caCertFile Path to a CA certificate file to validate the server's certificate. This parameter is required.
         */
        public Builder caCertFile(final java.lang.String caCertFile) {
            this.config.caCertFile(caCertFile);
            return this;
        }

        /**
         * The client certificate.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_cert KafkaProvider#client_cert}
         * <p>
         * @return {@code this}
         * @param clientCert The client certificate. This parameter is required.
         */
        public Builder clientCert(final java.lang.String clientCert) {
            this.config.clientCert(clientCert);
            return this;
        }

        /**
         * Path to a file containing the client certificate.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_cert_file KafkaProvider#client_cert_file}
         * <p>
         * @return {@code this}
         * @param clientCertFile Path to a file containing the client certificate. This parameter is required.
         */
        public Builder clientCertFile(final java.lang.String clientCertFile) {
            this.config.clientCertFile(clientCertFile);
            return this;
        }

        /**
         * The private key that the certificate was issued for.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_key KafkaProvider#client_key}
         * <p>
         * @return {@code this}
         * @param clientKey The private key that the certificate was issued for. This parameter is required.
         */
        public Builder clientKey(final java.lang.String clientKey) {
            this.config.clientKey(clientKey);
            return this;
        }

        /**
         * Path to a file containing the private key that the certificate was issued for.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_key_file KafkaProvider#client_key_file}
         * <p>
         * @return {@code this}
         * @param clientKeyFile Path to a file containing the private key that the certificate was issued for. This parameter is required.
         */
        public Builder clientKeyFile(final java.lang.String clientKeyFile) {
            this.config.clientKeyFile(clientKeyFile);
            return this;
        }

        /**
         * The passphrase for the private key that the certificate was issued for.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#client_key_passphrase KafkaProvider#client_key_passphrase}
         * <p>
         * @return {@code this}
         * @param clientKeyPassphrase The passphrase for the private key that the certificate was issued for. This parameter is required.
         */
        public Builder clientKeyPassphrase(final java.lang.String clientKeyPassphrase) {
            this.config.clientKeyPassphrase(clientKeyPassphrase);
            return this;
        }

        /**
         * SASL mechanism, can be plain, scram-sha512, scram-sha256.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#sasl_mechanism KafkaProvider#sasl_mechanism}
         * <p>
         * @return {@code this}
         * @param saslMechanism SASL mechanism, can be plain, scram-sha512, scram-sha256. This parameter is required.
         */
        public Builder saslMechanism(final java.lang.String saslMechanism) {
            this.config.saslMechanism(saslMechanism);
            return this;
        }

        /**
         * Password for SASL authentication.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#sasl_password KafkaProvider#sasl_password}
         * <p>
         * @return {@code this}
         * @param saslPassword Password for SASL authentication. This parameter is required.
         */
        public Builder saslPassword(final java.lang.String saslPassword) {
            this.config.saslPassword(saslPassword);
            return this;
        }

        /**
         * Username for SASL authentication.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#sasl_username KafkaProvider#sasl_username}
         * <p>
         * @return {@code this}
         * @param saslUsername Username for SASL authentication. This parameter is required.
         */
        public Builder saslUsername(final java.lang.String saslUsername) {
            this.config.saslUsername(saslUsername);
            return this;
        }

        /**
         * Set this to true only if the target Kafka server is an insecure development instance.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#skip_tls_verify KafkaProvider#skip_tls_verify}
         * <p>
         * @return {@code this}
         * @param skipTlsVerify Set this to true only if the target Kafka server is an insecure development instance. This parameter is required.
         */
        public Builder skipTlsVerify(final java.lang.Boolean skipTlsVerify) {
            this.config.skipTlsVerify(skipTlsVerify);
            return this;
        }
        /**
         * Set this to true only if the target Kafka server is an insecure development instance.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#skip_tls_verify KafkaProvider#skip_tls_verify}
         * <p>
         * @return {@code this}
         * @param skipTlsVerify Set this to true only if the target Kafka server is an insecure development instance. This parameter is required.
         */
        public Builder skipTlsVerify(final com.hashicorp.cdktf.IResolvable skipTlsVerify) {
            this.config.skipTlsVerify(skipTlsVerify);
            return this;
        }

        /**
         * Timeout in seconds.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#timeout KafkaProvider#timeout}
         * <p>
         * @return {@code this}
         * @param timeout Timeout in seconds. This parameter is required.
         */
        public Builder timeout(final java.lang.Number timeout) {
            this.config.timeout(timeout);
            return this;
        }

        /**
         * Enable communication with the Kafka Cluster over TLS.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#tls_enabled KafkaProvider#tls_enabled}
         * <p>
         * @return {@code this}
         * @param tlsEnabled Enable communication with the Kafka Cluster over TLS. This parameter is required.
         */
        public Builder tlsEnabled(final java.lang.Boolean tlsEnabled) {
            this.config.tlsEnabled(tlsEnabled);
            return this;
        }
        /**
         * Enable communication with the Kafka Cluster over TLS.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka#tls_enabled KafkaProvider#tls_enabled}
         * <p>
         * @return {@code this}
         * @param tlsEnabled Enable communication with the Kafka Cluster over TLS. This parameter is required.
         */
        public Builder tlsEnabled(final com.hashicorp.cdktf.IResolvable tlsEnabled) {
            this.config.tlsEnabled(tlsEnabled);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.kafka.KafkaProvider}.
         */
        @Override
        public imports.kafka.KafkaProvider build() {
            return new imports.kafka.KafkaProvider(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
