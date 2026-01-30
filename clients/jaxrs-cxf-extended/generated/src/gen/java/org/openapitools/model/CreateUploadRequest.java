package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateUploadRequest  {
  
 /**
  * The name of the file to upload. 
  */
  @ApiModelProperty(required = true, value = "The name of the file to upload. ")
  private String filename;

public enum PurposeEnum {

    @JsonProperty("assistants") ASSISTANTS(String.valueOf("assistants")),
    @JsonProperty("batch") BATCH(String.valueOf("batch")),
    @JsonProperty("fine-tune") FINE_TUNE(String.valueOf("fine-tune")),
    @JsonProperty("vision") VISION(String.valueOf("vision"));

    private String value;

    PurposeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PurposeEnum fromValue(String value) {
        for (PurposeEnum b : PurposeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
  */
  @ApiModelProperty(required = true, value = "The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). ")
  private PurposeEnum purpose;

 /**
  * The number of bytes in the file you are uploading. 
  */
  @ApiModelProperty(required = true, value = "The number of bytes in the file you are uploading. ")
  private Integer bytes;

 /**
  * The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
  */
  @ApiModelProperty(required = true, value = "The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. ")
  private String mimeType;
 /**
  * The name of the file to upload. 
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
  public CreateUploadRequest filename(String filename) {
    this.filename = filename;
    return this;
  }

 /**
  * The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
  * @return purpose
  */
  @JsonProperty("purpose")
  @NotNull
  public String getPurpose() {
    return purpose == null ? null : purpose.value();
  }

  /**
   * Sets the <code>purpose</code> property.
   */
 public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  /**
   * Sets the <code>purpose</code> property.
   */
  public CreateUploadRequest purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

 /**
  * The number of bytes in the file you are uploading. 
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
  public CreateUploadRequest bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

 /**
  * The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
  * @return mimeType
  */
  @JsonProperty("mime_type")
  @NotNull
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Sets the <code>mimeType</code> property.
   */
 public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * Sets the <code>mimeType</code> property.
   */
  public CreateUploadRequest mimeType(String mimeType) {
    this.mimeType = mimeType;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

