package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogActorServiceAccount;
import org.openapitools.model.AuditLogActorUser;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The API Key used to perform the audit logged action.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The API Key used to perform the audit logged action.")
public class AuditLogActorApiKey   {
  
  private String id;


public enum TypeEnum {

    @JsonProperty("user") USER(String.valueOf("user")), @JsonProperty("service_account") SERVICE_ACCOUNT(String.valueOf("service_account"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private AuditLogActorUser user;

  private AuditLogActorServiceAccount serviceAccount;

  /**
   * The tracking id of the API key.
   **/
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
   * The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;.
   **/
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
   **/
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
   **/
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

