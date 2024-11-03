const utils = require('../utils/utils');
const MessageObject_content_inner = require('../models/MessageObject_content_inner');
const MessageObject_incomplete_details = require('../models/MessageObject_incomplete_details');

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
                label: `The object type, which is always `thread.message`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'thread.message',
                ],
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the message was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}thread_id`,
                label: `The [thread](/docs/api-reference/threads) ID that this message belongs to. - [${labelPrefix}thread_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `The status of the message, which can be either `in_progress`, `incomplete`, or `completed`. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'in_progress',
                    'incomplete',
                    'completed',
                ],
            },
            ...MessageObject_incomplete_details.fields(`${keyPrefix}incomplete_details`, isInput),
            {
                key: `${keyPrefix}completed_at`,
                label: `The Unix timestamp (in seconds) for when the message was completed. - [${labelPrefix}completed_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}incomplete_at`,
                label: `The Unix timestamp (in seconds) for when the message was marked as incomplete. - [${labelPrefix}incomplete_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}role`,
                label: `The entity that produced the message. One of `user` or `assistant`. - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'user',
                    'assistant',
                ],
            },
            {
                key: `${keyPrefix}content`,
                label: `[${labelPrefix}content]`,
                children: MessageObject_content_inner.fields(`${keyPrefix}content${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}assistant_id`,
                label: `If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. - [${labelPrefix}assistant_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}run_id`,
                label: `The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. - [${labelPrefix}run_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}file_ids`,
                label: `A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. - [${labelPrefix}file_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  - [${labelPrefix}metadata]`,
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
            'thread_id': bundle.inputData?.[`${keyPrefix}thread_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'incomplete_details': utils.removeIfEmpty(MessageObject_incomplete_details.mapping(bundle, `${keyPrefix}incomplete_details`)),
            'completed_at': bundle.inputData?.[`${keyPrefix}completed_at`],
            'incomplete_at': bundle.inputData?.[`${keyPrefix}incomplete_at`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'content': utils.childMapping(bundle.inputData?.[`${keyPrefix}content`], `${keyPrefix}content`, MessageObject_content_inner),
            'assistant_id': bundle.inputData?.[`${keyPrefix}assistant_id`],
            'run_id': bundle.inputData?.[`${keyPrefix}run_id`],
            'file_ids': bundle.inputData?.[`${keyPrefix}file_ids`],
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
