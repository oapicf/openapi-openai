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

case class RunToolCallObject (
  /* The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. */
  id: String,
  /* The type of tool call the output is required for. For now, this is always `function`. */
  `type`: RunToolCallObjectEnums.`Type`,
  function: RunToolCallObjectFunction
) extends ApiModel

object RunToolCallObjectEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Function = Value("function")
  }

}
