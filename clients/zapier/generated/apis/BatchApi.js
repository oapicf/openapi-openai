const samples = require('../samples/BatchApi');
const Batch = require('../models/Batch');
const ListBatchesResponse = require('../models/ListBatchesResponse');
const createBatch_request = require('../models/createBatch_request');
const utils = require('../utils/utils');

module.exports = {
    cancelBatch: {
        key: 'cancelBatch',
        noun: 'Batch',
        display: {
            label: 'Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'batch_id',
                    label: 'The ID of the batch to cancel.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Batch.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/batches/{batch_id}/cancel'),
                    method: 'POST',
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'cancelBatch', response.json);
                    return results;
                })
            },
            sample: samples['BatchSample']
        }
    },
    createBatch: {
        key: 'createBatch',
        noun: 'Batch',
        display: {
            label: 'Creates and executes a batch from an uploaded file of requests',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...createBatch_request.fields(),
            ],
            outputFields: [
                ...Batch.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/batches'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...createBatch_request.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createBatch', response.json);
                    return results;
                })
            },
            sample: samples['BatchSample']
        }
    },
    listBatches: {
        key: 'listBatches',
        noun: 'Batch',
        display: {
            label: 'List your organization&#39;s batches.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'after',
                    label: 'A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ',
                    type: 'string',
                },
                {
                    key: 'limit',
                    label: 'A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...ListBatchesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/batches'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'after': bundle.inputData?.['after'],
                        'limit': bundle.inputData?.['limit'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listBatches', response.json);
                    return results;
                })
            },
            sample: samples['ListBatchesResponseSample']
        }
    },
    retrieveBatch: {
        key: 'retrieveBatch',
        noun: 'Batch',
        display: {
            label: 'Retrieves a batch.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'batch_id',
                    label: 'The ID of the batch to retrieve.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Batch.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/batches/{batch_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'retrieveBatch', response.json);
                    return results;
                })
            },
            sample: samples['BatchSample']
        }
    },
}
