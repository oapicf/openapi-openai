package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.VectorStoreExpirationAfter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * UpdateVectorStoreRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UpdateVectorStoreRequest   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("expires_after")
  private VectorStoreExpirationAfter expiresAfter;

  @JsonProperty("metadata")
  private Object metadata;

  public UpdateVectorStoreRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the vector store.
   * @return name
   */
  @ApiModelProperty(value = "The name of the vector store.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateVectorStoreRequest expiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
    return this;
  }

  /**
   * Get expiresAfter
   * @return expiresAfter
   */
  @ApiModelProperty(value = "")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }

  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  public UpdateVectorStoreRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

