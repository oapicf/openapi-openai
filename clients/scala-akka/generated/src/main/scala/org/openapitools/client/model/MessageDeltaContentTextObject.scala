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

case class MessageDeltaContentTextObject (
  /* The index of the content part in the message. */
  index: Int,
  /* Always `text`. */
  `type`: MessageDeltaContentTextObjectEnums.`Type`,
  text: Option[MessageDeltaContentTextObjectText] = None
) extends ApiModel

object MessageDeltaContentTextObjectEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Text = Value("text")
  }

}
