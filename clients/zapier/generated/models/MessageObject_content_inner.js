const utils = require('../utils/utils');
const MessageContentImageFileObject = require('../models/MessageContentImageFileObject');
const MessageContentImageFileObject_image_file = require('../models/MessageContentImageFileObject_image_file');
const MessageContentTextObject = require('../models/MessageContentTextObject');
const MessageContentTextObject_text = require('../models/MessageContentTextObject_text');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
            ...MessageContentImageFileObject_image_file.fields(`${keyPrefix}image_file`, isInput),
            ...MessageContentTextObject_text.fields(`${keyPrefix}text`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'image_file': utils.removeIfEmpty(MessageContentImageFileObject_image_file.mapping(bundle, `${keyPrefix}image_file`)),
            'text': utils.removeIfEmpty(MessageContentTextObject_text.mapping(bundle, `${keyPrefix}text`)),
        }
    },
}
