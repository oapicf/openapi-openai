
package org.openapitools.client.model

import java.net.URI

case class CreateModerationRequestInputOneOfInnerOneOfImageUrl (
    /* Either a URL of the image or the base64 encoded image data. */
    _url: URI
)
object CreateModerationRequestInputOneOfInnerOneOfImageUrl {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
