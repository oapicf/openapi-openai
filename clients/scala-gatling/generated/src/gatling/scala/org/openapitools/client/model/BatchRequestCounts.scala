
package org.openapitools.client.model


case class BatchRequestCounts (
    /* Total number of requests in the batch. */
    _total: Integer,
    /* Number of requests that have been completed successfully. */
    _completed: Integer,
    /* Number of requests that have failed. */
    _failed: Integer
)
object BatchRequestCounts {
    def toStringBody(var_total: Object, var_completed: Object, var_failed: Object) =
        s"""
        | {
        | "total":$var_total,"completed":$var_completed,"failed":$var_failed
        | }
        """.stripMargin
}
