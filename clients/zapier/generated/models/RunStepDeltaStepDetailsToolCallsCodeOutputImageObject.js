const utils = require('../utils/utils');
const RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image = require('../models/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `The index of the output in the outputs array. - [${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}type`,
                label: `Always `image`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'image',
                ],
            },
            ...RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.fields(`${keyPrefix}image`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'image': utils.removeIfEmpty(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.mapping(bundle, `${keyPrefix}image`)),
        }
    },
}
