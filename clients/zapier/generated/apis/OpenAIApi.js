const samples = require('../samples/OpenAIApi');
const CreateChatCompletionRequest = require('../models/CreateChatCompletionRequest');
const CreateChatCompletionResponse = require('../models/CreateChatCompletionResponse');
const CreateCompletionRequest = require('../models/CreateCompletionRequest');
const CreateCompletionResponse = require('../models/CreateCompletionResponse');
const CreateEditRequest = require('../models/CreateEditRequest');
const CreateEditResponse = require('../models/CreateEditResponse');
const CreateEmbeddingRequest = require('../models/CreateEmbeddingRequest');
const CreateEmbeddingResponse = require('../models/CreateEmbeddingResponse');
const CreateFineTuneRequest = require('../models/CreateFineTuneRequest');
const CreateImageRequest = require('../models/CreateImageRequest');
const CreateModerationRequest = require('../models/CreateModerationRequest');
const CreateModerationResponse = require('../models/CreateModerationResponse');
const CreateTranscriptionRequest_model = require('../models/CreateTranscriptionRequest_model');
const CreateTranscriptionResponse = require('../models/CreateTranscriptionResponse');
const CreateTranslationResponse = require('../models/CreateTranslationResponse');
const DeleteFileResponse = require('../models/DeleteFileResponse');
const DeleteModelResponse = require('../models/DeleteModelResponse');
const FineTune = require('../models/FineTune');
const ImagesResponse = require('../models/ImagesResponse');
const ListFilesResponse = require('../models/ListFilesResponse');
const ListFineTuneEventsResponse = require('../models/ListFineTuneEventsResponse');
const ListFineTunesResponse = require('../models/ListFineTunesResponse');
const ListModelsResponse = require('../models/ListModelsResponse');
const Model = require('../models/Model');
const OpenAIFile = require('../models/OpenAIFile');
const utils = require('../utils/utils');
const FormData = require('form-data');
const FormData = require('form-data');
const FormData = require('form-data');
const FormData = require('form-data');
const FormData = require('form-data');

