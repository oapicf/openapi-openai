package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RealtimeConversationItem;
import com.prokarma.pkmst.model.RealtimeResponseCreateParamsConversation;
import com.prokarma.pkmst.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import com.prokarma.pkmst.model.RealtimeResponseCreateParamsToolsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Create a new Realtime response with these parameters
 */
@ApiModel(description = "Create a new Realtime response with these parameters")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseCreateParams   {
  /**
   * Gets or Sets modalities
   */
  public enum ModalitiesEnum {
    TEXT("text"),
    
    AUDIO("audio");

    private String value;

    ModalitiesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModalitiesEnum fromValue(String text) {
      for (ModalitiesEnum b : ModalitiesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("modalities")
  
  private List<ModalitiesEnum> modalities = null;

  @JsonProperty("instructions")
  private String instructions;

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

    private String value;

    VoiceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VoiceEnum fromValue(String text) {
      for (VoiceEnum b : VoiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("voice")
  private VoiceEnum voice;

  /**
   * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   */
  public enum OutputAudioFormatEnum {
    PCM16("pcm16"),
    
    G711_ULAW("g711_ulaw"),
    
    G711_ALAW("g711_alaw");

    private String value;

    OutputAudioFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OutputAudioFormatEnum fromValue(String text) {
      for (OutputAudioFormatEnum b : OutputAudioFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("output_audio_format")
  private OutputAudioFormatEnum outputAudioFormat;

  @JsonProperty("tools")
  
  private List<RealtimeResponseCreateParamsToolsInner> tools = null;

  @JsonProperty("tool_choice")
  private String toolChoice;

  @JsonProperty("temperature")
  private BigDecimal temperature;

  @JsonProperty("max_response_output_tokens")
  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  @JsonProperty("conversation")
  private RealtimeResponseCreateParamsConversation conversation;

  @JsonProperty("metadata")
  private Object metadata;

  @JsonProperty("input")
  
  private List<RealtimeConversationItem> input = null;

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
  @ApiModelProperty(value = "The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. ")
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }

  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

  public RealtimeResponseCreateParams instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
   * @return instructions
   */
  @ApiModelProperty(value = "The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. ")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public RealtimeResponseCreateParams voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

  /**
   * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
   * @return voice
   */
  @ApiModelProperty(value = "The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. ")
  public VoiceEnum getVoice() {
    return voice;
  }

  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  public RealtimeResponseCreateParams outputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
    return this;
  }

  /**
   * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   * @return outputAudioFormat
   */
  @ApiModelProperty(value = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")
  public OutputAudioFormatEnum getOutputAudioFormat() {
    return outputAudioFormat;
  }

  public void setOutputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }

  public RealtimeResponseCreateParams tools(List<RealtimeResponseCreateParamsToolsInner> tools) {
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
  @ApiModelProperty(value = "Tools (functions) available to the model.")
  public List<RealtimeResponseCreateParamsToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
  }

  public RealtimeResponseCreateParams toolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

  /**
   * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
   * @return toolChoice
   */
  @ApiModelProperty(value = "How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. ")
  public String getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RealtimeResponseCreateParams temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
   * @return temperature
   */
  @ApiModelProperty(value = "Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. ")
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public RealtimeResponseCreateParams maxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
    return this;
  }

  /**
   * Get maxResponseOutputTokens
   * @return maxResponseOutputTokens
   */
  @ApiModelProperty(value = "")
  public RealtimeResponseCreateParamsMaxResponseOutputTokens getMaxResponseOutputTokens() {
    return maxResponseOutputTokens;
  }

  public void setMaxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
  }

  public RealtimeResponseCreateParams conversation(RealtimeResponseCreateParamsConversation conversation) {
    this.conversation = conversation;
    return this;
  }

  /**
   * Get conversation
   * @return conversation
   */
  @ApiModelProperty(value = "")
  public RealtimeResponseCreateParamsConversation getConversation() {
    return conversation;
  }

  public void setConversation(RealtimeResponseCreateParamsConversation conversation) {
    this.conversation = conversation;
  }

  public RealtimeResponseCreateParams metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public RealtimeResponseCreateParams input(List<RealtimeConversationItem> input) {
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
  @ApiModelProperty(value = "Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. ")
  public List<RealtimeConversationItem> getInput() {
    return input;
  }

  public void setInput(List<RealtimeConversationItem> input) {
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
        Objects.equals(this.metadata, realtimeResponseCreateParams.metadata) &&
        Objects.equals(this.input, realtimeResponseCreateParams.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modalities, instructions, voice, outputAudioFormat, tools, toolChoice, temperature, maxResponseOutputTokens, conversation, metadata, input);
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

