const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Type of turn detection, only `server_vad` is currently supported.  - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}threshold`,
                label: `Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  - [${labelPrefix}threshold]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}prefix_padding_ms`,
                label: `Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  - [${labelPrefix}prefix_padding_ms]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}silence_duration_ms`,
                label: `Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  - [${labelPrefix}silence_duration_ms]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}create_response`,
                label: `Whether or not to automatically generate a response when VAD is enabled. `true` by default.  - [${labelPrefix}create_response]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'threshold': bundle.inputData?.[`${keyPrefix}threshold`],
            'prefix_padding_ms': bundle.inputData?.[`${keyPrefix}prefix_padding_ms`],
            'silence_duration_ms': bundle.inputData?.[`${keyPrefix}silence_duration_ms`],
            'create_response': bundle.inputData?.[`${keyPrefix}create_response`],
        }
    },
}
