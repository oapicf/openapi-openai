package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import com.prokarma.pkmst.model.RealtimeResponseCreateParamsToolsInner;
import com.prokarma.pkmst.model.RealtimeSessionCreateRequestTurnDetection;
import com.prokarma.pkmst.model.RealtimeSessionInputAudioTranscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Realtime session object configuration.
 */
@ApiModel(description = "Realtime session object configuration.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionCreateRequest   {
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

  /**
   * The Realtime model used for this session. 
   */
  public enum ModelEnum {
    GPT_4O_REALTIME_PREVIEW("gpt-4o-realtime-preview"),
    
    GPT_4O_REALTIME_PREVIEW_2024_10_01("gpt-4o-realtime-preview-2024-10-01"),
    
    GPT_4O_REALTIME_PREVIEW_2024_12_17("gpt-4o-realtime-preview-2024-12-17"),
    
    GPT_4O_MINI_REALTIME_PREVIEW("gpt-4o-mini-realtime-preview"),
    
    GPT_4O_MINI_REALTIME_PREVIEW_2024_12_17("gpt-4o-mini-realtime-preview-2024-12-17");

    private String value;

    ModelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModelEnum fromValue(String text) {
      for (ModelEnum b : ModelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("model")
  private ModelEnum model;

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
   * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
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

    @JsonCreator
    public static InputAudioFormatEnum fromValue(String text) {
      for (InputAudioFormatEnum b : InputAudioFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("input_audio_format")
  private InputAudioFormatEnum inputAudioFormat;

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

  @JsonProperty("input_audio_transcription")
  private RealtimeSessionInputAudioTranscription inputAudioTranscription;

  @JsonProperty("turn_detection")
  private RealtimeSessionCreateRequestTurnDetection turnDetection;

  @JsonProperty("tools")
  
  private List<RealtimeResponseCreateParamsToolsInner> tools = null;

  @JsonProperty("tool_choice")
  private String toolChoice;

  @JsonProperty("temperature")
  private BigDecimal temperature;

  @JsonProperty("max_response_output_tokens")
  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  public RealtimeSessionCreateRequest modalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
    return this;
  }

  public RealtimeSessionCreateRequest addModalitiesItem(ModalitiesEnum modalitiesItem) {
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

  public RealtimeSessionCreateRequest model(ModelEnum model) {
    this.model = model;
    return this;
  }

  /**
   * The Realtime model used for this session. 
   * @return model
   */
  @ApiModelProperty(required = true, value = "The Realtime model used for this session. ")
  public ModelEnum getModel() {
    return model;
  }

  public void setModel(ModelEnum model) {
    this.model = model;
  }

  public RealtimeSessionCreateRequest instructions(String instructions) {
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

  public RealtimeSessionCreateRequest voice(VoiceEnum voice) {
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

  public RealtimeSessionCreateRequest inputAudioFormat(InputAudioFormatEnum inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
    return this;
  }

  /**
   * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   * @return inputAudioFormat
   */
  @ApiModelProperty(value = "The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ")
  public InputAudioFormatEnum getInputAudioFormat() {
    return inputAudioFormat;
  }

  public void setInputAudioFormat(InputAudioFormatEnum inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
  }

  public RealtimeSessionCreateRequest outputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
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

  public RealtimeSessionCreateRequest inputAudioTranscription(RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
    return this;
  }

  /**
   * Get inputAudioTranscription
   * @return inputAudioTranscription
   */
  @ApiModelProperty(value = "")
  public RealtimeSessionInputAudioTranscription getInputAudioTranscription() {
    return inputAudioTranscription;
  }

  public void setInputAudioTranscription(RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
  }

  public RealtimeSessionCreateRequest turnDetection(RealtimeSessionCreateRequestTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
    return this;
  }

  /**
   * Get turnDetection
   * @return turnDetection
   */
  @ApiModelProperty(value = "")
  public RealtimeSessionCreateRequestTurnDetection getTurnDetection() {
    return turnDetection;
  }

  public void setTurnDetection(RealtimeSessionCreateRequestTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
  }

  public RealtimeSessionCreateRequest tools(List<RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public RealtimeSessionCreateRequest addToolsItem(RealtimeResponseCreateParamsToolsInner toolsItem) {
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

  public RealtimeSessionCreateRequest toolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

  /**
   * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
   * @return toolChoice
   */
  @ApiModelProperty(value = "How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. ")
  public String getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RealtimeSessionCreateRequest temperature(BigDecimal temperature) {
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

  public RealtimeSessionCreateRequest maxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeSessionCreateRequest realtimeSessionCreateRequest = (RealtimeSessionCreateRequest) o;
    return Objects.equals(this.modalities, realtimeSessionCreateRequest.modalities) &&
        Objects.equals(this.model, realtimeSessionCreateRequest.model) &&
        Objects.equals(this.instructions, realtimeSessionCreateRequest.instructions) &&
        Objects.equals(this.voice, realtimeSessionCreateRequest.voice) &&
        Objects.equals(this.inputAudioFormat, realtimeSessionCreateRequest.inputAudioFormat) &&
        Objects.equals(this.outputAudioFormat, realtimeSessionCreateRequest.outputAudioFormat) &&
        Objects.equals(this.inputAudioTranscription, realtimeSessionCreateRequest.inputAudioTranscription) &&
        Objects.equals(this.turnDetection, realtimeSessionCreateRequest.turnDetection) &&
        Objects.equals(this.tools, realtimeSessionCreateRequest.tools) &&
        Objects.equals(this.toolChoice, realtimeSessionCreateRequest.toolChoice) &&
        Objects.equals(this.temperature, realtimeSessionCreateRequest.temperature) &&
        Objects.equals(this.maxResponseOutputTokens, realtimeSessionCreateRequest.maxResponseOutputTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modalities, model, instructions, voice, inputAudioFormat, outputAudioFormat, inputAudioTranscription, turnDetection, tools, toolChoice, temperature, maxResponseOutputTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeSessionCreateRequest {\n");
    
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

