const utils = require('../utils/utils');
const CreateImageRequest_model = require('../models/CreateImageRequest_model');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}prompt`,
                label: `A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`. - [${labelPrefix}prompt]`,
                required: true,
                type: 'string',
            },
            ...CreateImageRequest_model.fields(`${keyPrefix}model`, isInput),
            {
                key: `${keyPrefix}n`,
                label: `The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. - [${labelPrefix}n]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}quality`,
                label: `The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`. - [${labelPrefix}quality]`,
                type: 'string',
                choices: [
                    'standard',
                    'hd',
                ],
            },
            {
                key: `${keyPrefix}response_format`,
                label: `The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. - [${labelPrefix}response_format]`,
                type: 'string',
                choices: [
                    'url',
                    'b64_json',
                ],
            },
            {
                key: `${keyPrefix}size`,
                label: `The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models. - [${labelPrefix}size]`,
                type: 'string',
                choices: [
                    '256x256',
                    '512x512',
                    '1024x1024',
                    '1792x1024',
                    '1024x1792',
                ],
            },
            {
                key: `${keyPrefix}style`,
                label: `The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`. - [${labelPrefix}style]`,
                type: 'string',
                choices: [
                    'vivid',
                    'natural',
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
            'model': utils.removeIfEmpty(CreateImageRequest_model.mapping(bundle, `${keyPrefix}model`)),
            'n': bundle.inputData?.[`${keyPrefix}n`],
            'quality': bundle.inputData?.[`${keyPrefix}quality`],
            'response_format': bundle.inputData?.[`${keyPrefix}response_format`],
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'style': bundle.inputData?.[`${keyPrefix}style`],
            'user': bundle.inputData?.[`${keyPrefix}user`],
        }
    },
}
