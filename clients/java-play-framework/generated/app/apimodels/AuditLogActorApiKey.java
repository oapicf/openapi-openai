package apimodels;

import apimodels.AuditLogActorServiceAccount;
import apimodels.AuditLogActorUser;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The API Key used to perform the audit logged action.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AuditLogActorApiKey   {
  @JsonProperty("id")
  
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

    @Override
    @JsonValue
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

  @JsonProperty("type")
  
  private TypeEnum type;

  @JsonProperty("user")
  @Valid

  private AuditLogActorUser user;

  @JsonProperty("service_account")
  @Valid

  private AuditLogActorServiceAccount serviceAccount;

  public AuditLogActorApiKey id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The tracking id of the API key.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

