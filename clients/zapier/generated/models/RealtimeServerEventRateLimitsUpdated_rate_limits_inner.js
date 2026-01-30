const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `The name of the rate limit (`requests`, `tokens`).  - [${labelPrefix}name]`,
                type: 'string',
                choices: [
                    'requests',
                    'tokens',
                ],
            },
            {
                key: `${keyPrefix}limit`,
                label: `The maximum allowed value for the rate limit. - [${labelPrefix}limit]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}remaining`,
                label: `The remaining value before the limit is reached. - [${labelPrefix}remaining]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}reset_seconds`,
                label: `Seconds until the rate limit resets. - [${labelPrefix}reset_seconds]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'limit': bundle.inputData?.[`${keyPrefix}limit`],
            'remaining': bundle.inputData?.[`${keyPrefix}remaining`],
            'reset_seconds': bundle.inputData?.[`${keyPrefix}reset_seconds`],
        }
    },
}
