const samples = require('../samples/ChatApi');
const CreateChatCompletionRequest = require('../models/CreateChatCompletionRequest');
const CreateChatCompletionResponse = require('../models/CreateChatCompletionResponse');
const utils = require('../utils/utils');

module.exports = {
    createChatCompletion: {
        key: 'createChatCompletion',
        noun: 'Chat',
        display: {
            label: 'Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). ',
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
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateChatCompletionRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createChatCompletion', response.json);
                    return results;
                })
            },
            sample: samples['CreateChatCompletionResponseSample']
        }
    },
}
