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
   * Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
   */
case class RunCompletionUsage(
  /* Number of completion tokens used over the course of the run. */
  completionTokens: Int,
  /* Number of prompt tokens used over the course of the run. */
  promptTokens: Int,
  /* Total number of tokens used (prompt + completion). */
  totalTokens: Int
)

