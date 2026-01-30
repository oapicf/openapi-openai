package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenAIFile;



/**
 * The Upload object can accept byte chunks in the form of Parts. 
 **/

@ApiModel(description = "The Upload object can accept byte chunks in the form of Parts. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Upload   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("filename")
  private String filename;

  @JsonProperty("bytes")
  private Integer bytes;

  @JsonProperty("purpose")
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

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("expires_at")
  private Integer expiresAt;

  /**
   * The object type, which is always \"upload\".
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

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("file")
  private OpenAIFile _file;

  /**
   * The Upload unique identifier, which can be referenced in API endpoints.
   **/
  public Upload id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Upload unique identifier, which can be referenced in API endpoints.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   **/
  public Upload createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the Upload was created.")
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The name of the file to be uploaded.
   **/
  public Upload filename(String filename) {
    this.filename = filename;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the file to be uploaded.")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The intended number of bytes to be uploaded.
   **/
  public Upload bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The intended number of bytes to be uploaded.")
  @JsonProperty("bytes")
  public Integer getBytes() {
    return bytes;
  }
  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  /**
   * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
   **/
  public Upload purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   * The status of the Upload.
   **/
  public Upload status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The status of the Upload.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   **/
  public Upload expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the Upload was created.")
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The object type, which is always \"upload\".
   **/
  public Upload _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
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
  public Upload _file(OpenAIFile _file) {
    this._file = _file;
    return this;
  }

  
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
    return Objects.equals(id, upload.id) &&
        Objects.equals(createdAt, upload.createdAt) &&
        Objects.equals(filename, upload.filename) &&
        Objects.equals(bytes, upload.bytes) &&
        Objects.equals(purpose, upload.purpose) &&
        Objects.equals(status, upload.status) &&
        Objects.equals(expiresAt, upload.expiresAt) &&
        Objects.equals(_object, upload._object) &&
        Objects.equals(_file, upload._file);
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

