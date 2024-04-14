const utils = require('../utils/utils');
const ChatCompletionNamedToolChoice_function = require('../models/ChatCompletionNamedToolChoice_function');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of the tool. If type is `function`, the function name must be set - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'function',
                    'code_interpreter',
                    'retrieval',
                ],
            },
            ...ChatCompletionNamedToolChoice_function.fields(`${keyPrefix}function`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'function': utils.removeIfEmpty(ChatCompletionNamedToolChoice_function.mapping(bundle, `${keyPrefix}function`)),
        }
    },
}
