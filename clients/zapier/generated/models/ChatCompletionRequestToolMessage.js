const utils = require('../utils/utils');
const ChatCompletionRequestToolMessage_content = require('../models/ChatCompletionRequestToolMessage_content');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}role`,
                label: `The role of the messages author, in this case `tool`. - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'tool',
                ],
            },
            ...ChatCompletionRequestToolMessage_content.fields(`${keyPrefix}content`, isInput),
            {
                key: `${keyPrefix}tool_call_id`,
                label: `Tool call that this message is responding to. - [${labelPrefix}tool_call_id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'content': utils.removeIfEmpty(ChatCompletionRequestToolMessage_content.mapping(bundle, `${keyPrefix}content`)),
            'tool_call_id': bundle.inputData?.[`${keyPrefix}tool_call_id`],
        }
    },
}
