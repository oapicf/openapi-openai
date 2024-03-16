const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}hate`,
                label: `[${labelPrefix}hate]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}hate/threatening`,
                label: `[${labelPrefix}hate/threatening]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}self-harm`,
                label: `[${labelPrefix}self-harm]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}sexual`,
                label: `[${labelPrefix}sexual]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}sexual/minors`,
                label: `[${labelPrefix}sexual/minors]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}violence`,
                label: `[${labelPrefix}violence]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}violence/graphic`,
                label: `[${labelPrefix}violence/graphic]`,
                required: true,
                type: 'boolean',
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
