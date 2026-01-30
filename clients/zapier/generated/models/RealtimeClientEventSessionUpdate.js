const utils = require('../utils/utils');
const RealtimeSessionCreateRequest = require('../models/RealtimeSessionCreateRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}event_id`,
                label: `Optional client-generated ID used to identify this event. - [${labelPrefix}event_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The event type, must be `session.update`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'session.update',
                ],
            },
            ...RealtimeSessionCreateRequest.fields(`${keyPrefix}session`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'session': utils.removeIfEmpty(RealtimeSessionCreateRequest.mapping(bundle, `${keyPrefix}session`)),
        }
    },
}
