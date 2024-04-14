const samples = require('../samples/ImagesApi');
const CreateImageEditRequest_model = require('../models/CreateImageEditRequest_model');
const CreateImageRequest = require('../models/CreateImageRequest');
const ImagesResponse = require('../models/ImagesResponse');
const utils = require('../utils/utils');
const FormData = require('form-data');
const FormData = require('form-data');

module.exports = {
    createImage: {
        key: 'createImage',
        noun: 'Images',
        display: {
            label: 'Creates an image given a prompt.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateImageRequest.fields(),
            ],
            outputFields: [
                ...ImagesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/images/generations'),
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
                        ...CreateImageRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['ImagesResponseSample']
        }
    },
    createImageEdit: {
        key: 'createImageEdit',
        noun: 'Images',
        display: {
            label: 'Creates an edited or extended image given an original image and a prompt.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'image',
                    label: 'The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.',
                    type: 'file',
                    required: true,
                },
                {
                    key: 'prompt',
                    label: 'A text description of the desired image(s). The maximum length is 1000 characters.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'mask',
                    label: 'An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.',
                    type: 'file',
                },
                ...CreateImageEditRequest_model.fields(),
                {
                    key: 'n',
                    label: 'The number of images to generate. Must be between 1 and 10.',
                    type: 'integer',
                },
                {
                    key: 'size',
                    label: 'The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.',
                    type: 'string',
                    choices: [
                        '256x256',
                        '512x512',
                        '1024x1024',
                    ],
                },
                {
                    key: 'response_format',
                    label: 'The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.',
                    type: 'string',
                    choices: [
                        'url',
                        'b64_json',
                    ],
                },
                {
                    key: 'user',
                    label: 'A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ImagesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['image'].split('/').slice(-1)[0]
                formData.append('image', (await (await z.request({url: bundle.inputData?.['image'], method: 'GET', raw: true})).buffer()), { filename: filename })
                formData.append('prompt', bundle.inputData?.['prompt'])
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['mask'].split('/').slice(-1)[0]
                formData.append('mask', (await (await z.request({url: bundle.inputData?.['mask'], method: 'GET', raw: true})).buffer()), { filename: filename })
                formData.append('model', bundle.inputData?.['model'])
                formData.append('n', bundle.inputData?.['n'])
                formData.append('size', bundle.inputData?.['size'])
                formData.append('response_format', bundle.inputData?.['response_format'])
                formData.append('user', bundle.inputData?.['user'])
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/images/edits'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: formData,
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['ImagesResponseSample']
        }
    },
    createImageVariation: {
        key: 'createImageVariation',
        noun: 'Images',
        display: {
            label: 'Creates a variation of a given image.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'image',
                    label: 'The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.',
                    type: 'file',
                    required: true,
                },
                ...CreateImageEditRequest_model.fields(),
                {
                    key: 'n',
                    label: 'The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.',
                    type: 'integer',
                },
                {
                    key: 'response_format',
                    label: 'The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.',
                    type: 'string',
                    choices: [
                        'url',
                        'b64_json',
                    ],
                },
                {
                    key: 'size',
                    label: 'The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.',
                    type: 'string',
                    choices: [
                        '256x256',
                        '512x512',
                        '1024x1024',
                    ],
                },
                {
                    key: 'user',
                    label: 'A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ImagesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['image'].split('/').slice(-1)[0]
                formData.append('image', (await (await z.request({url: bundle.inputData?.['image'], method: 'GET', raw: true})).buffer()), { filename: filename })
                formData.append('model', bundle.inputData?.['model'])
                formData.append('n', bundle.inputData?.['n'])
                formData.append('response_format', bundle.inputData?.['response_format'])
                formData.append('size', bundle.inputData?.['size'])
                formData.append('user', bundle.inputData?.['user'])
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/images/variations'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: formData,
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['ImagesResponseSample']
        }
    },
}
