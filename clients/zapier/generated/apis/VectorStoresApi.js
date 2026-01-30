const samples = require('../samples/VectorStoresApi');
const CreateVectorStoreFileBatchRequest = require('../models/CreateVectorStoreFileBatchRequest');
const CreateVectorStoreFileRequest = require('../models/CreateVectorStoreFileRequest');
const CreateVectorStoreRequest = require('../models/CreateVectorStoreRequest');
const DeleteVectorStoreFileResponse = require('../models/DeleteVectorStoreFileResponse');
const DeleteVectorStoreResponse = require('../models/DeleteVectorStoreResponse');
const ListVectorStoreFilesResponse = require('../models/ListVectorStoreFilesResponse');
const ListVectorStoresResponse = require('../models/ListVectorStoresResponse');
const UpdateVectorStoreRequest = require('../models/UpdateVectorStoreRequest');
const VectorStoreFileBatchObject = require('../models/VectorStoreFileBatchObject');
const VectorStoreFileObject = require('../models/VectorStoreFileObject');
const VectorStoreObject = require('../models/VectorStoreObject');
const utils = require('../utils/utils');

module.exports = {
    cancelVectorStoreFileBatch: {
        key: 'cancelVectorStoreFileBatch',
        noun: 'Vector stores',
        display: {
            label: 'Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store that the file batch belongs to.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'batch_id',
                    label: 'The ID of the file batch to cancel.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...VectorStoreFileBatchObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'cancelVectorStoreFileBatch', response.json);
                    return results;
                })
            },
            sample: samples['VectorStoreFileBatchObjectSample']
        }
    },
    createVectorStore: {
        key: 'createVectorStore',
        noun: 'Vector stores',
        display: {
            label: 'Create a vector store.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateVectorStoreRequest.fields(),
            ],
            outputFields: [
                ...VectorStoreObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateVectorStoreRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createVectorStore', response.json);
                    return results;
                })
            },
            sample: samples['VectorStoreObjectSample']
        }
    },
    createVectorStoreFile: {
        key: 'createVectorStoreFile',
        noun: 'Vector stores',
        display: {
            label: 'Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store for which to create a File. ',
                    type: 'string',
                    required: true,
                },
                ...CreateVectorStoreFileRequest.fields(),
            ],
            outputFields: [
                ...VectorStoreFileObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}/files'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateVectorStoreFileRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createVectorStoreFile', response.json);
                    return results;
                })
            },
            sample: samples['VectorStoreFileObjectSample']
        }
    },
    createVectorStoreFileBatch: {
        key: 'createVectorStoreFileBatch',
        noun: 'Vector stores',
        display: {
            label: 'Create a vector store file batch.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store for which to create a File Batch. ',
                    type: 'string',
                    required: true,
                },
                ...CreateVectorStoreFileBatchRequest.fields(),
            ],
            outputFields: [
                ...VectorStoreFileBatchObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}/file_batches'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateVectorStoreFileBatchRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createVectorStoreFileBatch', response.json);
                    return results;
                })
            },
            sample: samples['VectorStoreFileBatchObjectSample']
        }
    },
    deleteVectorStore: {
        key: 'deleteVectorStore',
        noun: 'Vector stores',
        display: {
            label: 'Delete a vector store.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store to delete.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...DeleteVectorStoreResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteVectorStore', response.json);
                    return results;
                })
            },
            sample: samples['DeleteVectorStoreResponseSample']
        }
    },
    deleteVectorStoreFile: {
        key: 'deleteVectorStoreFile',
        noun: 'Vector stores',
        display: {
            label: 'Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store that the file belongs to.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'file_id',
                    label: 'The ID of the file to delete.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...DeleteVectorStoreFileResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}/files/{file_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteVectorStoreFile', response.json);
                    return results;
                })
            },
            sample: samples['DeleteVectorStoreFileResponseSample']
        }
    },
    getVectorStore: {
        key: 'getVectorStore',
        noun: 'Vector stores',
        display: {
            label: 'Retrieves a vector store.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store to retrieve.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...VectorStoreObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getVectorStore', response.json);
                    return results;
                })
            },
            sample: samples['VectorStoreObjectSample']
        }
    },
    getVectorStoreFile: {
        key: 'getVectorStoreFile',
        noun: 'Vector stores',
        display: {
            label: 'Retrieves a vector store file.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store that the file belongs to.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'file_id',
                    label: 'The ID of the file being retrieved.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...VectorStoreFileObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}/files/{file_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getVectorStoreFile', response.json);
                    return results;
                })
            },
            sample: samples['VectorStoreFileObjectSample']
        }
    },
    getVectorStoreFileBatch: {
        key: 'getVectorStoreFileBatch',
        noun: 'Vector stores',
        display: {
            label: 'Retrieves a vector store file batch.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store that the file batch belongs to.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'batch_id',
                    label: 'The ID of the file batch being retrieved.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...VectorStoreFileBatchObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getVectorStoreFileBatch', response.json);
                    return results;
                })
            },
            sample: samples['VectorStoreFileBatchObjectSample']
        }
    },
    listFilesInVectorStoreBatch: {
        key: 'listFilesInVectorStoreBatch',
        noun: 'Vector stores',
        display: {
            label: 'Returns a list of vector store files in a batch.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store that the files belong to.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'batch_id',
                    label: 'The ID of the file batch that the files belong to.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'limit',
                    label: 'A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ',
                    type: 'integer',
                },
                {
                    key: 'order',
                    label: 'Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ',
                    type: 'string',
                    choices: [
                        'asc',
                        'desc',
                    ],
                },
                {
                    key: 'after',
                    label: 'A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ',
                    type: 'string',
                },
                {
                    key: 'before',
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
                {
                    key: 'filter',
                    label: 'Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.',
                    type: 'string',
                    choices: [
                        'in_progress',
                        'completed',
                        'failed',
                        'cancelled',
                    ],
                },
            ],
            outputFields: [
                ...ListVectorStoreFilesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'order': bundle.inputData?.['order'],
                        'after': bundle.inputData?.['after'],
                        'before': bundle.inputData?.['before'],
                        'filter': bundle.inputData?.['filter'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listFilesInVectorStoreBatch', response.json);
                    return results;
                })
            },
            sample: samples['ListVectorStoreFilesResponseSample']
        }
    },
    listVectorStoreFiles: {
        key: 'listVectorStoreFiles',
        noun: 'Vector stores',
        display: {
            label: 'Returns a list of vector store files.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store that the files belong to.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'limit',
                    label: 'A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ',
                    type: 'integer',
                },
                {
                    key: 'order',
                    label: 'Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ',
                    type: 'string',
                    choices: [
                        'asc',
                        'desc',
                    ],
                },
                {
                    key: 'after',
                    label: 'A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ',
                    type: 'string',
                },
                {
                    key: 'before',
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
                {
                    key: 'filter',
                    label: 'Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.',
                    type: 'string',
                    choices: [
                        'in_progress',
                        'completed',
                        'failed',
                        'cancelled',
                    ],
                },
            ],
            outputFields: [
                ...ListVectorStoreFilesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}/files'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'order': bundle.inputData?.['order'],
                        'after': bundle.inputData?.['after'],
                        'before': bundle.inputData?.['before'],
                        'filter': bundle.inputData?.['filter'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listVectorStoreFiles', response.json);
                    return results;
                })
            },
            sample: samples['ListVectorStoreFilesResponseSample']
        }
    },
    listVectorStores: {
        key: 'listVectorStores',
        noun: 'Vector stores',
        display: {
            label: 'Returns a list of vector stores.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'limit',
                    label: 'A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ',
                    type: 'integer',
                },
                {
                    key: 'order',
                    label: 'Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ',
                    type: 'string',
                    choices: [
                        'asc',
                        'desc',
                    ],
                },
                {
                    key: 'after',
                    label: 'A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ',
                    type: 'string',
                },
                {
                    key: 'before',
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ListVectorStoresResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'order': bundle.inputData?.['order'],
                        'after': bundle.inputData?.['after'],
                        'before': bundle.inputData?.['before'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listVectorStores', response.json);
                    return results;
                })
            },
            sample: samples['ListVectorStoresResponseSample']
        }
    },
    modifyVectorStore: {
        key: 'modifyVectorStore',
        noun: 'Vector stores',
        display: {
            label: 'Modifies a vector store.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'vector_store_id',
                    label: 'The ID of the vector store to modify.',
                    type: 'string',
                    required: true,
                },
                ...UpdateVectorStoreRequest.fields(),
            ],
            outputFields: [
                ...VectorStoreObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/vector_stores/{vector_store_id}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...UpdateVectorStoreRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'modifyVectorStore', response.json);
                    return results;
                })
            },
            sample: samples['VectorStoreObjectSample']
        }
    },
}
