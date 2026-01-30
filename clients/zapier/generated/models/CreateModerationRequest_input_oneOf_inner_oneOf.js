const utils = require('../utils/utils');
const CreateModerationRequest_input_oneOf_inner_oneOf_image_url = require('../models/CreateModerationRequest_input_oneOf_inner_oneOf_image_url');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `image_url`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'image_url',
                ],
            },
            ...CreateModerationRequest_input_oneOf_inner_oneOf_image_url.fields(`${keyPrefix}image_url`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'image_url': utils.removeIfEmpty(CreateModerationRequest_input_oneOf_inner_oneOf_image_url.mapping(bundle, `${keyPrefix}image_url`)),
        }
    },
}
