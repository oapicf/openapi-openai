const samples = require('../samples/AssistantsApi');
const AssistantFileObject = require('../models/AssistantFileObject');
const AssistantObject = require('../models/AssistantObject');
const CreateAssistantFileRequest = require('../models/CreateAssistantFileRequest');
const CreateAssistantRequest = require('../models/CreateAssistantRequest');
const CreateMessageRequest = require('../models/CreateMessageRequest');
const CreateRunRequest = require('../models/CreateRunRequest');
const CreateThreadAndRunRequest = require('../models/CreateThreadAndRunRequest');
const CreateThreadRequest = require('../models/CreateThreadRequest');
const DeleteAssistantFileResponse = require('../models/DeleteAssistantFileResponse');
const DeleteAssistantResponse = require('../models/DeleteAssistantResponse');
const DeleteThreadResponse = require('../models/DeleteThreadResponse');
const ListAssistantFilesResponse = require('../models/ListAssistantFilesResponse');
const ListAssistantsResponse = require('../models/ListAssistantsResponse');
const ListMessageFilesResponse = require('../models/ListMessageFilesResponse');
const ListMessagesResponse = require('../models/ListMessagesResponse');
const ListRunStepsResponse = require('../models/ListRunStepsResponse');
const ListRunsResponse = require('../models/ListRunsResponse');
const MessageFileObject = require('../models/MessageFileObject');
const MessageObject = require('../models/MessageObject');
const ModifyAssistantRequest = require('../models/ModifyAssistantRequest');
const ModifyMessageRequest = require('../models/ModifyMessageRequest');
const ModifyRunRequest = require('../models/ModifyRunRequest');
const ModifyThreadRequest = require('../models/ModifyThreadRequest');
const RunObject = require('../models/RunObject');
const RunStepObject = require('../models/RunStepObject');
const SubmitToolOutputsRunRequest = require('../models/SubmitToolOutputsRunRequest');
const ThreadObject = require('../models/ThreadObject');
const utils = require('../utils/utils');

