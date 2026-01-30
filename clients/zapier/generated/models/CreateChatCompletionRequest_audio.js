const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}voice`,
                label: `The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive).  - [${labelPrefix}voice]`,
                required: true,
                type: 'string',
                choices: [
                    'alloy',
                    'ash',
                    'ballad',
                    'coral',
                    'echo',
                    'sage',
                    'shimmer',
                    'verse',
                ],
            },
            {
                key: `${keyPrefix}format`,
                label: `Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`.  - [${labelPrefix}format]`,
                required: true,
                type: 'string',
                choices: [
                    'wav',
                    'mp3',
                    'flac',
                    'opus',
                    'pcm16',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'voice': bundle.inputData?.[`${keyPrefix}voice`],
            'format': bundle.inputData?.[`${keyPrefix}format`],
        }
    },
}
