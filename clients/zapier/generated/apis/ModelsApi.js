const samples = require('../samples/ModelsApi');
const DeleteModelResponse = require('../models/DeleteModelResponse');
const ListModelsResponse = require('../models/ListModelsResponse');
const Model = require('../models/Model');
const utils = require('../utils/utils');

module.exports = {
    deleteModel: {
        key: 'deleteModel',
        noun: 'Models',
        display: {
            label: 'Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'model',
                    label: 'The model to delete',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...DeleteModelResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/models/{model}'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['DeleteModelResponseSample']
        }
    },
    listModels: {
        key: 'listModels',
        noun: 'Models',
        display: {
            label: 'Lists the currently available models, and provides basic information about each one such as the owner and availability.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
                ...ListModelsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/models'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['ListModelsResponseSample']
        }
    },
    retrieveModel: {
        key: 'retrieveModel',
        noun: 'Models',
        display: {
            label: 'Retrieves a model instance, providing basic information about the model such as the owner and permissioning.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'model',
                    label: 'The ID of the model to use for this request',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Model.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/models/{model}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['ModelSample']
        }
    },
}
