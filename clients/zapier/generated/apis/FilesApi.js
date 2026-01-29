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
            label: 'Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ',
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
                    label: 'The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. ',
                    type: 'string',
                    required: true,
                    choices: [
                        'fine-tune',
                        'assistants',
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
            label: 'Returns a list of files that belong to the user&#39;s organization.',
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
