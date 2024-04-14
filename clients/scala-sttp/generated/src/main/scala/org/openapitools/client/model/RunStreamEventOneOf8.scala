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
   * Occurs when a [run](/docs/api-reference/runs/object) expires.
   */
case class RunStreamEventOneOf8(
  event: RunStreamEventOneOf8Enums.Event,
  data: RunObject
)

object RunStreamEventOneOf8Enums {

  type Event = Event.Value
  object Event extends Enumeration {
    val ThreadRunExpired = Value("thread.run.expired")
  }

}
