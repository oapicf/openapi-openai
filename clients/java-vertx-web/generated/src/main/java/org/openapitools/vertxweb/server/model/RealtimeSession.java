package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.vertxweb.server.model.RealtimeResponseCreateParamsToolsInner;
import org.openapitools.vertxweb.server.model.RealtimeSessionInputAudioTranscription;
import org.openapitools.vertxweb.server.model.RealtimeSessionModel;
import org.openapitools.vertxweb.server.model.RealtimeSessionTurnDetection;

/**
 * Realtime session object configuration.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeSession   {
  
  private String id;


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
  private RealtimeSessionModel model;
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
      return value;
    }
  }

  private InputAudioFormatEnum inputAudioFormat;


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
      return value;
    }
  }

  private OutputAudioFormatEnum outputAudioFormat;
  private RealtimeSessionInputAudioTranscription inputAudioTranscription;
  private RealtimeSessionTurnDetection turnDetection;
  private List<RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();
  private String toolChoice;
  private BigDecimal temperature;
  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  public RealtimeSession () {

  }

  public RealtimeSession (String id, List<ModalitiesEnum> modalities, RealtimeSessionModel model, String instructions, VoiceEnum voice, InputAudioFormatEnum inputAudioFormat, OutputAudioFormatEnum outputAudioFormat, RealtimeSessionInputAudioTranscription inputAudioTranscription, RealtimeSessionTurnDetection turnDetection, List<RealtimeResponseCreateParamsToolsInner> tools, String toolChoice, BigDecimal temperature, RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.id = id;
    this.modalities = modalities;
    this.model = model;
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

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("modalities")
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }
  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

    
  @JsonProperty("model")
  public RealtimeSessionModel getModel() {
    return model;
  }
  public void setModel(RealtimeSessionModel model) {
    this.model = model;
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
  public InputAudioFormatEnum getInputAudioFormat() {
    return inputAudioFormat;
  }
  public void setInputAudioFormat(InputAudioFormatEnum inputAudioFormat) {
    this.inputAudioFormat = inputAudioFormat;
  }

    
  @JsonProperty("output_audio_format")
  public OutputAudioFormatEnum getOutputAudioFormat() {
    return outputAudioFormat;
  }
  public void setOutputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
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
  public RealtimeSessionTurnDetection getTurnDetection() {
    return turnDetection;
  }
  public void setTurnDetection(RealtimeSessionTurnDetection turnDetection) {
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
    RealtimeSession realtimeSession = (RealtimeSession) o;
    return Objects.equals(id, realtimeSession.id) &&
        Objects.equals(modalities, realtimeSession.modalities) &&
        Objects.equals(model, realtimeSession.model) &&
        Objects.equals(instructions, realtimeSession.instructions) &&
        Objects.equals(voice, realtimeSession.voice) &&
        Objects.equals(inputAudioFormat, realtimeSession.inputAudioFormat) &&
        Objects.equals(outputAudioFormat, realtimeSession.outputAudioFormat) &&
        Objects.equals(inputAudioTranscription, realtimeSession.inputAudioTranscription) &&
        Objects.equals(turnDetection, realtimeSession.turnDetection) &&
        Objects.equals(tools, realtimeSession.tools) &&
        Objects.equals(toolChoice, realtimeSession.toolChoice) &&
        Objects.equals(temperature, realtimeSession.temperature) &&
        Objects.equals(maxResponseOutputTokens, realtimeSession.maxResponseOutputTokens);
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
