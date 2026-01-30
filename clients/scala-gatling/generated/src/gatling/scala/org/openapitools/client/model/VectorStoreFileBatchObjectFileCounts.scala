
package org.openapitools.client.model


case class VectorStoreFileBatchObjectFileCounts (
    /* The number of files that are currently being processed. */
    _inProgress: Integer,
    /* The number of files that have been processed. */
    _completed: Integer,
    /* The number of files that have failed to process. */
    _failed: Integer,
    /* The number of files that where cancelled. */
    _cancelled: Integer,
    /* The total number of files. */
    _total: Integer
)
object VectorStoreFileBatchObjectFileCounts {
    def toStringBody(var_inProgress: Object, var_completed: Object, var_failed: Object, var_cancelled: Object, var_total: Object) =
        s"""
        | {
        | "inProgress":$var_inProgress,"completed":$var_completed,"failed":$var_failed,"cancelled":$var_cancelled,"total":$var_total
        | }
        """.stripMargin
}
