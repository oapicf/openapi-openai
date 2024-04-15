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

case class RunStepDetailsToolCallsRetrievalObject (
  /* The ID of the tool call object. */
  id: String,
  /* The type of tool call. This is always going to be `retrieval` for this type of tool call. */
  `type`: RunStepDetailsToolCallsRetrievalObjectEnums.`Type`,
  /* For now, this is always going to be an empty object. */
  retrieval: Any
) extends ApiModel

object RunStepDetailsToolCallsRetrievalObjectEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Retrieval = Value("retrieval")
  }

}