
package org.openapitools.client.model


case class RealtimeServerEventErrorError (
    /* The type of error (e.g., \"invalid_request_error\", \"server_error\").  */
    _type: String,
    /* Error code, if any. */
    _code: Option[String],
    /* A human-readable error message. */
    _message: String,
    /* Parameter related to the error, if any. */
    _param: Option[String],
    /* The event_id of the client event that caused the error, if applicable.  */
    _eventId: Option[String]
)
object RealtimeServerEventErrorError {
    def toStringBody(var_type: Object, var_code: Object, var_message: Object, var_param: Object, var_eventId: Object) =
        s"""
        | {
        | "type":$var_type,"code":$var_code,"message":$var_message,"param":$var_param,"eventId":$var_eventId
        | }
        """.stripMargin
}
