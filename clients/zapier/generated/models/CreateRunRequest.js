const utils = require('../utils/utils');
const AssistantObject_tools_inner = require('../models/AssistantObject_tools_inner');
const AssistantsApiResponseFormatOption = require('../models/AssistantsApiResponseFormatOption');
const AssistantsApiToolChoiceOption = require('../models/AssistantsApiToolChoiceOption');
const CreateMessageRequest = require('../models/CreateMessageRequest');
const CreateRunRequest_model = require('../models/CreateRunRequest_model');
const TruncationObject = require('../models/TruncationObject');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}assistant_id`,
                label: `The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. - [${labelPrefix}assistant_id]`,
                required: true,
                type: 'string',
            },
            ...CreateRunRequest_model.fields(`${keyPrefix}model`, isInput),
            {
                key: `${keyPrefix}instructions`,
                label: `Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. - [${labelPrefix}instructions]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}additional_instructions`,
                label: `Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. - [${labelPrefix}additional_instructions]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}additional_messages`,
                label: `[${labelPrefix}additional_messages]`,
                children: CreateMessageRequest.fields(`${keyPrefix}additional_messages${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}tools`,
                label: `[${labelPrefix}tools]`,
                children: AssistantObject_tools_inner.fields(`${keyPrefix}tools${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  - [${labelPrefix}metadata]`,
                dict: true,
            },
            {
                key: `${keyPrefix}temperature`,
                label: `What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  - [${labelPrefix}temperature]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}stream`,
                label: `If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  - [${labelPrefix}stream]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}max_prompt_tokens`,
                label: `The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  - [${labelPrefix}max_prompt_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_completion_tokens`,
                label: `The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  - [${labelPrefix}max_completion_tokens]`,
                type: 'integer',
            },
            ...TruncationObject.fields(`${keyPrefix}truncation_strategy`, isInput),
            ...AssistantsApiToolChoiceOption.fields(`${keyPrefix}tool_choice`, isInput),
            ...AssistantsApiResponseFormatOption.fields(`${keyPrefix}response_format`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'assistant_id': bundle.inputData?.[`${keyPrefix}assistant_id`],
            'model': utils.removeIfEmpty(CreateRunRequest_model.mapping(bundle, `${keyPrefix}model`)),
            'instructions': bundle.inputData?.[`${keyPrefix}instructions`],
            'additional_instructions': bundle.inputData?.[`${keyPrefix}additional_instructions`],
            'additional_messages': utils.childMapping(bundle.inputData?.[`${keyPrefix}additional_messages`], `${keyPrefix}additional_messages`, CreateMessageRequest),
            'tools': utils.childMapping(bundle.inputData?.[`${keyPrefix}tools`], `${keyPrefix}tools`, AssistantObject_tools_inner),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
            'temperature': bundle.inputData?.[`${keyPrefix}temperature`],
            'stream': bundle.inputData?.[`${keyPrefix}stream`],
            'max_prompt_tokens': bundle.inputData?.[`${keyPrefix}max_prompt_tokens`],
            'max_completion_tokens': bundle.inputData?.[`${keyPrefix}max_completion_tokens`],
            'truncation_strategy': utils.removeIfEmpty(TruncationObject.mapping(bundle, `${keyPrefix}truncation_strategy`)),
            'tool_choice': utils.removeIfEmpty(AssistantsApiToolChoiceOption.mapping(bundle, `${keyPrefix}tool_choice`)),
            'response_format': utils.removeIfEmpty(AssistantsApiResponseFormatOption.mapping(bundle, `${keyPrefix}response_format`)),
        }
    },
}
