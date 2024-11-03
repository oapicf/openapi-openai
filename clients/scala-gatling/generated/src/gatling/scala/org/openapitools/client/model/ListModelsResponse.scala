
package org.openapitools.client.model


case class ListModelsResponse (
    _object: String,
    _data: List[Model]
)
object ListModelsResponse {
    def toStringBody(var_object: Object, var_data: Object) =
        s"""
        | {
        | "object":$var_object,"data":$var_data
        | }
        """.stripMargin
}
