package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 */
@ApiModel(description = "The aggregated code interpreter sessions usage details of the specific time bucket.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageCodeInterpreterSessionsResult   {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USAGE_CODE_INTERPRETER_SESSIONS_RESULT("organization.usage.code_interpreter_sessions.result");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("sessions")
  private Integer sessions;

  @JsonProperty("project_id")
  private String projectId;

  public UsageCodeInterpreterSessionsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @ApiModelProperty(required = true, value = "")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public UsageCodeInterpreterSessionsResult sessions(Integer sessions) {
    this.sessions = sessions;
    return this;
  }

  /**
   * The number of code interpreter sessions.
   * @return sessions
   */
  @ApiModelProperty(required = true, value = "The number of code interpreter sessions.")
  public Integer getSessions() {
    return sessions;
  }

  public void setSessions(Integer sessions) {
    this.sessions = sessions;
  }

  public UsageCodeInterpreterSessionsResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   * @return projectId
   */
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

