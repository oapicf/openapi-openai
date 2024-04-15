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
   * The delta containing the fields that have changed on the Message.
   */
case class MessageDeltaObjectDelta(
  /* The entity that produced the message. One of `user` or `assistant`. */
  role: Option[MessageDeltaObjectDeltaEnums.Role] = None,
  /* The content of the message in array of text and/or images. */
  content: Option[Seq[MessageDeltaObjectDeltaContentInner]] = None,
  /* A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. */
  fileIds: Option[Seq[String]] = None
)

object MessageDeltaObjectDeltaEnums {

  type Role = Role.Value
  object Role extends Enumeration {
    val User = Value("user")
    val Assistant = Value("assistant")
  }

}