const utils = require('../utils/utils');
const CreateSpeechRequest_model = require('../models/CreateSpeechRequest_model');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CreateSpeechRequest_model.fields(`${keyPrefix}model`, isInput),
            {
                key: `${keyPrefix}input`,
                label: `The text to generate audio for. The maximum length is 4096 characters. - [${labelPrefix}input]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}voice`,
                label: `The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options). - [${labelPrefix}voice]`,
                required: true,
                type: 'string',
                choices: [
                    'alloy',
                    'echo',
                    'fable',
                    'onyx',
                    'nova',
                    'shimmer',
                ],
            },
            {
                key: `${keyPrefix}response_format`,
                label: `The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`. - [${labelPrefix}response_format]`,
                type: 'string',
                choices: [
                    'mp3',
                    'opus',
                    'aac',
                    'flac',
                    'wav',
                    'pcm',
                ],
            },
            {
                key: `${keyPrefix}speed`,
                label: `The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default. - [${labelPrefix}speed]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'model': utils.removeIfEmpty(CreateSpeechRequest_model.mapping(bundle, `${keyPrefix}model`)),
            'input': bundle.inputData?.[`${keyPrefix}input`],
            'voice': bundle.inputData?.[`${keyPrefix}voice`],
            'response_format': bundle.inputData?.[`${keyPrefix}response_format`],
            'speed': bundle.inputData?.[`${keyPrefix}speed`],
        }
    },
}
