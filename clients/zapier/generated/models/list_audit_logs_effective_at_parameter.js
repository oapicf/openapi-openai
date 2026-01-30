const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}gt`,
                label: `Return only events whose `effective_at` (Unix seconds) is greater than this value. - [${labelPrefix}gt]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}gte`,
                label: `Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value. - [${labelPrefix}gte]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}lt`,
                label: `Return only events whose `effective_at` (Unix seconds) is less than this value. - [${labelPrefix}lt]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}lte`,
                label: `Return only events whose `effective_at` (Unix seconds) is less than or equal to this value. - [${labelPrefix}lte]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'gt': bundle.inputData?.[`${keyPrefix}gt`],
            'gte': bundle.inputData?.[`${keyPrefix}gte`],
            'lt': bundle.inputData?.[`${keyPrefix}lt`],
            'lte': bundle.inputData?.[`${keyPrefix}lte`],
        }
    },
}
