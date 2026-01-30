const utils = require('../utils/utils');
const ChatCompletionRequestSystemMessage_content = require('../models/ChatCompletionRequestSystemMessage_content');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ChatCompletionRequestSystemMessage_content.fields(`${keyPrefix}content`, isInput),
            {
                key: `${keyPrefix}role`,
                label: `The role of the messages author, in this case `system`. - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'system',
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
            'content': utils.removeIfEmpty(ChatCompletionRequestSystemMessage_content.mapping(bundle, `${keyPrefix}content`)),
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
