package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CreateUploadRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateUploadRequest   {
  private String filename;
  public enum PurposeEnum {

    ASSISTANTS(String.valueOf("assistants")), BATCH(String.valueOf("batch")), FINE_TUNE(String.valueOf("fine-tune")), VISION(String.valueOf("vision"));


    private String value;

    PurposeEnum (String v) {
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
    public static PurposeEnum fromString(String s) {
        for (PurposeEnum b : PurposeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  }

  @JsonCreator
  public CreateUploadRequest(
    @JsonProperty(required = true, value = "filename") String filename,
    @JsonProperty(required = true, value = "purpose") PurposeEnum purpose,
    @JsonProperty(required = true, value = "bytes") Integer bytes,
    @JsonProperty(required = true, value = "mime_type") String mimeType
  ) {
    this.filename = filename;
    this.purpose = purpose;
    this.bytes = bytes;
    this.mimeType = mimeType;
  }

  /**
   * The name of the file to upload. 
   **/
  public CreateUploadRequest filename(String filename) {
    this.filename = filename;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the file to upload. ")
  @JsonProperty(required = true, value = "filename")
  @NotNull public String getFilename() {
    return filename;
  }

  @JsonProperty(required = true, value = "filename")
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
   **/
  public CreateUploadRequest purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). ")
  @JsonProperty(required = true, value = "purpose")
  @NotNull public PurposeEnum getPurpose() {
    return purpose;
  }

  @JsonProperty(required = true, value = "purpose")
  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  /**
   * The number of bytes in the file you are uploading. 
   **/
  public CreateUploadRequest bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of bytes in the file you are uploading. ")
  @JsonProperty(required = true, value = "bytes")
  @NotNull public Integer getBytes() {
    return bytes;
  }

  @JsonProperty(required = true, value = "bytes")
  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  /**
   * The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
   **/
  public CreateUploadRequest mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. ")
  @JsonProperty(required = true, value = "mime_type")
  @NotNull public String getMimeType() {
    return mimeType;
  }

  @JsonProperty(required = true, value = "mime_type")
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

