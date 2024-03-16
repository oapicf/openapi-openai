const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `[${labelPrefix}type]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}message`,
                label: `[${labelPrefix}message]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}param`,
                label: `[${labelPrefix}param]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}code`,
                label: `[${labelPrefix}code]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'param': bundle.inputData?.[`${keyPrefix}param`],
            'code': bundle.inputData?.[`${keyPrefix}code`],
        }
    },
}
