const utils = require('../utils/utils');
const ChatCompletionRequestMessageContentPartAudio = require('../models/ChatCompletionRequestMessageContentPartAudio');
const ChatCompletionRequestMessageContentPartAudio_input_audio = require('../models/ChatCompletionRequestMessageContentPartAudio_input_audio');
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
                    'input_audio',
                ],
            },
            {
                key: `${keyPrefix}text`,
                label: `The text content. - [${labelPrefix}text]`,
                required: true,
                type: 'string',
            },
            ...ChatCompletionRequestMessageContentPartImage_image_url.fields(`${keyPrefix}image_url`, isInput),
            ...ChatCompletionRequestMessageContentPartAudio_input_audio.fields(`${keyPrefix}input_audio`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'image_url': utils.removeIfEmpty(ChatCompletionRequestMessageContentPartImage_image_url.mapping(bundle, `${keyPrefix}image_url`)),
            'input_audio': utils.removeIfEmpty(ChatCompletionRequestMessageContentPartAudio_input_audio.mapping(bundle, `${keyPrefix}input_audio`)),
        }
    },
}
