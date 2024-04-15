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
   * Assistant files
   * A list of [Files](/docs/api-reference/files) attached to an `assistant`.
   */
case class AssistantFileObject(
  /* The identifier, which can be referenced in API endpoints. */
  id: String,
  /* The object type, which is always `assistant.file`. */
  `object`: AssistantFileObjectEnums.`Object`,
  /* The Unix timestamp (in seconds) for when the assistant file was created. */
  createdAt: Int,
  /* The assistant ID that the file is attached to. */
  assistantId: String
)

object AssistantFileObjectEnums {

  type `Object` = `Object`.Value
  object `Object` extends Enumeration {
    val AssistantFile = Value("assistant.file")
  }

}