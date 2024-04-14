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

import org.openapitools.client.core.ApiModel

case class RunStepDeltaStepDetailsToolCallsObject (
  /* Always `tool_calls`. */
  `type`: RunStepDeltaStepDetailsToolCallsObjectEnums.`Type`,
  /* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.  */
  toolCalls: Option[Seq[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]] = None
) extends ApiModel

object RunStepDeltaStepDetailsToolCallsObjectEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val ToolCalls = Value("tool_calls")
  }

}
