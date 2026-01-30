package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateUploadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateUploadRequest   {
  @JsonProperty("filename")
  @NotNull

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

    @Override
    @JsonValue
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

  @JsonProperty("purpose")
  @NotNull

  private PurposeEnum purpose;

  @JsonProperty("bytes")
  @NotNull

  private Integer bytes;

  @JsonProperty("mime_type")
  @NotNull

  private String mimeType;

  public CreateUploadRequest filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * The name of the file to upload. 
   * @return filename
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(filename, createUploadRequest.filename) &&
        Objects.equals(purpose, createUploadRequest.purpose) &&
        Objects.equals(bytes, createUploadRequest.bytes) &&
        Objects.equals(mimeType, createUploadRequest.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, purpose, bytes, mimeType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

