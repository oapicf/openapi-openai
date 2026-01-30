goog.provide('API.Client.RealtimeSessionCreateResponse');

/**
 * A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
 * @record
 */
API.Client.RealtimeSessionCreateResponse = function() {}

/**
 * @type {!API.Client.RealtimeSessionCreateResponse_client_secret}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.clientSecret;

/**
 * The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.modalities;

/**
 * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.instructions;

/**
 * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.voice;

/**
 * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.inputAudioFormat;

/**
 * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.outputAudioFormat;

/**
 * @type {!API.Client.RealtimeSession_input_audio_transcription}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.inputAudioTranscription;

/**
 * @type {!API.Client.RealtimeSessionCreateResponse_turn_detection}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.turnDetection;

/**
 * Tools (functions) available to the model.
 * @type {!Array<!API.Client.RealtimeResponseCreateParams_tools_inner>}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.tools;

/**
 * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.toolChoice;

/**
 * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.temperature;

/**
 * @type {!API.Client.RealtimeResponseCreateParams_max_response_output_tokens}
 * @export
 */
API.Client.RealtimeSessionCreateResponse.prototype.maxResponseOutputTokens;

/** @enum {string} */
API.Client.RealtimeSessionCreateResponse.Array&lt;!ModalitiesEnum&gt; = { 
  text: 'text',
  audio: 'audio',
}
/** @enum {string} */
API.Client.RealtimeSessionCreateResponse.VoiceEnum = { 
  alloy: 'alloy',
  ash: 'ash',
  ballad: 'ballad',
  coral: 'coral',
  echo: 'echo',
  sage: 'sage',
  shimmer: 'shimmer',
  verse: 'verse',
}
