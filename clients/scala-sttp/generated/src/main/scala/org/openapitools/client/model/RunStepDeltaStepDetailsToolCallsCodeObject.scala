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


  /**
   * Code interpreter tool call
   * Details of the Code Interpreter tool call the run step was involved in.
   */
case class RunStepDeltaStepDetailsToolCallsCodeObject(
  /* The index of the tool call in the tool calls array. */
  index: Int,
  /* The ID of the tool call. */
  id: Option[String] = None,
  /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
  `type`: RunStepDeltaStepDetailsToolCallsCodeObjectEnums.`Type`,
  codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = None
)

object RunStepDeltaStepDetailsToolCallsCodeObjectEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")
  }

}
