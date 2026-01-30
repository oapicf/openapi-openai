package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.VectorStoreExpirationAfter;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateVectorStoreRequest  {
  
 /**
  * The name of the vector store.
  */
  @ApiModelProperty(value = "The name of the vector store.")

  private String name;

  @ApiModelProperty(value = "")

  private VectorStoreExpirationAfter expiresAfter;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")

  private Object metadata;
 /**
   * The name of the vector store.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateVectorStoreRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get expiresAfter
   * @return expiresAfter
  **/
  @JsonProperty("expires_after")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }

  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  public UpdateVectorStoreRequest expiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
    return this;
  }

 /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public UpdateVectorStoreRequest metadata(Object metadata) {
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
    UpdateVectorStoreRequest updateVectorStoreRequest = (UpdateVectorStoreRequest) o;
    return Objects.equals(this.name, updateVectorStoreRequest.name) &&
        Objects.equals(this.expiresAfter, updateVectorStoreRequest.expiresAfter) &&
        Objects.equals(this.metadata, updateVectorStoreRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expiresAfter, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVectorStoreRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expiresAfter: ").append(toIndentedString(expiresAfter)).append("\n");
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

