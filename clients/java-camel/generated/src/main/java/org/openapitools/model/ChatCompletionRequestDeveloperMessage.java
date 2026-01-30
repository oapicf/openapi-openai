package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChatCompletionRequestDeveloperMessageContent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, &#x60;developer&#x60; messages replace the previous &#x60;system&#x60; messages. 
 */

@Schema(name = "ChatCompletionRequestDeveloperMessage", description = "Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestDeveloperMessage implements ChatCompletionRequestMessage {

  private ChatCompletionRequestDeveloperMessageContent content;

  /**
   * The role of the messages author, in this case `developer`.
   */
  public enum RoleEnum {
    DEVELOPER("developer");

    private final String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RoleEnum role;

  private String name;

  public ChatCompletionRequestDeveloperMessage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChatCompletionRequestDeveloperMessage(ChatCompletionRequestDeveloperMessageContent content, RoleEnum role) {
    this.content = content;
    this.role = role;
  }

  public ChatCompletionRequestDeveloperMessage content(ChatCompletionRequestDeveloperMessageContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @NotNull @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public ChatCompletionRequestDeveloperMessageContent getContent() {
    return content;
  }

  public void setContent(ChatCompletionRequestDeveloperMessageContent content) {
    this.content = content;
  }

  public ChatCompletionRequestDeveloperMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the messages author, in this case `developer`.
   * @return role
   */
  @NotNull 
  @Schema(name = "role", description = "The role of the messages author, in this case `developer`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestDeveloperMessage name(String name) {
    this.name = name;
    return this;
  }

  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   * @return name
   */
  
  @Schema(name = "name", description = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestDeveloperMessage chatCompletionRequestDeveloperMessage = (ChatCompletionRequestDeveloperMessage) o;
    return Objects.equals(this.content, chatCompletionRequestDeveloperMessage.content) &&
        Objects.equals(this.role, chatCompletionRequestDeveloperMessage.role) &&
        Objects.equals(this.name, chatCompletionRequestDeveloperMessage.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestDeveloperMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

