package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner;
import org.openapitools.model.RealtimeSessionCreateResponseClientSecret;
import org.openapitools.model.RealtimeSessionCreateResponseTurnDetection;
import org.openapitools.model.RealtimeSessionInputAudioTranscription;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
 */
@ApiModel(description="A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. ")

public class RealtimeSessionCreateResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private RealtimeSessionCreateResponseClientSecret clientSecret;

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

 /**
  * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  */
  @ApiModelProperty(value = "The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")

  private String inputAudioFormat;

 /**
  * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  */
  @ApiModelProperty(value = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")

  private String outputAudioFormat;

  @ApiModelProperty(value = "")

  @Valid

  private RealtimeSessionInputAudioTranscription inputAudioTranscription;

  @ApiModelProperty(value = "")

  @Valid

  private RealtimeSessionCreateResponseTurnDetection turnDetection;

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
   * Get clientSecret
   * @return clientSecret
  **/
  @JsonProperty("client_secret")
  public RealtimeSessionCreateResponseClientSecret getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(RealtimeSessionCreateResponseClientSecret clientSecret) {
    this.clientSecret = clientSecret;
  }

  public RealtimeSessionCreateResponse clientSecret(RealtimeSessionCreateResponseClientSecret clientSecret) {
    this.clientSecret = clientSecret;
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

  public RealtimeSessionCreateResponse modalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
    return this;
  }

  public RealtimeSessionCreateResponse addModalitiesItem(ModalitiesEnum modalitiesItem) {
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

  public RealtimeSessionCreateResponse instructions(String instructions) {
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

  public RealtimeSessionCreateResponse voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

 /**
   * The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   * @return inputAudioFormat
  **/
  @JsonProperty("input_audio_format")
  public String getInputAudioFormat() {
    return inputAudioFormat;
  }

  public void setInputAudioFormat(String inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
  }

  public RealtimeSessionCreateResponse inputAudioFormat(String inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
    return this;
  }

 /**
   * The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   * @return outputAudioFormat
  **/
  @JsonProperty("output_audio_format")
  public String getOutputAudioFormat() {
    return outputAudioFormat;
  }

  public void setOutputAudioFormat(String outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }

  public RealtimeSessionCreateResponse outputAudioFormat(String outputAudioFormat) {
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

  public RealtimeSessionCreateResponse inputAudioTranscription(RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
    return this;
  }

 /**
   * Get turnDetection
   * @return turnDetection
  **/
  @JsonProperty("turn_detection")
  public RealtimeSessionCreateResponseTurnDetection getTurnDetection() {
    return turnDetection;
  }

  public void setTurnDetection(RealtimeSessionCreateResponseTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
  }

  public RealtimeSessionCreateResponse turnDetection(RealtimeSessionCreateResponseTurnDetection turnDetection) {
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

  public RealtimeSessionCreateResponse tools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public RealtimeSessionCreateResponse addToolsItem(RealtimeResponseCreateParamsToolsInner toolsItem) {
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

  public RealtimeSessionCreateResponse toolChoice(String toolChoice) {
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

  public RealtimeSessionCreateResponse temperature(BigDecimal temperature) {
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

  public RealtimeSessionCreateResponse maxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
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
    RealtimeSessionCreateResponse realtimeSessionCreateResponse = (RealtimeSessionCreateResponse) o;
    return Objects.equals(this.clientSecret, realtimeSessionCreateResponse.clientSecret) &&
        Objects.equals(this.modalities, realtimeSessionCreateResponse.modalities) &&
        Objects.equals(this.instructions, realtimeSessionCreateResponse.instructions) &&
        Objects.equals(this.voice, realtimeSessionCreateResponse.voice) &&
        Objects.equals(this.inputAudioFormat, realtimeSessionCreateResponse.inputAudioFormat) &&
        Objects.equals(this.outputAudioFormat, realtimeSessionCreateResponse.outputAudioFormat) &&
        Objects.equals(this.inputAudioTranscription, realtimeSessionCreateResponse.inputAudioTranscription) &&
        Objects.equals(this.turnDetection, realtimeSessionCreateResponse.turnDetection) &&
        Objects.equals(this.tools, realtimeSessionCreateResponse.tools) &&
        Objects.equals(this.toolChoice, realtimeSessionCreateResponse.toolChoice) &&
        Objects.equals(this.temperature, realtimeSessionCreateResponse.temperature) &&
        Objects.equals(this.maxResponseOutputTokens, realtimeSessionCreateResponse.maxResponseOutputTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSecret, modalities, instructions, voice, inputAudioFormat, outputAudioFormat, inputAudioTranscription, turnDetection, tools, toolChoice, temperature, maxResponseOutputTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeSessionCreateResponse {\n");
    
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    modalities: ").append(toIndentedString(modalities)).append("\n");
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

