const utils = require('../utils/utils');
const ModifyThreadRequest_tool_resources = require('../models/ModifyThreadRequest_tool_resources');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ModifyThreadRequest_tool_resources.fields(`${keyPrefix}tool_resources`, isInput),
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
            'tool_resources': utils.removeIfEmpty(ModifyThreadRequest_tool_resources.mapping(bundle, `${keyPrefix}tool_resources`)),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
