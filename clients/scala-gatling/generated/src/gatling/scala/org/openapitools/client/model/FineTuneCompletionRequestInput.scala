
package org.openapitools.client.model


case class FineTuneCompletionRequestInput (
    /* The input prompt for this training example. */
    _prompt: Option[String],
    /* The desired completion for this training example. */
    _completion: Option[String]
)
object FineTuneCompletionRequestInput {
    def toStringBody(var_prompt: Object, var_completion: Object) =
        s"""
        | {
        | "prompt":$var_prompt,"completion":$var_completion
        | }
        """.stripMargin
}
