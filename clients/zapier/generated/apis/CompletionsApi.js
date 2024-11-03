const samples = require('../samples/CompletionsApi');
const CreateCompletionRequest = require('../models/CreateCompletionRequest');
const CreateCompletionResponse = require('../models/CreateCompletionResponse');
const utils = require('../utils/utils');

module.exports = {
    createCompletion: {
        key: 'createCompletion',
        noun: 'Completions',
        display: {
            label: 'Creates a completion for the provided prompt and parameters.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateCompletionRequest.fields(),
            ],
            outputFields: [
                ...CreateCompletionResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/completions'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateCompletionRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createCompletion', response.json);
                    return results;
                })
            },
            sample: samples['CreateCompletionResponseSample']
        }
    },
}
