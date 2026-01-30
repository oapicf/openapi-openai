package apimodels;

import apimodels.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import apimodels.RealtimeResponseCreateParamsToolsInner;
import apimodels.RealtimeSessionCreateResponseClientSecret;
import apimodels.RealtimeSessionCreateResponseTurnDetection;
import apimodels.RealtimeSessionInputAudioTranscription;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeSessionCreateResponse   {
  @JsonProperty("client_secret")
  @Valid

  private RealtimeSessionCreateResponseClientSecret clientSecret;

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

    private final String value;

    VoiceEnum(String value) {
      this.value = value;
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

  @JsonProperty("voice")
  
  private VoiceEnum voice;

  @JsonProperty("input_audio_format")
  
  private String inputAudioFormat;

  @JsonProperty("output_audio_format")
  
  private String outputAudioFormat;

  @JsonProperty("input_audio_transcription")
  @Valid

  private RealtimeSessionInputAudioTranscription inputAudioTranscription;

  @JsonProperty("turn_detection")
  @Valid

  private RealtimeSessionCreateResponseTurnDetection turnDetection;

  @JsonProperty("tools")
  @Valid

  private List<@Valid RealtimeResponseCreateParamsToolsInner> tools = null;

  @JsonProperty("tool_choice")
  
  private String toolChoice;

  @JsonProperty("temperature")
  @Valid

  private BigDecimal temperature;

  @JsonProperty("max_response_output_tokens")
  @Valid

  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  public RealtimeSessionCreateResponse clientSecret(RealtimeSessionCreateResponseClientSecret clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  public RealtimeSessionCreateResponseClientSecret getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(RealtimeSessionCreateResponseClientSecret clientSecret) {
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
  **/
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }

  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

  public RealtimeSessionCreateResponse instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
   * @return instructions
  **/
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public RealtimeSessionCreateResponse voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

   /**
   * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
   * @return voice
  **/
  public VoiceEnum getVoice() {
    return voice;
  }

  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  public RealtimeSessionCreateResponse inputAudioFormat(String inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
    return this;
  }

   /**
   * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   * @return inputAudioFormat
  **/
  public String getInputAudioFormat() {
    return inputAudioFormat;
  }

  public void setInputAudioFormat(String inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
  }

  public RealtimeSessionCreateResponse outputAudioFormat(String outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
    return this;
  }

   /**
   * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
   * @return outputAudioFormat
  **/
  public String getOutputAudioFormat() {
    return outputAudioFormat;
  }

  public void setOutputAudioFormat(String outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }

  public RealtimeSessionCreateResponse inputAudioTranscription(RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
    return this;
  }

   /**
   * Get inputAudioTranscription
   * @return inputAudioTranscription
  **/
  public RealtimeSessionInputAudioTranscription getInputAudioTranscription() {
    return inputAudioTranscription;
  }

  public void setInputAudioTranscription(RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
  }

  public RealtimeSessionCreateResponse turnDetection(RealtimeSessionCreateResponseTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
    return this;
  }

   /**
   * Get turnDetection
   * @return turnDetection
  **/
  public RealtimeSessionCreateResponseTurnDetection getTurnDetection() {
    return turnDetection;
  }

  public void setTurnDetection(RealtimeSessionCreateResponseTurnDetection turnDetection) {
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
  **/
  public List<@Valid RealtimeResponseCreateParamsToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
  }

  public RealtimeSessionCreateResponse toolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

   /**
   * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
   * @return toolChoice
  **/
  public String getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RealtimeSessionCreateResponse temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
   * @return temperature
  **/
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public RealtimeSessionCreateResponse maxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
    return this;
  }

   /**
   * Get maxResponseOutputTokens
   * @return maxResponseOutputTokens
  **/
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
    return Objects.equals(clientSecret, realtimeSessionCreateResponse.clientSecret) &&
        Objects.equals(modalities, realtimeSessionCreateResponse.modalities) &&
        Objects.equals(instructions, realtimeSessionCreateResponse.instructions) &&
        Objects.equals(voice, realtimeSessionCreateResponse.voice) &&
        Objects.equals(inputAudioFormat, realtimeSessionCreateResponse.inputAudioFormat) &&
        Objects.equals(outputAudioFormat, realtimeSessionCreateResponse.outputAudioFormat) &&
        Objects.equals(inputAudioTranscription, realtimeSessionCreateResponse.inputAudioTranscription) &&
        Objects.equals(turnDetection, realtimeSessionCreateResponse.turnDetection) &&
        Objects.equals(tools, realtimeSessionCreateResponse.tools) &&
        Objects.equals(toolChoice, realtimeSessionCreateResponse.toolChoice) &&
        Objects.equals(temperature, realtimeSessionCreateResponse.temperature) &&
        Objects.equals(maxResponseOutputTokens, realtimeSessionCreateResponse.maxResponseOutputTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSecret, modalities, instructions, voice, inputAudioFormat, outputAudioFormat, inputAudioTranscription, turnDetection, tools, toolChoice, temperature, maxResponseOutputTokens);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

