const utils = require('../utils/utils');
const RealtimeServerEventRateLimitsUpdated_rate_limits_inner = require('../models/RealtimeServerEventRateLimitsUpdated_rate_limits_inner');

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
                label: `The event type, must be `rate_limits.updated`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'rate_limits.updated',
                ],
            },
            {
                key: `${keyPrefix}rate_limits`,
                label: `[${labelPrefix}rate_limits]`,
                children: RealtimeServerEventRateLimitsUpdated_rate_limits_inner.fields(`${keyPrefix}rate_limits${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'rate_limits': utils.childMapping(bundle.inputData?.[`${keyPrefix}rate_limits`], `${keyPrefix}rate_limits`, RealtimeServerEventRateLimitsUpdated_rate_limits_inner),
        }
    },
}