module.exports = {
    cancelRun: {
        key: 'cancelRun',
        noun: 'Assistants',
        display: {
            label: 'Cancels a run that is &#x60;in_progress&#x60;.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread to which this run belongs.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'run_id',
                    label: 'The ID of the run to cancel.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...RunObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}/cancel'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'cancelRun', response.json);
                    return results;
                })
            },
            sample: samples['RunObjectSample']
        }
    },
    createAssistant: {
        key: 'createAssistant',
        noun: 'Assistants',
        display: {
            label: 'Create an assistant with a model and instructions.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateAssistantRequest.fields(),
            ],
            outputFields: [
                ...AssistantObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/assistants'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateAssistantRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createAssistant', response.json);
                    return results;
                })
            },
            sample: samples['AssistantObjectSample']
        }
    },
    createAssistantFile: {
        key: 'createAssistantFile',
        noun: 'Assistants',
        display: {
            label: 'Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'assistant_id',
                    label: 'The ID of the assistant for which to create a File. ',
                    type: 'string',
                    required: true,
                },
                ...CreateAssistantFileRequest.fields(),
            ],
            outputFields: [
                ...AssistantFileObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/assistants/{assistant_id}/files'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateAssistantFileRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createAssistantFile', response.json);
                    return results;
                })
            },
            sample: samples['AssistantFileObjectSample']
        }
    },
    createMessage: {
        key: 'createMessage',
        noun: 'Assistants',
        display: {
            label: 'Create a message.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the [thread](/docs/api-reference/threads) to create a message for.',
                    type: 'string',
                    required: true,
                },
                ...CreateMessageRequest.fields(),
            ],
            outputFields: [
                ...MessageObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/messages'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateMessageRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createMessage', response.json);
                    return results;
                })
            },
            sample: samples['MessageObjectSample']
        }
    },
    createRun: {
        key: 'createRun',
        noun: 'Assistants',
        display: {
            label: 'Create a run.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread to run.',
                    type: 'string',
                    required: true,
                },
                ...CreateRunRequest.fields(),
            ],
            outputFields: [
                ...RunObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/runs'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateRunRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createRun', response.json);
                    return results;
                })
            },
            sample: samples['RunObjectSample']
        }
    },
    createThread: {
        key: 'createThread',
        noun: 'Assistants',
        display: {
            label: 'Create a thread.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateThreadRequest.fields(),
            ],
            outputFields: [
                ...ThreadObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateThreadRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createThread', response.json);
                    return results;
                })
            },
            sample: samples['ThreadObjectSample']
        }
    },
    createThreadAndRun: {
        key: 'createThreadAndRun',
        noun: 'Assistants',
        display: {
            label: 'Create a thread and run it in one request.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateThreadAndRunRequest.fields(),
            ],
            outputFields: [
                ...RunObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/runs'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateThreadAndRunRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createThreadAndRun', response.json);
                    return results;
                })
            },
            sample: samples['RunObjectSample']
        }
    },
    deleteAssistant: {
        key: 'deleteAssistant',
        noun: 'Assistants',
        display: {
            label: 'Delete an assistant.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'assistant_id',
                    label: 'The ID of the assistant to delete.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...DeleteAssistantResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/assistants/{assistant_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteAssistant', response.json);
                    return results;
                })
            },
            sample: samples['DeleteAssistantResponseSample']
        }
    },
    deleteAssistantFile: {
        key: 'deleteAssistantFile',
        noun: 'Assistants',
        display: {
            label: 'Delete an assistant file.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'assistant_id',
                    label: 'The ID of the assistant that the file belongs to.',
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
                ...DeleteAssistantFileResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/assistants/{assistant_id}/files/{file_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteAssistantFile', response.json);
                    return results;
                })
            },
            sample: samples['DeleteAssistantFileResponseSample']
        }
    },
    deleteThread: {
        key: 'deleteThread',
        noun: 'Assistants',
        display: {
            label: 'Delete a thread.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread to delete.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...DeleteThreadResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteThread', response.json);
                    return results;
                })
            },
            sample: samples['DeleteThreadResponseSample']
        }
    },
    getAssistant: {
        key: 'getAssistant',
        noun: 'Assistants',
        display: {
            label: 'Retrieves an assistant.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'assistant_id',
                    label: 'The ID of the assistant to retrieve.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...AssistantObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/assistants/{assistant_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getAssistant', response.json);
                    return results;
                })
            },
            sample: samples['AssistantObjectSample']
        }
    },
    getAssistantFile: {
        key: 'getAssistantFile',
        noun: 'Assistants',
        display: {
            label: 'Retrieves an AssistantFile.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'assistant_id',
                    label: 'The ID of the assistant who the file belongs to.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'file_id',
                    label: 'The ID of the file we&#39;re getting.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...AssistantFileObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/assistants/{assistant_id}/files/{file_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getAssistantFile', response.json);
                    return results;
                })
            },
            sample: samples['AssistantFileObjectSample']
        }
    },
    getMessage: {
        key: 'getMessage',
        noun: 'Assistants',
        display: {
            label: 'Retrieve a message.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the [thread](/docs/api-reference/threads) to which this message belongs.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'message_id',
                    label: 'The ID of the message to retrieve.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...MessageObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/messages/{message_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getMessage', response.json);
                    return results;
                })
            },
            sample: samples['MessageObjectSample']
        }
    },
    getMessageFile: {
        key: 'getMessageFile',
        noun: 'Assistants',
        display: {
            label: 'Retrieves a message file.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread to which the message and File belong.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'message_id',
                    label: 'The ID of the message the file belongs to.',
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
                ...MessageFileObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/messages/{message_id}/files/{file_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getMessageFile', response.json);
                    return results;
                })
            },
            sample: samples['MessageFileObjectSample']
        }
    },
    getRun: {
        key: 'getRun',
        noun: 'Assistants',
        display: {
            label: 'Retrieves a run.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the [thread](/docs/api-reference/threads) that was run.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'run_id',
                    label: 'The ID of the run to retrieve.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...RunObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getRun', response.json);
                    return results;
                })
            },
            sample: samples['RunObjectSample']
        }
    },
    getRunStep: {
        key: 'getRunStep',
        noun: 'Assistants',
        display: {
            label: 'Retrieves a run step.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread to which the run and run step belongs.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'run_id',
                    label: 'The ID of the run to which the run step belongs.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'step_id',
                    label: 'The ID of the run step to retrieve.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...RunStepObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getRunStep', response.json);
                    return results;
                })
            },
            sample: samples['RunStepObjectSample']
        }
    },
    getThread: {
        key: 'getThread',
        noun: 'Assistants',
        display: {
            label: 'Retrieves a thread.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread to retrieve.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...ThreadObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getThread', response.json);
                    return results;
                })
            },
            sample: samples['ThreadObjectSample']
        }
    },
    listAssistantFiles: {
        key: 'listAssistantFiles',
        noun: 'Assistants',
        display: {
            label: 'Returns a list of assistant files.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'assistant_id',
                    label: 'The ID of the assistant the file belongs to.',
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
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ListAssistantFilesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/assistants/{assistant_id}/files'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listAssistantFiles', response.json);
                    return results;
                })
            },
            sample: samples['ListAssistantFilesResponseSample']
        }
    },
    listAssistants: {
        key: 'listAssistants',
        noun: 'Assistants',
        display: {
            label: 'Returns a list of assistants.',
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
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ListAssistantsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/assistants'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listAssistants', response.json);
                    return results;
                })
            },
            sample: samples['ListAssistantsResponseSample']
        }
    },
    listMessageFiles: {
        key: 'listMessageFiles',
        noun: 'Assistants',
        display: {
            label: 'Returns a list of message files.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread that the message and files belong to.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'message_id',
                    label: 'The ID of the message that the files belongs to.',
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
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ListMessageFilesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/messages/{message_id}/files'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listMessageFiles', response.json);
                    return results;
                })
            },
            sample: samples['ListMessageFilesResponseSample']
        }
    },
    listMessages: {
        key: 'listMessages',
        noun: 'Assistants',
        display: {
            label: 'Returns a list of messages for a given thread.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the [thread](/docs/api-reference/threads) the messages belong to.',
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
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
                {
                    key: 'run_id',
                    label: 'Filter messages by the run ID that generated them. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ListMessagesResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/messages'),
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
                        'run_id': bundle.inputData?.['run_id'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listMessages', response.json);
                    return results;
                })
            },
            sample: samples['ListMessagesResponseSample']
        }
    },
    listRunSteps: {
        key: 'listRunSteps',
        noun: 'Assistants',
        display: {
            label: 'Returns a list of run steps belonging to a run.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread the run and run steps belong to.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'run_id',
                    label: 'The ID of the run the run steps belong to.',
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
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ListRunStepsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}/steps'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listRunSteps', response.json);
                    return results;
                })
            },
            sample: samples['ListRunStepsResponseSample']
        }
    },
    listRuns: {
        key: 'listRuns',
        noun: 'Assistants',
        display: {
            label: 'Returns a list of runs belonging to a thread.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread the run belongs to.',
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
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ListRunsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/runs'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listRuns', response.json);
                    return results;
                })
            },
            sample: samples['ListRunsResponseSample']
        }
    },
    modifyAssistant: {
        key: 'modifyAssistant',
        noun: 'Assistants',
        display: {
            label: 'Modifies an assistant.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'assistant_id',
                    label: 'The ID of the assistant to modify.',
                    type: 'string',
                    required: true,
                },
                ...ModifyAssistantRequest.fields(),
            ],
            outputFields: [
                ...AssistantObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/assistants/{assistant_id}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ModifyAssistantRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'modifyAssistant', response.json);
                    return results;
                })
            },
            sample: samples['AssistantObjectSample']
        }
    },
    modifyMessage: {
        key: 'modifyMessage',
        noun: 'Assistants',
        display: {
            label: 'Modifies a message.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread to which this message belongs.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'message_id',
                    label: 'The ID of the message to modify.',
                    type: 'string',
                    required: true,
                },
                ...ModifyMessageRequest.fields(),
            ],
            outputFields: [
                ...MessageObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/messages/{message_id}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ModifyMessageRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'modifyMessage', response.json);
                    return results;
                })
            },
            sample: samples['MessageObjectSample']
        }
    },
    modifyRun: {
        key: 'modifyRun',
        noun: 'Assistants',
        display: {
            label: 'Modifies a run.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the [thread](/docs/api-reference/threads) that was run.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'run_id',
                    label: 'The ID of the run to modify.',
                    type: 'string',
                    required: true,
                },
                ...ModifyRunRequest.fields(),
            ],
            outputFields: [
                ...RunObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ModifyRunRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'modifyRun', response.json);
                    return results;
                })
            },
            sample: samples['RunObjectSample']
        }
    },
    modifyThread: {
        key: 'modifyThread',
        noun: 'Assistants',
        display: {
            label: 'Modifies a thread.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.',
                    type: 'string',
                    required: true,
                },
                ...ModifyThreadRequest.fields(),
            ],
            outputFields: [
                ...ThreadObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ModifyThreadRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'modifyThread', response.json);
                    return results;
                })
            },
            sample: samples['ThreadObjectSample']
        }
    },
    submitToolOuputsToRun: {
        key: 'submitToolOuputsToRun',
        noun: 'Assistants',
        display: {
            label: 'When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. ',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'thread_id',
                    label: 'The ID of the [thread](/docs/api-reference/threads) to which this run belongs.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'run_id',
                    label: 'The ID of the run that requires the tool output submission.',
                    type: 'string',
                    required: true,
                },
                ...SubmitToolOutputsRunRequest.fields(),
            ],
            outputFields: [
                ...RunObject.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...SubmitToolOutputsRunRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'submitToolOuputsToRun', response.json);
                    return results;
                })
            },
            sample: samples['RunObjectSample']
        }
    },
}
