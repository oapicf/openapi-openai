package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AuditLogActorServiceAccount;
import com.prokarma.pkmst.model.AuditLogActorUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The API Key used to perform the audit logged action.
 */
@ApiModel(description = "The API Key used to perform the audit logged action.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogActorApiKey   {
  @JsonProperty("id")
  private String id;

  /**
   * The type of API key. Can be either `user` or `service_account`.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("user")
  private AuditLogActorUser user;

  @JsonProperty("service_account")
  private AuditLogActorServiceAccount serviceAccount;

  public AuditLogActorApiKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The tracking id of the API key.
   * @return id
   */
  @ApiModelProperty(value = "The tracking id of the API key.")
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
  @ApiModelProperty(value = "The type of API key. Can be either `user` or `service_account`.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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