module.exports = {
    cancelFineTune: {
        key: 'cancelFineTune',
        noun: 'OpenAI',
        display: {
            label: 'Immediately cancel a fine-tune job. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'fine_tune_id',
                    label: 'The ID of the fine-tune job to cancel ',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...FineTune.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine-tunes/{fine_tune_id}/cancel'),
                    method: 'POST',
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
            sample: samples['FineTuneSample']
        }
    },
    createChatCompletion: {
        key: 'createChatCompletion',
        noun: 'OpenAI',
        display: {
            label: 'Creates a model response for the given chat conversation.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateChatCompletionRequest.fields(),
            ],
            outputFields: [
                ...CreateChatCompletionResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/chat/completions'),
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
                        ...CreateChatCompletionRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['CreateChatCompletionResponseSample']
        }
    },
    createCompletion: {
        key: 'createCompletion',
        noun: 'OpenAI',
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
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateCompletionRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['CreateCompletionResponseSample']
        }
    },
    createEdit: {
        key: 'createEdit',
        noun: 'OpenAI',
        display: {
            label: 'Creates a new edit for the provided input, instruction, and parameters.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateEditRequest.fields(),
            ],
            outputFields: [
                ...CreateEditResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/edits'),
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
                        ...CreateEditRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['CreateEditResponseSample']
        }
    },
    createEmbedding: {
        key: 'createEmbedding',
        noun: 'OpenAI',
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
    createFile: {
        key: 'createFile',
        noun: 'OpenAI',
        display: {
            label: 'Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file',
                    label: 'Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). ',
                    type: 'file',
                    required: true,
                },
                {
                    key: 'purpose',
                    label: 'The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. ',
                    type: 'string',
                    required: true,
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
            sample: samples['OpenAIFileSample']
        }
    },
    createFineTune: {
        key: 'createFineTune',
        noun: 'OpenAI',
        display: {
            label: 'Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateFineTuneRequest.fields(),
            ],
            outputFields: [
                ...FineTune.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine-tunes'),
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
                        ...CreateFineTuneRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['FineTuneSample']
        }
    },
    createImage: {
        key: 'createImage',
        noun: 'OpenAI',
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
        noun: 'OpenAI',
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
                    label: 'The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.',
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
        noun: 'OpenAI',
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
                    label: 'The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.',
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
                formData.append('n', bundle.inputData?.['n'])
                formData.append('size', bundle.inputData?.['size'])
                formData.append('response_format', bundle.inputData?.['response_format'])
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
    createModeration: {
        key: 'createModeration',
        noun: 'OpenAI',
        display: {
            label: 'Classifies if text violates OpenAI&#39;s Content Policy',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateModerationRequest.fields(),
            ],
            outputFields: [
                ...CreateModerationResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/moderations'),
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
                        ...CreateModerationRequest.mapping(bundle),
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['CreateModerationResponseSample']
        }
    },
    createTranscription: {
        key: 'createTranscription',
        noun: 'OpenAI',
        display: {
            label: 'Transcribes audio into the input language.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file',
                    label: 'The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. ',
                    type: 'file',
                    required: true,
                },
                ...CreateTranscriptionRequest_model.fields(),
                {
                    key: 'prompt',
                    label: 'An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. ',
                    type: 'string',
                },
                {
                    key: 'response_format',
                    label: 'The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. ',
                    type: 'string',
                },
                {
                    key: 'temperature',
                    label: 'The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ',
                    type: 'number',
                },
                {
                    key: 'language',
                    label: 'The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...CreateTranscriptionResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['file'].split('/').slice(-1)[0]
                formData.append('file', (await (await z.request({url: bundle.inputData?.['file'], method: 'GET', raw: true})).buffer()), { filename: filename })
                formData.append('model', bundle.inputData?.['model'])
                formData.append('prompt', bundle.inputData?.['prompt'])
                formData.append('response_format', bundle.inputData?.['response_format'])
                formData.append('temperature', bundle.inputData?.['temperature'])
                formData.append('language', bundle.inputData?.['language'])
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/audio/transcriptions'),
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
            sample: samples['CreateTranscriptionResponseSample']
        }
    },
    createTranslation: {
        key: 'createTranslation',
        noun: 'OpenAI',
        display: {
            label: 'Translates audio into English.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file',
                    label: 'The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. ',
                    type: 'file',
                    required: true,
                },
                ...CreateTranscriptionRequest_model.fields(),
                {
                    key: 'prompt',
                    label: 'An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. ',
                    type: 'string',
                },
                {
                    key: 'response_format',
                    label: 'The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. ',
                    type: 'string',
                },
                {
                    key: 'temperature',
                    label: 'The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ',
                    type: 'number',
                },
            ],
            outputFields: [
                ...CreateTranslationResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['file'].split('/').slice(-1)[0]
                formData.append('file', (await (await z.request({url: bundle.inputData?.['file'], method: 'GET', raw: true})).buffer()), { filename: filename })
                formData.append('model', bundle.inputData?.['model'])
                formData.append('prompt', bundle.inputData?.['prompt'])
                formData.append('response_format', bundle.inputData?.['response_format'])
                formData.append('temperature', bundle.inputData?.['temperature'])
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/audio/translations'),
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
            sample: samples['CreateTranslationResponseSample']
        }
    },
    deleteFile: {
        key: 'deleteFile',
        noun: 'OpenAI',
        display: {
            label: 'Delete a file.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file_id',
                    label: 'The ID of the file to use for this request',
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
            sample: samples['DeleteFileResponseSample']
        }
    },
    deleteModel: {
        key: 'deleteModel',
        noun: 'OpenAI',
        display: {
            label: 'Delete a fine-tuned model. You must have the Owner role in your organization.',
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
    downloadFile: {
        key: 'downloadFile',
        noun: 'OpenAI',
        display: {
            label: 'Returns the contents of the specified file',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file_id',
                    label: 'The ID of the file to use for this request',
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
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    listFiles: {
        key: 'listFiles',
        noun: 'OpenAI',
        display: {
            label: 'Returns a list of files that belong to the user&#39;s organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
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
            sample: samples['ListFilesResponseSample']
        }
    },
    listFineTuneEvents: {
        key: 'listFineTuneEvents',
        noun: 'OpenAI',
        display: {
            label: 'Get fine-grained status updates for a fine-tune job. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'fine_tune_id',
                    label: 'The ID of the fine-tune job to get events for. ',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'stream',
                    label: 'Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. ',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...ListFineTuneEventsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine-tunes/{fine_tune_id}/events'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'stream': bundle.inputData?.['stream'],
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
            sample: samples['ListFineTuneEventsResponseSample']
        }
    },
    listFineTunes: {
        key: 'listFineTunes',
        noun: 'OpenAI',
        display: {
            label: 'List your organization&#39;s fine-tuning jobs ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
                ...ListFineTunesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine-tunes'),
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
            sample: samples['ListFineTunesResponseSample']
        }
    },
    listModels: {
        key: 'listModels',
        noun: 'OpenAI',
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
    retrieveFile: {
        key: 'retrieveFile',
        noun: 'OpenAI',
        display: {
            label: 'Returns information about a specific file.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file_id',
                    label: 'The ID of the file to use for this request',
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
            sample: samples['OpenAIFileSample']
        }
    },
    retrieveFineTune: {
        key: 'retrieveFineTune',
        noun: 'OpenAI',
        display: {
            label: 'Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'fine_tune_id',
                    label: 'The ID of the fine-tune job ',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...FineTune.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine-tunes/{fine_tune_id}'),
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
            sample: samples['FineTuneSample']
        }
    },
    retrieveModel: {
        key: 'retrieveModel',
        noun: 'OpenAI',
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
