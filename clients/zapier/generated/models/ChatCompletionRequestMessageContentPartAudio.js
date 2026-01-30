const utils = require('../utils/utils');
const ChatCompletionRequestMessageContentPartAudio_input_audio = require('../models/ChatCompletionRequestMessageContentPartAudio_input_audio');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of the content part. Always `input_audio`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'input_audio',
                ],
            },
            ...ChatCompletionRequestMessageContentPartAudio_input_audio.fields(`${keyPrefix}input_audio`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'input_audio': utils.removeIfEmpty(ChatCompletionRequestMessageContentPartAudio_input_audio.mapping(bundle, `${keyPrefix}input_audio`)),
        }
    },
}
