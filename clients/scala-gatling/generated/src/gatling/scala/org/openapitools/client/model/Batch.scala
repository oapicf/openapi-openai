
package org.openapitools.client.model


case class Batch (
    _id: String,
    /* The object type, which is always `batch`. */
    _object: String,
    /* The OpenAI API endpoint used by the batch. */
    _endpoint: String,
    _errors: Option[BatchErrors],
    /* The ID of the input file for the batch. */
    _inputFileId: String,
    /* The time frame within which the batch should be processed. */
    _completionWindow: String,
    /* The current status of the batch. */
    _status: String,
    /* The ID of the file containing the outputs of successfully executed requests. */
    _outputFileId: Option[String],
    /* The ID of the file containing the outputs of requests with errors. */
    _errorFileId: Option[String],
    /* The Unix timestamp (in seconds) for when the batch was created. */
    _createdAt: Integer,
    /* The Unix timestamp (in seconds) for when the batch started processing. */
    _inProgressAt: Option[Integer],
    /* The Unix timestamp (in seconds) for when the batch will expire. */
    _expiresAt: Option[Integer],
    /* The Unix timestamp (in seconds) for when the batch started finalizing. */
    _finalizingAt: Option[Integer],
    /* The Unix timestamp (in seconds) for when the batch was completed. */
    _completedAt: Option[Integer],
    /* The Unix timestamp (in seconds) for when the batch failed. */
    _failedAt: Option[Integer],
    /* The Unix timestamp (in seconds) for when the batch expired. */
    _expiredAt: Option[Integer],
    /* The Unix timestamp (in seconds) for when the batch started cancelling. */
    _cancellingAt: Option[Integer],
    /* The Unix timestamp (in seconds) for when the batch was cancelled. */
    _cancelledAt: Option[Integer],
    _requestCounts: Option[BatchRequestCounts],
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    _metadata: Option[Any]
)
object Batch {
    def toStringBody(var_id: Object, var_object: Object, var_endpoint: Object, var_errors: Object, var_inputFileId: Object, var_completionWindow: Object, var_status: Object, var_outputFileId: Object, var_errorFileId: Object, var_createdAt: Object, var_inProgressAt: Object, var_expiresAt: Object, var_finalizingAt: Object, var_completedAt: Object, var_failedAt: Object, var_expiredAt: Object, var_cancellingAt: Object, var_cancelledAt: Object, var_requestCounts: Object, var_metadata: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"endpoint":$var_endpoint,"errors":$var_errors,"inputFileId":$var_inputFileId,"completionWindow":$var_completionWindow,"status":$var_status,"outputFileId":$var_outputFileId,"errorFileId":$var_errorFileId,"createdAt":$var_createdAt,"inProgressAt":$var_inProgressAt,"expiresAt":$var_expiresAt,"finalizingAt":$var_finalizingAt,"completedAt":$var_completedAt,"failedAt":$var_failedAt,"expiredAt":$var_expiredAt,"cancellingAt":$var_cancellingAt,"cancelledAt":$var_cancelledAt,"requestCounts":$var_requestCounts,"metadata":$var_metadata
        | }
        """.stripMargin
}
