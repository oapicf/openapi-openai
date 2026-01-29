const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `The index of the embedding in the list of embeddings. - [${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}embedding`,
                label: `The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  - [${labelPrefix}embedding]`,
                required: true,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always \"embedding\". - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'embedding',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'embedding': bundle.inputData?.[`${keyPrefix}embedding`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
        }
    },
}
