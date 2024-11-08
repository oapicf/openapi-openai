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
package org.openapitools.client.api

import org.openapitools.client.model.CreateImageEditRequestModel
import org.openapitools.client.model.CreateImageRequest
import java.io.File
import org.openapitools.client.model.ImagesResponse
import org.openapitools.client.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object ImagesApi {
  def apply(baseUrl: String = "https://api.openai.com/v1") = new ImagesApi(baseUrl)
}

class ImagesApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : ImagesResponse (OK)
   * 
   * Available security schemes:
   *   ApiKeyAuth (http)
   * 
   * @param createImageRequest 
   */
  def createImage(bearerToken: String)(createImageRequest: CreateImageRequest
): Request[Either[ResponseException[String, Exception], ImagesResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/images/generations")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(createImageRequest)
      .response(asJson[ImagesResponse])

  /**
   * Expected answers:
   *   code 200 : ImagesResponse (OK)
   * 
   * Available security schemes:
   *   ApiKeyAuth (http)
   * 
   * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
   * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
   * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
   * @param model 
   * @param `n` The number of images to generate. Must be between 1 and 10.
   * @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
   * @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
   * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   */
  def createImageEdit(bearerToken: String)(image: File, prompt: String, mask: Option[File] = None, model: Option[CreateImageEditRequestModel] = None, `n`: Option[Int] = None, size: Option[String] = None, responseFormat: Option[String] = None, user: Option[String] = None
): Request[Either[ResponseException[String, Exception], ImagesResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/images/edits")
      .contentType("multipart/form-data")
      .auth.bearer(bearerToken)
      .multipartBody(Seq(
                multipartFile("image", image)
, 
                multipart("prompt", prompt)
, 
                mask.map(multipartFile("mask", _))
, 
                model.map(multipart("model", _))
, 
                `n`.map(multipart("n", _))
, 
                size.map(multipart("size", _))
, 
                responseFormat.map(multipart("response_format", _))
, 
                user.map(multipart("user", _))

      ).flatten)
      .response(asJson[ImagesResponse])

  /**
   * Expected answers:
   *   code 200 : ImagesResponse (OK)
   * 
   * Available security schemes:
   *   ApiKeyAuth (http)
   * 
   * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
   * @param model 
   * @param `n` The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
   * @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
   * @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
   * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   */
  def createImageVariation(bearerToken: String)(image: File, model: Option[CreateImageEditRequestModel] = None, `n`: Option[Int] = None, responseFormat: Option[String] = None, size: Option[String] = None, user: Option[String] = None
): Request[Either[ResponseException[String, Exception], ImagesResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/images/variations")
      .contentType("multipart/form-data")
      .auth.bearer(bearerToken)
      .multipartBody(Seq(
                multipartFile("image", image)
, 
                model.map(multipart("model", _))
, 
                `n`.map(multipart("n", _))
, 
                responseFormat.map(multipart("response_format", _))
, 
                size.map(multipart("size", _))
, 
                user.map(multipart("user", _))

      ).flatten)
      .response(asJson[ImagesResponse])

}
