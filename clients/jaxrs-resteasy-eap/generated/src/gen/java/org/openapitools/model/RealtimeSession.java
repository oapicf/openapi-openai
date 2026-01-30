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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner;
import org.openapitools.model.RealtimeSessionInputAudioTranscription;
import org.openapitools.model.RealtimeSessionModel;
import org.openapitools.model.RealtimeSessionTurnDetection;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Realtime session object configuration.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSession   {
  
  private String id;

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
  private RealtimeSessionModel model;
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

  /**
   * The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   */
  public enum InputAudioFormatEnum {
    PCM16("pcm16"),

        G711_ULAW("g711_ulaw"),

        G711_ALAW("g711_alaw");
    private String value;

    InputAudioFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private InputAudioFormatEnum inputAudioFormat;

  /**
   * The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
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
  }

  private OutputAudioFormatEnum outputAudioFormat;
  private RealtimeSessionInputAudioTranscription inputAudioTranscription;
  private RealtimeSessionTurnDetection turnDetection;
  private List<@Valid RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();
  private String toolChoice;
  private BigDecimal temperature;
  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  /**
   * Unique identifier for the session object. 
   **/
  
  @ApiModelProperty(value = "Unique identifier for the session object. ")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("model")
  public RealtimeSessionModel getModel() {
    return model;
  }
  public void setModel(RealtimeSessionModel model) {
    this.model = model;
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
  public InputAudioFormatEnum getInputAudioFormat() {
    return inputAudioFormat;
  }
  public void setInputAudioFormat(InputAudioFormatEnum inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
  }

  /**
   * The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   **/
  
  @ApiModelProperty(value = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")
  @JsonProperty("output_audio_format")
  public OutputAudioFormatEnum getOutputAudioFormat() {
    return outputAudioFormat;
  }
  public void setOutputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
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
  public RealtimeSessionTurnDetection getTurnDetection() {
    return turnDetection;
  }
  public void setTurnDetection(RealtimeSessionTurnDetection turnDetection) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

