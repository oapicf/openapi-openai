const utils = require('../utils/utils');
const ChatCompletionTokenLogprob = require('../models/ChatCompletionTokenLogprob');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}content`,
                label: `[${labelPrefix}content]`,
                children: ChatCompletionTokenLogprob.fields(`${keyPrefix}content${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}refusal`,
                label: `[${labelPrefix}refusal]`,
                children: ChatCompletionTokenLogprob.fields(`${keyPrefix}refusal${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'content': utils.childMapping(bundle.inputData?.[`${keyPrefix}content`], `${keyPrefix}content`, ChatCompletionTokenLogprob),
            'refusal': utils.childMapping(bundle.inputData?.[`${keyPrefix}refusal`], `${keyPrefix}refusal`, ChatCompletionTokenLogprob),
        }
    },
}
