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
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner;
import org.openapitools.model.RealtimeSessionCreateRequestTurnDetection;
import org.openapitools.model.RealtimeSessionInputAudioTranscription;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Realtime session object configuration.
 */

@Schema(name = "RealtimeSessionCreateRequest", description = "Realtime session object configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionCreateRequest {

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

  /**
   * The Realtime model used for this session. 
   */
  public enum ModelEnum {
    GPT_4O_REALTIME_PREVIEW("gpt-4o-realtime-preview"),
    
    GPT_4O_REALTIME_PREVIEW_2024_10_01("gpt-4o-realtime-preview-2024-10-01"),
    
    GPT_4O_REALTIME_PREVIEW_2024_12_17("gpt-4o-realtime-preview-2024-12-17"),
    
    GPT_4O_MINI_REALTIME_PREVIEW("gpt-4o-mini-realtime-preview"),
    
    GPT_4O_MINI_REALTIME_PREVIEW_2024_12_17("gpt-4o-mini-realtime-preview-2024-12-17");

    private final String value;

    ModelEnum(String value) {
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
    public static ModelEnum fromValue(String value) {
      for (ModelEnum b : ModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ModelEnum model;

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
   * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   */
  public enum InputAudioFormatEnum {
    PCM16("pcm16"),
    
    G711_ULAW("g711_ulaw"),
    
    G711_ALAW("g711_alaw");

    private final String value;

    InputAudioFormatEnum(String value) {
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
    public static InputAudioFormatEnum fromValue(String value) {
      for (InputAudioFormatEnum b : InputAudioFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable InputAudioFormatEnum inputAudioFormat;

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

  private @Nullable RealtimeSessionInputAudioTranscription inputAudioTranscription;

  private @Nullable RealtimeSessionCreateRequestTurnDetection turnDetection;

  @Valid
  private List<@Valid RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();

  private @Nullable String toolChoice;

  private @Nullable BigDecimal temperature;

  private @Nullable RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  public RealtimeSessionCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeSessionCreateRequest(ModelEnum model) {
    this.model = model;
  }

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
  
  @Schema(name = "modalities", description = "The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modalities")
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
  @NotNull 
  @Schema(name = "model", description = "The Realtime model used for this session. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public ModelEnum getModel() {
    return model;
  }

  public void setModel(ModelEnum model) {
    this.model = model;
  }

  public RealtimeSessionCreateRequest instructions(@Nullable String instructions) {
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

  public RealtimeSessionCreateRequest voice(@Nullable VoiceEnum voice) {
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

  public RealtimeSessionCreateRequest inputAudioFormat(@Nullable InputAudioFormatEnum inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
    return this;
  }

  /**
   * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   * @return inputAudioFormat
   */
  
  @Schema(name = "input_audio_format", description = "The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input_audio_format")
  public @Nullable InputAudioFormatEnum getInputAudioFormat() {
    return inputAudioFormat;
  }

  public void setInputAudioFormat(@Nullable InputAudioFormatEnum inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
  }

  public RealtimeSessionCreateRequest outputAudioFormat(@Nullable OutputAudioFormatEnum outputAudioFormat) {
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

  public RealtimeSessionCreateRequest inputAudioTranscription(@Nullable RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
    return this;
  }

  /**
   * Get inputAudioTranscription
   * @return inputAudioTranscription
   */
  @Valid 
  @Schema(name = "input_audio_transcription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input_audio_transcription")
  public @Nullable RealtimeSessionInputAudioTranscription getInputAudioTranscription() {
    return inputAudioTranscription;
  }

  public void setInputAudioTranscription(@Nullable RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
  }

  public RealtimeSessionCreateRequest turnDetection(@Nullable RealtimeSessionCreateRequestTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
    return this;
  }

  /**
   * Get turnDetection
   * @return turnDetection
   */
  @Valid 
  @Schema(name = "turn_detection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("turn_detection")
  public @Nullable RealtimeSessionCreateRequestTurnDetection getTurnDetection() {
    return turnDetection;
  }

  public void setTurnDetection(@Nullable RealtimeSessionCreateRequestTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
  }

  public RealtimeSessionCreateRequest tools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
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
  @Valid 
  @Schema(name = "tools", description = "Tools (functions) available to the model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tools")
  public List<@Valid RealtimeResponseCreateParamsToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
  }

  public RealtimeSessionCreateRequest toolChoice(@Nullable String toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

  /**
   * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
   * @return toolChoice
   */
  
  @Schema(name = "tool_choice", description = "How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tool_choice")
  public @Nullable String getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(@Nullable String toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RealtimeSessionCreateRequest temperature(@Nullable BigDecimal temperature) {
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

  public RealtimeSessionCreateRequest maxResponseOutputTokens(@Nullable RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
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

