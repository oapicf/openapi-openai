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

case class CreateImageRequest (
  /* A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`. */
  prompt: String,
  model: Option[CreateImageRequestModel] = None,
  /* The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. */
  n: Option[Int] = None,
  /* The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`. */
  quality: Option[CreateImageRequestEnums.Quality] = None,
  /* The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. */
  responseFormat: Option[CreateImageRequestEnums.ResponseFormat] = None,
  /* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models. */
  size: Option[CreateImageRequestEnums.Size] = None,
  /* The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`. */
  style: Option[CreateImageRequestEnums.Style] = None,
  /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
  user: Option[String] = None
) extends ApiModel

object CreateImageRequestEnums {

  type Quality = Quality.Value
  type ResponseFormat = ResponseFormat.Value
  type Size = Size.Value
  type Style = Style.Value
  object Quality extends Enumeration {
    val Standard = Value("standard")
    val Hd = Value("hd")
  }

  object ResponseFormat extends Enumeration {
    val Url = Value("url")
    val B64Json = Value("b64_json")
  }

  object Size extends Enumeration {
    val `256x256` = Value("256x256")
    val `512x512` = Value("512x512")
    val `1024x1024` = Value("1024x1024")
    val `1792x1024` = Value("1792x1024")
    val `1024x1792` = Value("1024x1792")
  }

  object Style extends Enumeration {
    val Vivid = Value("vivid")
    val Natural = Value("natural")
  }

}
