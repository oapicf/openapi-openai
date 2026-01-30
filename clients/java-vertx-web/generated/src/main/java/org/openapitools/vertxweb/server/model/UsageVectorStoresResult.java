package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The aggregated vector stores usage details of the specific time bucket.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsageVectorStoresResult   {
  


  public enum ObjectEnum {
    ORGANIZATION_USAGE_VECTOR_STORES_RESULT("organization.usage.vector_stores.result");

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
  private Integer usageBytes;
  private String projectId;

  public UsageVectorStoresResult () {

  }

  public UsageVectorStoresResult (ObjectEnum _object, Integer usageBytes, String projectId) {
    this._object = _object;
    this.usageBytes = usageBytes;
    this.projectId = projectId;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("usage_bytes")
  public Integer getUsageBytes() {
    return usageBytes;
  }
  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

    
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
    UsageVectorStoresResult usageVectorStoresResult = (UsageVectorStoresResult) o;
    return Objects.equals(_object, usageVectorStoresResult._object) &&
        Objects.equals(usageBytes, usageVectorStoresResult.usageBytes) &&
        Objects.equals(projectId, usageVectorStoresResult.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, usageBytes, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageVectorStoresResult {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    usageBytes: ").append(toIndentedString(usageBytes)).append("\n");
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
