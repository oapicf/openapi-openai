package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepObject
import org.openapitools.model.RunStepStreamEventOneOf
import org.openapitools.model.RunStepStreamEventOneOf1
import org.openapitools.model.RunStepStreamEventOneOf2
import org.openapitools.model.RunStepStreamEventOneOf3
import org.openapitools.model.RunStepStreamEventOneOf4
import org.openapitools.model.RunStepStreamEventOneOf5
import org.openapitools.model.RunStepStreamEventOneOf6
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
sealed interface RunStepStreamEvent : AssistantStreamEvent {
}

