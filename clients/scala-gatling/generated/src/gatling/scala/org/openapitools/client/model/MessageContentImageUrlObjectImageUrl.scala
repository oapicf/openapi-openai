
package org.openapitools.client.model

import java.net.URI

case class MessageContentImageUrlObjectImageUrl (
    /* The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. */
    _url: URI,
    /* Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto` */
    _detail: Option[String]
)
object MessageContentImageUrlObjectImageUrl {
    def toStringBody(var_url: Object, var_detail: Object) =
        s"""
        | {
        | "url":$var_url,"detail":$var_detail
        | }
        """.stripMargin
}
