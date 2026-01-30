const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of the content. - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'text',
                ],
            },
            {
                key: `${keyPrefix}text`,
                label: `The text content of the file. - [${labelPrefix}text]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
        }
    },
}
