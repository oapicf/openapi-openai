const utils = require('../utils/utils');

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
                label: `The event type, must be `response.cancel`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'response.cancel',
                ],
            },
            {
                key: `${keyPrefix}response_id`,
                label: `A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  - [${labelPrefix}response_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'response_id': bundle.inputData?.[`${keyPrefix}response_id`],
        }
    },
}
