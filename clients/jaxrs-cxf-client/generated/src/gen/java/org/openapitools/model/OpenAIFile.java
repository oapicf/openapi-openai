package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OpenAIFile  {
  
  @ApiModelProperty(required = true, value = "")
  private String id;

  @ApiModelProperty(required = true, value = "")
  private String _object;

  @ApiModelProperty(required = true, value = "")
  private Integer bytes;

  @ApiModelProperty(required = true, value = "")
  private Integer createdAt;

  @ApiModelProperty(required = true, value = "")
  private String filename;

  @ApiModelProperty(required = true, value = "")
  private String purpose;

  @ApiModelProperty(value = "")
  private String status;

  @ApiModelProperty(value = "")
  private Object statusDetails;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenAIFile id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public OpenAIFile _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get bytes
   * @return bytes
  **/
  @JsonProperty("bytes")
  public Integer getBytes() {
    return bytes;
  }

  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  public OpenAIFile bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

 /**
   * Get createdAt
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public OpenAIFile createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * Get filename
   * @return filename
  **/
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public OpenAIFile filename(String filename) {
    this.filename = filename;
    return this;
  }

 /**
   * Get purpose
   * @return purpose
  **/
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public OpenAIFile purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OpenAIFile status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get statusDetails
   * @return statusDetails
  **/
  @JsonProperty("status_details")
  public Object getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
  }

  public OpenAIFile statusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
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
    OpenAIFile openAIFile = (OpenAIFile) o;
    return Objects.equals(this.id, openAIFile.id) &&
        Objects.equals(this._object, openAIFile._object) &&
        Objects.equals(this.bytes, openAIFile.bytes) &&
        Objects.equals(this.createdAt, openAIFile.createdAt) &&
        Objects.equals(this.filename, openAIFile.filename) &&
        Objects.equals(this.purpose, openAIFile.purpose) &&
        Objects.equals(this.status, openAIFile.status) &&
        Objects.equals(this.statusDetails, openAIFile.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, bytes, createdAt, filename, purpose, status, statusDetails);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

