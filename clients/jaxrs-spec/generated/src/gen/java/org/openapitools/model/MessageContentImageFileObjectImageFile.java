package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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



@JsonTypeName("MessageContentImageFileObject_image_file")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageContentImageFileObjectImageFile   {
  private String fileId;
  public enum DetailEnum {

    AUTO(String.valueOf("auto")), LOW(String.valueOf("low")), HIGH(String.valueOf("high"));


    private String value;

    DetailEnum (String v) {
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
    public static DetailEnum fromString(String s) {
        for (DetailEnum b : DetailEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static DetailEnum fromValue(String value) {
        for (DetailEnum b : DetailEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private DetailEnum detail = DetailEnum.AUTO;

  public MessageContentImageFileObjectImageFile() {
  }

  @JsonCreator
  public MessageContentImageFileObjectImageFile(
    @JsonProperty(required = true, value = "file_id") String fileId
  ) {
    this.fileId = fileId;
  }

  /**
   * The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;\&quot;vision\&quot;&#x60; when uploading the File if you need to later display the file content.
   **/
  public MessageContentImageFileObjectImageFile fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.")
  @JsonProperty(required = true, value = "file_id")
  @NotNull public String getFileId() {
    return fileId;
  }

  @JsonProperty(required = true, value = "file_id")
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;.
   **/
  public MessageContentImageFileObjectImageFile detail(DetailEnum detail) {
    this.detail = detail;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.")
  @JsonProperty("detail")
  public DetailEnum getDetail() {
    return detail;
  }

  @JsonProperty("detail")
  public void setDetail(DetailEnum detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentImageFileObjectImageFile messageContentImageFileObjectImageFile = (MessageContentImageFileObjectImageFile) o;
    return Objects.equals(this.fileId, messageContentImageFileObjectImageFile.fileId) &&
        Objects.equals(this.detail, messageContentImageFileObjectImageFile.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentImageFileObjectImageFile {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

