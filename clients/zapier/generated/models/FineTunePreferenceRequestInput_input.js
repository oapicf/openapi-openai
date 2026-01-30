const utils = require('../utils/utils');
const ChatCompletionTool = require('../models/ChatCompletionTool');
const FineTuneChatRequestInput_messages_inner = require('../models/FineTuneChatRequestInput_messages_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}messages`,
                label: `[${labelPrefix}messages]`,
                children: FineTuneChatRequestInput_messages_inner.fields(`${keyPrefix}messages${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}tools`,
                label: `[${labelPrefix}tools]`,
                children: ChatCompletionTool.fields(`${keyPrefix}tools${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}parallel_tool_calls`,
                label: `Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. - [${labelPrefix}parallel_tool_calls]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'messages': utils.childMapping(bundle.inputData?.[`${keyPrefix}messages`], `${keyPrefix}messages`, FineTuneChatRequestInput_messages_inner),
            'tools': utils.childMapping(bundle.inputData?.[`${keyPrefix}tools`], `${keyPrefix}tools`, ChatCompletionTool),
            'parallel_tool_calls': bundle.inputData?.[`${keyPrefix}parallel_tool_calls`],
        }
    },
}
