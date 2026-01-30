package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AutoChunkingStrategy
import org.openapitools.model.StaticChunkingStrategy
import org.openapitools.model.StaticChunkingStrategyStatic
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
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 * @param type Always `auto`.
 * @param static 
 */
data class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy(

    @Schema(example = "null", required = true, description = "Always `auto`.")
    @get:JsonProperty("type", required = true) val type: CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("static", required = true) val static: StaticChunkingStrategyStatic
) {

    /**
    * Always `auto`.
    * Values: auto,static
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        auto("auto"),
        static("static");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy'")
            }
        }
    }

}

