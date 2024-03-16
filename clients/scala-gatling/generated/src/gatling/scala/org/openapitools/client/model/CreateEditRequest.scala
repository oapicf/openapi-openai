
package org.openapitools.client.model


case class CreateEditRequest (
    _model: CreateEditRequestModel,
    /* The input text to use as a starting point for the edit. */
    _input: Option[String],
    /* The instruction that tells the model how to edit the prompt. */
    _instruction: String,
    /* How many edits to generate for the input and instruction. */
    _n: Option[Integer],
    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  */
    _temperature: Option[Number],
    /* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  */
    _topP: Option[Number]
)
object CreateEditRequest {
    def toStringBody(var_model: Object, var_input: Object, var_instruction: Object, var_n: Object, var_temperature: Object, var_topP: Object) =
        s"""
        | {
        | "model":$var_model,"input":$var_input,"instruction":$var_instruction,"n":$var_n,"temperature":$var_temperature,"topP":$var_topP
        | }
        """.stripMargin
}
