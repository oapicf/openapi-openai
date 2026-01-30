const samples = require('../samples/FilesApi');
const DeleteFileResponse = require('../models/DeleteFileResponse');
const ListFilesResponse = require('../models/ListFilesResponse');
const OpenAIFile = require('../models/OpenAIFile');
const utils = require('../utils/utils');
const FormData = require('form-data');

module.exports = {
    createFile: {
        key: 'createFile',
        noun: 'Files',
        display: {
            label: 'Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file',
                    label: 'The File object (not file name) to be uploaded. ',
                    type: 'file',
                    required: true,
                },
                {
                    key: 'purpose',
                    label: 'The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning). ',
                    type: 'string',
                    required: true,
                    choices: [
                        'assistants',
                        'batch',
                        'fine-tune',
                        'vision',
                    ],
                },
            ],
            outputFields: [
                ...OpenAIFile.fields('', false),
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['file'].split('/').slice(-1)[0]
                formData.append('file', (await (await z.request({url: bundle.inputData?.['file'], method: 'GET', raw: true})).buffer()), { filename: filename })
                formData.append('purpose', bundle.inputData?.['purpose'])
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/files'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: formData,
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createFile', response.json);
                    return results;
                })
            },
            sample: samples['OpenAIFileSample']
        }
    },
    deleteFile: {
        key: 'deleteFile',
        noun: 'Files',
        display: {
            label: 'Delete a file.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file_id',
                    label: 'The ID of the file to use for this request.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...DeleteFileResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/files/{file_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteFile', response.json);
                    return results;
                })
            },
            sample: samples['DeleteFileResponseSample']
        }
    },
    downloadFile: {
        key: 'downloadFile',
        noun: 'Files',
        display: {
            label: 'Returns the contents of the specified file.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file_id',
                    label: 'The ID of the file to use for this request.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/files/{file_id}/content'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'downloadFile', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    listFiles: {
        key: 'listFiles',
        noun: 'Files',
        display: {
            label: 'Returns a list of files.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'purpose',
                    label: 'Only return files with the given purpose.',
                    type: 'string',
                },
                {
                    key: 'limit',
                    label: 'A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. ',
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
            ],
            outputFields: [
                ...ListFilesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/files'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'purpose': bundle.inputData?.['purpose'],
                        'limit': bundle.inputData?.['limit'],
                        'order': bundle.inputData?.['order'],
                        'after': bundle.inputData?.['after'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listFiles', response.json);
                    return results;
                })
            },
            sample: samples['ListFilesResponseSample']
        }
    },
    retrieveFile: {
        key: 'retrieveFile',
        noun: 'Files',
        display: {
            label: 'Returns information about a specific file.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file_id',
                    label: 'The ID of the file to use for this request.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...OpenAIFile.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/files/{file_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'retrieveFile', response.json);
                    return results;
                })
            },
            sample: samples['OpenAIFileSample']
        }
    },
}
