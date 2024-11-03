const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}b64_json`,
                label: `The base64-encoded JSON of the generated image, if `response_format` is `b64_json`. - [${labelPrefix}b64_json]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}url`,
                label: `The URL of the generated image, if `response_format` is `url` (default). - [${labelPrefix}url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}revised_prompt`,
                label: `The prompt that was used to generate the image, if there was any revision to the prompt. - [${labelPrefix}revised_prompt]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'b64_json': bundle.inputData?.[`${keyPrefix}b64_json`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'revised_prompt': bundle.inputData?.[`${keyPrefix}revised_prompt`],
        }
    },
}
