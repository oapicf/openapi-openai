const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}url`,
                label: `The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. - [${labelPrefix}url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}detail`,
                label: `Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. - [${labelPrefix}detail]`,
                type: 'string',
                choices: [
                    'auto',
                    'low',
                    'high',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'detail': bundle.inputData?.[`${keyPrefix}detail`],
        }
    },
}
