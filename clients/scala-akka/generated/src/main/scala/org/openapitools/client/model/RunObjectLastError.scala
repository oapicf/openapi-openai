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

case class RunObjectLastError (
  /* One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. */
  code: RunObjectLastErrorEnums.Code,
  /* A human-readable description of the error. */
  message: String
) extends ApiModel

object RunObjectLastErrorEnums {

  type Code = Code.Value
  object Code extends Enumeration {
    val ServerError = Value("server_error")
    val RateLimitExceeded = Value("rate_limit_exceeded")
    val InvalidPrompt = Value("invalid_prompt")
  }

}
