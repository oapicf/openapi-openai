const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}embedding`,
                label: `[${labelPrefix}embedding]`,
                required: true,
                list: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'embedding': bundle.inputData?.[`${keyPrefix}embedding`],
        }
    },
}
