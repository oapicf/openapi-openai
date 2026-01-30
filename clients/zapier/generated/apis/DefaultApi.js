const samples = require('../samples/DefaultApi');
const AdminApiKey = require('../models/AdminApiKey');
const ApiKeyList = require('../models/ApiKeyList');
const admin_api_keys_create_request = require('../models/admin_api_keys_create_request');
const admin_api_keys_delete_200_response = require('../models/admin_api_keys_delete_200_response');
const utils = require('../utils/utils');

module.exports = {
    adminApiKeysCreate: {
        key: 'adminApiKeysCreate',
        noun: 'default',
        display: {
            label: 'Create an organization admin API key',
            description: 'Create a new admin-level API key for the organization.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...admin_api_keys_create_request.fields(),
            ],
            outputFields: [
                ...AdminApiKey.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/admin_api_keys'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...admin_api_keys_create_request.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adminApiKeysCreate', response.json);
                    return results;
                })
            },
            sample: samples['AdminApiKeySample']
        }
    },
    adminApiKeysDelete: {
        key: 'adminApiKeysDelete',
        noun: 'default',
        display: {
            label: 'Delete an organization admin API key',
            description: 'Delete the specified admin API key.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'key_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...admin_api_keys_delete_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/admin_api_keys/{key_id}'),
                    method: 'DELETE',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adminApiKeysDelete', response.json);
                    return results;
                })
            },
            sample: samples['admin_api_keys_delete_200_responseSample']
        }
    },
    adminApiKeysGet: {
        key: 'adminApiKeysGet',
        noun: 'default',
        display: {
            label: 'Retrieve a single organization API key',
            description: 'Get details for a specific organization API key by its ID.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'key_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...AdminApiKey.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/admin_api_keys/{key_id}'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adminApiKeysGet', response.json);
                    return results;
                })
            },
            sample: samples['AdminApiKeySample']
        }
    },
    adminApiKeysList: {
        key: 'adminApiKeysList',
        noun: 'default',
        display: {
            label: 'List organization API keys',
            description: 'Retrieve a paginated list of organization admin API keys.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'after',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'order',
                    label: '',
                    type: 'string',
                    choices: [
                        'asc',
                        'desc',
                    ],
                },
                {
                    key: 'limit',
                    label: '',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...ApiKeyList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/admin_api_keys'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'after': bundle.inputData?.['after'],
                        'order': bundle.inputData?.['order'],
                        'limit': bundle.inputData?.['limit'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adminApiKeysList', response.json);
                    return results;
                })
            },
            sample: samples['ApiKeyListSample']
        }
    },
}
