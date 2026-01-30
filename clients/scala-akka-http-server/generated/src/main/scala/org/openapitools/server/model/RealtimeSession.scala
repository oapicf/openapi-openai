package org.openapitools.server.model


/**
 * Realtime session object configuration.
 *
 * @param id Unique identifier for the session object.  for example: ''null''
 * @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"].  for example: ''null''
 * @param model  for example: ''null''
 * @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.  for example: ''null''
 * @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.  for example: ''null''
 * @param inputAudioFormat The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  for example: ''null''
 * @param outputAudioFormat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  for example: ''null''
 * @param inputAudioTranscription  for example: ''null''
 * @param turnDetection  for example: ''null''
 * @param tools Tools (functions) available to the model. for example: ''null''
 * @param toolChoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function.  for example: ''null''
 * @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  for example: ''null''
 * @param maxResponseOutputTokens  for example: ''null''
*/
final case class RealtimeSession (
  id: Option[String] = None,
  modalities: Option[Seq[String]] = None,
  model: Option[RealtimeSessionModel] = None,
  instructions: Option[String] = None,
  voice: Option[String] = None,
  inputAudioFormat: Option[String] = None,
  outputAudioFormat: Option[String] = None,
  inputAudioTranscription: Option[RealtimeSessionInputAudioTranscription] = None,
  turnDetection: Option[RealtimeSessionTurnDetection] = None,
  tools: Option[Seq[RealtimeResponseCreateParamsToolsInner]] = None,
  toolChoice: Option[String] = None,
  temperature: Option[Double] = None,
  maxResponseOutputTokens: Option[RealtimeResponseCreateParamsMaxResponseOutputTokens] = None
)

