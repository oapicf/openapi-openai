package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OpenAIFile;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The Upload object can accept byte chunks in the form of Parts. 
 */
@ApiModel(description="The Upload object can accept byte chunks in the form of Parts. ")

public class Upload  {
  
 /**
  * The Upload unique identifier, which can be referenced in API endpoints.
  */
  @ApiModelProperty(required = true, value = "The Upload unique identifier, which can be referenced in API endpoints.")
  private String id;

 /**
  * The Unix timestamp (in seconds) for when the Upload was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the Upload was created.")
  private Integer createdAt;

 /**
  * The name of the file to be uploaded.
  */
  @ApiModelProperty(required = true, value = "The name of the file to be uploaded.")
  private String filename;

 /**
  * The intended number of bytes to be uploaded.
  */
  @ApiModelProperty(required = true, value = "The intended number of bytes to be uploaded.")
  private Integer bytes;

 /**
  * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
  */
  @ApiModelProperty(required = true, value = "The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.")
  private String purpose;

public enum StatusEnum {

    @JsonProperty("pending") PENDING(String.valueOf("pending")),
    @JsonProperty("completed") COMPLETED(String.valueOf("completed")),
    @JsonProperty("cancelled") CANCELLED(String.valueOf("cancelled")),
    @JsonProperty("expired") EXPIRED(String.valueOf("expired"));

    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The status of the Upload.
  */
  @ApiModelProperty(required = true, value = "The status of the Upload.")
  private StatusEnum status;

 /**
  * The Unix timestamp (in seconds) for when the Upload was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the Upload was created.")
  private Integer expiresAt;

public enum ObjectEnum {

    @JsonProperty("upload") UPLOAD(String.valueOf("upload"));

    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The object type, which is always \"upload\".
  */
  @ApiModelProperty(value = "The object type, which is always \"upload\".")
  private ObjectEnum _object;

  @ApiModelProperty(value = "")
  @Valid
  private OpenAIFile _file;
 /**
  * The Upload unique identifier, which can be referenced in API endpoints.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public Upload id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the Upload was created.
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public Upload createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * The name of the file to be uploaded.
  * @return filename
  */
  @JsonProperty("filename")
  @NotNull
  public String getFilename() {
    return filename;
  }

  /**
   * Sets the <code>filename</code> property.
   */
 public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * Sets the <code>filename</code> property.
   */
  public Upload filename(String filename) {
    this.filename = filename;
    return this;
  }

 /**
  * The intended number of bytes to be uploaded.
  * @return bytes
  */
  @JsonProperty("bytes")
  @NotNull
  public Integer getBytes() {
    return bytes;
  }

  /**
   * Sets the <code>bytes</code> property.
   */
 public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  /**
   * Sets the <code>bytes</code> property.
   */
  public Upload bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

 /**
  * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
  * @return purpose
  */
  @JsonProperty("purpose")
  @NotNull
  public String getPurpose() {
    return purpose;
  }

  /**
   * Sets the <code>purpose</code> property.
   */
 public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   * Sets the <code>purpose</code> property.
   */
  public Upload purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

 /**
  * The status of the Upload.
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public Upload status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the Upload was created.
  * @return expiresAt
  */
  @JsonProperty("expires_at")
  @NotNull
  public Integer getExpiresAt() {
    return expiresAt;
  }

  /**
   * Sets the <code>expiresAt</code> property.
   */
 public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * Sets the <code>expiresAt</code> property.
   */
  public Upload expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

 /**
  * The object type, which is always \&quot;upload\&quot;.
  * @return _object
  */
  @JsonProperty("object")
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public Upload _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get _file
  * @return _file
  */
  @JsonProperty("file")
  public OpenAIFile getFile() {
    return _file;
  }

  /**
   * Sets the <code>_file</code> property.
   */
 public void setFile(OpenAIFile _file) {
    this._file = _file;
  }

  /**
   * Sets the <code>_file</code> property.
   */
  public Upload _file(OpenAIFile _file) {
    this._file = _file;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

