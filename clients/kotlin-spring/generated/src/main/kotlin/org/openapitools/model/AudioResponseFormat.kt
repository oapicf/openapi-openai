package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
* Values: json,text,srt,verbose_json,vtt
*/
enum class AudioResponseFormat(@get:JsonValue val value: kotlin.String) {

    json("json"),
    text("text"),
    srt("srt"),
    verbose_json("verbose_json"),
    vtt("vtt");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AudioResponseFormat {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AudioResponseFormat'")
        }
    }
}

