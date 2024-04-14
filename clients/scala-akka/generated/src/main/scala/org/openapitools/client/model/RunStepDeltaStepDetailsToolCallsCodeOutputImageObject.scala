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

case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject (
  /* The index of the output in the outputs array. */
  index: Int,
  /* Always `image`. */
  `type`: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectEnums.`Type`,
  image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = None
) extends ApiModel

object RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Image = Value("image")
  }

}
