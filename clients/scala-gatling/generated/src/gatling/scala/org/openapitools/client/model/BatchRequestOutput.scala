
package org.openapitools.client.model


case class BatchRequestOutput (
    _id: Option[String],
    /* A developer-provided per-request id that will be used to match outputs to inputs. */
    _customId: Option[String],
    _response: Option[BatchRequestOutputResponse],
    _error: Option[BatchRequestOutputError]
)
object BatchRequestOutput {
    def toStringBody(var_id: Object, var_customId: Object, var_response: Object, var_error: Object) =
        s"""
        | {
        | "id":$var_id,"customId":$var_customId,"response":$var_response,"error":$var_error
        | }
        """.stripMargin
}
