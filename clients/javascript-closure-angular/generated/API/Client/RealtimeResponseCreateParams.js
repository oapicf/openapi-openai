goog.provide('API.Client.RealtimeResponseCreateParams');

/**
 * Create a new Realtime response with these parameters
 * @record
 */
API.Client.RealtimeResponseCreateParams = function() {}

/**
 * The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.modalities;

/**
 * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.instructions;

/**
 * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.voice;

/**
 * The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.outputAudioFormat;

/**
 * Tools (functions) available to the model.
 * @type {!Array<!API.Client.RealtimeResponseCreateParams_tools_inner>}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.tools;

/**
 * How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.toolChoice;

/**
 * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.temperature;

/**
 * @type {!API.Client.RealtimeResponseCreateParams_max_response_output_tokens}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.maxResponseOutputTokens;

/**
 * @type {!API.Client.RealtimeResponseCreateParams_conversation}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.conversation;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.metadata;

/**
 * Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
 * @type {!Array<!API.Client.RealtimeConversationItem>}
 * @export
 */
API.Client.RealtimeResponseCreateParams.prototype.input;

/** @enum {string} */
API.Client.RealtimeResponseCreateParams.Array&lt;!ModalitiesEnum&gt; = { 
  text: 'text',
  audio: 'audio',
}
/** @enum {string} */
API.Client.RealtimeResponseCreateParams.VoiceEnum = { 
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
API.Client.RealtimeResponseCreateParams.OutputAudioFormatEnum = { 
  pcm16: 'pcm16',
  g711_ulaw: 'g711_ulaw',
  g711_alaw: 'g711_alaw',
}
