goog.provide('API.Client.RealtimeSessionCreateResponse_client_secret');

/**
 * Ephemeral key returned by the API.
 * @record
 */
API.Client.RealtimeSessionCreateResponseClientSecret = function() {}

/**
 * Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeSessionCreateResponseClientSecret.prototype.value;

/**
 * Timestamp for when the token expires. Currently, all tokens expire after one minute. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeSessionCreateResponseClientSecret.prototype.expiresAt;

