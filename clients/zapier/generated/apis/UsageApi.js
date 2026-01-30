const samples = require('../samples/UsageApi');
const UsageResponse = require('../models/UsageResponse');
const utils = require('../utils/utils');

module.exports = {
    usageAudioSpeeches: {
        key: 'usageAudioSpeeches',
        noun: 'Usage',
        display: {
            label: 'Get audio speeches usage details for the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_time',
                    label: 'Start time (Unix seconds) of the query time range, inclusive.',
                    type: 'integer',
                    required: true,
                },
                {
                    key: 'end_time',
                    label: 'End time (Unix seconds) of the query time range, exclusive.',
                    type: 'integer',
                },
                {
                    key: 'bucket_width',
                    label: 'Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.',
                    type: 'string',
                    choices: [
                        '1m',
                        '1h',
                        '1d',
                    ],
                },
                {
                    key: 'project_ids',
                    label: 'Return only usage for these projects.',
                    type: 'string',
                }
                {
                    key: 'user_ids',
                    label: 'Return only usage for these users.',
                    type: 'string',
                }
                {
                    key: 'api_key_ids',
                    label: 'Return only usage for these API keys.',
                    type: 'string',
                }
                {
                    key: 'models',
                    label: 'Return only usage for these models.',
                    type: 'string',
                }
                {
                    key: 'group_by',
                    label: 'Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.',
                    type: 'string',
                }
                {
                    key: 'limit',
                    label: 'Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ',
                    type: 'integer',
                },
                {
                    key: 'page',
                    label: 'A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UsageResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/usage/audio_speeches'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_time': bundle.inputData?.['start_time'],
                        'end_time': bundle.inputData?.['end_time'],
                        'bucket_width': bundle.inputData?.['bucket_width'],
                        'project_ids': bundle.inputData?.['project_ids'],
                        'user_ids': bundle.inputData?.['user_ids'],
                        'api_key_ids': bundle.inputData?.['api_key_ids'],
                        'models': bundle.inputData?.['models'],
                        'group_by': bundle.inputData?.['group_by'],
                        'limit': bundle.inputData?.['limit'],
                        'page': bundle.inputData?.['page'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'usageAudioSpeeches', response.json);
                    return results;
                })
            },
            sample: samples['UsageResponseSample']
        }
    },
    usageAudioTranscriptions: {
        key: 'usageAudioTranscriptions',
        noun: 'Usage',
        display: {
            label: 'Get audio transcriptions usage details for the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_time',
                    label: 'Start time (Unix seconds) of the query time range, inclusive.',
                    type: 'integer',
                    required: true,
                },
                {
                    key: 'end_time',
                    label: 'End time (Unix seconds) of the query time range, exclusive.',
                    type: 'integer',
                },
                {
                    key: 'bucket_width',
                    label: 'Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.',
                    type: 'string',
                    choices: [
                        '1m',
                        '1h',
                        '1d',
                    ],
                },
                {
                    key: 'project_ids',
                    label: 'Return only usage for these projects.',
                    type: 'string',
                }
                {
                    key: 'user_ids',
                    label: 'Return only usage for these users.',
                    type: 'string',
                }
                {
                    key: 'api_key_ids',
                    label: 'Return only usage for these API keys.',
                    type: 'string',
                }
                {
                    key: 'models',
                    label: 'Return only usage for these models.',
                    type: 'string',
                }
                {
                    key: 'group_by',
                    label: 'Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.',
                    type: 'string',
                }
                {
                    key: 'limit',
                    label: 'Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ',
                    type: 'integer',
                },
                {
                    key: 'page',
                    label: 'A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UsageResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/usage/audio_transcriptions'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_time': bundle.inputData?.['start_time'],
                        'end_time': bundle.inputData?.['end_time'],
                        'bucket_width': bundle.inputData?.['bucket_width'],
                        'project_ids': bundle.inputData?.['project_ids'],
                        'user_ids': bundle.inputData?.['user_ids'],
                        'api_key_ids': bundle.inputData?.['api_key_ids'],
                        'models': bundle.inputData?.['models'],
                        'group_by': bundle.inputData?.['group_by'],
                        'limit': bundle.inputData?.['limit'],
                        'page': bundle.inputData?.['page'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'usageAudioTranscriptions', response.json);
                    return results;
                })
            },
            sample: samples['UsageResponseSample']
        }
    },
    usageCodeInterpreterSessions: {
        key: 'usageCodeInterpreterSessions',
        noun: 'Usage',
        display: {
            label: 'Get code interpreter sessions usage details for the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_time',
                    label: 'Start time (Unix seconds) of the query time range, inclusive.',
                    type: 'integer',
                    required: true,
                },
                {
                    key: 'end_time',
                    label: 'End time (Unix seconds) of the query time range, exclusive.',
                    type: 'integer',
                },
                {
                    key: 'bucket_width',
                    label: 'Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.',
                    type: 'string',
                    choices: [
                        '1m',
                        '1h',
                        '1d',
                    ],
                },
                {
                    key: 'project_ids',
                    label: 'Return only usage for these projects.',
                    type: 'string',
                }
                {
                    key: 'group_by',
                    label: 'Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.',
                    type: 'string',
                }
                {
                    key: 'limit',
                    label: 'Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ',
                    type: 'integer',
                },
                {
                    key: 'page',
                    label: 'A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UsageResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/usage/code_interpreter_sessions'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_time': bundle.inputData?.['start_time'],
                        'end_time': bundle.inputData?.['end_time'],
                        'bucket_width': bundle.inputData?.['bucket_width'],
                        'project_ids': bundle.inputData?.['project_ids'],
                        'group_by': bundle.inputData?.['group_by'],
                        'limit': bundle.inputData?.['limit'],
                        'page': bundle.inputData?.['page'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'usageCodeInterpreterSessions', response.json);
                    return results;
                })
            },
            sample: samples['UsageResponseSample']
        }
    },
    usageCompletions: {
        key: 'usageCompletions',
        noun: 'Usage',
        display: {
            label: 'Get completions usage details for the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_time',
                    label: 'Start time (Unix seconds) of the query time range, inclusive.',
                    type: 'integer',
                    required: true,
                },
                {
                    key: 'end_time',
                    label: 'End time (Unix seconds) of the query time range, exclusive.',
                    type: 'integer',
                },
                {
                    key: 'bucket_width',
                    label: 'Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.',
                    type: 'string',
                    choices: [
                        '1m',
                        '1h',
                        '1d',
                    ],
                },
                {
                    key: 'project_ids',
                    label: 'Return only usage for these projects.',
                    type: 'string',
                }
                {
                    key: 'user_ids',
                    label: 'Return only usage for these users.',
                    type: 'string',
                }
                {
                    key: 'api_key_ids',
                    label: 'Return only usage for these API keys.',
                    type: 'string',
                }
                {
                    key: 'models',
                    label: 'Return only usage for these models.',
                    type: 'string',
                }
                {
                    key: 'batch',
                    label: 'If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. ',
                    type: 'boolean',
                },
                {
                    key: 'group_by',
                    label: 'Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.',
                    type: 'string',
                }
                {
                    key: 'limit',
                    label: 'Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ',
                    type: 'integer',
                },
                {
                    key: 'page',
                    label: 'A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UsageResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/usage/completions'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_time': bundle.inputData?.['start_time'],
                        'end_time': bundle.inputData?.['end_time'],
                        'bucket_width': bundle.inputData?.['bucket_width'],
                        'project_ids': bundle.inputData?.['project_ids'],
                        'user_ids': bundle.inputData?.['user_ids'],
                        'api_key_ids': bundle.inputData?.['api_key_ids'],
                        'models': bundle.inputData?.['models'],
                        'batch': bundle.inputData?.['batch'],
                        'group_by': bundle.inputData?.['group_by'],
                        'limit': bundle.inputData?.['limit'],
                        'page': bundle.inputData?.['page'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'usageCompletions', response.json);
                    return results;
                })
            },
            sample: samples['UsageResponseSample']
        }
    },
    usageCosts: {
        key: 'usageCosts',
        noun: 'Usage',
        display: {
            label: 'Get costs details for the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_time',
                    label: 'Start time (Unix seconds) of the query time range, inclusive.',
                    type: 'integer',
                    required: true,
                },
                {
                    key: 'end_time',
                    label: 'End time (Unix seconds) of the query time range, exclusive.',
                    type: 'integer',
                },
                {
                    key: 'bucket_width',
                    label: 'Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.',
                    type: 'string',
                    choices: [
                        '1d',
                    ],
                },
                {
                    key: 'project_ids',
                    label: 'Return only costs for these projects.',
                    type: 'string',
                }
                {
                    key: 'group_by',
                    label: 'Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.',
                    type: 'string',
                }
                {
                    key: 'limit',
                    label: 'A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. ',
                    type: 'integer',
                },
                {
                    key: 'page',
                    label: 'A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UsageResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/costs'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_time': bundle.inputData?.['start_time'],
                        'end_time': bundle.inputData?.['end_time'],
                        'bucket_width': bundle.inputData?.['bucket_width'],
                        'project_ids': bundle.inputData?.['project_ids'],
                        'group_by': bundle.inputData?.['group_by'],
                        'limit': bundle.inputData?.['limit'],
                        'page': bundle.inputData?.['page'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'usageCosts', response.json);
                    return results;
                })
            },
            sample: samples['UsageResponseSample']
        }
    },
    usageEmbeddings: {
        key: 'usageEmbeddings',
        noun: 'Usage',
        display: {
            label: 'Get embeddings usage details for the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_time',
                    label: 'Start time (Unix seconds) of the query time range, inclusive.',
                    type: 'integer',
                    required: true,
                },
                {
                    key: 'end_time',
                    label: 'End time (Unix seconds) of the query time range, exclusive.',
                    type: 'integer',
                },
                {
                    key: 'bucket_width',
                    label: 'Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.',
                    type: 'string',
                    choices: [
                        '1m',
                        '1h',
                        '1d',
                    ],
                },
                {
                    key: 'project_ids',
                    label: 'Return only usage for these projects.',
                    type: 'string',
                }
                {
                    key: 'user_ids',
                    label: 'Return only usage for these users.',
                    type: 'string',
                }
                {
                    key: 'api_key_ids',
                    label: 'Return only usage for these API keys.',
                    type: 'string',
                }
                {
                    key: 'models',
                    label: 'Return only usage for these models.',
                    type: 'string',
                }
                {
                    key: 'group_by',
                    label: 'Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.',
                    type: 'string',
                }
                {
                    key: 'limit',
                    label: 'Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ',
                    type: 'integer',
                },
                {
                    key: 'page',
                    label: 'A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UsageResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/usage/embeddings'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_time': bundle.inputData?.['start_time'],
                        'end_time': bundle.inputData?.['end_time'],
                        'bucket_width': bundle.inputData?.['bucket_width'],
                        'project_ids': bundle.inputData?.['project_ids'],
                        'user_ids': bundle.inputData?.['user_ids'],
                        'api_key_ids': bundle.inputData?.['api_key_ids'],
                        'models': bundle.inputData?.['models'],
                        'group_by': bundle.inputData?.['group_by'],
                        'limit': bundle.inputData?.['limit'],
                        'page': bundle.inputData?.['page'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'usageEmbeddings', response.json);
                    return results;
                })
            },
            sample: samples['UsageResponseSample']
        }
    },
    usageImages: {
        key: 'usageImages',
        noun: 'Usage',
        display: {
            label: 'Get images usage details for the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_time',
                    label: 'Start time (Unix seconds) of the query time range, inclusive.',
                    type: 'integer',
                    required: true,
                },
                {
                    key: 'end_time',
                    label: 'End time (Unix seconds) of the query time range, exclusive.',
                    type: 'integer',
                },
                {
                    key: 'bucket_width',
                    label: 'Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.',
                    type: 'string',
                    choices: [
                        '1m',
                        '1h',
                        '1d',
                    ],
                },
                {
                    key: 'sources',
                    label: 'Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.',
                    type: 'string',
                }
                {
                    key: 'sizes',
                    label: 'Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.',
                    type: 'string',
                }
                {
                    key: 'project_ids',
                    label: 'Return only usage for these projects.',
                    type: 'string',
                }
                {
                    key: 'user_ids',
                    label: 'Return only usage for these users.',
                    type: 'string',
                }
                {
                    key: 'api_key_ids',
                    label: 'Return only usage for these API keys.',
                    type: 'string',
                }
                {
                    key: 'models',
                    label: 'Return only usage for these models.',
                    type: 'string',
                }
                {
                    key: 'group_by',
                    label: 'Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.',
                    type: 'string',
                }
                {
                    key: 'limit',
                    label: 'Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ',
                    type: 'integer',
                },
                {
                    key: 'page',
                    label: 'A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UsageResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/usage/images'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_time': bundle.inputData?.['start_time'],
                        'end_time': bundle.inputData?.['end_time'],
                        'bucket_width': bundle.inputData?.['bucket_width'],
                        'sources': bundle.inputData?.['sources'],
                        'sizes': bundle.inputData?.['sizes'],
                        'project_ids': bundle.inputData?.['project_ids'],
                        'user_ids': bundle.inputData?.['user_ids'],
                        'api_key_ids': bundle.inputData?.['api_key_ids'],
                        'models': bundle.inputData?.['models'],
                        'group_by': bundle.inputData?.['group_by'],
                        'limit': bundle.inputData?.['limit'],
                        'page': bundle.inputData?.['page'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'usageImages', response.json);
                    return results;
                })
            },
            sample: samples['UsageResponseSample']
        }
    },
    usageModerations: {
        key: 'usageModerations',
        noun: 'Usage',
        display: {
            label: 'Get moderations usage details for the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_time',
                    label: 'Start time (Unix seconds) of the query time range, inclusive.',
                    type: 'integer',
                    required: true,
                },
                {
                    key: 'end_time',
                    label: 'End time (Unix seconds) of the query time range, exclusive.',
                    type: 'integer',
                },
                {
                    key: 'bucket_width',
                    label: 'Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.',
                    type: 'string',
                    choices: [
                        '1m',
                        '1h',
                        '1d',
                    ],
                },
                {
                    key: 'project_ids',
                    label: 'Return only usage for these projects.',
                    type: 'string',
                }
                {
                    key: 'user_ids',
                    label: 'Return only usage for these users.',
                    type: 'string',
                }
                {
                    key: 'api_key_ids',
                    label: 'Return only usage for these API keys.',
                    type: 'string',
                }
                {
                    key: 'models',
                    label: 'Return only usage for these models.',
                    type: 'string',
                }
                {
                    key: 'group_by',
                    label: 'Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.',
                    type: 'string',
                }
                {
                    key: 'limit',
                    label: 'Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ',
                    type: 'integer',
                },
                {
                    key: 'page',
                    label: 'A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UsageResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/usage/moderations'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_time': bundle.inputData?.['start_time'],
                        'end_time': bundle.inputData?.['end_time'],
                        'bucket_width': bundle.inputData?.['bucket_width'],
                        'project_ids': bundle.inputData?.['project_ids'],
                        'user_ids': bundle.inputData?.['user_ids'],
                        'api_key_ids': bundle.inputData?.['api_key_ids'],
                        'models': bundle.inputData?.['models'],
                        'group_by': bundle.inputData?.['group_by'],
                        'limit': bundle.inputData?.['limit'],
                        'page': bundle.inputData?.['page'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'usageModerations', response.json);
                    return results;
                })
            },
            sample: samples['UsageResponseSample']
        }
    },
    usageVectorStores: {
        key: 'usageVectorStores',
        noun: 'Usage',
        display: {
            label: 'Get vector stores usage details for the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'start_time',
                    label: 'Start time (Unix seconds) of the query time range, inclusive.',
                    type: 'integer',
                    required: true,
                },
                {
                    key: 'end_time',
                    label: 'End time (Unix seconds) of the query time range, exclusive.',
                    type: 'integer',
                },
                {
                    key: 'bucket_width',
                    label: 'Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.',
                    type: 'string',
                    choices: [
                        '1m',
                        '1h',
                        '1d',
                    ],
                },
                {
                    key: 'project_ids',
                    label: 'Return only usage for these projects.',
                    type: 'string',
                }
                {
                    key: 'group_by',
                    label: 'Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.',
                    type: 'string',
                }
                {
                    key: 'limit',
                    label: 'Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ',
                    type: 'integer',
                },
                {
                    key: 'page',
                    label: 'A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.',
                    type: 'string',
                },
            ],
            outputFields: [
                ...UsageResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/usage/vector_stores'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'start_time': bundle.inputData?.['start_time'],
                        'end_time': bundle.inputData?.['end_time'],
                        'bucket_width': bundle.inputData?.['bucket_width'],
                        'project_ids': bundle.inputData?.['project_ids'],
                        'group_by': bundle.inputData?.['group_by'],
                        'limit': bundle.inputData?.['limit'],
                        'page': bundle.inputData?.['page'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'usageVectorStores', response.json);
                    return results;
                })
            },
            sample: samples['UsageResponseSample']
        }
    },
}
