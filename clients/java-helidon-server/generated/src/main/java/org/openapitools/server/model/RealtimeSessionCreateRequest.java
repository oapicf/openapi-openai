package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.server.model.RealtimeResponseCreateParamsToolsInner;
import org.openapitools.server.model.RealtimeSessionCreateRequestTurnDetection;
import org.openapitools.server.model.RealtimeSessionInputAudioTranscription;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Realtime session object configuration.
 */
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        private String value;

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
        public static ModelEnum fromValue(String text) {
            for (ModelEnum b : ModelEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ModelEnum model;
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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


    private OutputAudioFormatEnum outputAudioFormat;
    private RealtimeSessionInputAudioTranscription inputAudioTranscription;
    private RealtimeSessionCreateRequestTurnDetection turnDetection;
    private List<@Valid RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();
    private String toolChoice;
    private BigDecimal temperature;
    private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

    /**
     * Default constructor.
     */
    public RealtimeSessionCreateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeSessionCreateRequest.
     *
     * @param modalities The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;]. 
     * @param model The Realtime model used for this session. 
     * @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session. 
     * @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;. 
     * @param inputAudioFormat The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
     * @param outputAudioFormat The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
     * @param inputAudioTranscription inputAudioTranscription
     * @param turnDetection turnDetection
     * @param tools Tools (functions) available to the model.
     * @param toolChoice How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function. 
     * @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
     * @param maxResponseOutputTokens maxResponseOutputTokens
     */
    public RealtimeSessionCreateRequest(
        List<ModalitiesEnum> modalities, 
        ModelEnum model, 
        String instructions, 
        VoiceEnum voice, 
        InputAudioFormatEnum inputAudioFormat, 
        OutputAudioFormatEnum outputAudioFormat, 
        RealtimeSessionInputAudioTranscription inputAudioTranscription, 
        RealtimeSessionCreateRequestTurnDetection turnDetection, 
        List<@Valid RealtimeResponseCreateParamsToolsInner> tools, 
        String toolChoice, 
        BigDecimal temperature, 
        RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens
    ) {
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



    /**
     * The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
     * @return modalities
     */
    public List<ModalitiesEnum> getModalities() {
        return modalities;
    }

    public void setModalities(List<ModalitiesEnum> modalities) {
        this.modalities = modalities;
    }

    /**
     * The Realtime model used for this session. 
     * @return model
     */
    public ModelEnum getModel() {
        return model;
    }

    public void setModel(ModelEnum model) {
        this.model = model;
    }

    /**
     * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
     * @return instructions
     */
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
     * @return voice
     */
    public VoiceEnum getVoice() {
        return voice;
    }

    public void setVoice(VoiceEnum voice) {
        this.voice = voice;
    }

    /**
     * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
     * @return inputAudioFormat
     */
    public InputAudioFormatEnum getInputAudioFormat() {
        return inputAudioFormat;
    }

    public void setInputAudioFormat(InputAudioFormatEnum inputAudioFormat) {
        this.inputAudioFormat = inputAudioFormat;
    }

    /**
     * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
     * @return outputAudioFormat
     */
    public OutputAudioFormatEnum getOutputAudioFormat() {
        return outputAudioFormat;
    }

    public void setOutputAudioFormat(OutputAudioFormatEnum outputAudioFormat) {
        this.outputAudioFormat = outputAudioFormat;
    }

    /**
     * Get inputAudioTranscription
     * @return inputAudioTranscription
     */
    public RealtimeSessionInputAudioTranscription getInputAudioTranscription() {
        return inputAudioTranscription;
    }

    public void setInputAudioTranscription(RealtimeSessionInputAudioTranscription inputAudioTranscription) {
        this.inputAudioTranscription = inputAudioTranscription;
    }

    /**
     * Get turnDetection
     * @return turnDetection
     */
    public RealtimeSessionCreateRequestTurnDetection getTurnDetection() {
        return turnDetection;
    }

    public void setTurnDetection(RealtimeSessionCreateRequestTurnDetection turnDetection) {
        this.turnDetection = turnDetection;
    }

    /**
     * Tools (functions) available to the model.
     * @return tools
     */
    public List<@Valid RealtimeResponseCreateParamsToolsInner> getTools() {
        return tools;
    }

    public void setTools(List<@Valid RealtimeResponseCreateParamsToolsInner> tools) {
        this.tools = tools;
    }

    /**
     * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
     * @return toolChoice
     */
    public String getToolChoice() {
        return toolChoice;
    }

    public void setToolChoice(String toolChoice) {
        this.toolChoice = toolChoice;
    }

    /**
     * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
     * @return temperature
     */
    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    /**
     * Get maxResponseOutputTokens
     * @return maxResponseOutputTokens
     */
    public RealtimeResponseCreateParamsMaxResponseOutputTokens getMaxResponseOutputTokens() {
        return maxResponseOutputTokens;
    }

    public void setMaxResponseOutputTokens(RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
        this.maxResponseOutputTokens = maxResponseOutputTokens;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

