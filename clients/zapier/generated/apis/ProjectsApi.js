const samples = require('../samples/ProjectsApi');
const ErrorResponse = require('../models/ErrorResponse');
const Project = require('../models/Project');
const ProjectApiKey = require('../models/ProjectApiKey');
const ProjectApiKeyDeleteResponse = require('../models/ProjectApiKeyDeleteResponse');
const ProjectApiKeyListResponse = require('../models/ProjectApiKeyListResponse');
const ProjectCreateRequest = require('../models/ProjectCreateRequest');
const ProjectListResponse = require('../models/ProjectListResponse');
const ProjectRateLimit = require('../models/ProjectRateLimit');
const ProjectRateLimitListResponse = require('../models/ProjectRateLimitListResponse');
const ProjectRateLimitUpdateRequest = require('../models/ProjectRateLimitUpdateRequest');
const ProjectServiceAccount = require('../models/ProjectServiceAccount');
const ProjectServiceAccountCreateRequest = require('../models/ProjectServiceAccountCreateRequest');
const ProjectServiceAccountCreateResponse = require('../models/ProjectServiceAccountCreateResponse');
const ProjectServiceAccountDeleteResponse = require('../models/ProjectServiceAccountDeleteResponse');
const ProjectServiceAccountListResponse = require('../models/ProjectServiceAccountListResponse');
const ProjectUpdateRequest = require('../models/ProjectUpdateRequest');
const ProjectUser = require('../models/ProjectUser');
const ProjectUserCreateRequest = require('../models/ProjectUserCreateRequest');
const ProjectUserDeleteResponse = require('../models/ProjectUserDeleteResponse');
const ProjectUserListResponse = require('../models/ProjectUserListResponse');
const ProjectUserUpdateRequest = require('../models/ProjectUserUpdateRequest');
const utils = require('../utils/utils');

