const utils = require('../utils/utils');
const AssistantsApiResponseFormat = require('../models/AssistantsApiResponseFormat');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Must be one of `text` or `json_object`. - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'text',
                    'json_object',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
