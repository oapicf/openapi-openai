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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'content': utils.childMapping(bundle.inputData?.[`${keyPrefix}content`], `${keyPrefix}content`, MessageDeltaObject_delta_content_inner),
        }
    },
}
