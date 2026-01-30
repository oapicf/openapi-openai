const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'auto',
                    'last_messages',
                ],
            },
            {
                key: `${keyPrefix}last_messages`,
                label: `The number of most recent messages from the thread when constructing the context for the run. - [${labelPrefix}last_messages]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'last_messages': bundle.inputData?.[`${keyPrefix}last_messages`],
        }
    },
}
