package org.openapitools.server.model


/**
 * Fine-tuning job event object
 *
 * @param `object` The object type, which is always \"fine_tuning.job.event\". for example: ''null''
 * @param id The object identifier. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job was created. for example: ''null''
 * @param level The log level of the event. for example: ''null''
 * @param message The message of the event. for example: ''null''
 * @param `type` The type of event. for example: ''null''
 * @param data The data associated with the event. for example: ''null''
*/
final case class FineTuningJobEvent (
  `object`: String,
  id: String,
  createdAt: Int,
  level: String,
  message: String,
  `type`: Option[String] = None,
  data: Option[Any] = None
)

