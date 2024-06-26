const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}arguments`,
                label: `The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. - [${labelPrefix}arguments]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the function to call. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'arguments': bundle.inputData?.[`${keyPrefix}arguments`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
