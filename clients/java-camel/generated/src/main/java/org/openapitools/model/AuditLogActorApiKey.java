package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AuditLogActorServiceAccount;
import org.openapitools.model.AuditLogActorUser;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The API Key used to perform the audit logged action.
 */

@Schema(name = "AuditLogActorApiKey", description = "The API Key used to perform the audit logged action.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogActorApiKey {

  private String id;

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

  private TypeEnum type;

  private AuditLogActorUser user;

  private AuditLogActorServiceAccount serviceAccount;

  public AuditLogActorApiKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The tracking id of the API key.
   * @return id
   */
  
  @Schema(name = "id", description = "The tracking id of the API key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogActorApiKey type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of API key. Can be either `user` or `service_account`.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of API key. Can be either `user` or `service_account`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AuditLogActorApiKey user(AuditLogActorUser user) {
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
  public AuditLogActorUser getUser() {
    return user;
  }

  public void setUser(AuditLogActorUser user) {
    this.user = user;
  }

  public AuditLogActorApiKey serviceAccount(AuditLogActorServiceAccount serviceAccount) {
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
  public AuditLogActorServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(AuditLogActorServiceAccount serviceAccount) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

