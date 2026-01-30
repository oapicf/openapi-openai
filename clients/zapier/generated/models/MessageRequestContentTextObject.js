const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `text`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'text',
                ],
            },
            {
                key: `${keyPrefix}text`,
                label: `Text content to be sent to the model - [${labelPrefix}text]`,
                required: true,
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
