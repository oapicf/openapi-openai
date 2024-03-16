
package org.openapitools.client.model


case class ListFilesResponse (
    _object: String,
    _data: List[OpenAIFile]
)
object ListFilesResponse {
    def toStringBody(var_object: Object, var_data: Object) =
        s"""
        | {
        | "object":$var_object,"data":$var_data
        | }
        """.stripMargin
}
