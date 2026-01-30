package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageDeltaContentImageFileObjectImageFile  {
  
 /**
  * The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
  */
  @ApiModelProperty(value = "The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.")

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

 /**
  * Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  */
  @ApiModelProperty(value = "Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.")

  private DetailEnum detail = DetailEnum.AUTO;
 /**
   * The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;\&quot;vision\&quot;&#x60; when uploading the File if you need to later display the file content.
   * @return fileId
  **/
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public MessageDeltaContentImageFileObjectImageFile fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

 /**
   * Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;.
   * @return detail
  **/
  @JsonProperty("detail")
  public String getDetail() {
    if (detail == null) {
      return null;
    }
    return detail.value();
  }

  public void setDetail(DetailEnum detail) {
    this.detail = detail;
  }

  public MessageDeltaContentImageFileObjectImageFile detail(DetailEnum detail) {
    this.detail = detail;
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
    MessageDeltaContentImageFileObjectImageFile messageDeltaContentImageFileObjectImageFile = (MessageDeltaContentImageFileObjectImageFile) o;
    return Objects.equals(this.fileId, messageDeltaContentImageFileObjectImageFile.fileId) &&
        Objects.equals(this.detail, messageDeltaContentImageFileObjectImageFile.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentImageFileObjectImageFile {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

