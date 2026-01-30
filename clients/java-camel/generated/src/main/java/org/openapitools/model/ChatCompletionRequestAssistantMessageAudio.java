package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 */

@Schema(name = "ChatCompletionRequestAssistantMessage_audio", description = "Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). ")
@JsonTypeName("ChatCompletionRequestAssistantMessage_audio")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestAssistantMessageAudio {

  private String id;

  public ChatCompletionRequestAssistantMessageAudio() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChatCompletionRequestAssistantMessageAudio(String id) {
    this.id = id;
  }

  public ChatCompletionRequestAssistantMessageAudio id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for a previous audio response from the model. 
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier for a previous audio response from the model. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestAssistantMessageAudio chatCompletionRequestAssistantMessageAudio = (ChatCompletionRequestAssistantMessageAudio) o;
    return Objects.equals(this.id, chatCompletionRequestAssistantMessageAudio.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestAssistantMessageAudio {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

