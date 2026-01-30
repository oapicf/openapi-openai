package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogActorApiKey;
import org.openapitools.model.AuditLogActorSession;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The actor who performed the audit logged action.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogActor   {
  

  /**
   * The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;.
   */
  public enum TypeEnum {
    SESSION("session"),

        API_KEY("api_key");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private AuditLogActorSession session;
  private AuditLogActorApiKey apiKey;

  /**
   * The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;.
   **/
  
  @ApiModelProperty(value = "The type of actor. Is either `session` or `api_key`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("session")
  @Valid
  public AuditLogActorSession getSession() {
    return session;
  }
  public void setSession(AuditLogActorSession session) {
    this.session = session;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("api_key")
  @Valid
  public AuditLogActorApiKey getApiKey() {
    return apiKey;
  }
  public void setApiKey(AuditLogActorApiKey apiKey) {
    this.apiKey = apiKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogActor auditLogActor = (AuditLogActor) o;
    return Objects.equals(this.type, auditLogActor.type) &&
        Objects.equals(this.session, auditLogActor.session) &&
        Objects.equals(this.apiKey, auditLogActor.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, session, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogActor {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

