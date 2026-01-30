const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}hate`,
                label: `The applied input type(s) for the category 'hate'. - [${labelPrefix}hate]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}hate/threatening`,
                label: `The applied input type(s) for the category 'hate/threatening'. - [${labelPrefix}hate/threatening]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}harassment`,
                label: `The applied input type(s) for the category 'harassment'. - [${labelPrefix}harassment]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}harassment/threatening`,
                label: `The applied input type(s) for the category 'harassment/threatening'. - [${labelPrefix}harassment/threatening]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}illicit`,
                label: `The applied input type(s) for the category 'illicit'. - [${labelPrefix}illicit]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}illicit/violent`,
                label: `The applied input type(s) for the category 'illicit/violent'. - [${labelPrefix}illicit/violent]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}self-harm`,
                label: `The applied input type(s) for the category 'self-harm'. - [${labelPrefix}self-harm]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}self-harm/intent`,
                label: `The applied input type(s) for the category 'self-harm/intent'. - [${labelPrefix}self-harm/intent]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}self-harm/instructions`,
                label: `The applied input type(s) for the category 'self-harm/instructions'. - [${labelPrefix}self-harm/instructions]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}sexual`,
                label: `The applied input type(s) for the category 'sexual'. - [${labelPrefix}sexual]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}sexual/minors`,
                label: `The applied input type(s) for the category 'sexual/minors'. - [${labelPrefix}sexual/minors]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}violence`,
                label: `The applied input type(s) for the category 'violence'. - [${labelPrefix}violence]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}violence/graphic`,
                label: `The applied input type(s) for the category 'violence/graphic'. - [${labelPrefix}violence/graphic]`,
                required: true,
                list: true,
                type: 'string',
                choices: [
                ],
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
            'illicit': bundle.inputData?.[`${keyPrefix}illicit`],
            'illicit/violent': bundle.inputData?.[`${keyPrefix}illicit/violent`],
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
