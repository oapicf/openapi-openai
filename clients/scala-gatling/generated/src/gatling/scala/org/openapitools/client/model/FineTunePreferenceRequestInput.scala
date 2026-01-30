
package org.openapitools.client.model


case class FineTunePreferenceRequestInput (
    _input: Option[FineTunePreferenceRequestInputInput],
    /* The preferred completion message for the output. */
    _preferredCompletion: Option[List[FineTunePreferenceRequestInputPreferredCompletionInner]],
    /* The non-preferred completion message for the output. */
    _nonPreferredCompletion: Option[List[FineTunePreferenceRequestInputPreferredCompletionInner]]
)
object FineTunePreferenceRequestInput {
    def toStringBody(var_input: Object, var_preferredCompletion: Object, var_nonPreferredCompletion: Object) =
        s"""
        | {
        | "input":$var_input,"preferredCompletion":$var_preferredCompletion,"nonPreferredCompletion":$var_nonPreferredCompletion
        | }
        """.stripMargin
}
