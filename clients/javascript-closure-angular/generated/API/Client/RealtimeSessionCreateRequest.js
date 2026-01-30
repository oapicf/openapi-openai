goog.provide('API.Client.RealtimeSessionCreateRequest');

/**
 * Realtime session object configuration.
 * @record
 */
API.Client.RealtimeSessionCreateRequest = function() {}

/**
 * The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.modalities;

/**
 * The Realtime model used for this session. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.model;

/**
 * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.instructions;

/**
 * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.voice;

/**
 * The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.inputAudioFormat;

/**
 * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.outputAudioFormat;

/**
 * @type {!API.Client.RealtimeSession_input_audio_transcription}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.inputAudioTranscription;

/**
 * @type {!API.Client.RealtimeSessionCreateRequest_turn_detection}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.turnDetection;

/**
 * Tools (functions) available to the model.
 * @type {!Array<!API.Client.RealtimeResponseCreateParams_tools_inner>}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.tools;

/**
 * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.toolChoice;

/**
 * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.temperature;

/**
 * @type {!API.Client.RealtimeResponseCreateParams_max_response_output_tokens}
 * @export
 */
API.Client.RealtimeSessionCreateRequest.prototype.maxResponseOutputTokens;

/** @enum {string} */
API.Client.RealtimeSessionCreateRequest.Array&lt;!ModalitiesEnum&gt; = { 
  text: 'text',
  audio: 'audio',
}
/** @enum {string} */
API.Client.RealtimeSessionCreateRequest.ModelEnum = { 
  gpt-4o-realtime-preview: 'gpt-4o-realtime-preview',
  gpt-4o-realtime-preview-2024-10-01: 'gpt-4o-realtime-preview-2024-10-01',
  gpt-4o-realtime-preview-2024-12-17: 'gpt-4o-realtime-preview-2024-12-17',
  gpt-4o-mini-realtime-preview: 'gpt-4o-mini-realtime-preview',
  gpt-4o-mini-realtime-preview-2024-12-17: 'gpt-4o-mini-realtime-preview-2024-12-17',
}
/** @enum {string} */
API.Client.RealtimeSessionCreateRequest.VoiceEnum = { 
  alloy: 'alloy',
  ash: 'ash',
  ballad: 'ballad',
  coral: 'coral',
  echo: 'echo',
  sage: 'sage',
  shimmer: 'shimmer',
  verse: 'verse',
}
/** @enum {string} */
API.Client.RealtimeSessionCreateRequest.InputAudioFormatEnum = { 
  pcm16: 'pcm16',
  g711_ulaw: 'g711_ulaw',
  g711_alaw: 'g711_alaw',
}
/** @enum {string} */
API.Client.RealtimeSessionCreateRequest.OutputAudioFormatEnum = { 
  pcm16: 'pcm16',
  g711_ulaw: 'g711_ulaw',
  g711_alaw: 'g711_alaw',
}
