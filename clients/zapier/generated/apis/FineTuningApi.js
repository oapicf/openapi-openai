const samples = require('../samples/FineTuningApi');
const CreateFineTuningJobRequest = require('../models/CreateFineTuningJobRequest');
const FineTuningJob = require('../models/FineTuningJob');
const ListFineTuningJobCheckpointsResponse = require('../models/ListFineTuningJobCheckpointsResponse');
const ListFineTuningJobEventsResponse = require('../models/ListFineTuningJobEventsResponse');
const ListPaginatedFineTuningJobsResponse = require('../models/ListPaginatedFineTuningJobsResponse');
const utils = require('../utils/utils');

module.exports = {
    cancelFineTuningJob: {
        key: 'cancelFineTuningJob',
        noun: 'Fine-tuning',
        display: {
            label: 'Immediately cancel a fine-tune job. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'fine_tuning_job_id',
                    label: 'The ID of the fine-tuning job to cancel. ',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...FineTuningJob.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'cancelFineTuningJob', response.json);
                    return results;
                })
            },
            sample: samples['FineTuningJobSample']
        }
    },
    createFineTuningJob: {
        key: 'createFineTuningJob',
        noun: 'Fine-tuning',
        display: {
            label: 'Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateFineTuningJobRequest.fields(),
            ],
            outputFields: [
                ...FineTuningJob.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine_tuning/jobs'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateFineTuningJobRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createFineTuningJob', response.json);
                    return results;
                })
            },
            sample: samples['FineTuningJobSample']
        }
    },
    listFineTuningEvents: {
        key: 'listFineTuningEvents',
        noun: 'Fine-tuning',
        display: {
            label: 'Get status updates for a fine-tuning job. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'fine_tuning_job_id',
                    label: 'The ID of the fine-tuning job to get events for. ',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'after',
                    label: 'Identifier for the last event from the previous pagination request.',
                    type: 'string',
                },
                {
                    key: 'limit',
                    label: 'Number of events to retrieve.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...ListFineTuningJobEventsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}/events'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listFineTuningEvents', response.json);
                    return results;
                })
            },
            sample: samples['ListFineTuningJobEventsResponseSample']
        }
    },
    listFineTuningJobCheckpoints: {
        key: 'listFineTuningJobCheckpoints',
        noun: 'Fine-tuning',
        display: {
            label: 'List checkpoints for a fine-tuning job. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'fine_tuning_job_id',
                    label: 'The ID of the fine-tuning job to get checkpoints for. ',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'after',
                    label: 'Identifier for the last checkpoint ID from the previous pagination request.',
                    type: 'string',
                },
                {
                    key: 'limit',
                    label: 'Number of checkpoints to retrieve.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...ListFineTuningJobCheckpointsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listFineTuningJobCheckpoints', response.json);
                    return results;
                })
            },
            sample: samples['ListFineTuningJobCheckpointsResponseSample']
        }
    },
    listPaginatedFineTuningJobs: {
        key: 'listPaginatedFineTuningJobs',
        noun: 'Fine-tuning',
        display: {
            label: 'List your organization&#39;s fine-tuning jobs ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'after',
                    label: 'Identifier for the last job from the previous pagination request.',
                    type: 'string',
                },
                {
                    key: 'limit',
                    label: 'Number of fine-tuning jobs to retrieve.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...ListPaginatedFineTuningJobsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine_tuning/jobs'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listPaginatedFineTuningJobs', response.json);
                    return results;
                })
            },
            sample: samples['ListPaginatedFineTuningJobsResponseSample']
        }
    },
    retrieveFineTuningJob: {
        key: 'retrieveFineTuningJob',
        noun: 'Fine-tuning',
        display: {
            label: 'Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'fine_tuning_job_id',
                    label: 'The ID of the fine-tuning job. ',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...FineTuningJob.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'retrieveFineTuningJob', response.json);
                    return results;
                })
            },
            sample: samples['FineTuningJobSample']
        }
    },
}
