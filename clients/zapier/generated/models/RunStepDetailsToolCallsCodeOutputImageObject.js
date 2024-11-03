const utils = require('../utils/utils');
const RunStepDetailsToolCallsCodeOutputImageObject_image = require('../models/RunStepDetailsToolCallsCodeOutputImageObject_image');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `image`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'image',
                ],
            },
            ...RunStepDetailsToolCallsCodeOutputImageObject_image.fields(`${keyPrefix}image`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'image': utils.removeIfEmpty(RunStepDetailsToolCallsCodeOutputImageObject_image.mapping(bundle, `${keyPrefix}image`)),
        }
    },
}
