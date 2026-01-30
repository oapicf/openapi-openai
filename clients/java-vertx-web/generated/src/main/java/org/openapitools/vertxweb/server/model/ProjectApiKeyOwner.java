package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ProjectServiceAccount;
import org.openapitools.vertxweb.server.model.ProjectUser;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectApiKeyOwner   {
  


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
  private ProjectUser user;
  private ProjectServiceAccount serviceAccount;

  public ProjectApiKeyOwner () {

  }

  public ProjectApiKeyOwner (TypeEnum type, ProjectUser user, ProjectServiceAccount serviceAccount) {
    this.type = type;
    this.user = user;
    this.serviceAccount = serviceAccount;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("user")
  public ProjectUser getUser() {
    return user;
  }
  public void setUser(ProjectUser user) {
    this.user = user;
  }

    
  @JsonProperty("service_account")
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
