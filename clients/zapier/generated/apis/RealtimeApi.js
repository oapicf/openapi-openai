const samples = require('../samples/RealtimeApi');
const RealtimeSessionCreateRequest = require('../models/RealtimeSessionCreateRequest');
const RealtimeSessionCreateResponse = require('../models/RealtimeSessionCreateResponse');
const utils = require('../utils/utils');

module.exports = {
    createRealtimeSession: {
        key: 'createRealtimeSession',
        noun: 'Realtime',
        display: {
            label: 'Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...RealtimeSessionCreateRequest.fields(),
            ],
            outputFields: [
                ...RealtimeSessionCreateResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/realtime/sessions'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...RealtimeSessionCreateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createRealtimeSession', response.json);
                    return results;
                })
            },
            sample: samples['RealtimeSessionCreateResponseSample']
        }
    },
}
