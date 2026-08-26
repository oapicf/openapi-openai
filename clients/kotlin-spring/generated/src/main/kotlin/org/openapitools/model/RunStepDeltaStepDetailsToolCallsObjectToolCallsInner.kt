package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObject
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFileSearchObject
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObject
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
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
sealed interface RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
}

