const utils = require('../utils/utils');
const CreateMessageRequest = require('../models/CreateMessageRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}messages`,
                label: `[${labelPrefix}messages]`,
                children: CreateMessageRequest.fields(`${keyPrefix}messages${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  - [${labelPrefix}metadata]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'messages': utils.childMapping(bundle.inputData?.[`${keyPrefix}messages`], `${keyPrefix}messages`, CreateMessageRequest),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
