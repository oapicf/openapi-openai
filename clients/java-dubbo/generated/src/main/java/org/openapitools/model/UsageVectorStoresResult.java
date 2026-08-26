package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The aggregated vector stores usage details of the specific time bucket.
 */
public class UsageVectorStoresResult implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String _object;

  /**
   * The vector stores usage in bytes.
   */
  @JsonProperty("usage_bytes")
  private Integer usageBytes;

  /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
   */
  @JsonProperty("project_id")
  private String projectId;

  /**
   * 
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The vector stores usage in bytes.
   * @return usageBytes
   */
  public Integer getUsageBytes() {
    return usageBytes;
  }

  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
   * @return projectId
   */
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
    return Objects.equals(this._object, usageVectorStoresResult._object) &&
        Objects.equals(this.usageBytes, usageVectorStoresResult.usageBytes) &&
        Objects.equals(this.projectId, usageVectorStoresResult.projectId);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
