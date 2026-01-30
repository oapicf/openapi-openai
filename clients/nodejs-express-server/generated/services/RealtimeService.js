/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
*
* realtimeSessionCreateRequest RealtimeSessionCreateRequest Create an ephemeral API key with the given session configuration.
* returns RealtimeSessionCreateResponse
* */
const createRealtimeSession = ({ realtimeSessionCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        realtimeSessionCreateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  createRealtimeSession,
};
