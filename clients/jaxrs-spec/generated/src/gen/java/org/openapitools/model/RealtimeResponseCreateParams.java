package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RealtimeConversationItem;
import org.openapitools.model.RealtimeResponseCreateParamsConversation;
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Create a new Realtime response with these parameters
 **/
@ApiModel(description = "Create a new Realtime response with these parameters")
@JsonTypeName("RealtimeResponseCreateParams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseCreateParams   {
  public enum ModalitiesEnum {

    TEXT(String.valueOf("text")), AUDIO(String.valueOf("audio"));


    private String value;

    ModalitiesEnum (String v) {
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
    public static ModalitiesEnum fromString(String s) {
        for (ModalitiesEnum b : ModalitiesEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid List<ModalitiesEnum> modalities = new ArrayList<>();
  private String instructions;
  public enum VoiceEnum {

    ALLOY(String.valueOf("alloy")), ASH(String.valueOf("ash")), BALLAD(String.valueOf("ballad")), CORAL(String.valueOf("coral")), ECHO(String.valueOf("echo")), SAGE(String.valueOf("sage")), SHIMMER(String.valueOf("shimmer")), VERSE(String.valueOf("verse"));


    private String value;

    VoiceEnum (String v) {
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
    public static VoiceEnum fromString(String s) {
        for (VoiceEnum b : VoiceEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private VoiceEnum voice;
  public enum OutputAudioFormatEnum {

    PCM16(String.valueOf("pcm16")), G711_ULAW(String.valueOf("g711_ulaw")), G711_ALAW(String.valueOf("g711_alaw"));


    private String value;

    OutputAudioFormatEnum (String v) {
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
    public static OutputAudioFormatEnum fromString(String s) {
        for (OutputAudioFormatEnum b : OutputAudioFormatEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private OutputAudioFormatEnum outputAudioFormat;
  private @Valid List<@Valid RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();
  private String toolChoice;
  private BigDecimal temperature;
  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;
  private RealtimeResponseCreateParamsConversation conversation;
  private Object metadata;
  private @Valid List<@Valid RealtimeConversationItem> input = new ArrayList<>();

  public RealtimeResponseCreateParams() {
  }

  /**
   * The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;]. 
   **/
  public RealtimeResponseCreateParams modalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
    return this;
  }

  
  @ApiModelProperty(value = "The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. ")
  @JsonProperty("modalities")
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }

  @JsonProperty("modalities")
  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

  public RealtimeResponseCreateParams addModalitiesItem(ModalitiesEnum modalitiesItem) {
    if (this.modalities == null) {
      this.modalities = new ArrayList<>();
    }

    this.modalities.add(modalitiesItem);
    return this;
  }

  public RealtimeResponseCreateParams removeModalitiesItem(ModalitiesEnum modalitiesItem) {
    if (modalitiesItem != null && this.modalities != null) {
      this.modalities.remove(modalitiesItem);
    }

    return this;
  }
  /**
   * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session. 
   **/
  public RealtimeResponseCreateParams instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  
  @ApiModelProperty(value = "The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. ")
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }

  @JsonProperty("instructions")
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;. 
   **/
  public RealtimeResponseCreateParams voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

  
  @ApiModelProperty(value = "The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. ")
  @JsonProperty("voice")
  public VoiceEnum getVoice() {
    return voice;
  }

  @JsonProperty("voice")
  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  /**
   * The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   **/
  public RealtimeResponseCreateParams outputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
    return this;
  }

  
  @ApiModelProperty(value = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")
  @JsonProperty("output_audio_format")
  public OutputAudioFormatEnum getOutputAudioFormat() {
    return outputAudioFormat;
  }

  @JsonProperty("output_audio_format")
  public void setOutputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }

  /**
   * Tools (functions) available to the model.
   **/
  public RealtimeResponseCreateParams tools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  
  @ApiModelProperty(value = "Tools (functions) available to the model.")
  @JsonProperty("tools")
  @Valid public List<@Valid RealtimeResponseCreateParamsToolsInner> getTools() {
    return tools;
  }

  @JsonProperty("tools")
  public void setTools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
  }

  public RealtimeResponseCreateParams addToolsItem(RealtimeResponseCreateParamsToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }

    this.tools.add(toolsItem);
    return this;
  }

  public RealtimeResponseCreateParams removeToolsItem(RealtimeResponseCreateParamsToolsInner toolsItem) {
    if (toolsItem != null && this.tools != null) {
      this.tools.remove(toolsItem);
    }

    return this;
  }
  /**
   * How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function, like &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60;. 
   **/
  public RealtimeResponseCreateParams toolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

  
  @ApiModelProperty(value = "How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. ")
  @JsonProperty("tool_choice")
  public String getToolChoice() {
    return toolChoice;
  }

  @JsonProperty("tool_choice")
  public void setToolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
  }

  /**
   * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
   **/
  public RealtimeResponseCreateParams temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(value = "Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. ")
  @JsonProperty("temperature")
  @Valid public BigDecimal getTemperature() {
    return temperature;
  }

  @JsonProperty("temperature")
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   **/
  public RealtimeResponseCreateParams maxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max_response_output_tokens")
  @Valid public RealtimeResponseCreateParamsMaxResponseOutputTokens getMaxResponseOutputTokens() {
    return maxResponseOutputTokens;
  }

  @JsonProperty("max_response_output_tokens")
  public void setMaxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
  }

  /**
   **/
  public RealtimeResponseCreateParams conversation(RealtimeResponseCreateParamsConversation conversation) {
    this.conversation = conversation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("conversation")
  @Valid public RealtimeResponseCreateParamsConversation getConversation() {
    return conversation;
  }

  @JsonProperty("conversation")
  public void setConversation(RealtimeResponseCreateParamsConversation conversation) {
    this.conversation = conversation;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   **/
  public RealtimeResponseCreateParams metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  @JsonProperty("metadata")
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
   **/
  public RealtimeResponseCreateParams input(List<@Valid RealtimeConversationItem> input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(value = "Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. ")
  @JsonProperty("input")
  @Valid public List<@Valid RealtimeConversationItem> getInput() {
    return input;
  }

  @JsonProperty("input")
  public void setInput(List<@Valid RealtimeConversationItem> input) {
    this.input = input;
  }

  public RealtimeResponseCreateParams addInputItem(RealtimeConversationItem inputItem) {
    if (this.input == null) {
      this.input = new ArrayList<>();
    }

    this.input.add(inputItem);
    return this;
  }

  public RealtimeResponseCreateParams removeInputItem(RealtimeConversationItem inputItem) {
    if (inputItem != null && this.input != null) {
      this.input.remove(inputItem);
    }

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

