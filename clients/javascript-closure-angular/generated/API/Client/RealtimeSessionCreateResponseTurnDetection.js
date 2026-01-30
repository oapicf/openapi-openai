goog.provide('API.Client.RealtimeSessionCreateResponse_turn_detection');

/**
 * Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 * @record
 */
API.Client.RealtimeSessionCreateResponseTurnDetection = function() {}

/**
 * Type of turn detection, only `server_vad` is currently supported. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateResponseTurnDetection.prototype.type;

/**
 * Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeSessionCreateResponseTurnDetection.prototype.threshold;

/**
 * Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeSessionCreateResponseTurnDetection.prototype.prefixPaddingMs;

/**
 * Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeSessionCreateResponseTurnDetection.prototype.silenceDurationMs;

