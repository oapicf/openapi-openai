package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.VectorStoreExpirationAfter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateVectorStoreRequest   {
  
  private String name;
  private VectorStoreExpirationAfter expiresAfter;
  private Object metadata;

  public UpdateVectorStoreRequest () {

  }

  public UpdateVectorStoreRequest (String name, VectorStoreExpirationAfter expiresAfter, Object metadata) {
    this.name = name;
    this.expiresAfter = expiresAfter;
    this.metadata = metadata;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("expires_after")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }
  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

    
  @JsonProperty("metadata")
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
    return Objects.equals(name, updateVectorStoreRequest.name) &&
        Objects.equals(expiresAfter, updateVectorStoreRequest.expiresAfter) &&
        Objects.equals(metadata, updateVectorStoreRequest.metadata);
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
