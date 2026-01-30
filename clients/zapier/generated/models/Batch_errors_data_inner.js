const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                label: `An error code identifying the error type. - [${labelPrefix}code]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}message`,
                label: `A human-readable message providing more details about the error. - [${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}param`,
                label: `The name of the parameter that caused the error, if applicable. - [${labelPrefix}param]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}line`,
                label: `The line number of the input file where the error occurred, if applicable. - [${labelPrefix}line]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'param': bundle.inputData?.[`${keyPrefix}param`],
            'line': bundle.inputData?.[`${keyPrefix}line`],
        }
    },
}
