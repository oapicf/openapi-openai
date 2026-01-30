
package org.openapitools.client.model


case class FineTuningJobEvent (
    /* The object type, which is always \"fine_tuning.job.event\". */
    _object: String,
    /* The object identifier. */
    _id: String,
    /* The Unix timestamp (in seconds) for when the fine-tuning job was created. */
    _createdAt: Integer,
    /* The log level of the event. */
    _level: String,
    /* The message of the event. */
    _message: String,
    /* The type of event. */
    _type: Option[String],
    /* The data associated with the event. */
    _data: Option[Any]
)
object FineTuningJobEvent {
    def toStringBody(var_object: Object, var_id: Object, var_createdAt: Object, var_level: Object, var_message: Object, var_type: Object, var_data: Object) =
        s"""
        | {
        | "object":$var_object,"id":$var_id,"createdAt":$var_createdAt,"level":$var_level,"message":$var_message,"type":$var_type,"data":$var_data
        | }
        """.stripMargin
}
