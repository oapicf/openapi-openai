const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of error. - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}code`,
                label: `Error code, if any. - [${labelPrefix}code]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}message`,
                label: `A human-readable error message. - [${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}param`,
                label: `Parameter related to the error, if any. - [${labelPrefix}param]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'param': bundle.inputData?.[`${keyPrefix}param`],
        }
    },
}
