const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}prompt`,
                label: `A text description of the desired image(s). The maximum length is 1000 characters. - [${labelPrefix}prompt]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}n`,
                label: `The number of images to generate. Must be between 1 and 10. - [${labelPrefix}n]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}size`,
                label: `The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. - [${labelPrefix}size]`,
                type: 'string',
                choices: [
                    '256x256',
                    '512x512',
                    '1024x1024',
                ],
            },
            {
                key: `${keyPrefix}response_format`,
                label: `The format in which the generated images are returned. Must be one of `url` or `b64_json`. - [${labelPrefix}response_format]`,
                type: 'string',
                choices: [
                    'url',
                    'b64_json',
                ],
            },
            {
                key: `${keyPrefix}user`,
                label: `A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  - [${labelPrefix}user]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'prompt': bundle.inputData?.[`${keyPrefix}prompt`],
            'n': bundle.inputData?.[`${keyPrefix}n`],
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'response_format': bundle.inputData?.[`${keyPrefix}response_format`],
            'user': bundle.inputData?.[`${keyPrefix}user`],
        }
    },
}
