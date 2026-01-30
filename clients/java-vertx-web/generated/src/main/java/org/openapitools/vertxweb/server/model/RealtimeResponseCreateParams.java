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
import org.openapitools.vertxweb.server.model.RealtimeConversationItem;
import org.openapitools.vertxweb.server.model.RealtimeResponseCreateParamsConversation;
import org.openapitools.vertxweb.server.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.vertxweb.server.model.RealtimeResponseCreateParamsToolsInner;

/**
 * Create a new Realtime response with these parameters
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeResponseCreateParams   {
  


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
  private List<RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();
  private String toolChoice;
  private BigDecimal temperature;
  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;
  private RealtimeResponseCreateParamsConversation conversation;
  private Object metadata;
  private List<RealtimeConversationItem> input = new ArrayList<>();

  public RealtimeResponseCreateParams () {

  }

  public RealtimeResponseCreateParams (List<ModalitiesEnum> modalities, String instructions, VoiceEnum voice, OutputAudioFormatEnum outputAudioFormat, List<RealtimeResponseCreateParamsToolsInner> tools, String toolChoice, BigDecimal temperature, RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens, RealtimeResponseCreateParamsConversation conversation, Object metadata, List<RealtimeConversationItem> input) {
    this.modalities = modalities;
    this.instructions = instructions;
    this.voice = voice;
    this.outputAudioFormat = outputAudioFormat;
    this.tools = tools;
    this.toolChoice = toolChoice;
    this.temperature = temperature;
    this.maxResponseOutputTokens = maxResponseOutputTokens;
    this.conversation = conversation;
    this.metadata = metadata;
    this.input = input;
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

    
  @JsonProperty("output_audio_format")
  public OutputAudioFormatEnum getOutputAudioFormat() {
    return outputAudioFormat;
  }
  public void setOutputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
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

    
  @JsonProperty("conversation")
  public RealtimeResponseCreateParamsConversation getConversation() {
    return conversation;
  }
  public void setConversation(RealtimeResponseCreateParamsConversation conversation) {
    this.conversation = conversation;
  }

    
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

    
  @JsonProperty("input")
  public List<RealtimeConversationItem> getInput() {
    return input;
  }
  public void setInput(List<RealtimeConversationItem> input) {
    this.input = input;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseCreateParams realtimeResponseCreateParams = (RealtimeResponseCreateParams) o;
    return Objects.equals(modalities, realtimeResponseCreateParams.modalities) &&
        Objects.equals(instructions, realtimeResponseCreateParams.instructions) &&
        Objects.equals(voice, realtimeResponseCreateParams.voice) &&
        Objects.equals(outputAudioFormat, realtimeResponseCreateParams.outputAudioFormat) &&
        Objects.equals(tools, realtimeResponseCreateParams.tools) &&
        Objects.equals(toolChoice, realtimeResponseCreateParams.toolChoice) &&
        Objects.equals(temperature, realtimeResponseCreateParams.temperature) &&
        Objects.equals(maxResponseOutputTokens, realtimeResponseCreateParams.maxResponseOutputTokens) &&
        Objects.equals(conversation, realtimeResponseCreateParams.conversation) &&
        Objects.equals(metadata, realtimeResponseCreateParams.metadata) &&
        Objects.equals(input, realtimeResponseCreateParams.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modalities, instructions, voice, outputAudioFormat, tools, toolChoice, temperature, maxResponseOutputTokens, conversation, metadata, input);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseCreateParams {\n");
    
    sb.append("    modalities: ").append(toIndentedString(modalities)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    outputAudioFormat: ").append(toIndentedString(outputAudioFormat)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    maxResponseOutputTokens: ").append(toIndentedString(maxResponseOutputTokens)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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
