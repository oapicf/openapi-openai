const samples = require('../samples/UsersApi');
const User = require('../models/User');
const UserDeleteResponse = require('../models/UserDeleteResponse');
const UserListResponse = require('../models/UserListResponse');
const UserRoleUpdateRequest = require('../models/UserRoleUpdateRequest');
const utils = require('../utils/utils');

module.exports = {
    deleteUser: {
        key: 'deleteUser',
        noun: 'Users',
        display: {
            label: 'Deletes a user from the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'user_id',
                    label: 'The ID of the user.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...UserDeleteResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/users/{user_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteUser', response.json);
                    return results;
                })
            },
            sample: samples['UserDeleteResponseSample']
        }
    },
    listUsers: {
        key: 'listUsers',
        noun: 'Users',
        display: {
            label: 'Lists all of the users in the organization.',
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
            ],
            outputFields: [
                ...UserListResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/users'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listUsers', response.json);
                    return results;
                })
            },
            sample: samples['UserListResponseSample']
        }
    },
    modifyUser: {
        key: 'modifyUser',
        noun: 'Users',
        display: {
            label: 'Modifies a user&#39;s role in the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'user_id',
                    label: 'The ID of the user.',
                    type: 'string',
                    required: true,
                },
                ...UserRoleUpdateRequest.fields(),
            ],
            outputFields: [
                ...User.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/users/{user_id}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...UserRoleUpdateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'modifyUser', response.json);
                    return results;
                })
            },
            sample: samples['UserSample']
        }
    },
    retrieveUser: {
        key: 'retrieveUser',
        noun: 'Users',
        display: {
            label: 'Retrieves a user by their identifier.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'user_id',
                    label: 'The ID of the user.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...User.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/users/{user_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'retrieveUser', response.json);
                    return results;
                })
            },
            sample: samples['UserSample']
        }
    },
}
