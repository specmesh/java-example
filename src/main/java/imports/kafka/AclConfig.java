package imports.kafka;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-09-19T18:32:11.216Z")
@software.amazon.jsii.Jsii(module = imports.kafka.$Module.class, fqn = "Mongey_kafka.AclConfig")
@software.amazon.jsii.Jsii.Proxy(AclConfig.Jsii$Proxy.class)
public interface AclConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_host Acl#acl_host}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAclHost();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_operation Acl#acl_operation}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAclOperation();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_permission_type Acl#acl_permission_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAclPermissionType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_principal Acl#acl_principal}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAclPrincipal();

    /**
     * The name of the resource.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka/r/acl#resource_name Acl#resource_name}
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResourceName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#resource_type Acl#resource_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResourceType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#id Acl#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#resource_pattern_type_filter Acl#resource_pattern_type_filter}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourcePatternTypeFilter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AclConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AclConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AclConfig> {
        java.lang.String aclHost;
        java.lang.String aclOperation;
        java.lang.String aclPermissionType;
        java.lang.String aclPrincipal;
        java.lang.String resourceName;
        java.lang.String resourceType;
        java.lang.String id;
        java.lang.String resourcePatternTypeFilter;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link AclConfig#getAclHost}
         * @param aclHost Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_host Acl#acl_host}. This parameter is required.
         * @return {@code this}
         */
        public Builder aclHost(java.lang.String aclHost) {
            this.aclHost = aclHost;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getAclOperation}
         * @param aclOperation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_operation Acl#acl_operation}. This parameter is required.
         * @return {@code this}
         */
        public Builder aclOperation(java.lang.String aclOperation) {
            this.aclOperation = aclOperation;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getAclPermissionType}
         * @param aclPermissionType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_permission_type Acl#acl_permission_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder aclPermissionType(java.lang.String aclPermissionType) {
            this.aclPermissionType = aclPermissionType;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getAclPrincipal}
         * @param aclPrincipal Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#acl_principal Acl#acl_principal}. This parameter is required.
         * @return {@code this}
         */
        public Builder aclPrincipal(java.lang.String aclPrincipal) {
            this.aclPrincipal = aclPrincipal;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getResourceName}
         * @param resourceName The name of the resource. This parameter is required.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/kafka/r/acl#resource_name Acl#resource_name}
         * @return {@code this}
         */
        public Builder resourceName(java.lang.String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getResourceType}
         * @param resourceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#resource_type Acl#resource_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder resourceType(java.lang.String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#id Acl#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getResourcePatternTypeFilter}
         * @param resourcePatternTypeFilter Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/kafka/r/acl#resource_pattern_type_filter Acl#resource_pattern_type_filter}.
         * @return {@code this}
         */
        public Builder resourcePatternTypeFilter(java.lang.String resourcePatternTypeFilter) {
            this.resourcePatternTypeFilter = resourcePatternTypeFilter;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link AclConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AclConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AclConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AclConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AclConfig {
        private final java.lang.String aclHost;
        private final java.lang.String aclOperation;
        private final java.lang.String aclPermissionType;
        private final java.lang.String aclPrincipal;
        private final java.lang.String resourceName;
        private final java.lang.String resourceType;
        private final java.lang.String id;
        private final java.lang.String resourcePatternTypeFilter;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.aclHost = software.amazon.jsii.Kernel.get(this, "aclHost", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.aclOperation = software.amazon.jsii.Kernel.get(this, "aclOperation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.aclPermissionType = software.amazon.jsii.Kernel.get(this, "aclPermissionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.aclPrincipal = software.amazon.jsii.Kernel.get(this, "aclPrincipal", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceName = software.amazon.jsii.Kernel.get(this, "resourceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourceType = software.amazon.jsii.Kernel.get(this, "resourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resourcePatternTypeFilter = software.amazon.jsii.Kernel.get(this, "resourcePatternTypeFilter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.aclHost = java.util.Objects.requireNonNull(builder.aclHost, "aclHost is required");
            this.aclOperation = java.util.Objects.requireNonNull(builder.aclOperation, "aclOperation is required");
            this.aclPermissionType = java.util.Objects.requireNonNull(builder.aclPermissionType, "aclPermissionType is required");
            this.aclPrincipal = java.util.Objects.requireNonNull(builder.aclPrincipal, "aclPrincipal is required");
            this.resourceName = java.util.Objects.requireNonNull(builder.resourceName, "resourceName is required");
            this.resourceType = java.util.Objects.requireNonNull(builder.resourceType, "resourceType is required");
            this.id = builder.id;
            this.resourcePatternTypeFilter = builder.resourcePatternTypeFilter;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getAclHost() {
            return this.aclHost;
        }

        @Override
        public final java.lang.String getAclOperation() {
            return this.aclOperation;
        }

        @Override
        public final java.lang.String getAclPermissionType() {
            return this.aclPermissionType;
        }

        @Override
        public final java.lang.String getAclPrincipal() {
            return this.aclPrincipal;
        }

        @Override
        public final java.lang.String getResourceName() {
            return this.resourceName;
        }

        @Override
        public final java.lang.String getResourceType() {
            return this.resourceType;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getResourcePatternTypeFilter() {
            return this.resourcePatternTypeFilter;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("aclHost", om.valueToTree(this.getAclHost()));
            data.set("aclOperation", om.valueToTree(this.getAclOperation()));
            data.set("aclPermissionType", om.valueToTree(this.getAclPermissionType()));
            data.set("aclPrincipal", om.valueToTree(this.getAclPrincipal()));
            data.set("resourceName", om.valueToTree(this.getResourceName()));
            data.set("resourceType", om.valueToTree(this.getResourceType()));
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getResourcePatternTypeFilter() != null) {
                data.set("resourcePatternTypeFilter", om.valueToTree(this.getResourcePatternTypeFilter()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("Mongey_kafka.AclConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AclConfig.Jsii$Proxy that = (AclConfig.Jsii$Proxy) o;

            if (!aclHost.equals(that.aclHost)) return false;
            if (!aclOperation.equals(that.aclOperation)) return false;
            if (!aclPermissionType.equals(that.aclPermissionType)) return false;
            if (!aclPrincipal.equals(that.aclPrincipal)) return false;
            if (!resourceName.equals(that.resourceName)) return false;
            if (!resourceType.equals(that.resourceType)) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.resourcePatternTypeFilter != null ? !this.resourcePatternTypeFilter.equals(that.resourcePatternTypeFilter) : that.resourcePatternTypeFilter != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.aclHost.hashCode();
            result = 31 * result + (this.aclOperation.hashCode());
            result = 31 * result + (this.aclPermissionType.hashCode());
            result = 31 * result + (this.aclPrincipal.hashCode());
            result = 31 * result + (this.resourceName.hashCode());
            result = 31 * result + (this.resourceType.hashCode());
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.resourcePatternTypeFilter != null ? this.resourcePatternTypeFilter.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
