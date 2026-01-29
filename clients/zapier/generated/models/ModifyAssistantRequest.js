const utils = require('../utils/utils');
const AssistantObject_tools_inner = require('../models/AssistantObject_tools_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}model`,
                label: `[${labelPrefix}model]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the assistant. The maximum length is 256 characters.  - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `The description of the assistant. The maximum length is 512 characters.  - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}instructions`,
                label: `The system instructions that the assistant uses. The maximum length is 256,000 characters.  - [${labelPrefix}instructions]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}tools`,
                label: `[${labelPrefix}tools]`,
                children: AssistantObject_tools_inner.fields(`${keyPrefix}tools${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}file_ids`,
                label: `A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant.  - [${labelPrefix}file_ids]`,
                list: true,
                type: 'string',
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
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'instructions': bundle.inputData?.[`${keyPrefix}instructions`],
            'tools': utils.childMapping(bundle.inputData?.[`${keyPrefix}tools`], `${keyPrefix}tools`, AssistantObject_tools_inner),
            'file_ids': bundle.inputData?.[`${keyPrefix}file_ids`],
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
