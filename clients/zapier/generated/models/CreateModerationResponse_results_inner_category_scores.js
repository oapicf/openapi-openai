const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}hate`,
                label: `[${labelPrefix}hate]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}hate/threatening`,
                label: `[${labelPrefix}hate/threatening]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}self-harm`,
                label: `[${labelPrefix}self-harm]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}sexual`,
                label: `[${labelPrefix}sexual]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}sexual/minors`,
                label: `[${labelPrefix}sexual/minors]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}violence`,
                label: `[${labelPrefix}violence]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}violence/graphic`,
                label: `[${labelPrefix}violence/graphic]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hate': bundle.inputData?.[`${keyPrefix}hate`],
            'hate/threatening': bundle.inputData?.[`${keyPrefix}hate/threatening`],
            'self-harm': bundle.inputData?.[`${keyPrefix}self-harm`],
            'sexual': bundle.inputData?.[`${keyPrefix}sexual`],
            'sexual/minors': bundle.inputData?.[`${keyPrefix}sexual/minors`],
            'violence': bundle.inputData?.[`${keyPrefix}violence`],
            'violence/graphic': bundle.inputData?.[`${keyPrefix}violence/graphic`],
        }
    },
}
