const utils = require('../utils/utils');
const RealtimeResponseCreateParams = require('../models/RealtimeResponseCreateParams');

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
                label: `The event type, must be `response.create`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'response.create',
                ],
            },
            ...RealtimeResponseCreateParams.fields(`${keyPrefix}response`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'response': utils.removeIfEmpty(RealtimeResponseCreateParams.mapping(bundle, `${keyPrefix}response`)),
        }
    },
}
