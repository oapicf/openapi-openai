package apimodels;

import apimodels.ModifyThreadRequestToolResources;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyThreadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ModifyThreadRequest   {
  @JsonProperty("tool_resources")
  @Valid

  private ModifyThreadRequestToolResources toolResources;

  @JsonProperty("metadata")
  
  private Object metadata;

  public ModifyThreadRequest toolResources(ModifyThreadRequestToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

   /**
   * Get toolResources
   * @return toolResources
  **/
  public ModifyThreadRequestToolResources getToolResources() {
    return toolResources;
  }

  public void setToolResources(ModifyThreadRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

  public ModifyThreadRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyThreadRequest modifyThreadRequest = (ModifyThreadRequest) o;
    return Objects.equals(toolResources, modifyThreadRequest.toolResources) &&
        Objects.equals(metadata, modifyThreadRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolResources, metadata);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyThreadRequest {\n");
    
    sb.append("    toolResources: ").append(toIndentedString(toolResources)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

