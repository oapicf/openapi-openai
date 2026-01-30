const utils = require('../utils/utils');
const ModifyThreadRequest_tool_resources = require('../models/ModifyThreadRequest_tool_resources');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier, which can be referenced in API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `thread`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'thread',
                ],
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the thread was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            ...ModifyThreadRequest_tool_resources.fields(`${keyPrefix}tool_resources`, isInput),
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  - [${labelPrefix}metadata]`,
                required: true,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'tool_resources': utils.removeIfEmpty(ModifyThreadRequest_tool_resources.mapping(bundle, `${keyPrefix}tool_resources`)),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
