package apimodels;

import apimodels.OpenAIFile;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The Upload object can accept byte chunks in the form of Parts. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Upload   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("filename")
  @NotNull

  private String filename;

  @JsonProperty("bytes")
  @NotNull

  private Integer bytes;

  @JsonProperty("purpose")
  @NotNull

  private String purpose;

  /**
   * The status of the Upload.
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    COMPLETED("completed"),
    
    CANCELLED("cancelled"),
    
    EXPIRED("expired");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("status")
  @NotNull

  private StatusEnum status;

  @JsonProperty("expires_at")
  @NotNull

  private Integer expiresAt;

  /**
   * The object type, which is always \"upload\".
   */
  public enum ObjectEnum {
    UPLOAD("upload");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("object")
  
  private ObjectEnum _object;

  @JsonProperty("file")
  @Valid

  private OpenAIFile _file;

  public Upload id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Upload unique identifier, which can be referenced in API endpoints.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Upload createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   * @return createdAt
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public Upload filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * The name of the file to be uploaded.
   * @return filename
  **/
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Upload bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

   /**
   * The intended number of bytes to be uploaded.
   * @return bytes
  **/
  public Integer getBytes() {
    return bytes;
  }

  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  public Upload purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public Upload status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the Upload.
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Upload expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   * @return expiresAt
  **/
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Upload _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always \"upload\".
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public Upload _file(OpenAIFile _file) {
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

