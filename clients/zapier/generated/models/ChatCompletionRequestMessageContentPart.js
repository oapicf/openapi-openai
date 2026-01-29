const utils = require('../utils/utils');
const ChatCompletionRequestMessageContentPartImage = require('../models/ChatCompletionRequestMessageContentPartImage');
const ChatCompletionRequestMessageContentPartImage_image_url = require('../models/ChatCompletionRequestMessageContentPartImage_image_url');
const ChatCompletionRequestMessageContentPartText = require('../models/ChatCompletionRequestMessageContentPartText');

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
                    'text',
                    'image_url',
                ],
            },
            {
                key: `${keyPrefix}text`,
                label: `The text content. - [${labelPrefix}text]`,
                required: true,
                type: 'string',
            },
            ...ChatCompletionRequestMessageContentPartImage_image_url.fields(`${keyPrefix}image_url`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'image_url': utils.removeIfEmpty(ChatCompletionRequestMessageContentPartImage_image_url.mapping(bundle, `${keyPrefix}image_url`)),
        }
    },
}
