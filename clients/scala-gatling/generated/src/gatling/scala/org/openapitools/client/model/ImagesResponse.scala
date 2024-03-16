
package org.openapitools.client.model


case class ImagesResponse (
    _created: Integer,
    _data: List[ImagesResponseDataInner]
)
object ImagesResponse {
    def toStringBody(var_created: Object, var_data: Object) =
        s"""
        | {
        | "created":$var_created,"data":$var_data
        | }
        """.stripMargin
}
