
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsRetrievalObject (
    /* The index of the tool call in the tool calls array. */
    _index: Integer,
    /* The ID of the tool call object. */
    _id: Option[String],
    /* The type of tool call. This is always going to be `retrieval` for this type of tool call. */
    _type: String,
    /* For now, this is always going to be an empty object. */
    _retrieval: Option[Any]
)
object RunStepDeltaStepDetailsToolCallsRetrievalObject {
    def toStringBody(var_index: Object, var_id: Object, var_type: Object, var_retrieval: Object) =
        s"""
        | {
        | "index":$var_index,"id":$var_id,"type":$var_type,"retrieval":$var_retrieval
        | }
        """.stripMargin
}
