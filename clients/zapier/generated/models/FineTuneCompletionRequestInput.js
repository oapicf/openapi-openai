const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}prompt`,
                label: `The input prompt for this training example. - [${labelPrefix}prompt]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}completion`,
                label: `The desired completion for this training example. - [${labelPrefix}completion]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'prompt': bundle.inputData?.[`${keyPrefix}prompt`],
            'completion': bundle.inputData?.[`${keyPrefix}completion`],
        }
    },
}
