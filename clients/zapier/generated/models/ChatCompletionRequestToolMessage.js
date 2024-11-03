const utils = require('../utils/utils');

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
            {
                key: `${keyPrefix}content`,
                label: `The contents of the tool message. - [${labelPrefix}content]`,
                required: true,
                type: 'string',
            },
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
            'content': bundle.inputData?.[`${keyPrefix}content`],
            'tool_call_id': bundle.inputData?.[`${keyPrefix}tool_call_id`],
        }
    },
}
