const utils = require('../utils/utils');
const MessageContentImageFileObject = require('../models/MessageContentImageFileObject');
const MessageContentImageFileObject_image_file = require('../models/MessageContentImageFileObject_image_file');
const MessageContentImageUrlObject = require('../models/MessageContentImageUrlObject');
const MessageContentImageUrlObject_image_url = require('../models/MessageContentImageUrlObject_image_url');
const MessageContentRefusalObject = require('../models/MessageContentRefusalObject');
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
                    'image_url',
                    'text',
                    'refusal',
                ],
            },
            ...MessageContentImageFileObject_image_file.fields(`${keyPrefix}image_file`, isInput),
            ...MessageContentImageUrlObject_image_url.fields(`${keyPrefix}image_url`, isInput),
            ...MessageContentTextObject_text.fields(`${keyPrefix}text`, isInput),
            {
                key: `${keyPrefix}refusal`,
                label: `[${labelPrefix}refusal]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'image_file': utils.removeIfEmpty(MessageContentImageFileObject_image_file.mapping(bundle, `${keyPrefix}image_file`)),
            'image_url': utils.removeIfEmpty(MessageContentImageUrlObject_image_url.mapping(bundle, `${keyPrefix}image_url`)),
            'text': utils.removeIfEmpty(MessageContentTextObject_text.mapping(bundle, `${keyPrefix}text`)),
            'refusal': bundle.inputData?.[`${keyPrefix}refusal`],
        }
    },
}
