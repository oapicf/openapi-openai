
package org.openapitools.client.model


case class ListFineTuningJobCheckpointsResponse (
    _data: List[FineTuningJobCheckpoint],
    _object: String,
    _firstId: Option[String],
    _lastId: Option[String],
    _hasMore: Boolean
)
object ListFineTuningJobCheckpointsResponse {
    def toStringBody(var_data: Object, var_object: Object, var_firstId: Object, var_lastId: Object, var_hasMore: Object) =
        s"""
        | {
        | "data":$var_data,"object":$var_object,"firstId":$var_firstId,"lastId":$var_lastId,"hasMore":$var_hasMore
        | }
        """.stripMargin
}
