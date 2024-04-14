const samples = require('../samples/EmbeddingsApi');
const CreateEmbeddingRequest = require('../models/CreateEmbeddingRequest');
const CreateEmbeddingResponse = require('../models/CreateEmbeddingResponse');
const utils = require('../utils/utils');

module.exports = {
    createEmbedding: {
        key: 'createEmbedding',
        noun: 'Embeddings',
        display: {
            label: 'Creates an embedding vector representing the input text.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateEmbeddingRequest.fields(),
            ],
            outputFields: [
                ...CreateEmbeddingResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/embeddings'),
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
                        ...CreateEmbeddingRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['CreateEmbeddingResponseSample']
        }
    },
}
