const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}role`,
                label: `The role of the messages author, in this case `function`. - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'function',
                ],
            },
            {
                key: `${keyPrefix}content`,
                label: `The contents of the function message. - [${labelPrefix}content]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the function to call. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'content': bundle.inputData?.[`${keyPrefix}content`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
