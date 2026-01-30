package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenAIFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The Upload object can accept byte chunks in the form of Parts. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Upload   {
  
  private String id;
  private Integer createdAt;
  private String filename;
  private Integer bytes;
  private String purpose;

  /**
   * The status of the Upload.
   */
  public enum StatusEnum {
    PENDING("pending"),

        COMPLETED("completed"),

        CANCELLED("cancelled"),

        EXPIRED("expired");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status;
  private Integer expiresAt;

  /**
   * The object type, which is always \&quot;upload\&quot;.
   */
  public enum ObjectEnum {
    UPLOAD("upload");
    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ObjectEnum _object;
  private OpenAIFile _file;

  /**
   * The Upload unique identifier, which can be referenced in API endpoints.
   **/
  
  @ApiModelProperty(required = true, value = "The Upload unique identifier, which can be referenced in API endpoints.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   **/
  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the Upload was created.")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The name of the file to be uploaded.
   **/
  
  @ApiModelProperty(required = true, value = "The name of the file to be uploaded.")
  @JsonProperty("filename")
  @NotNull
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The intended number of bytes to be uploaded.
   **/
  
  @ApiModelProperty(required = true, value = "The intended number of bytes to be uploaded.")
  @JsonProperty("bytes")
  @NotNull
  public Integer getBytes() {
    return bytes;
  }
  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  /**
   * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
   **/
  
  @ApiModelProperty(required = true, value = "The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.")
  @JsonProperty("purpose")
  @NotNull
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   * The status of the Upload.
   **/
  
  @ApiModelProperty(required = true, value = "The status of the Upload.")
  @JsonProperty("status")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   **/
  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the Upload was created.")
  @JsonProperty("expires_at")
  @NotNull
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The object type, which is always \&quot;upload\&quot;.
   **/
  
  @ApiModelProperty(value = "The object type, which is always \"upload\".")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("file")
  public OpenAIFile getFile() {
    return _file;
  }
  public void setFile(OpenAIFile _file) {
    this._file = _file;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Upload upload = (Upload) o;
    return Objects.equals(this.id, upload.id) &&
        Objects.equals(this.createdAt, upload.createdAt) &&
        Objects.equals(this.filename, upload.filename) &&
        Objects.equals(this.bytes, upload.bytes) &&
        Objects.equals(this.purpose, upload.purpose) &&
        Objects.equals(this.status, upload.status) &&
        Objects.equals(this.expiresAt, upload.expiresAt) &&
        Objects.equals(this._object, upload._object) &&
        Objects.equals(this._file, upload._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, filename, bytes, purpose, status, expiresAt, _object, _file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upload {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