module.exports = {
    archiveProject: {
        key: 'archiveProject',
        noun: 'Projects',
        display: {
            label: 'Archives a project in the organization. Archived projects cannot be used or updated.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Project.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/archive'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'archiveProject', response.json);
                    return results;
                })
            },
            sample: samples['ProjectSample']
        }
    },
    createProject: {
        key: 'createProject',
        noun: 'Projects',
        display: {
            label: 'Create a new project in the organization. Projects can be created and archived, but cannot be deleted.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...ProjectCreateRequest.fields(),
            ],
            outputFields: [
                ...Project.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ProjectCreateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createProject', response.json);
                    return results;
                })
            },
            sample: samples['ProjectSample']
        }
    },
    createProjectServiceAccount: {
        key: 'createProjectServiceAccount',
        noun: 'Projects',
        display: {
            label: 'Creates a new service account in the project. This also returns an unredacted API key for the service account.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                ...ProjectServiceAccountCreateRequest.fields(),
            ],
            outputFields: [
                ...ProjectServiceAccountCreateResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/service_accounts'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ProjectServiceAccountCreateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createProjectServiceAccount', response.json);
                    return results;
                })
            },
            sample: samples['ProjectServiceAccountCreateResponseSample']
        }
    },
    createProjectUser: {
        key: 'createProjectUser',
        noun: 'Projects',
        display: {
            label: 'Adds a user to the project. Users must already be members of the organization to be added to a project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                ...ProjectUserCreateRequest.fields(),
            ],
            outputFields: [
                ...ProjectUser.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/users'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ProjectUserCreateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createProjectUser', response.json);
                    return results;
                })
            },
            sample: samples['ProjectUserSample']
        }
    },
    deleteProjectApiKey: {
        key: 'deleteProjectApiKey',
        noun: 'Projects',
        display: {
            label: 'Deletes an API key from the project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'key_id',
                    label: 'The ID of the API key.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...ProjectApiKeyDeleteResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/api_keys/{key_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteProjectApiKey', response.json);
                    return results;
                })
            },
            sample: samples['ProjectApiKeyDeleteResponseSample']
        }
    },
    deleteProjectServiceAccount: {
        key: 'deleteProjectServiceAccount',
        noun: 'Projects',
        display: {
            label: 'Deletes a service account from the project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'service_account_id',
                    label: 'The ID of the service account.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...ProjectServiceAccountDeleteResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/service_accounts/{service_account_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteProjectServiceAccount', response.json);
                    return results;
                })
            },
            sample: samples['ProjectServiceAccountDeleteResponseSample']
        }
    },
    deleteProjectUser: {
        key: 'deleteProjectUser',
        noun: 'Projects',
        display: {
            label: 'Deletes a user from the project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'user_id',
                    label: 'The ID of the user.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...ProjectUserDeleteResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/users/{user_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteProjectUser', response.json);
                    return results;
                })
            },
            sample: samples['ProjectUserDeleteResponseSample']
        }
    },
    listProjectApiKeys: {
        key: 'listProjectApiKeys',
        noun: 'Projects',
        display: {
            label: 'Returns a list of API keys in the project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'limit',
                    label: 'A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ',
                    type: 'integer',
                },
                {
                    key: 'after',
                    label: 'A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ProjectApiKeyListResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/api_keys'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'after': bundle.inputData?.['after'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listProjectApiKeys', response.json);
                    return results;
                })
            },
            sample: samples['ProjectApiKeyListResponseSample']
        }
    },
    listProjectRateLimits: {
        key: 'listProjectRateLimits',
        noun: 'Projects',
        display: {
            label: 'Returns the rate limits per model for a project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'limit',
                    label: 'A limit on the number of objects to be returned. The default is 100. ',
                    type: 'integer',
                },
                {
                    key: 'after',
                    label: 'A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ',
                    type: 'string',
                },
                {
                    key: 'before',
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ProjectRateLimitListResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/rate_limits'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'after': bundle.inputData?.['after'],
                        'before': bundle.inputData?.['before'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listProjectRateLimits', response.json);
                    return results;
                })
            },
            sample: samples['ProjectRateLimitListResponseSample']
        }
    },
    listProjectServiceAccounts: {
        key: 'listProjectServiceAccounts',
        noun: 'Projects',
        display: {
            label: 'Returns a list of service accounts in the project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'limit',
                    label: 'A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ',
                    type: 'integer',
                },
                {
                    key: 'after',
                    label: 'A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ProjectServiceAccountListResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/service_accounts'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'after': bundle.inputData?.['after'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listProjectServiceAccounts', response.json);
                    return results;
                })
            },
            sample: samples['ProjectServiceAccountListResponseSample']
        }
    },
    listProjectUsers: {
        key: 'listProjectUsers',
        noun: 'Projects',
        display: {
            label: 'Returns a list of users in the project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'limit',
                    label: 'A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ',
                    type: 'integer',
                },
                {
                    key: 'after',
                    label: 'A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ProjectUserListResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/users'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'after': bundle.inputData?.['after'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listProjectUsers', response.json);
                    return results;
                })
            },
            sample: samples['ProjectUserListResponseSample']
        }
    },
    listProjects: {
        key: 'listProjects',
        noun: 'Projects',
        display: {
            label: 'Returns a list of projects.',
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
                    key: 'after',
                    label: 'A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ',
                    type: 'string',
                },
                {
                    key: 'include_archived',
                    label: 'If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.',
                    type: 'boolean',
                },
            ],
            outputFields: [
                ...ProjectListResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'after': bundle.inputData?.['after'],
                        'include_archived': bundle.inputData?.['include_archived'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listProjects', response.json);
                    return results;
                })
            },
            sample: samples['ProjectListResponseSample']
        }
    },
    modifyProject: {
        key: 'modifyProject',
        noun: 'Projects',
        display: {
            label: 'Modifies a project in the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                ...ProjectUpdateRequest.fields(),
            ],
            outputFields: [
                ...Project.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ProjectUpdateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'modifyProject', response.json);
                    return results;
                })
            },
            sample: samples['ProjectSample']
        }
    },
    modifyProjectUser: {
        key: 'modifyProjectUser',
        noun: 'Projects',
        display: {
            label: 'Modifies a user&#39;s role in the project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'user_id',
                    label: 'The ID of the user.',
                    type: 'string',
                    required: true,
                },
                ...ProjectUserUpdateRequest.fields(),
            ],
            outputFields: [
                ...ProjectUser.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/users/{user_id}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ProjectUserUpdateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'modifyProjectUser', response.json);
                    return results;
                })
            },
            sample: samples['ProjectUserSample']
        }
    },
    retrieveProject: {
        key: 'retrieveProject',
        noun: 'Projects',
        display: {
            label: 'Retrieves a project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Project.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'retrieveProject', response.json);
                    return results;
                })
            },
            sample: samples['ProjectSample']
        }
    },
    retrieveProjectApiKey: {
        key: 'retrieveProjectApiKey',
        noun: 'Projects',
        display: {
            label: 'Retrieves an API key in the project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'key_id',
                    label: 'The ID of the API key.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...ProjectApiKey.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/api_keys/{key_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'retrieveProjectApiKey', response.json);
                    return results;
                })
            },
            sample: samples['ProjectApiKeySample']
        }
    },
    retrieveProjectServiceAccount: {
        key: 'retrieveProjectServiceAccount',
        noun: 'Projects',
        display: {
            label: 'Retrieves a service account in the project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'service_account_id',
                    label: 'The ID of the service account.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...ProjectServiceAccount.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/service_accounts/{service_account_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'retrieveProjectServiceAccount', response.json);
                    return results;
                })
            },
            sample: samples['ProjectServiceAccountSample']
        }
    },
    retrieveProjectUser: {
        key: 'retrieveProjectUser',
        noun: 'Projects',
        display: {
            label: 'Retrieves a user in the project.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'user_id',
                    label: 'The ID of the user.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...ProjectUser.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/users/{user_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'retrieveProjectUser', response.json);
                    return results;
                })
            },
            sample: samples['ProjectUserSample']
        }
    },
    updateProjectRateLimits: {
        key: 'updateProjectRateLimits',
        noun: 'Projects',
        display: {
            label: 'Updates a project rate limit.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'project_id',
                    label: 'The ID of the project.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'rate_limit_id',
                    label: 'The ID of the rate limit.',
                    type: 'string',
                    required: true,
                },
                ...ProjectRateLimitUpdateRequest.fields(),
            ],
            outputFields: [
                ...ProjectRateLimit.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...ProjectRateLimitUpdateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'updateProjectRateLimits', response.json);
                    return results;
                })
            },
            sample: samples['ProjectRateLimitSample']
        }
    },
}
