const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                label: `One of `server_error` or `rate_limit_exceeded`. - [${labelPrefix}code]`,
                required: true,
                type: 'string',
                choices: [
                    'server_error',
                    'rate_limit_exceeded',
                ],
            },
            {
                key: `${keyPrefix}message`,
                label: `A human-readable description of the error. - [${labelPrefix}message]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
        }
    },
}
