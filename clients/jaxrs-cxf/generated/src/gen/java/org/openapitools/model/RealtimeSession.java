package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner;
import org.openapitools.model.RealtimeSessionInputAudioTranscription;
import org.openapitools.model.RealtimeSessionModel;
import org.openapitools.model.RealtimeSessionTurnDetection;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Realtime session object configuration.
 */
@ApiModel(description="Realtime session object configuration.")

public class RealtimeSession  {
  
 /**
  * Unique identifier for the session object. 
  */
  @ApiModelProperty(value = "Unique identifier for the session object. ")

  private String id;

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

 /**
  * The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  */
  @ApiModelProperty(value = "The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. ")

  private List<ModalitiesEnum> modalities = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private RealtimeSessionModel model;

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
    @JsonValue
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

 /**
  * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  */
  @ApiModelProperty(value = "The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. ")

  private VoiceEnum voice;

public enum InputAudioFormatEnum {

PCM16(String.valueOf("pcm16")), G711_ULAW(String.valueOf("g711_ulaw")), G711_ALAW(String.valueOf("g711_alaw"));


    private String value;

    InputAudioFormatEnum (String v) {
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
    public static InputAudioFormatEnum fromValue(String value) {
        for (InputAudioFormatEnum b : InputAudioFormatEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  */
  @ApiModelProperty(value = "The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")

  private InputAudioFormatEnum inputAudioFormat;

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

 /**
  * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  */
  @ApiModelProperty(value = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")

  private OutputAudioFormatEnum outputAudioFormat;

  @ApiModelProperty(value = "")

  @Valid

  private RealtimeSessionInputAudioTranscription inputAudioTranscription;

  @ApiModelProperty(value = "")

  @Valid

  private RealtimeSessionTurnDetection turnDetection;

 /**
  * Tools (functions) available to the model.
  */
  @ApiModelProperty(value = "Tools (functions) available to the model.")

  @Valid

  private List<@Valid RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();

 /**
  * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
  */
  @ApiModelProperty(value = "How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. ")

  private String toolChoice;

 /**
  * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
  */
  @ApiModelProperty(value = "Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. ")

  @Valid

  private BigDecimal temperature;

  @ApiModelProperty(value = "")

  @Valid

  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;
 /**
   * Unique identifier for the session object. 
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RealtimeSession id(String id) {
    this.id = id;
    return this;
  }

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

  public RealtimeSession modalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
    return this;
  }

  public RealtimeSession addModalitiesItem(ModalitiesEnum modalitiesItem) {
    this.modalities.add(modalitiesItem);
    return this;
  }

 /**
   * Get model
   * @return model
  **/
  @JsonProperty("model")
  public RealtimeSessionModel getModel() {
    return model;
  }

  public void setModel(RealtimeSessionModel model) {
    this.model = model;
  }

  public RealtimeSession model(RealtimeSessionModel model) {
    this.model = model;
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

  public RealtimeSession instructions(String instructions) {
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

  public RealtimeSession voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

 /**
   * The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   * @return inputAudioFormat
  **/
  @JsonProperty("input_audio_format")
  public String getInputAudioFormat() {
    if (inputAudioFormat == null) {
      return null;
    }
    return inputAudioFormat.value();
  }

  public void setInputAudioFormat(InputAudioFormatEnum inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
  }

  public RealtimeSession inputAudioFormat(InputAudioFormatEnum inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
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

  public RealtimeSession outputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
    return this;
  }

 /**
   * Get inputAudioTranscription
   * @return inputAudioTranscription
  **/
  @JsonProperty("input_audio_transcription")
  public RealtimeSessionInputAudioTranscription getInputAudioTranscription() {
    return inputAudioTranscription;
  }

  public void setInputAudioTranscription(RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
  }

  public RealtimeSession inputAudioTranscription(RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
    return this;
  }

 /**
   * Get turnDetection
   * @return turnDetection
  **/
  @JsonProperty("turn_detection")
  public RealtimeSessionTurnDetection getTurnDetection() {
    return turnDetection;
  }

  public void setTurnDetection(RealtimeSessionTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
  }

  public RealtimeSession turnDetection(RealtimeSessionTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
    return this;
  }

 /**
   * Tools (functions) available to the model.
   * @return tools
  **/
  @JsonProperty("tools")
  public List<@Valid RealtimeResponseCreateParamsToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
  }

  public RealtimeSession tools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public RealtimeSession addToolsItem(RealtimeResponseCreateParamsToolsInner toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

 /**
   * How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function. 
   * @return toolChoice
  **/
  @JsonProperty("tool_choice")
  public String getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RealtimeSession toolChoice(String toolChoice) {
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

  public RealtimeSession temperature(BigDecimal temperature) {
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

  public RealtimeSession maxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
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
    RealtimeSession realtimeSession = (RealtimeSession) o;
    return Objects.equals(this.id, realtimeSession.id) &&
        Objects.equals(this.modalities, realtimeSession.modalities) &&
        Objects.equals(this.model, realtimeSession.model) &&
        Objects.equals(this.instructions, realtimeSession.instructions) &&
        Objects.equals(this.voice, realtimeSession.voice) &&
        Objects.equals(this.inputAudioFormat, realtimeSession.inputAudioFormat) &&
        Objects.equals(this.outputAudioFormat, realtimeSession.outputAudioFormat) &&
        Objects.equals(this.inputAudioTranscription, realtimeSession.inputAudioTranscription) &&
        Objects.equals(this.turnDetection, realtimeSession.turnDetection) &&
        Objects.equals(this.tools, realtimeSession.tools) &&
        Objects.equals(this.toolChoice, realtimeSession.toolChoice) &&
        Objects.equals(this.temperature, realtimeSession.temperature) &&
        Objects.equals(this.maxResponseOutputTokens, realtimeSession.maxResponseOutputTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, modalities, model, instructions, voice, inputAudioFormat, outputAudioFormat, inputAudioTranscription, turnDetection, tools, toolChoice, temperature, maxResponseOutputTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modalities: ").append(toIndentedString(modalities)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    inputAudioFormat: ").append(toIndentedString(inputAudioFormat)).append("\n");
    sb.append("    outputAudioFormat: ").append(toIndentedString(outputAudioFormat)).append("\n");
    sb.append("    inputAudioTranscription: ").append(toIndentedString(inputAudioTranscription)).append("\n");
    sb.append("    turnDetection: ").append(toIndentedString(turnDetection)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    maxResponseOutputTokens: ").append(toIndentedString(maxResponseOutputTokens)).append("\n");
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

