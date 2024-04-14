const samples = require('../samples/ChatApi');
const CreateChatCompletionRequest = require('../models/CreateChatCompletionRequest');
const CreateChatCompletionResponse = require('../models/CreateChatCompletionResponse');
const utils = require('../utils/utils');

module.exports = {
    createChatCompletion: {
        key: 'createChatCompletion',
        noun: 'Chat',
        display: {
            label: 'Creates a model response for the given chat conversation.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateChatCompletionRequest.fields(),
            ],
            outputFields: [
                ...CreateChatCompletionResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/chat/completions'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateChatCompletionRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['CreateChatCompletionResponseSample']
        }
    },
}
