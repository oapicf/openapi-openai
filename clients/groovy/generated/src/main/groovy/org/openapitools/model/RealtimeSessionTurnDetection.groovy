package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class RealtimeSessionTurnDetection {

    enum TypeEnum {
    
        SERVER_VAD("server_vad")
    
        private final String value
    
        TypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* Type of turn detection, only `server_vad` is currently supported.  */
    TypeEnum type
    /* Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  */
    BigDecimal threshold
    /* Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  */
    Integer prefixPaddingMs
    /* Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  */
    Integer silenceDurationMs
}
