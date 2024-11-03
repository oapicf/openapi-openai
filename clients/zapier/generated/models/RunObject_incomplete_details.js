const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}reason`,
                label: `The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. - [${labelPrefix}reason]`,
                type: 'string',
                choices: [
                    'max_completion_tokens',
                    'max_prompt_tokens',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'reason': bundle.inputData?.[`${keyPrefix}reason`],
        }
    },
}
