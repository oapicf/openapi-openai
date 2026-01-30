const samples = require('../samples/UploadsApi');
const CompleteUploadRequest = require('../models/CompleteUploadRequest');
const CreateUploadRequest = require('../models/CreateUploadRequest');
const Upload = require('../models/Upload');
const UploadPart = require('../models/UploadPart');
const utils = require('../utils/utils');
const FormData = require('form-data');

module.exports = {
    addUploadPart: {
        key: 'addUploadPart',
        noun: 'Uploads',
        display: {
            label: 'Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'upload_id',
                    label: 'The ID of the Upload. ',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'data',
                    label: 'The chunk of bytes for this Part. ',
                    type: 'file',
                    required: true,
                },
            ],
            outputFields: [
                ...UploadPart.fields('', false),
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['data'].split('/').slice(-1)[0]
                formData.append('data', (await (await z.request({url: bundle.inputData?.['data'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/uploads/{upload_id}/parts'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'addUploadPart', response.json);
                    return results;
                })
            },
            sample: samples['UploadPartSample']
        }
    },
    cancelUpload: {
        key: 'cancelUpload',
        noun: 'Uploads',
        display: {
            label: 'Cancels the Upload. No Parts may be added after an Upload is cancelled. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'upload_id',
                    label: 'The ID of the Upload. ',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Upload.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/uploads/{upload_id}/cancel'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'cancelUpload', response.json);
                    return results;
                })
            },
            sample: samples['UploadSample']
        }
    },
    completeUpload: {
        key: 'completeUpload',
        noun: 'Uploads',
        display: {
            label: 'Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'upload_id',
                    label: 'The ID of the Upload. ',
                    type: 'string',
                    required: true,
                },
                ...CompleteUploadRequest.fields(),
            ],
            outputFields: [
                ...Upload.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/uploads/{upload_id}/complete'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CompleteUploadRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'completeUpload', response.json);
                    return results;
                })
            },
            sample: samples['UploadSample']
        }
    },
    createUpload: {
        key: 'createUpload',
        noun: 'Uploads',
        display: {
            label: 'Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateUploadRequest.fields(),
            ],
            outputFields: [
                ...Upload.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/uploads'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateUploadRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createUpload', response.json);
                    return results;
                })
            },
            sample: samples['UploadSample']
        }
    },
}
