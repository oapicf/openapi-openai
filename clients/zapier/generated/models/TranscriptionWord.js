const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}word`,
                label: `The text content of the word. - [${labelPrefix}word]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}start`,
                label: `Start time of the word in seconds. - [${labelPrefix}start]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}end`,
                label: `End time of the word in seconds. - [${labelPrefix}end]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'word': bundle.inputData?.[`${keyPrefix}word`],
            'start': bundle.inputData?.[`${keyPrefix}start`],
            'end': bundle.inputData?.[`${keyPrefix}end`],
        }
    },
}
