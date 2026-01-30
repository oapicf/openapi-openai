const utils = require('../utils/utils');
const VectorStoreExpirationAfter = require('../models/VectorStoreExpirationAfter');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `The name of the vector store. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...VectorStoreExpirationAfter.fields(`${keyPrefix}expires_after`, isInput),
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  - [${labelPrefix}metadata]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'expires_after': utils.removeIfEmpty(VectorStoreExpirationAfter.mapping(bundle, `${keyPrefix}expires_after`)),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
