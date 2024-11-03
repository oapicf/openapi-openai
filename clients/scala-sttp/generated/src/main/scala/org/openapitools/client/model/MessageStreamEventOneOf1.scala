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
   * Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
   */
case class MessageStreamEventOneOf1(
  event: MessageStreamEventOneOf1Enums.Event,
  data: MessageObject
)

object MessageStreamEventOneOf1Enums {

  type Event = Event.Value
  object Event extends Enumeration {
    val ThreadMessageInProgress = Value("thread.message.in_progress")
  }

}
