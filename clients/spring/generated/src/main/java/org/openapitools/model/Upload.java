package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OpenAIFile;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The Upload object can accept byte chunks in the form of Parts. 
 */

@Schema(name = "Upload", description = "The Upload object can accept byte chunks in the form of Parts. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Upload {

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

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private StatusEnum status;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ObjectEnum _object;

  private @Nullable OpenAIFile file;

  public Upload() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Upload(String id, Integer createdAt, String filename, Integer bytes, String purpose, StatusEnum status, Integer expiresAt) {
    this.id = id;
    this.createdAt = createdAt;
    this.filename = filename;
    this.bytes = bytes;
    this.purpose = purpose;
    this.status = status;
    this.expiresAt = expiresAt;
  }

  public Upload id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Upload unique identifier, which can be referenced in API endpoints.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The Upload unique identifier, which can be referenced in API endpoints.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull 
  @Schema(name = "created_at", description = "The Unix timestamp (in seconds) for when the Upload was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
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
   */
  @NotNull 
  @Schema(name = "filename", description = "The name of the file to be uploaded.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filename")
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
   */
  @NotNull 
  @Schema(name = "bytes", description = "The intended number of bytes to be uploaded.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bytes")
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
   */
  @NotNull 
  @Schema(name = "purpose", description = "The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("purpose")
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
   */
  @NotNull 
  @Schema(name = "status", description = "The status of the Upload.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
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
   */
  @NotNull 
  @Schema(name = "expires_at", description = "The Unix timestamp (in seconds) for when the Upload was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Upload _object(@Nullable ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always \"upload\".
   * @return _object
   */
  
  @Schema(name = "object", description = "The object type, which is always \"upload\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("object")
  public @Nullable ObjectEnum getObject() {
    return _object;
  }

  public void setObject(@Nullable ObjectEnum _object) {
    this._object = _object;
  }

  public Upload file(@Nullable OpenAIFile file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
   */
  @Valid 
  @Schema(name = "file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file")
  public @Nullable OpenAIFile getFile() {
    return file;
  }

  public void setFile(@Nullable OpenAIFile file) {
    this.file = file;
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
        Objects.equals(this.file, upload.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, filename, bytes, purpose, status, expiresAt, _object, file);
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
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

