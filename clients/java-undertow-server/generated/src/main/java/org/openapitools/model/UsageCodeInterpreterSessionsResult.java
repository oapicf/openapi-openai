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
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 */

@ApiModel(description = "The aggregated code interpreter sessions usage details of the specific time bucket.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageCodeInterpreterSessionsResult   {
  


  public enum ObjectEnum {
    ORGANIZATION_USAGE_CODE_INTERPRETER_SESSIONS_RESULT("organization.usage.code_interpreter_sessions.result");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private Integer sessions;
  private String projectId;

  /**
   */
  public UsageCodeInterpreterSessionsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The number of code interpreter sessions.
   */
  public UsageCodeInterpreterSessionsResult sessions(Integer sessions) {
    this.sessions = sessions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of code interpreter sessions.")
  @JsonProperty("sessions")
  public Integer getSessions() {
    return sessions;
  }
  public void setSessions(Integer sessions) {
    this.sessions = sessions;
  }

  /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   */
  public UsageCodeInterpreterSessionsResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCodeInterpreterSessionsResult usageCodeInterpreterSessionsResult = (UsageCodeInterpreterSessionsResult) o;
    return Objects.equals(_object, usageCodeInterpreterSessionsResult._object) &&
        Objects.equals(sessions, usageCodeInterpreterSessionsResult.sessions) &&
        Objects.equals(projectId, usageCodeInterpreterSessionsResult.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, sessions, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCodeInterpreterSessionsResult {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

