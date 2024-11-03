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
   * Code interpreter log output
   * Text output from the Code Interpreter tool call as part of a run step.
   */
case class RunStepDetailsToolCallsCodeOutputLogsObject(
  /* Always `logs`. */
  `type`: RunStepDetailsToolCallsCodeOutputLogsObjectEnums.`Type`,
  /* The text output from the Code Interpreter tool call. */
  logs: String
)

object RunStepDetailsToolCallsCodeOutputLogsObjectEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Logs = Value("logs")
  }

}
