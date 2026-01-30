
package org.openapitools.client.model


case class ApiKeyList (
    _object: Option[String],
    _data: Option[List[AdminApiKey]],
    _hasMore: Option[Boolean],
    _firstId: Option[String],
    _lastId: Option[String]
)
object ApiKeyList {
    def toStringBody(var_object: Object, var_data: Object, var_hasMore: Object, var_firstId: Object, var_lastId: Object) =
        s"""
        | {
        | "object":$var_object,"data":$var_data,"hasMore":$var_hasMore,"firstId":$var_firstId,"lastId":$var_lastId
        | }
        """.stripMargin
}
