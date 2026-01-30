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
import org.openapitools.model.RealtimeSessionCreateResponseClientSecret;
import org.openapitools.model.RealtimeSessionCreateResponseTurnDetection;
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
 * A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
 */

@Schema(name = "RealtimeSessionCreateResponse", description = "A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionCreateResponse {

  private @Nullable RealtimeSessionCreateResponseClientSecret clientSecret;

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

  private @Nullable String inputAudioFormat;

  private @Nullable String outputAudioFormat;

  private @Nullable RealtimeSessionInputAudioTranscription inputAudioTranscription;

  private @Nullable RealtimeSessionCreateResponseTurnDetection turnDetection;

  @Valid
  private List<@Valid RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();

  private @Nullable String toolChoice;

  private @Nullable BigDecimal temperature;

  private @Nullable RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  public RealtimeSessionCreateResponse clientSecret(@Nullable RealtimeSessionCreateResponseClientSecret clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Get clientSecret
   * @return clientSecret
   */
  @Valid 
  @Schema(name = "client_secret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client_secret")
  public @Nullable RealtimeSessionCreateResponseClientSecret getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(@Nullable RealtimeSessionCreateResponseClientSecret clientSecret) {
    this.clientSecret = clientSecret;
  }

  public RealtimeSessionCreateResponse modalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
    return this;
  }

  public RealtimeSessionCreateResponse addModalitiesItem(ModalitiesEnum modalitiesItem) {
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

  public RealtimeSessionCreateResponse instructions(@Nullable String instructions) {
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

  public RealtimeSessionCreateResponse voice(@Nullable VoiceEnum voice) {
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

  public RealtimeSessionCreateResponse inputAudioFormat(@Nullable String inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
    return this;
  }

  /**
   * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   * @return inputAudioFormat
   */
  
  @Schema(name = "input_audio_format", description = "The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input_audio_format")
  public @Nullable String getInputAudioFormat() {
    return inputAudioFormat;
  }

  public void setInputAudioFormat(@Nullable String inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
  }

  public RealtimeSessionCreateResponse outputAudioFormat(@Nullable String outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
    return this;
  }

  /**
   * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   * @return outputAudioFormat
   */
  
  @Schema(name = "output_audio_format", description = "The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output_audio_format")
  public @Nullable String getOutputAudioFormat() {
    return outputAudioFormat;
  }

  public void setOutputAudioFormat(@Nullable String outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }

  public RealtimeSessionCreateResponse inputAudioTranscription(@Nullable RealtimeSessionInputAudioTranscription inputAudioTranscription) {
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

  public RealtimeSessionCreateResponse turnDetection(@Nullable RealtimeSessionCreateResponseTurnDetection turnDetection) {
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
  public @Nullable RealtimeSessionCreateResponseTurnDetection getTurnDetection() {
    return turnDetection;
  }

  public void setTurnDetection(@Nullable RealtimeSessionCreateResponseTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
  }

  public RealtimeSessionCreateResponse tools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public RealtimeSessionCreateResponse addToolsItem(RealtimeResponseCreateParamsToolsInner toolsItem) {
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

  public RealtimeSessionCreateResponse toolChoice(@Nullable String toolChoice) {
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

  public RealtimeSessionCreateResponse temperature(@Nullable BigDecimal temperature) {
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

  public RealtimeSessionCreateResponse maxResponseOutputTokens(@Nullable RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
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

