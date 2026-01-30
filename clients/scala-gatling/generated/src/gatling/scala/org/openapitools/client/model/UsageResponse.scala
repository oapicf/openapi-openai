
package org.openapitools.client.model


case class UsageResponse (
    _object: String,
    _data: List[UsageTimeBucket],
    _hasMore: Boolean,
    _nextPage: String
)
object UsageResponse {
    def toStringBody(var_object: Object, var_data: Object, var_hasMore: Object, var_nextPage: Object) =
        s"""
        | {
        | "object":$var_object,"data":$var_data,"hasMore":$var_hasMore,"nextPage":$var_nextPage
        | }
        """.stripMargin
}
