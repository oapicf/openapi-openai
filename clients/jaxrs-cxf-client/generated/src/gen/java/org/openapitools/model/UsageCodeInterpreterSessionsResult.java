package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 */
@ApiModel(description="The aggregated code interpreter sessions usage details of the specific time bucket.")

public class UsageCodeInterpreterSessionsResult  {
  
public enum ObjectEnum {

ORGANIZATION_USAGE_CODE_INTERPRETER_SESSIONS_RESULT(String.valueOf("organization.usage.code_interpreter_sessions.result"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private ObjectEnum _object;

 /**
  * The number of code interpreter sessions.
  */
  @ApiModelProperty(required = true, value = "The number of code interpreter sessions.")

  private Integer sessions;

 /**
  * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  */
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")

  private String projectId;
 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public UsageCodeInterpreterSessionsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The number of code interpreter sessions.
   * @return sessions
  **/
  @JsonProperty("sessions")
  public Integer getSessions() {
    return sessions;
  }

  public void setSessions(Integer sessions) {
    this.sessions = sessions;
  }

  public UsageCodeInterpreterSessionsResult sessions(Integer sessions) {
    this.sessions = sessions;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
   * @return projectId
  **/
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public UsageCodeInterpreterSessionsResult projectId(String projectId) {
    this.projectId = projectId;
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
    UsageCodeInterpreterSessionsResult usageCodeInterpreterSessionsResult = (UsageCodeInterpreterSessionsResult) o;
    return Objects.equals(this._object, usageCodeInterpreterSessionsResult._object) &&
        Objects.equals(this.sessions, usageCodeInterpreterSessionsResult.sessions) &&
        Objects.equals(this.projectId, usageCodeInterpreterSessionsResult.projectId);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

