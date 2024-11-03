
package org.openapitools.client.model

import java.net.URI

case class ChatCompletionRequestMessageContentPartImageImageUrl (
    /* Either a URL of the image or the base64 encoded image data. */
    _url: URI,
    /* Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding). */
    _detail: Option[String]
)
object ChatCompletionRequestMessageContentPartImageImageUrl {
    def toStringBody(var_url: Object, var_detail: Object) =
        s"""
        | {
        | "url":$var_url,"detail":$var_detail
        | }
        """.stripMargin
}
