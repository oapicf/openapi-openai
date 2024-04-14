package org.openapitools.server.model


/**
 * @param prompt A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`. for example: ''A cute baby sea otter''
 * @param model  for example: ''null''
 * @param n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. for example: ''1''
 * @param quality The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`. for example: ''standard''
 * @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. for example: ''url''
 * @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models. for example: ''1024x1024''
 * @param style The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`. for example: ''vivid''
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  for example: ''user-1234''
*/
final case class CreateImageRequest (
  prompt: String,
  model: Option[CreateImageRequestModel] = None,
  n: Option[Int] = None,
  quality: Option[String] = None,
  responseFormat: Option[String] = None,
  size: Option[String] = None,
  style: Option[String] = None,
  user: Option[String] = None
)

