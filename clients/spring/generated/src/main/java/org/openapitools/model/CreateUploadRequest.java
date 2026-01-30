package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateUploadRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateUploadRequest {

  private String filename;

  /**
   * The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
   */
  public enum PurposeEnum {
    ASSISTANTS("assistants"),
    
    BATCH("batch"),
    
    FINE_TUNE("fine-tune"),
    
    VISION("vision");

    private final String value;

    PurposeEnum(String value) {
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
    public static PurposeEnum fromValue(String value) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PurposeEnum purpose;

  private Integer bytes;

  private String mimeType;

  public CreateUploadRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUploadRequest(String filename, PurposeEnum purpose, Integer bytes, String mimeType) {
    this.filename = filename;
    this.purpose = purpose;
    this.bytes = bytes;
    this.mimeType = mimeType;
  }

  public CreateUploadRequest filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The name of the file to upload. 
   * @return filename
   */
  @NotNull 
  @Schema(name = "filename", description = "The name of the file to upload. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public CreateUploadRequest purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
   * @return purpose
   */
  @NotNull 
  @Schema(name = "purpose", description = "The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("purpose")
  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  public CreateUploadRequest bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

  /**
   * The number of bytes in the file you are uploading. 
   * @return bytes
   */
  @NotNull 
  @Schema(name = "bytes", description = "The number of bytes in the file you are uploading. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bytes")
  public Integer getBytes() {
    return bytes;
  }

  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  public CreateUploadRequest mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
   * @return mimeType
   */
  @NotNull 
  @Schema(name = "mime_type", description = "The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mime_type")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUploadRequest createUploadRequest = (CreateUploadRequest) o;
    return Objects.equals(this.filename, createUploadRequest.filename) &&
        Objects.equals(this.purpose, createUploadRequest.purpose) &&
        Objects.equals(this.bytes, createUploadRequest.bytes) &&
        Objects.equals(this.mimeType, createUploadRequest.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, purpose, bytes, mimeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUploadRequest {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

