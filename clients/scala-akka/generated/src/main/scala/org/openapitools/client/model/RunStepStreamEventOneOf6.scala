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

case class RunStepStreamEventOneOf6 (
  event: RunStepStreamEventOneOf6Enums.Event,
  data: RunStepObject
) extends ApiModel

object RunStepStreamEventOneOf6Enums {

  type Event = Event.Value
  object Event extends Enumeration {
    val ThreadRunStepExpired = Value("thread.run.step.expired")
  }

}
