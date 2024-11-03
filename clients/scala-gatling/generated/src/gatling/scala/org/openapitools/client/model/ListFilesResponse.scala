
package org.openapitools.client.model


case class ListFilesResponse (
    _data: List[OpenAIFile],
    _object: String
)
object ListFilesResponse {
    def toStringBody(var_data: Object, var_object: Object) =
        s"""
        | {
        | "data":$var_data,"object":$var_object
        | }
        """.stripMargin
}
