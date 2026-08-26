package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
 */
public class RealtimeSessionInputAudioTranscription   {

    private String model;

    /**
     * Default constructor.
     */
    public RealtimeSessionInputAudioTranscription() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeSessionInputAudioTranscription.
     *
     * @param model The model to use for transcription, &#x60;whisper-1&#x60; is the only currently  supported model. 
     */
    public RealtimeSessionInputAudioTranscription(
        String model
    ) {
        this.model = model;
    }



    /**
     * The model to use for transcription, `whisper-1` is the only currently  supported model. 
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeSessionInputAudioTranscription {\n");
        
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

