package apimodels;

import apimodels.ProjectServiceAccount;
import apimodels.ProjectUser;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProjectApiKeyOwner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProjectApiKeyOwner   {
  /**
   * `user` or `service_account`
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

  private ProjectUser user;

  @JsonProperty("service_account")
  @Valid

  private ProjectServiceAccount serviceAccount;

  public ProjectApiKeyOwner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * `user` or `service_account`
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ProjectApiKeyOwner user(ProjectUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  public ProjectUser getUser() {
    return user;
  }

  public void setUser(ProjectUser user) {
    this.user = user;
  }

  public ProjectApiKeyOwner serviceAccount(ProjectServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * Get serviceAccount
   * @return serviceAccount
  **/
  public ProjectServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(ProjectServiceAccount serviceAccount) {
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
    ProjectApiKeyOwner projectApiKeyOwner = (ProjectApiKeyOwner) o;
    return Objects.equals(type, projectApiKeyOwner.type) &&
        Objects.equals(user, projectApiKeyOwner.user) &&
        Objects.equals(serviceAccount, projectApiKeyOwner.serviceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, user, serviceAccount);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectApiKeyOwner {\n");
    
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

