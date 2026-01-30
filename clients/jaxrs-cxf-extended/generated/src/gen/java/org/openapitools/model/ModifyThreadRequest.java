package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ModifyThreadRequestToolResources;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ModifyThreadRequest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ModifyThreadRequestToolResources toolResources;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  private Object metadata;
 /**
  * Get toolResources
  * @return toolResources
  */
  @JsonProperty("tool_resources")
  public ModifyThreadRequestToolResources getToolResources() {
    return toolResources;
  }

  /**
   * Sets the <code>toolResources</code> property.
   */
 public void setToolResources(ModifyThreadRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

  /**
   * Sets the <code>toolResources</code> property.
   */
  public ModifyThreadRequest toolResources(ModifyThreadRequestToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  * @return metadata
  */
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
 public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
  public ModifyThreadRequest metadata(Object metadata) {
    this.metadata = metadata;
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
    ModifyThreadRequest modifyThreadRequest = (ModifyThreadRequest) o;
    return Objects.equals(this.toolResources, modifyThreadRequest.toolResources) &&
        Objects.equals(this.metadata, modifyThreadRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolResources, metadata);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

