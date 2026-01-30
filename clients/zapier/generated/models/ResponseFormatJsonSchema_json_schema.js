const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}description`,
                label: `A description of what the response format is for, used by the model to determine how to respond in the format. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}schema`,
                label: `The schema for the response format, described as a JSON Schema object. - [${labelPrefix}schema]`,
                dict: true,
            },
            {
                key: `${keyPrefix}strict`,
                label: `Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs). - [${labelPrefix}strict]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'schema': bundle.inputData?.[`${keyPrefix}schema`],
            'strict': bundle.inputData?.[`${keyPrefix}strict`],
        }
    },
}
