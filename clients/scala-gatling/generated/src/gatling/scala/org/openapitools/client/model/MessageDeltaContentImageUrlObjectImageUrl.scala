
package org.openapitools.client.model


case class MessageDeltaContentImageUrlObjectImageUrl (
    /* The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. */
    _url: Option[String],
    /* Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. */
    _detail: Option[String]
)
object MessageDeltaContentImageUrlObjectImageUrl {
    def toStringBody(var_url: Object, var_detail: Object) =
        s"""
        | {
        | "url":$var_url,"detail":$var_detail
        | }
        """.stripMargin
}
