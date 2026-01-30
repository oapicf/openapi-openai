const utils = require('../utils/utils');
const MessageContentImageUrlObject_image_url = require('../models/MessageContentImageUrlObject_image_url');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of the content part. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'image_url',
                ],
            },
            ...MessageContentImageUrlObject_image_url.fields(`${keyPrefix}image_url`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'image_url': utils.removeIfEmpty(MessageContentImageUrlObject_image_url.mapping(bundle, `${keyPrefix}image_url`)),
        }
    },
}
