
package org.openapitools.client.model


case class RealtimeResponseCreateParams (
    /* The set of modalities the model can respond with. To disable audio, set this to [\"text\"].  */
    _modalities: Option[List[String]],
    /* The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.  */
    _instructions: Option[String],
    /* The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.  */
    _voice: Option[String],
    /* The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
    _outputAudioFormat: Option[String],
    /* Tools (functions) available to the model. */
    _tools: Option[List[RealtimeResponseCreateParamsToolsInner]],
    /* How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`.  */
    _toolChoice: Option[String],
    /* Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  */
    _temperature: Option[Number],
    _maxResponseOutputTokens: Option[RealtimeResponseCreateParamsMaxResponseOutputTokens],
    _conversation: Option[RealtimeResponseCreateParamsConversation],
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    _metadata: Option[Any],
    /* Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation.  */
    _input: Option[List[RealtimeConversationItem]]
)
object RealtimeResponseCreateParams {
    def toStringBody(var_modalities: Object, var_instructions: Object, var_voice: Object, var_outputAudioFormat: Object, var_tools: Object, var_toolChoice: Object, var_temperature: Object, var_maxResponseOutputTokens: Object, var_conversation: Object, var_metadata: Object, var_input: Object) =
        s"""
        | {
        | "modalities":$var_modalities,"instructions":$var_instructions,"voice":$var_voice,"outputAudioFormat":$var_outputAudioFormat,"tools":$var_tools,"toolChoice":$var_toolChoice,"temperature":$var_temperature,"maxResponseOutputTokens":$var_maxResponseOutputTokens,"conversation":$var_conversation,"metadata":$var_metadata,"input":$var_input
        | }
        """.stripMargin
}
