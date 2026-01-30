const utils = require('../utils/utils');
const MessageDeltaContentImageUrlObject_image_url = require('../models/MessageDeltaContentImageUrlObject_image_url');

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
                label: `Always `image_url`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'image_url',
                ],
            },
            ...MessageDeltaContentImageUrlObject_image_url.fields(`${keyPrefix}image_url`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'image_url': utils.removeIfEmpty(MessageDeltaContentImageUrlObject_image_url.mapping(bundle, `${keyPrefix}image_url`)),
        }
    },
}
