const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}event`,
                label: `[${labelPrefix}event]`,
                required: true,
                type: 'string',
                choices: [
                    'done',
                ],
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                required: true,
                type: 'string',
                choices: [
                    '[DONE]',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event': bundle.inputData?.[`${keyPrefix}event`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
        }
    },
}
