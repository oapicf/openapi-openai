
package org.openapitools.client.model


case class ListFineTuneEventsResponse (
    _object: String,
    _data: List[FineTuneEvent]
)
object ListFineTuneEventsResponse {
    def toStringBody(var_object: Object, var_data: Object) =
        s"""
        | {
        | "object":$var_object,"data":$var_data
        | }
        """.stripMargin
}
