const utils = require('../utils/utils');
const RealtimeServerEventError_error = require('../models/RealtimeServerEventError_error');

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
                label: `The event type, must be `error`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'error',
                ],
            },
            ...RealtimeServerEventError_error.fields(`${keyPrefix}error`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'error': utils.removeIfEmpty(RealtimeServerEventError_error.mapping(bundle, `${keyPrefix}error`)),
        }
    },
}
