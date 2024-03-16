const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `The description of what the function does. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}parameters`,
                label: `The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. - [${labelPrefix}parameters]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'parameters': bundle.inputData?.[`${keyPrefix}parameters`],
        }
    },
}
