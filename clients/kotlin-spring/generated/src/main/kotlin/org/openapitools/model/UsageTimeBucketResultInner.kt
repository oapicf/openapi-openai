package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CostsResult
import org.openapitools.model.CostsResultAmount
import org.openapitools.model.UsageAudioSpeechesResult
import org.openapitools.model.UsageAudioTranscriptionsResult
import org.openapitools.model.UsageCodeInterpreterSessionsResult
import org.openapitools.model.UsageCompletionsResult
import org.openapitools.model.UsageEmbeddingsResult
import org.openapitools.model.UsageImagesResult
import org.openapitools.model.UsageModerationsResult
import org.openapitools.model.UsageVectorStoresResult
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
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
 */
sealed interface UsageTimeBucketResultInner {
}

