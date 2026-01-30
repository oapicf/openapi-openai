const utils = require('../utils/utils');
const CostsResult = require('../models/CostsResult');
const CostsResult_amount = require('../models/CostsResult_amount');
const UsageAudioSpeechesResult = require('../models/UsageAudioSpeechesResult');
const UsageAudioTranscriptionsResult = require('../models/UsageAudioTranscriptionsResult');
const UsageCodeInterpreterSessionsResult = require('../models/UsageCodeInterpreterSessionsResult');
const UsageCompletionsResult = require('../models/UsageCompletionsResult');
const UsageEmbeddingsResult = require('../models/UsageEmbeddingsResult');
const UsageImagesResult = require('../models/UsageImagesResult');
const UsageModerationsResult = require('../models/UsageModerationsResult');
const UsageVectorStoresResult = require('../models/UsageVectorStoresResult');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'organization.costs.result',
                ],
            },
            {
                key: `${keyPrefix}input_tokens`,
                label: `The aggregated number of input tokens used. - [${labelPrefix}input_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}input_cached_tokens`,
                label: `The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. - [${labelPrefix}input_cached_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}output_tokens`,
                label: `The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. - [${labelPrefix}output_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}input_audio_tokens`,
                label: `The aggregated number of audio input tokens used, including cached tokens. - [${labelPrefix}input_audio_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}output_audio_tokens`,
                label: `The aggregated number of audio output tokens used. - [${labelPrefix}output_audio_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}num_model_requests`,
                label: `The count of requests made to the model. - [${labelPrefix}num_model_requests]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}project_id`,
                label: `When `group_by=project_id`, this field provides the project ID of the grouped costs result. - [${labelPrefix}project_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}user_id`,
                label: `When `group_by=user_id`, this field provides the user ID of the grouped usage result. - [${labelPrefix}user_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}api_key_id`,
                label: `When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. - [${labelPrefix}api_key_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}model`,
                label: `When `group_by=model`, this field provides the model name of the grouped usage result. - [${labelPrefix}model]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}batch`,
                label: `When `group_by=batch`, this field tells whether the grouped usage result is batch or not. - [${labelPrefix}batch]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}images`,
                label: `The number of images processed. - [${labelPrefix}images]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}source`,
                label: `When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. - [${labelPrefix}source]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}size`,
                label: `When `group_by=size`, this field provides the image size of the grouped usage result. - [${labelPrefix}size]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}characters`,
                label: `The number of characters processed. - [${labelPrefix}characters]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}seconds`,
                label: `The number of seconds processed. - [${labelPrefix}seconds]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}usage_bytes`,
                label: `The vector stores usage in bytes. - [${labelPrefix}usage_bytes]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}sessions`,
                label: `The number of code interpreter sessions. - [${labelPrefix}sessions]`,
                required: true,
                type: 'integer',
            },
            ...CostsResult_amount.fields(`${keyPrefix}amount`, isInput),
            {
                key: `${keyPrefix}line_item`,
                label: `When `group_by=line_item`, this field provides the line item of the grouped costs result. - [${labelPrefix}line_item]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'input_tokens': bundle.inputData?.[`${keyPrefix}input_tokens`],
            'input_cached_tokens': bundle.inputData?.[`${keyPrefix}input_cached_tokens`],
            'output_tokens': bundle.inputData?.[`${keyPrefix}output_tokens`],
            'input_audio_tokens': bundle.inputData?.[`${keyPrefix}input_audio_tokens`],
            'output_audio_tokens': bundle.inputData?.[`${keyPrefix}output_audio_tokens`],
            'num_model_requests': bundle.inputData?.[`${keyPrefix}num_model_requests`],
            'project_id': bundle.inputData?.[`${keyPrefix}project_id`],
            'user_id': bundle.inputData?.[`${keyPrefix}user_id`],
            'api_key_id': bundle.inputData?.[`${keyPrefix}api_key_id`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'batch': bundle.inputData?.[`${keyPrefix}batch`],
            'images': bundle.inputData?.[`${keyPrefix}images`],
            'source': bundle.inputData?.[`${keyPrefix}source`],
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'characters': bundle.inputData?.[`${keyPrefix}characters`],
            'seconds': bundle.inputData?.[`${keyPrefix}seconds`],
            'usage_bytes': bundle.inputData?.[`${keyPrefix}usage_bytes`],
            'sessions': bundle.inputData?.[`${keyPrefix}sessions`],
            'amount': utils.removeIfEmpty(CostsResult_amount.mapping(bundle, `${keyPrefix}amount`)),
            'line_item': bundle.inputData?.[`${keyPrefix}line_item`],
        }
    },
}
