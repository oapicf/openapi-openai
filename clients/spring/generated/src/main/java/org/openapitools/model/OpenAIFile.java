package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OpenAIFile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OpenAIFile {

  private String id;

  private String _object;

  private Integer bytes;

  private Integer createdAt;

  private String filename;

  private String purpose;

  private String status;

  private JsonNullable<Object> statusDetails = JsonNullable.<Object>undefined();

  public OpenAIFile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OpenAIFile(String id, String _object, Integer bytes, Integer createdAt, String filename, String purpose) {
    this.id = id;
    this._object = _object;
    this.bytes = bytes;
    this.createdAt = createdAt;
    this.filename = filename;
    this.purpose = purpose;
  }

  public OpenAIFile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenAIFile _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
  */
  @NotNull 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public OpenAIFile bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

  /**
   * Get bytes
   * @return bytes
  */
  @NotNull 
  @Schema(name = "bytes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bytes")
  public Integer getBytes() {
    return bytes;
  }

  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  public OpenAIFile createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public OpenAIFile filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   * @return filename
  */
  @NotNull 
  @Schema(name = "filename", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public OpenAIFile purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Get purpose
   * @return purpose
  */
  @NotNull 
  @Schema(name = "purpose", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public OpenAIFile status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OpenAIFile statusDetails(Object statusDetails) {
    this.statusDetails = JsonNullable.of(statusDetails);
    return this;
  }

  /**
   * Get statusDetails
   * @return statusDetails
  */
  
  @Schema(name = "status_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status_details")
  public JsonNullable<Object> getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(JsonNullable<Object> statusDetails) {
    this.statusDetails = statusDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAIFile openAIFile = (OpenAIFile) o;
    return Objects.equals(this.id, openAIFile.id) &&
        Objects.equals(this._object, openAIFile._object) &&
        Objects.equals(this.bytes, openAIFile.bytes) &&
        Objects.equals(this.createdAt, openAIFile.createdAt) &&
        Objects.equals(this.filename, openAIFile.filename) &&
        Objects.equals(this.purpose, openAIFile.purpose) &&
        Objects.equals(this.status, openAIFile.status) &&
        equalsNullable(this.statusDetails, openAIFile.statusDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, bytes, createdAt, filename, purpose, status, hashCodeNullable(statusDetails));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAIFile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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

