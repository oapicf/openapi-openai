
package org.openapitools.client.model


case class ListBatchesResponse (
    _data: List[Batch],
    _firstId: Option[String],
    _lastId: Option[String],
    _hasMore: Boolean,
    _object: String
)
object ListBatchesResponse {
    def toStringBody(var_data: Object, var_firstId: Object, var_lastId: Object, var_hasMore: Object, var_object: Object) =
        s"""
        | {
        | "data":$var_data,"firstId":$var_firstId,"lastId":$var_lastId,"hasMore":$var_hasMore,"object":$var_object
        | }
        """.stripMargin
}
