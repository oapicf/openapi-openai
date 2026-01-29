const samples = require('../samples/ModerationsApi');
const CreateModerationRequest = require('../models/CreateModerationRequest');
const CreateModerationResponse = require('../models/CreateModerationResponse');
const utils = require('../utils/utils');

module.exports = {
    createModeration: {
        key: 'createModeration',
        noun: 'Moderations',
        display: {
            label: 'Classifies if text is potentially harmful.',
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
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...CreateModerationRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createModeration', response.json);
                    return results;
                })
            },
            sample: samples['CreateModerationResponseSample']
        }
    },
}
