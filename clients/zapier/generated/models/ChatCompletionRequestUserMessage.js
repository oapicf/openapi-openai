const utils = require('../utils/utils');
const ChatCompletionRequestUserMessage_content = require('../models/ChatCompletionRequestUserMessage_content');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ChatCompletionRequestUserMessage_content.fields(`${keyPrefix}content`, isInput),
            {
                key: `${keyPrefix}role`,
                label: `The role of the messages author, in this case `user`. - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'user',
                ],
            },
            {
                key: `${keyPrefix}name`,
                label: `An optional name for the participant. Provides the model information to differentiate between participants of the same role. - [${labelPrefix}name]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'content': utils.removeIfEmpty(ChatCompletionRequestUserMessage_content.mapping(bundle, `${keyPrefix}content`)),
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
