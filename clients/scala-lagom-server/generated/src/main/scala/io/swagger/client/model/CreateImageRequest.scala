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

package io.swagger.client.model
import play.api.libs.json._

case class CreateImageRequest (
            /* A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`. */
                  prompt: String,
                  model: Option[CreateImageRequestModel],
            /* The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. */
                  n: Option[Int],
                  quality:  Option[CreateImageRequestQualityEnum.CreateImageRequestQualityEnum],
                  responseFormat:  Option[CreateImageRequestResponseFormatEnum.CreateImageRequestResponseFormatEnum],
                  size:  Option[CreateImageRequestSizeEnum.CreateImageRequestSizeEnum],
                  style:  Option[CreateImageRequestStyleEnum.CreateImageRequestStyleEnum],
            /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
                  user: Option[String]
)

object CreateImageRequest {
implicit val format: Format[CreateImageRequest] = Json.format
}

object CreateImageRequestQualityEnum extends Enumeration {
  val   standard, hd = Value
  type CreateImageRequestQualityEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CreateImageRequestQualityEnum.type])
}
object CreateImageRequestResponseFormatEnum extends Enumeration {
  val   url, b64_json = Value
  type CreateImageRequestResponseFormatEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CreateImageRequestResponseFormatEnum.type])
}
object CreateImageRequestSizeEnum extends Enumeration {
  val   256x256, 512x512, 1024x1024, 1792x1024, 1024x1792 = Value
  type CreateImageRequestSizeEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CreateImageRequestSizeEnum.type])
}
object CreateImageRequestStyleEnum extends Enumeration {
  val   vivid, natural = Value
  type CreateImageRequestStyleEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CreateImageRequestStyleEnum.type])
}
