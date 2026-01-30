const utils = require('../utils/utils');
const Batch_errors = require('../models/Batch_errors');
const Batch_request_counts = require('../models/Batch_request_counts');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `batch`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'batch',
                ],
            },
            {
                key: `${keyPrefix}endpoint`,
                label: `The OpenAI API endpoint used by the batch. - [${labelPrefix}endpoint]`,
                required: true,
                type: 'string',
            },
            ...Batch_errors.fields(`${keyPrefix}errors`, isInput),
            {
                key: `${keyPrefix}input_file_id`,
                label: `The ID of the input file for the batch. - [${labelPrefix}input_file_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}completion_window`,
                label: `The time frame within which the batch should be processed. - [${labelPrefix}completion_window]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `The current status of the batch. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'validating',
                    'failed',
                    'in_progress',
                    'finalizing',
                    'completed',
                    'expired',
                    'cancelling',
                    'cancelled',
                ],
            },
            {
                key: `${keyPrefix}output_file_id`,
                label: `The ID of the file containing the outputs of successfully executed requests. - [${labelPrefix}output_file_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}error_file_id`,
                label: `The ID of the file containing the outputs of requests with errors. - [${labelPrefix}error_file_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the batch was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}in_progress_at`,
                label: `The Unix timestamp (in seconds) for when the batch started processing. - [${labelPrefix}in_progress_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}expires_at`,
                label: `The Unix timestamp (in seconds) for when the batch will expire. - [${labelPrefix}expires_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}finalizing_at`,
                label: `The Unix timestamp (in seconds) for when the batch started finalizing. - [${labelPrefix}finalizing_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}completed_at`,
                label: `The Unix timestamp (in seconds) for when the batch was completed. - [${labelPrefix}completed_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}failed_at`,
                label: `The Unix timestamp (in seconds) for when the batch failed. - [${labelPrefix}failed_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}expired_at`,
                label: `The Unix timestamp (in seconds) for when the batch expired. - [${labelPrefix}expired_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cancelling_at`,
                label: `The Unix timestamp (in seconds) for when the batch started cancelling. - [${labelPrefix}cancelling_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cancelled_at`,
                label: `The Unix timestamp (in seconds) for when the batch was cancelled. - [${labelPrefix}cancelled_at]`,
                type: 'integer',
            },
            ...Batch_request_counts.fields(`${keyPrefix}request_counts`, isInput),
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
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'endpoint': bundle.inputData?.[`${keyPrefix}endpoint`],
            'errors': utils.removeIfEmpty(Batch_errors.mapping(bundle, `${keyPrefix}errors`)),
            'input_file_id': bundle.inputData?.[`${keyPrefix}input_file_id`],
            'completion_window': bundle.inputData?.[`${keyPrefix}completion_window`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'output_file_id': bundle.inputData?.[`${keyPrefix}output_file_id`],
            'error_file_id': bundle.inputData?.[`${keyPrefix}error_file_id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'in_progress_at': bundle.inputData?.[`${keyPrefix}in_progress_at`],
            'expires_at': bundle.inputData?.[`${keyPrefix}expires_at`],
            'finalizing_at': bundle.inputData?.[`${keyPrefix}finalizing_at`],
            'completed_at': bundle.inputData?.[`${keyPrefix}completed_at`],
            'failed_at': bundle.inputData?.[`${keyPrefix}failed_at`],
            'expired_at': bundle.inputData?.[`${keyPrefix}expired_at`],
            'cancelling_at': bundle.inputData?.[`${keyPrefix}cancelling_at`],
            'cancelled_at': bundle.inputData?.[`${keyPrefix}cancelled_at`],
            'request_counts': utils.removeIfEmpty(Batch_request_counts.mapping(bundle, `${keyPrefix}request_counts`)),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
