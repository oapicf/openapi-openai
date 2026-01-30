/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogActorServiceAccount;
import org.openapitools.model.AuditLogActorUser;



/**
 * The API Key used to perform the audit logged action.
 */

@ApiModel(description = "The API Key used to perform the audit logged action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogActorApiKey   {
  
  private String id;


  public enum TypeEnum {
    USER("user"),
    SERVICE_ACCOUNT("service_account");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private AuditLogActorUser user;
  private AuditLogActorServiceAccount serviceAccount;

  /**
   * The tracking id of the API key.
   */
  public AuditLogActorApiKey id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The tracking id of the API key.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of API key. Can be either `user` or `service_account`.
   */
  public AuditLogActorApiKey type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The type of API key. Can be either `user` or `service_account`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   */
  public AuditLogActorApiKey user(AuditLogActorUser user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user")
  public AuditLogActorUser getUser() {
    return user;
  }
  public void setUser(AuditLogActorUser user) {
    this.user = user;
  }

  /**
   */
  public AuditLogActorApiKey serviceAccount(AuditLogActorServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return Objects.equals(id, auditLogActorApiKey.id) &&
        Objects.equals(type, auditLogActorApiKey.type) &&
        Objects.equals(user, auditLogActorApiKey.user) &&
        Objects.equals(serviceAccount, auditLogActorApiKey.serviceAccount);
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

