package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OpenAIFile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OpenAIFile   {
  private @Valid String id;
  private @Valid String _object;
  private @Valid Integer bytes;
  private @Valid Integer createdAt;
  private @Valid String filename;
  private @Valid String purpose;
  private @Valid String status;
  private @Valid Object statusDetails;

  /**
   **/
  public OpenAIFile id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public OpenAIFile _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  public OpenAIFile bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("bytes")
  @NotNull
  public Integer getBytes() {
    return bytes;
  }

  @JsonProperty("bytes")
  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  /**
   **/
  public OpenAIFile createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public OpenAIFile filename(String filename) {
    this.filename = filename;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("filename")
  @NotNull
  public String getFilename() {
    return filename;
  }

  @JsonProperty("filename")
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   **/
  public OpenAIFile purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("purpose")
  @NotNull
  public String getPurpose() {
    return purpose;
  }

  @JsonProperty("purpose")
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   **/
  public OpenAIFile status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  public OpenAIFile statusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status_details")
  public Object getStatusDetails() {
    return statusDetails;
  }

  @JsonProperty("status_details")
  public void setStatusDetails(Object statusDetails) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

