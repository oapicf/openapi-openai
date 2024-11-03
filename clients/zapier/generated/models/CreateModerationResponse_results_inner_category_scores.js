const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}hate`,
                label: `The score for the category 'hate'. - [${labelPrefix}hate]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}hate/threatening`,
                label: `The score for the category 'hate/threatening'. - [${labelPrefix}hate/threatening]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}harassment`,
                label: `The score for the category 'harassment'. - [${labelPrefix}harassment]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}harassment/threatening`,
                label: `The score for the category 'harassment/threatening'. - [${labelPrefix}harassment/threatening]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}self-harm`,
                label: `The score for the category 'self-harm'. - [${labelPrefix}self-harm]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}self-harm/intent`,
                label: `The score for the category 'self-harm/intent'. - [${labelPrefix}self-harm/intent]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}self-harm/instructions`,
                label: `The score for the category 'self-harm/instructions'. - [${labelPrefix}self-harm/instructions]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}sexual`,
                label: `The score for the category 'sexual'. - [${labelPrefix}sexual]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}sexual/minors`,
                label: `The score for the category 'sexual/minors'. - [${labelPrefix}sexual/minors]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}violence`,
                label: `The score for the category 'violence'. - [${labelPrefix}violence]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}violence/graphic`,
                label: `The score for the category 'violence/graphic'. - [${labelPrefix}violence/graphic]`,
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
            'harassment': bundle.inputData?.[`${keyPrefix}harassment`],
            'harassment/threatening': bundle.inputData?.[`${keyPrefix}harassment/threatening`],
            'self-harm': bundle.inputData?.[`${keyPrefix}self-harm`],
            'self-harm/intent': bundle.inputData?.[`${keyPrefix}self-harm/intent`],
            'self-harm/instructions': bundle.inputData?.[`${keyPrefix}self-harm/instructions`],
            'sexual': bundle.inputData?.[`${keyPrefix}sexual`],
            'sexual/minors': bundle.inputData?.[`${keyPrefix}sexual/minors`],
            'violence': bundle.inputData?.[`${keyPrefix}violence`],
            'violence/graphic': bundle.inputData?.[`${keyPrefix}violence/graphic`],
        }
    },
}
