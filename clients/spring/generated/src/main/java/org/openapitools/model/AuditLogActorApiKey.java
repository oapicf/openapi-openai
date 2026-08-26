package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AuditLogActorServiceAccount;
import org.openapitools.model.AuditLogActorUser;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The API Key used to perform the audit logged action.
 */

@Schema(name = "AuditLogActorApiKey", description = "The API Key used to perform the audit logged action.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AuditLogActorApiKey {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  /**
   * The type of API key. Can be either `user` or `service_account`.
   */
  public enum TypeEnum {
    USER("user"),
    
    SERVICE_ACCOUNT("service_account");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TypeEnum type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AuditLogActorUser user;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AuditLogActorServiceAccount serviceAccount;

  public AuditLogActorApiKey id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The tracking id of the API key.
   * @return id
   */
  
  @Schema(name = "id", description = "The tracking id of the API key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public AuditLogActorApiKey type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of API key. Can be either `user` or `service_account`.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of API key. Can be either `user` or `service_account`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public AuditLogActorApiKey user(@Nullable AuditLogActorUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public @Nullable AuditLogActorUser getUser() {
    return user;
  }

  @JsonProperty("user")
  public void setUser(@Nullable AuditLogActorUser user) {
    this.user = user;
  }

  public AuditLogActorApiKey serviceAccount(@Nullable AuditLogActorServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Get serviceAccount
   * @return serviceAccount
   */
  @Valid 
  @Schema(name = "service_account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_account")
  public @Nullable AuditLogActorServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  @JsonProperty("service_account")
  public void setServiceAccount(@Nullable AuditLogActorServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogActorApiKey auditLogActorApiKey = (AuditLogActorApiKey) o;
    return Objects.equals(this.id, auditLogActorApiKey.id) &&
        Objects.equals(this.type, auditLogActorApiKey.type) &&
        Objects.equals(this.user, auditLogActorApiKey.user) &&
        Objects.equals(this.serviceAccount, auditLogActorApiKey.serviceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, user, serviceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogActorApiKey {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

