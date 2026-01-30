const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}description`,
                label: `A description of what the function does, used by the model to choose when and how to call the function. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}parameters`,
                label: `The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list. - [${labelPrefix}parameters]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'parameters': bundle.inputData?.[`${keyPrefix}parameters`],
        }
    },
}
