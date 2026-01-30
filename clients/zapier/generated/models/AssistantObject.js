const utils = require('../utils/utils');
const AssistantObject_tool_resources = require('../models/AssistantObject_tool_resources');
const AssistantObject_tools_inner = require('../models/AssistantObject_tools_inner');
const AssistantsApiResponseFormatOption = require('../models/AssistantsApiResponseFormatOption');

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
                label: `The object type, which is always `assistant`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'assistant',
                ],
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the assistant was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the assistant. The maximum length is 256 characters.  - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `The description of the assistant. The maximum length is 512 characters.  - [${labelPrefix}description]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}model`,
                label: `ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them.  - [${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}instructions`,
                label: `The system instructions that the assistant uses. The maximum length is 256,000 characters.  - [${labelPrefix}instructions]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}tools`,
                label: `[${labelPrefix}tools]`,
                children: AssistantObject_tools_inner.fields(`${keyPrefix}tools${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...AssistantObject_tool_resources.fields(`${keyPrefix}tool_resources`, isInput),
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  - [${labelPrefix}metadata]`,
                required: true,
                dict: true,
            },
            {
                key: `${keyPrefix}temperature`,
                label: `What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  - [${labelPrefix}temperature]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}top_p`,
                label: `An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  - [${labelPrefix}top_p]`,
                type: 'number',
            },
            ...AssistantsApiResponseFormatOption.fields(`${keyPrefix}response_format`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'instructions': bundle.inputData?.[`${keyPrefix}instructions`],
            'tools': utils.childMapping(bundle.inputData?.[`${keyPrefix}tools`], `${keyPrefix}tools`, AssistantObject_tools_inner),
            'tool_resources': utils.removeIfEmpty(AssistantObject_tool_resources.mapping(bundle, `${keyPrefix}tool_resources`)),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
            'temperature': bundle.inputData?.[`${keyPrefix}temperature`],
            'top_p': bundle.inputData?.[`${keyPrefix}top_p`],
            'response_format': utils.removeIfEmpty(AssistantsApiResponseFormatOption.mapping(bundle, `${keyPrefix}response_format`)),
        }
    },
}
