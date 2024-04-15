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


case class RunStepDeltaStepDetailsToolCallsFunctionObject(
  /* The index of the tool call in the tool calls array. */
  index: Int,
  /* The ID of the tool call object. */
  id: Option[String] = None,
  /* The type of tool call. This is always going to be `function` for this type of tool call. */
  `type`: RunStepDeltaStepDetailsToolCallsFunctionObjectEnums.`Type`,
  function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction] = None
)

object RunStepDeltaStepDetailsToolCallsFunctionObjectEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Function = Value("function")
  }

}