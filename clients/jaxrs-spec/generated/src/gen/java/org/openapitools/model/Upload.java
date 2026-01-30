package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OpenAIFile;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The Upload object can accept byte chunks in the form of Parts. 
 **/
@ApiModel(description = "The Upload object can accept byte chunks in the form of Parts. ")
@JsonTypeName("Upload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Upload   {
  private String id;
  private Integer createdAt;
  private String filename;
  private Integer bytes;
  private String purpose;
  public enum StatusEnum {

    PENDING(String.valueOf("pending")), COMPLETED(String.valueOf("completed")), CANCELLED(String.valueOf("cancelled")), EXPIRED(String.valueOf("expired"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static StatusEnum fromString(String s) {
        for (StatusEnum b : StatusEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StatusEnum status;
  private Integer expiresAt;
  public enum ObjectEnum {

    UPLOAD(String.valueOf("upload"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ObjectEnum _object;
  private OpenAIFile _file;

  public Upload() {
  }

  @JsonCreator
  public Upload(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "created_at") Integer createdAt,
    @JsonProperty(required = true, value = "filename") String filename,
    @JsonProperty(required = true, value = "bytes") Integer bytes,
    @JsonProperty(required = true, value = "purpose") String purpose,
    @JsonProperty(required = true, value = "status") StatusEnum status,
    @JsonProperty(required = true, value = "expires_at") Integer expiresAt
  ) {
    this.id = id;
    this.createdAt = createdAt;
    this.filename = filename;
    this.bytes = bytes;
    this.purpose = purpose;
    this.status = status;
    this.expiresAt = expiresAt;
  }

  /**
   * The Upload unique identifier, which can be referenced in API endpoints.
   **/
  public Upload id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Upload unique identifier, which can be referenced in API endpoints.")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "created_at")
  @NotNull public Integer getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(required = true, value = "created_at")
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
  @JsonProperty(required = true, value = "filename")
  @NotNull public String getFilename() {
    return filename;
  }

  @JsonProperty(required = true, value = "filename")
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
  @JsonProperty(required = true, value = "bytes")
  @NotNull public Integer getBytes() {
    return bytes;
  }

  @JsonProperty(required = true, value = "bytes")
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
  @JsonProperty(required = true, value = "purpose")
  @NotNull public String getPurpose() {
    return purpose;
  }

  @JsonProperty(required = true, value = "purpose")
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
  @JsonProperty(required = true, value = "status")
  @NotNull public StatusEnum getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
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
  @JsonProperty(required = true, value = "expires_at")
  @NotNull public Integer getExpiresAt() {
    return expiresAt;
  }

  @JsonProperty(required = true, value = "expires_at")
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The object type, which is always \&quot;upload\&quot;.
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

  @JsonProperty("object")
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
  @Valid public OpenAIFile getFile() {
    return _file;
  }

  @JsonProperty("file")
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

