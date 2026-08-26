package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.StaticChunkingStrategy
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
 * 
 * @param type Always `static`.
 * @param static 
 */
data class StaticChunkingStrategyRequestParam(

    @Schema(required = true, description = "Always `static`.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: StaticChunkingStrategyRequestParam.Type,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("static")
    @get:JsonProperty("static", required = true) val static: StaticChunkingStrategy
) : ChunkingStrategyRequestParam, CreateVectorStoreRequestChunkingStrategy, VectorStoreFileObjectChunkingStrategy {

    /**
    * Always `static`.
    * Values: static
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        static("static");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

}

