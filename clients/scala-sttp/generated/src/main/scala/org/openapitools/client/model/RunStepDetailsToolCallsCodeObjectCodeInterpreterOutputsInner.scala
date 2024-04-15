/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


case class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
  /* Always `logs`. */
  `type`: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerEnums.`Type`,
  /* The text output from the Code Interpreter tool call. */
  logs: String,
  image: RunStepDetailsToolCallsCodeOutputImageObjectImage
)

object RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Logs = Value("logs")
    val Image = Value("image")
  }

}