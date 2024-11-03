
package org.openapitools.client.model


case class ListRunsResponse (
    _object: String,
    _data: List[RunObject],
    _firstId: String,
    _lastId: String,
    _hasMore: Boolean
)
object ListRunsResponse {
    def toStringBody(var_object: Object, var_data: Object, var_firstId: Object, var_lastId: Object, var_hasMore: Object) =
        s"""
        | {
        | "object":$var_object,"data":$var_data,"firstId":$var_firstId,"lastId":$var_lastId,"hasMore":$var_hasMore
        | }
        """.stripMargin
}
