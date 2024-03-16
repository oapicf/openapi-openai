
package org.openapitools.client.model


case class CreateImageRequest (
    /* A text description of the desired image(s). The maximum length is 1000 characters. */
    _prompt: String,
    /* The number of images to generate. Must be between 1 and 10. */
    _n: Option[Integer],
    /* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. */
    _size: Option[String],
    /* The format in which the generated images are returned. Must be one of `url` or `b64_json`. */
    _responseFormat: Option[String],
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    _user: Option[String]
)
object CreateImageRequest {
    def toStringBody(var_prompt: Object, var_n: Object, var_size: Object, var_responseFormat: Object, var_user: Object) =
        s"""
        | {
        | "prompt":$var_prompt,"n":$var_n,"size":$var_size,"responseFormat":$var_responseFormat,"user":$var_user
        | }
        """.stripMargin
}
