package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateUploadRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateUploadRequest   {
  @JsonProperty("filename")
  private String filename;

  /**
   * The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
   */
  public enum PurposeEnum {
    ASSISTANTS("assistants"),
    
    BATCH("batch"),
    
    FINE_TUNE("fine-tune"),
    
    VISION("vision");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PurposeEnum fromValue(String text) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("purpose")
  private PurposeEnum purpose;

  @JsonProperty("bytes")
  private Integer bytes;

  @JsonProperty("mime_type")
  private String mimeType;

  public CreateUploadRequest filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The name of the file to upload. 
   * @return filename
   */
  @ApiModelProperty(required = true, value = "The name of the file to upload. ")
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
  @ApiModelProperty(required = true, value = "The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). ")
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
  @ApiModelProperty(required = true, value = "The number of bytes in the file you are uploading. ")
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
  @ApiModelProperty(required = true, value = "The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. ")
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

