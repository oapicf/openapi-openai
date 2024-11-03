
package org.openapitools.client.model


case class ListFineTuningJobEventsResponse (
    _data: List[FineTuningJobEvent],
    _object: String
)
object ListFineTuningJobEventsResponse {
    def toStringBody(var_data: Object, var_object: Object) =
        s"""
        | {
        | "data":$var_data,"object":$var_object
        | }
        """.stripMargin
}
