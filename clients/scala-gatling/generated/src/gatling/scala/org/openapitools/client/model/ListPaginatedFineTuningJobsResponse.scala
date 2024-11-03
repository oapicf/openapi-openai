
package org.openapitools.client.model


case class ListPaginatedFineTuningJobsResponse (
    _data: List[FineTuningJob],
    _hasMore: Boolean,
    _object: String
)
object ListPaginatedFineTuningJobsResponse {
    def toStringBody(var_data: Object, var_hasMore: Object, var_object: Object) =
        s"""
        | {
        | "data":$var_data,"hasMore":$var_hasMore,"object":$var_object
        | }
        """.stripMargin
}
