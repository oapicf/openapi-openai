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

case class RunStepObjectLastError (
  /* One of `server_error` or `rate_limit_exceeded`. */
  code: RunStepObjectLastErrorEnums.Code,
  /* A human-readable description of the error. */
  message: String
) extends ApiModel

object RunStepObjectLastErrorEnums {

  type Code = Code.Value
  object Code extends Enumeration {
    val ServerError = Value("server_error")
    val RateLimitExceeded = Value("rate_limit_exceeded")
  }

}
