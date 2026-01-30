package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.vertxweb.server.model.RealtimeResponseCreateParamsToolsInner;
import org.openapitools.vertxweb.server.model.RealtimeSessionCreateResponseClientSecret;
import org.openapitools.vertxweb.server.model.RealtimeSessionCreateResponseTurnDetection;
import org.openapitools.vertxweb.server.model.RealtimeSessionInputAudioTranscription;

/**
 * A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeSessionCreateResponse   {
  
  private RealtimeSessionCreateResponseClientSecret clientSecret;


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
      return value;
    }
  }

  private List<ModalitiesEnum> modalities = new ArrayList<>();
  private String instructions;


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
      return value;
    }
  }

  private VoiceEnum voice;
  private String inputAudioFormat;
  private String outputAudioFormat;
  private RealtimeSessionInputAudioTranscription inputAudioTranscription;
  private RealtimeSessionCreateResponseTurnDetection turnDetection;
  private List<RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();
  private String toolChoice;
  private BigDecimal temperature;
  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  public RealtimeSessionCreateResponse () {

  }

  public RealtimeSessionCreateResponse (RealtimeSessionCreateResponseClientSecret clientSecret, List<ModalitiesEnum> modalities, String instructions, VoiceEnum voice, String inputAudioFormat, String outputAudioFormat, RealtimeSessionInputAudioTranscription inputAudioTranscription, RealtimeSessionCreateResponseTurnDetection turnDetection, List<RealtimeResponseCreateParamsToolsInner> tools, String toolChoice, BigDecimal temperature, RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.clientSecret = clientSecret;
    this.modalities = modalities;
    this.instructions = instructions;
    this.voice = voice;
    this.inputAudioFormat = inputAudioFormat;
    this.outputAudioFormat = outputAudioFormat;
    this.inputAudioTranscription = inputAudioTranscription;
    this.turnDetection = turnDetection;
    this.tools = tools;
    this.toolChoice = toolChoice;
    this.temperature = temperature;
    this.maxResponseOutputTokens = maxResponseOutputTokens;
  }

    
  @JsonProperty("client_secret")
  public RealtimeSessionCreateResponseClientSecret getClientSecret() {
    return clientSecret;
  }
  public void setClientSecret(RealtimeSessionCreateResponseClientSecret clientSecret) {
    this.clientSecret = clientSecret;
  }

    
  @JsonProperty("modalities")
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }
  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

    
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

    
  @JsonProperty("voice")
  public VoiceEnum getVoice() {
    return voice;
  }
  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

    
  @JsonProperty("input_audio_format")
  public String getInputAudioFormat() {
    return inputAudioFormat;
  }
  public void setInputAudioFormat(String inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
  }

    
  @JsonProperty("output_audio_format")
  public String getOutputAudioFormat() {
    return outputAudioFormat;
  }
  public void setOutputAudioFormat(String outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }

    
  @JsonProperty("input_audio_transcription")
  public RealtimeSessionInputAudioTranscription getInputAudioTranscription() {
    return inputAudioTranscription;
  }
  public void setInputAudioTranscription(RealtimeSessionInputAudioTranscription inputAudioTranscription) {
    this.inputAudioTranscription = inputAudioTranscription;
  }

    
  @JsonProperty("turn_detection")
  public RealtimeSessionCreateResponseTurnDetection getTurnDetection() {
    return turnDetection;
  }
  public void setTurnDetection(RealtimeSessionCreateResponseTurnDetection turnDetection) {
    this.turnDetection = turnDetection;
  }

    
  @JsonProperty("tools")
  public List<RealtimeResponseCreateParamsToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
  }

    
  @JsonProperty("tool_choice")
  public String getToolChoice() {
    return toolChoice;
  }
  public void setToolChoice(String toolChoice) {
    this.toolChoice = toolChoice;
  }

    
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

    
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
