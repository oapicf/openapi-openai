package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RealtimeConversationItem;
import org.openapitools.model.RealtimeResponseCreateParamsConversation;
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Create a new Realtime response with these parameters
 */

@Schema(name = "RealtimeResponseCreateParams", description = "Create a new Realtime response with these parameters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseCreateParams {

  /**
   * Gets or Sets modalities
   */
  public enum ModalitiesEnum {
    TEXT("text"),
    
    AUDIO("audio");

    private final String value;

    ModalitiesEnum(String value) {
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
    public static ModalitiesEnum fromValue(String value) {
      for (ModalitiesEnum b : ModalitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<ModalitiesEnum> modalities = new ArrayList<>();

  private @Nullable String instructions;

  /**
   * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
   */
  public enum VoiceEnum {
    ALLOY("alloy"),
    
    ASH("ash"),
    
    BALLAD("ballad"),
    
    CORAL("coral"),
    
    ECHO("echo"),
    
    SAGE("sage"),
    
    SHIMMER("shimmer"),
    
    VERSE("verse");

    private final String value;

    VoiceEnum(String value) {
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
    public static VoiceEnum fromValue(String value) {
      for (VoiceEnum b : VoiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable VoiceEnum voice;

  /**
   * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   */
  public enum OutputAudioFormatEnum {
    PCM16("pcm16"),
    
    G711_ULAW("g711_ulaw"),
    
    G711_ALAW("g711_alaw");

    private final String value;

    OutputAudioFormatEnum(String value) {
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
    public static OutputAudioFormatEnum fromValue(String value) {
      for (OutputAudioFormatEnum b : OutputAudioFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable OutputAudioFormatEnum outputAudioFormat;

  @Valid
  private List<@Valid RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();

  private @Nullable String toolChoice;

  private @Nullable BigDecimal temperature;

  private @Nullable RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  private @Nullable RealtimeResponseCreateParamsConversation conversation;

  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  @Valid
  private List<@Valid RealtimeConversationItem> input = new ArrayList<>();

  public RealtimeResponseCreateParams modalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
    return this;
  }

  public RealtimeResponseCreateParams addModalitiesItem(ModalitiesEnum modalitiesItem) {
    if (this.modalities == null) {
      this.modalities = new ArrayList<>();
    }
    this.modalities.add(modalitiesItem);
    return this;
  }

  /**
   * The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
   * @return modalities
   */
  
  @Schema(name = "modalities", description = "The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modalities")
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }

  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

  public RealtimeResponseCreateParams instructions(@Nullable String instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
   * @return instructions
   */
  
  @Schema(name = "instructions", description = "The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructions")
  public @Nullable String getInstructions() {
    return instructions;
  }

  public void setInstructions(@Nullable String instructions) {
    this.instructions = instructions;
  }

  public RealtimeResponseCreateParams voice(@Nullable VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

  /**
   * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
   * @return voice
   */
  
  @Schema(name = "voice", description = "The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voice")
  public @Nullable VoiceEnum getVoice() {
    return voice;
  }

  public void setVoice(@Nullable VoiceEnum voice) {
    this.voice = voice;
  }

  public RealtimeResponseCreateParams outputAudioFormat(@Nullable OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
    return this;
  }

  /**
   * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   * @return outputAudioFormat
   */
  
  @Schema(name = "output_audio_format", description = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output_audio_format")
  public @Nullable OutputAudioFormatEnum getOutputAudioFormat() {
    return outputAudioFormat;
  }

  public void setOutputAudioFormat(@Nullable OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }

  public RealtimeResponseCreateParams tools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public RealtimeResponseCreateParams addToolsItem(RealtimeResponseCreateParamsToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * Tools (functions) available to the model.
   * @return tools
   */
  @Valid 
  @Schema(name = "tools", description = "Tools (functions) available to the model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tools")
  public List<@Valid RealtimeResponseCreateParamsToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
  }

  public RealtimeResponseCreateParams toolChoice(@Nullable String toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

  /**
   * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
   * @return toolChoice
   */
  
  @Schema(name = "tool_choice", description = "How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tool_choice")
  public @Nullable String getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(@Nullable String toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RealtimeResponseCreateParams temperature(@Nullable BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
   * @return temperature
   */
  @Valid 
  @Schema(name = "temperature", description = "Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature")
  public @Nullable BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(@Nullable BigDecimal temperature) {
    this.temperature = temperature;
  }

  public RealtimeResponseCreateParams maxResponseOutputTokens(@Nullable RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
    return this;
  }

  /**
   * Get maxResponseOutputTokens
   * @return maxResponseOutputTokens
   */
  @Valid 
  @Schema(name = "max_response_output_tokens", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_response_output_tokens")
  public @Nullable RealtimeResponseCreateParamsMaxResponseOutputTokens getMaxResponseOutputTokens() {
    return maxResponseOutputTokens;
  }

  public void setMaxResponseOutputTokens(@Nullable RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
  }

  public RealtimeResponseCreateParams conversation(@Nullable RealtimeResponseCreateParamsConversation conversation) {
    this.conversation = conversation;
    return this;
  }

  /**
   * Get conversation
   * @return conversation
   */
  @Valid 
  @Schema(name = "conversation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversation")
  public @Nullable RealtimeResponseCreateParamsConversation getConversation() {
    return conversation;
  }

  public void setConversation(@Nullable RealtimeResponseCreateParamsConversation conversation) {
    this.conversation = conversation;
  }

  public RealtimeResponseCreateParams metadata(Object metadata) {
    this.metadata = JsonNullable.of(metadata);
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  
  @Schema(name = "metadata", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public JsonNullable<Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public RealtimeResponseCreateParams input(List<@Valid RealtimeConversationItem> input) {
    this.input = input;
    return this;
  }

  public RealtimeResponseCreateParams addInputItem(RealtimeConversationItem inputItem) {
    if (this.input == null) {
      this.input = new ArrayList<>();
    }
    this.input.add(inputItem);
    return this;
  }

  /**
   * Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
   * @return input
   */
  @Valid 
  @Schema(name = "input", description = "Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input")
  public List<@Valid RealtimeConversationItem> getInput() {
    return input;
  }

  public void setInput(List<@Valid RealtimeConversationItem> input) {
    this.input = input;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseCreateParams realtimeResponseCreateParams = (RealtimeResponseCreateParams) o;
    return Objects.equals(this.modalities, realtimeResponseCreateParams.modalities) &&
        Objects.equals(this.instructions, realtimeResponseCreateParams.instructions) &&
        Objects.equals(this.voice, realtimeResponseCreateParams.voice) &&
        Objects.equals(this.outputAudioFormat, realtimeResponseCreateParams.outputAudioFormat) &&
        Objects.equals(this.tools, realtimeResponseCreateParams.tools) &&
        Objects.equals(this.toolChoice, realtimeResponseCreateParams.toolChoice) &&
        Objects.equals(this.temperature, realtimeResponseCreateParams.temperature) &&
        Objects.equals(this.maxResponseOutputTokens, realtimeResponseCreateParams.maxResponseOutputTokens) &&
        Objects.equals(this.conversation, realtimeResponseCreateParams.conversation) &&
        equalsNullable(this.metadata, realtimeResponseCreateParams.metadata) &&
        Objects.equals(this.input, realtimeResponseCreateParams.input);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(modalities, instructions, voice, outputAudioFormat, tools, toolChoice, temperature, maxResponseOutputTokens, conversation, hashCodeNullable(metadata), input);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseCreateParams {\n");
    sb.append("    modalities: ").append(toIndentedString(modalities)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    outputAudioFormat: ").append(toIndentedString(outputAudioFormat)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    maxResponseOutputTokens: ").append(toIndentedString(maxResponseOutputTokens)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

