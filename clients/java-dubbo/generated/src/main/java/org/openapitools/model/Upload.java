package org.openapitools.model;

import org.openapitools.model.OpenAIFile;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The Upload object can accept byte chunks in the form of Parts. 
 */
public class Upload implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The Upload unique identifier, which can be referenced in API endpoints.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  /**
   * The name of the file to be uploaded.
   */
  @JsonProperty("filename")
  private String filename;

  /**
   * The intended number of bytes to be uploaded.
   */
  @JsonProperty("bytes")
  private Integer bytes;

  /**
   * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
   */
  @JsonProperty("purpose")
  private String purpose;

  /**
   * The status of the Upload.
   */
  @JsonProperty("status")
  private String status;

  /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   */
  @JsonProperty("expires_at")
  private Integer expiresAt;

  /**
   * The object type, which is always \&quot;upload\&quot;.
   */
  @JsonProperty("object")
  private String _object;

  @JsonProperty("file")
  private OpenAIFile _file;

  /**
   * The Upload unique identifier, which can be referenced in API endpoints.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   * @return createdAt
   */
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The name of the file to be uploaded.
   * @return filename
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The intended number of bytes to be uploaded.
   * @return bytes
   */
  public Integer getBytes() {
    return bytes;
  }

  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  /**
   * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
   * @return purpose
   */
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   * The status of the Upload.
   * @return status
   */
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   * @return expiresAt
   */
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The object type, which is always \&quot;upload\&quot;.
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * 
   * @return _file
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
