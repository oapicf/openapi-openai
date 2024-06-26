/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class MessageDeltaContentTextAnnotationsFilePathObject(
  /* The index of the annotation in the text content part. */
  index: Int,

  /* Always `file_path`. */
  `type`: String,

  /* The text in the message content that needs to be replaced. */
  text: Option[String],

  filePath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath],

  startIndex: Option[Int],

  endIndex: Option[Int]

 )
