const utils = require('../utils/utils');
const RunStepDetailsToolCallsCodeOutputImageObject = require('../models/RunStepDetailsToolCallsCodeOutputImageObject');
const RunStepDetailsToolCallsCodeOutputImageObject_image = require('../models/RunStepDetailsToolCallsCodeOutputImageObject_image');
const RunStepDetailsToolCallsCodeOutputLogsObject = require('../models/RunStepDetailsToolCallsCodeOutputLogsObject');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `logs`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'logs',
                    'image',
                ],
            },
            {
                key: `${keyPrefix}logs`,
                label: `The text output from the Code Interpreter tool call. - [${labelPrefix}logs]`,
                required: true,
                type: 'string',
            },
            ...RunStepDetailsToolCallsCodeOutputImageObject_image.fields(`${keyPrefix}image`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'logs': bundle.inputData?.[`${keyPrefix}logs`],
            'image': utils.removeIfEmpty(RunStepDetailsToolCallsCodeOutputImageObject_image.mapping(bundle, `${keyPrefix}image`)),
        }
    },
}
