const utils = require('../utils/utils');
const MessageDeltaObject_delta_content_inner = require('../models/MessageDeltaObject_delta_content_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}role`,
                label: `The entity that produced the message. One of `user` or `assistant`. - [${labelPrefix}role]`,
                type: 'string',
                choices: [
                    'user',
                    'assistant',
                ],
            },
            {
                key: `${keyPrefix}content`,
                label: `[${labelPrefix}content]`,
                children: MessageDeltaObject_delta_content_inner.fields(`${keyPrefix}content${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}file_ids`,
                label: `A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. - [${labelPrefix}file_ids]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'content': utils.childMapping(bundle.inputData?.[`${keyPrefix}content`], `${keyPrefix}content`, MessageDeltaObject_delta_content_inner),
            'file_ids': bundle.inputData?.[`${keyPrefix}file_ids`],
        }
    },
}
