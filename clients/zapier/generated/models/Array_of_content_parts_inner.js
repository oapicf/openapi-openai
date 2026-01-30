const utils = require('../utils/utils');
const MessageContentImageFileObject = require('../models/MessageContentImageFileObject');
const MessageContentImageFileObject_image_file = require('../models/MessageContentImageFileObject_image_file');
const MessageContentImageUrlObject = require('../models/MessageContentImageUrlObject');
const MessageContentImageUrlObject_image_url = require('../models/MessageContentImageUrlObject_image_url');
const MessageRequestContentTextObject = require('../models/MessageRequestContentTextObject');

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
                ],
            },
            ...MessageContentImageFileObject_image_file.fields(`${keyPrefix}image_file`, isInput),
            ...MessageContentImageUrlObject_image_url.fields(`${keyPrefix}image_url`, isInput),
            {
                key: `${keyPrefix}text`,
                label: `Text content to be sent to the model - [${labelPrefix}text]`,
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
            'text': bundle.inputData?.[`${keyPrefix}text`],
        }
    },
}
