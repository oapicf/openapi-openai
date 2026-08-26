package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunObject
import org.openapitools.model.RunStreamEventOneOf
import org.openapitools.model.RunStreamEventOneOf1
import org.openapitools.model.RunStreamEventOneOf2
import org.openapitools.model.RunStreamEventOneOf3
import org.openapitools.model.RunStreamEventOneOf4
import org.openapitools.model.RunStreamEventOneOf5
import org.openapitools.model.RunStreamEventOneOf6
import org.openapitools.model.RunStreamEventOneOf7
import org.openapitools.model.RunStreamEventOneOf8
import org.openapitools.model.RunStreamEventOneOf9
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
sealed interface RunStreamEvent : AssistantStreamEvent {
}

