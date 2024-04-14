const utils = require('../utils/utils');
const MessageDeltaContentTextObject_text = require('../models/MessageDeltaContentTextObject_text');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `The index of the content part in the message. - [${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}type`,
                label: `Always `text`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'text',
                ],
            },
            ...MessageDeltaContentTextObject_text.fields(`${keyPrefix}text`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'text': utils.removeIfEmpty(MessageDeltaContentTextObject_text.mapping(bundle, `${keyPrefix}text`)),
        }
    },
}
