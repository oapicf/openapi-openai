
package org.openapitools.client.model


case class BatchRequestOutputResponse (
    /* The HTTP status code of the response */
    _statusCode: Option[Integer],
    /* An unique identifier for the OpenAI API request. Please include this request ID when contacting support. */
    _requestId: Option[String],
    /* The JSON body of the response */
    _body: Option[Any]
)
object BatchRequestOutputResponse {
    def toStringBody(var_statusCode: Object, var_requestId: Object, var_body: Object) =
        s"""
        | {
        | "statusCode":$var_statusCode,"requestId":$var_requestId,"body":$var_body
        | }
        """.stripMargin
}
