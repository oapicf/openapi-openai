package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RealtimeConversationItem;
import org.openapitools.model.RealtimeResponseCreateParamsConversation;
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Create a new Realtime response with these parameters
 */
@ApiModel(description="Create a new Realtime response with these parameters")

public class RealtimeResponseCreateParams  {
  
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
    public String toString() {
        return String.valueOf(value);
    }

    public static ModalitiesEnum fromValue(String value) {
        for (ModalitiesEnum b : ModalitiesEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  */
  @ApiModelProperty(value = "The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. ")

  private List<ModalitiesEnum> modalities = new ArrayList<>();

 /**
  * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  */
  @ApiModelProperty(value = "The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. ")

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
    public String toString() {
        return String.valueOf(value);
    }

    public static VoiceEnum fromValue(String value) {
        for (VoiceEnum b : VoiceEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  */
  @ApiModelProperty(value = "The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. ")

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
    public String toString() {
        return String.valueOf(value);
    }

    public static OutputAudioFormatEnum fromValue(String value) {
        for (OutputAudioFormatEnum b : OutputAudioFormatEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  */
  @ApiModelProperty(value = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")

  private OutputAudioFormatEnum outputAudioFormat;

 /**
  * Tools (functions) available to the model.
  */
  @ApiModelProperty(value = "Tools (functions) available to the model.")

  private List<RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();

 /**
  * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
  */
  @ApiModelProperty(value = "How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. ")

  private String toolChoice;

 /**
  * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
  */
  @ApiModelProperty(value = "Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. ")

  private BigDecimal temperature;

  @ApiModelProperty(value = "")

  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  @ApiModelProperty(value = "")

  private RealtimeResponseCreateParamsConversation conversation;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")

  private Object metadata;

 /**
  * Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
  */
  @ApiModelProperty(value = "Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. ")

  private List<RealtimeConversationItem> input = new ArrayList<>();
 /**
   * The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;]. 
   * @return modalities
  **/
  @JsonProperty("modalities")
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }

  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

  public RealtimeResponseCreateParams modalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
    return this;
  }

  public RealtimeResponseCreateParams addModalitiesItem(ModalitiesEnum modalitiesItem) {
    this.modalities.add(modalitiesItem);
    return this;
  }

 /**
   * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session. 
   * @return instructions
  **/
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public RealtimeResponseCreateParams instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

 /**
   * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;. 
   * @return voice
  **/
  @JsonProperty("voice")
  public String getVoice() {
    if (voice == null) {
      return null;
    }
    return voice.value();
  }

  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  public RealtimeResponseCreateParams voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

 /**
   * The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   * @return outputAudioFormat
  **/
  @JsonProperty("output_audio_format")
  public String getOutputAudioFormat() {
    if (outputAudioFormat == null) {
      return null;
    }
    return outputAudioFormat.value();
  }

  public void setOutputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }

  public RealtimeResponseCreateParams outputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
    return this;
  }

 /**
   * Tools (functions) available to the model.
   * @return tools
  **/
  @JsonProperty("tools")
  public List<RealtimeResponseCreateParamsToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
  }

  public RealtimeResponseCreateParams tools(List<RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public RealtimeResponseCreateParams addToolsItem(RealtimeResponseCreateParamsToolsInner toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

 /**
   * How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function, like &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60;. 
   * @return toolChoice
  **/
  @JsonProperty("tool_choice")
  public String getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RealtimeResponseCreateParams toolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

 /**
   * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
   * @return temperature
  **/
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public RealtimeResponseCreateParams temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
   * Get maxResponseOutputTokens
   * @return maxResponseOutputTokens
  **/
  @JsonProperty("max_response_output_tokens")
  public RealtimeResponseCreateParamsMaxResponseOutputTokens getMaxResponseOutputTokens() {
    return maxResponseOutputTokens;
  }

  public void setMaxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
  }

  public RealtimeResponseCreateParams maxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
    return this;
  }

 /**
   * Get conversation
   * @return conversation
  **/
  @JsonProperty("conversation")
  public RealtimeResponseCreateParamsConversation getConversation() {
    return conversation;
  }

  public void setConversation(RealtimeResponseCreateParamsConversation conversation) {
    this.conversation = conversation;
  }

  public RealtimeResponseCreateParams conversation(RealtimeResponseCreateParamsConversation conversation) {
    this.conversation = conversation;
    return this;
  }

 /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public RealtimeResponseCreateParams metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
   * @return input
  **/
  @JsonProperty("input")
  public List<RealtimeConversationItem> getInput() {
    return input;
  }

  public void setInput(List<RealtimeConversationItem> input) {
    this.input = input;
  }

  public RealtimeResponseCreateParams input(List<RealtimeConversationItem> input) {
    this.input = input;
    return this;
  }

  public RealtimeResponseCreateParams addInputItem(RealtimeConversationItem inputItem) {
    this.input.add(inputItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

