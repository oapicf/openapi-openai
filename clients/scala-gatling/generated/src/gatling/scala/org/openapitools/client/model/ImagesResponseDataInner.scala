
package org.openapitools.client.model


case class ImagesResponseDataInner (
    _url: Option[String],
    _b64Json: Option[String]
)
object ImagesResponseDataInner {
    def toStringBody(var_url: Object, var_b64Json: Object) =
        s"""
        | {
        | "url":$var_url,"b64Json":$var_b64Json
        | }
        """.stripMargin
}
