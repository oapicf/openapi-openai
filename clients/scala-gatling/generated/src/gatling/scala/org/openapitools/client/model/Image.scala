
package org.openapitools.client.model


case class Image (
    /* The base64-encoded JSON of the generated image, if `response_format` is `b64_json`. */
    _b64Json: Option[String],
    /* The URL of the generated image, if `response_format` is `url` (default). */
    _url: Option[String],
    /* The prompt that was used to generate the image, if there was any revision to the prompt. */
    _revisedPrompt: Option[String]
)
object Image {
    def toStringBody(var_b64Json: Object, var_url: Object, var_revisedPrompt: Object) =
        s"""
        | {
        | "b64Json":$var_b64Json,"url":$var_url,"revisedPrompt":$var_revisedPrompt
        | }
        """.stripMargin
}
