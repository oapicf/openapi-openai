package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AuditLogActorServiceAccount;
import org.openapitools.model.AuditLogActorUser;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The API Key used to perform the audit logged action.
 */
@ApiModel(description="The API Key used to perform the audit logged action.")

public class AuditLogActorApiKey  {
  
 /**
  * The tracking id of the API key.
  */
  @ApiModelProperty(value = "The tracking id of the API key.")
  private String id;

public enum TypeEnum {

    @JsonProperty("user") USER(String.valueOf("user")),
    @JsonProperty("service_account") SERVICE_ACCOUNT(String.valueOf("service_account"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The type of API key. Can be either `user` or `service_account`.
  */
  @ApiModelProperty(value = "The type of API key. Can be either `user` or `service_account`.")
  private TypeEnum type;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogActorUser user;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogActorServiceAccount serviceAccount;
 /**
  * The tracking id of the API key.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AuditLogActorApiKey id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;.
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public AuditLogActorApiKey type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get user
  * @return user
  */
  @JsonProperty("user")
  public AuditLogActorUser getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(AuditLogActorUser user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public AuditLogActorApiKey user(AuditLogActorUser user) {
    this.user = user;
    return this;
  }

 /**
  * Get serviceAccount
  * @return serviceAccount
  */
  @JsonProperty("service_account")
  public AuditLogActorServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Sets the <code>serviceAccount</code> property.
   */
 public void setServiceAccount(AuditLogActorServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  /**
   * Sets the <code>serviceAccount</code> property.
   */
  public AuditLogActorApiKey serviceAccount(AuditLogActorServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

