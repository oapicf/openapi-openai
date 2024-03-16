
package org.openapitools.client.model


case class ListFineTunesResponse (
    _object: String,
    _data: List[FineTune]
)
object ListFineTunesResponse {
    def toStringBody(var_object: Object, var_data: Object) =
        s"""
        | {
        | "object":$var_object,"data":$var_data
        | }
        """.stripMargin
}
