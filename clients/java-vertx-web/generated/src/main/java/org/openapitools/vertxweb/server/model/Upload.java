package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OpenAIFile;

/**
 * The Upload object can accept byte chunks in the form of Parts. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Upload   {
  
  private String id;
  private Integer createdAt;
  private String filename;
  private Integer bytes;
  private String purpose;


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
      return value;
    }
  }

  private StatusEnum status;
  private Integer expiresAt;


  public enum ObjectEnum {
    UPLOAD("upload");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private OpenAIFile _file;

  public Upload () {

  }

  public Upload (String id, Integer createdAt, String filename, Integer bytes, String purpose, StatusEnum status, Integer expiresAt, ObjectEnum _object, OpenAIFile _file) {
    this.id = id;
    this.createdAt = createdAt;
    this.filename = filename;
    this.bytes = bytes;
    this.purpose = purpose;
    this.status = status;
    this.expiresAt = expiresAt;
    this._object = _object;
    this._file = _file;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

    
  @JsonProperty("bytes")
  public Integer getBytes() {
    return bytes;
  }
  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

    
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
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
