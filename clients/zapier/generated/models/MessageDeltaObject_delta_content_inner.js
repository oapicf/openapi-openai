const utils = require('../utils/utils');
const MessageDeltaContentImageFileObject = require('../models/MessageDeltaContentImageFileObject');
const MessageDeltaContentImageFileObject_image_file = require('../models/MessageDeltaContentImageFileObject_image_file');
const MessageDeltaContentTextObject = require('../models/MessageDeltaContentTextObject');
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
                label: `Always `image_file`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'image_file',
                    'text',
                ],
            },
            ...MessageDeltaContentImageFileObject_image_file.fields(`${keyPrefix}image_file`, isInput),
            ...MessageDeltaContentTextObject_text.fields(`${keyPrefix}text`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'image_file': utils.removeIfEmpty(MessageDeltaContentImageFileObject_image_file.mapping(bundle, `${keyPrefix}image_file`)),
            'text': utils.removeIfEmpty(MessageDeltaContentTextObject_text.mapping(bundle, `${keyPrefix}text`)),
        }
    },
}
