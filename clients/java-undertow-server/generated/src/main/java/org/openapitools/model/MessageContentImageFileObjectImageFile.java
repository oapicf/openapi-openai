/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageContentImageFileObjectImageFile   {
  
  private String fileId;


  public enum DetailEnum {
    AUTO("auto"),
    LOW("low"),
    HIGH("high");

    private String value;

    DetailEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DetailEnum detail = DetailEnum.AUTO;

  /**
   * The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
   */
  public MessageContentImageFileObjectImageFile fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.")
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
   */
  public MessageContentImageFileObjectImageFile detail(DetailEnum detail) {
    this.detail = detail;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.")
  @JsonProperty("detail")
  public DetailEnum getDetail() {
    return detail;
  }
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
    return Objects.equals(fileId, messageContentImageFileObjectImageFile.fileId) &&
        Objects.equals(detail, messageContentImageFileObjectImageFile.detail);
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

