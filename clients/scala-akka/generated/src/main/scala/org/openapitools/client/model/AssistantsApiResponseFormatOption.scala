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

case class AssistantsApiResponseFormatOption (
  /* Must be one of `text` or `json_object`. */
  `type`: Option[AssistantsApiResponseFormatOptionEnums.`Type`] = None
) extends ApiModel

object AssistantsApiResponseFormatOptionEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Text = Value("text")
    val JsonObject = Value("json_object")
  }

}
