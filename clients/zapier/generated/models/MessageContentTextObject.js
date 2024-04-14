const utils = require('../utils/utils');
const MessageContentTextObject_text = require('../models/MessageContentTextObject_text');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `text`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'text',
                ],
            },
            ...MessageContentTextObject_text.fields(`${keyPrefix}text`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'text': utils.removeIfEmpty(MessageContentTextObject_text.mapping(bundle, `${keyPrefix}text`)),
        }
    },
}
