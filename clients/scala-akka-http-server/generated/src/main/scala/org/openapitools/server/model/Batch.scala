package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param `object` The object type, which is always `batch`. for example: ''null''
 * @param endpoint The OpenAI API endpoint used by the batch. for example: ''null''
 * @param errors  for example: ''null''
 * @param inputFileId The ID of the input file for the batch. for example: ''null''
 * @param completionWindow The time frame within which the batch should be processed. for example: ''null''
 * @param status The current status of the batch. for example: ''null''
 * @param outputFileId The ID of the file containing the outputs of successfully executed requests. for example: ''null''
 * @param errorFileId The ID of the file containing the outputs of requests with errors. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the batch was created. for example: ''null''
 * @param inProgressAt The Unix timestamp (in seconds) for when the batch started processing. for example: ''null''
 * @param expiresAt The Unix timestamp (in seconds) for when the batch will expire. for example: ''null''
 * @param finalizingAt The Unix timestamp (in seconds) for when the batch started finalizing. for example: ''null''
 * @param completedAt The Unix timestamp (in seconds) for when the batch was completed. for example: ''null''
 * @param failedAt The Unix timestamp (in seconds) for when the batch failed. for example: ''null''
 * @param expiredAt The Unix timestamp (in seconds) for when the batch expired. for example: ''null''
 * @param cancellingAt The Unix timestamp (in seconds) for when the batch started cancelling. for example: ''null''
 * @param cancelledAt The Unix timestamp (in seconds) for when the batch was cancelled. for example: ''null''
 * @param requestCounts  for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  for example: ''null''
*/
final case class Batch (
  id: String,
  `object`: String,
  endpoint: String,
  errors: Option[BatchErrors] = None,
  inputFileId: String,
  completionWindow: String,
  status: String,
  outputFileId: Option[String] = None,
  errorFileId: Option[String] = None,
  createdAt: Int,
  inProgressAt: Option[Int] = None,
  expiresAt: Option[Int] = None,
  finalizingAt: Option[Int] = None,
  completedAt: Option[Int] = None,
  failedAt: Option[Int] = None,
  expiredAt: Option[Int] = None,
  cancellingAt: Option[Int] = None,
  cancelledAt: Option[Int] = None,
  requestCounts: Option[BatchRequestCounts] = None,
  metadata: Option[Any] = None
)

