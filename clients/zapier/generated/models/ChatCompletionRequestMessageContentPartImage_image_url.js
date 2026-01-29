const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}url`,
                label: `Either a URL of the image or the base64 encoded image data. - [${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}detail`,
                label: `Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding). - [${labelPrefix}detail]`,
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
