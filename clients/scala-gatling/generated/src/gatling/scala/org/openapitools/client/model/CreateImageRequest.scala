
package org.openapitools.client.model


case class CreateImageRequest (
    /* A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`. */
    _prompt: String,
    _model: Option[CreateImageRequestModel],
    /* The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. */
    _n: Option[Integer],
    /* The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`. */
    _quality: Option[String],
    /* The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. */
    _responseFormat: Option[String],
    /* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models. */
    _size: Option[String],
    /* The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`. */
    _style: Option[String],
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    _user: Option[String]
)
object CreateImageRequest {
    def toStringBody(var_prompt: Object, var_model: Object, var_n: Object, var_quality: Object, var_responseFormat: Object, var_size: Object, var_style: Object, var_user: Object) =
        s"""
        | {
        | "prompt":$var_prompt,"model":$var_model,"n":$var_n,"quality":$var_quality,"responseFormat":$var_responseFormat,"size":$var_size,"style":$var_style,"user":$var_user
        | }
        """.stripMargin
}