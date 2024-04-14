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
   * File path
   * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
   */
case class MessageContentTextAnnotationsFilePathObject(
  /* Always `file_path`. */
  `type`: MessageContentTextAnnotationsFilePathObjectEnums.`Type`,
  /* The text in the message content that needs to be replaced. */
  text: String,
  filePath: MessageContentTextAnnotationsFilePathObjectFilePath,
  startIndex: Int,
  endIndex: Int
)

object MessageContentTextAnnotationsFilePathObjectEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val FilePath = Value("file_path")
  }

}
