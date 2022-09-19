package imports.kafka;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/kafka/r/acl kafka_acl}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-09-19T18:32:11.206Z")
@software.amazon.jsii.Jsii(module = imports.kafka.$Module.class, fqn = "Mongey_kafka.Acl")
public class Acl extends com.hashicorp.cdktf.TerraformResource {

    protected Acl(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Acl(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.kafka.Acl.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/kafka/r/acl kafka_acl} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Acl(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.kafka.AclConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourcePatternTypeFilter() {
        software.amazon.jsii.Kernel.call(this, "resetResourcePatternTypeFilter", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getAclHostInput() {
        return software.amazon.jsii.Kernel.get(this, "aclHostInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAclOperationInput() {
        return software.amazon.jsii.Kernel.get(this, "aclOperationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAclPermissionTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "aclPermissionTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAclPrincipalInput() {
        return software.amazon.jsii.Kernel.get(this, "aclPrincipalInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourcePatternTypeFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "resourcePatternTypeFilterInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAclHost() {
        return software.amazon.jsii.Kernel.get(this, "aclHost", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAclHost(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "aclHost", java.util.Objects.requireNonNull(value, "aclHost is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAclOperation() {
        return software.amazon.jsii.Kernel.get(this, "aclOperation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAclOperation(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "aclOperation", java.util.Objects.requireNonNull(value, "aclOperation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAclPermissionType() {
        return software.amazon.jsii.Kernel.get(this, "aclPermissionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAclPermissionType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "aclPermissionType", java.util.Objects.requireNonNull(value, "aclPermissionType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAclPrincipal() {
        return software.amazon.jsii.Kernel.get(this, "aclPrincipal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAclPrincipal(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "aclPrincipal", java.util.Objects.requireNonNull(value, "aclPrincipal is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceName() {
        return software.amazon.jsii.Kernel.get(this, "resourceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceName", java.util.Objects.requireNonNull(value, "resourceName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourcePatternTypeFilter() {
        return software.amazon.jsii.Kernel.get(this, "resourcePatternTypeFilter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourcePatternTypeFilter(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourcePatternTypeFilter", java.util.Objects.requireNonNull(value, "resourcePatternTypeFilter is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceType() {
        return software.amazon.jsii.Kernel.get(this, "resourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceType", java.util.Objects.requireNonNull(value, "resourceType is required"));
    }

    /**
     * A fluent builder for {@link imports.kafka.Acl}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.kafka.Acl> {
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
        private final imports.kafka.AclConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.kafka.AclConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_host Acl#acl_host}.
         * <p>
         * @return {@code this}
         * @param aclHost Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_host Acl#acl_host}. This parameter is required.
         */
        public Builder aclHost(final java.lang.String aclHost) {
            this.config.aclHost(aclHost);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_operation Acl#acl_operation}.
         * <p>
         * @return {@code this}
         * @param aclOperation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_operation Acl#acl_operation}. This parameter is required.
         */
        public Builder aclOperation(final java.lang.String aclOperation) {
            this.config.aclOperation(aclOperation);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_permission_type Acl#acl_permission_type}.
         * <p>
         * @return {@code this}
         * @param aclPermissionType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_permission_type Acl#acl_permission_type}. This parameter is required.
         */
        public Builder aclPermissionType(final java.lang.String aclPermissionType) {
            this.config.aclPermissionType(aclPermissionType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_principal Acl#acl_principal}.
         * <p>
         * @return {@code this}
         * @param aclPrincipal Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_principal Acl#acl_principal}. This parameter is required.
         */
        public Builder aclPrincipal(final java.lang.String aclPrincipal) {
            this.config.aclPrincipal(aclPrincipal);
            return this;
        }

        /**
         * The name of the resource.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka/r/acl#resource_name Acl#resource_name}
         * <p>
         * @return {@code this}
         * @param resourceName The name of the resource. This parameter is required.
         */
        public Builder resourceName(final java.lang.String resourceName) {
            this.config.resourceName(resourceName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#resource_type Acl#resource_type}.
         * <p>
         * @return {@code this}
         * @param resourceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#resource_type Acl#resource_type}. This parameter is required.
         */
        public Builder resourceType(final java.lang.String resourceType) {
            this.config.resourceType(resourceType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#id Acl#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#id Acl#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#resource_pattern_type_filter Acl#resource_pattern_type_filter}.
         * <p>
         * @return {@code this}
         * @param resourcePatternTypeFilter Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#resource_pattern_type_filter Acl#resource_pattern_type_filter}. This parameter is required.
         */
        public Builder resourcePatternTypeFilter(final java.lang.String resourcePatternTypeFilter) {
            this.config.resourcePatternTypeFilter(resourcePatternTypeFilter);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.kafka.Acl}.
         */
        @Override
        public imports.kafka.Acl build() {
            return new imports.kafka.Acl(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
