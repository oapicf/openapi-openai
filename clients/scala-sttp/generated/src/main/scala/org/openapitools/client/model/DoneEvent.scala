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
   * Occurs when a stream ends.
   */
case class DoneEvent(
  event: DoneEventEnums.Event,
  data: DoneEventEnums.Data
)

object DoneEventEnums {

  type Event = Event.Value
  type Data = Data.Value
  object Event extends Enumeration {
    val Done = Value("done")
  }

  object Data extends Enumeration {
    val DONE = Value("[DONE]")
  }

}
