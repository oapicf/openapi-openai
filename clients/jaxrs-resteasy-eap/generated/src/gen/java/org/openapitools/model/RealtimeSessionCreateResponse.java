package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@ApiModel(description="A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionCreateResponse   {
  
  private RealtimeSessionCreateResponseClientSecret clientSecret;

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
  }

  private List<ModalitiesEnum> modalities = new ArrayList<>();
  private String instructions;

  /**
   * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;. 
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
  }

  private VoiceEnum voice;
  private String inputAudioFormat;
  private String outputAudioFormat;
  private RealtimeSessionInputAudioTranscription inputAudioTranscription;
  private RealtimeSessionCreateResponseTurnDetection turnDetection;
  private List<@Valid RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();
  private String toolChoice;
  private BigDecimal temperature;
  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("client_secret")
  public RealtimeSessionCreateResponseClientSecret getClientSecret() {
    return clientSecret;
  }
  public void setClientSecret(RealtimeSessionCreateResponseClientSecret clientSecret) {
    this.clientSecret = clientSecret;
  }

  /**
   * The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;]. 
   **/
  
  @ApiModelProperty(value = "The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. ")
  @JsonProperty("modalities")
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }
  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

  /**
   * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session. 
   **/
  
  @ApiModelProperty(value = "The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. ")
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;. 
   **/
  
  @ApiModelProperty(value = "The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. ")
  @JsonProperty("voice")
  public VoiceEnum getVoice() {
    return voice;
  }
  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  /**
   * The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   **/
  
  @ApiModelProperty(value = "The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")
  @JsonProperty("input_audio_format")
  public String getInputAudioFormat() {
    return inputAudioFormat;
  }
  public void setInputAudioFormat(String inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
  }

  /**
   * The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   **/
  
  @ApiModelProperty(value = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")
  @JsonProperty("output_audio_format")
  public String getOutputAudioFormat() {
    return outputAudioFormat;
  }
  public void setOutputAudioFormat(String outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("input_audio_transcription")
  public RealtimeSessionInputAudioTranscription getInputAudioTranscription() {
    return inputAudioTranscription;
  }
  public void setInputAudioTranscription(RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("turn_detection")
  public RealtimeSessionCreateResponseTurnDetection getTurnDetection() {
    return turnDetection;
  }
  public void setTurnDetection(RealtimeSessionCreateResponseTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
  }

  /**
   * Tools (functions) available to the model.
   **/
  
  @ApiModelProperty(value = "Tools (functions) available to the model.")
  @JsonProperty("tools")
  public List<@Valid RealtimeResponseCreateParamsToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
  }

  /**
   * How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function. 
   **/
  
  @ApiModelProperty(value = "How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. ")
  @JsonProperty("tool_choice")
  public String getToolChoice() {
    return toolChoice;
  }
  public void setToolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
  }

  /**
   * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
   **/
  
  @ApiModelProperty(value = "Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. ")
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("max_response_output_tokens")
  public RealtimeResponseCreateParamsMaxResponseOutputTokens getMaxResponseOutputTokens() {
    return maxResponseOutputTokens;
  }
  public void setMaxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

