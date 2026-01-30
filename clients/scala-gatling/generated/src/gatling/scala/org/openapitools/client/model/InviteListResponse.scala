
package org.openapitools.client.model


case class InviteListResponse (
    /* The object type, which is always `list` */
    _object: String,
    _data: List[Invite],
    /* The first `invite_id` in the retrieved `list` */
    _firstId: Option[String],
    /* The last `invite_id` in the retrieved `list` */
    _lastId: Option[String],
    /* The `has_more` property is used for pagination to indicate there are additional results. */
    _hasMore: Option[Boolean]
)
object InviteListResponse {
    def toStringBody(var_object: Object, var_data: Object, var_firstId: Object, var_lastId: Object, var_hasMore: Object) =
        s"""
        | {
        | "object":$var_object,"data":$var_data,"firstId":$var_firstId,"lastId":$var_lastId,"hasMore":$var_hasMore
        | }
        """.stripMargin
}
