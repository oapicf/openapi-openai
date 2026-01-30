const samples = require('../samples/InvitesApi');
const Invite = require('../models/Invite');
const InviteDeleteResponse = require('../models/InviteDeleteResponse');
const InviteListResponse = require('../models/InviteListResponse');
const InviteRequest = require('../models/InviteRequest');
const utils = require('../utils/utils');

module.exports = {
    deleteInvite: {
        key: 'deleteInvite',
        noun: 'Invites',
        display: {
            label: 'Delete an invite. If the invite has already been accepted, it cannot be deleted.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'invite_id',
                    label: 'The ID of the invite to delete.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...InviteDeleteResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/invites/{invite_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteInvite', response.json);
                    return results;
                })
            },
            sample: samples['InviteDeleteResponseSample']
        }
    },
    inviteUser: {
        key: 'inviteUser',
        noun: 'Invites',
        display: {
            label: 'Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...InviteRequest.fields(),
            ],
            outputFields: [
                ...Invite.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/invites'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...InviteRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'inviteUser', response.json);
                    return results;
                })
            },
            sample: samples['InviteSample']
        }
    },
    listInvites: {
        key: 'listInvites',
        noun: 'Invites',
        display: {
            label: 'Returns a list of invites in the organization.',
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
                ...InviteListResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/invites'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listInvites', response.json);
                    return results;
                })
            },
            sample: samples['InviteListResponseSample']
        }
    },
    retrieveInvite: {
        key: 'retrieveInvite',
        noun: 'Invites',
        display: {
            label: 'Retrieves an invite.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'invite_id',
                    label: 'The ID of the invite to retrieve.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Invite.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/invites/{invite_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'retrieveInvite', response.json);
                    return results;
                })
            },
            sample: samples['InviteSample']
        }
    },
}
