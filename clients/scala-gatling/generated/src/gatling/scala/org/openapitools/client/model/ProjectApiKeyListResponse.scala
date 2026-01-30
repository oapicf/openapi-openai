
package org.openapitools.client.model


case class ProjectApiKeyListResponse (
    _object: String,
    _data: List[ProjectApiKey],
    _firstId: String,
    _lastId: String,
    _hasMore: Boolean
)
object ProjectApiKeyListResponse {
    def toStringBody(var_object: Object, var_data: Object, var_firstId: Object, var_lastId: Object, var_hasMore: Object) =
        s"""
        | {
        | "object":$var_object,"data":$var_data,"firstId":$var_firstId,"lastId":$var_lastId,"hasMore":$var_hasMore
        | }
        """.stripMargin
}
