const utils = require('../utils/utils');
const RealtimeSession = require('../models/RealtimeSession');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}event_id`,
                label: `The unique ID of the server event. - [${labelPrefix}event_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The event type, must be `session.updated`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'session.updated',
                ],
            },
            ...RealtimeSession.fields(`${keyPrefix}session`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'session': utils.removeIfEmpty(RealtimeSession.mapping(bundle, `${keyPrefix}session`)),
        }
    },
}
