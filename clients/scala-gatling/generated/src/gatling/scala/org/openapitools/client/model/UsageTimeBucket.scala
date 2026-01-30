
package org.openapitools.client.model


case class UsageTimeBucket (
    _object: String,
    _startTime: Integer,
    _endTime: Integer,
    _result: List[UsageTimeBucketResultInner]
)
object UsageTimeBucket {
    def toStringBody(var_object: Object, var_startTime: Object, var_endTime: Object, var_result: Object) =
        s"""
        | {
        | "object":$var_object,"startTime":$var_startTime,"endTime":$var_endTime,"result":$var_result
        | }
        """.stripMargin
}
