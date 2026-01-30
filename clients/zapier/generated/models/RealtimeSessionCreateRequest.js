const utils = require('../utils/utils');
const RealtimeResponseCreateParams_max_response_output_tokens = require('../models/RealtimeResponseCreateParams_max_response_output_tokens');
const RealtimeResponseCreateParams_tools_inner = require('../models/RealtimeResponseCreateParams_tools_inner');
const RealtimeSessionCreateRequest_turn_detection = require('../models/RealtimeSessionCreateRequest_turn_detection');
const RealtimeSession_input_audio_transcription = require('../models/RealtimeSession_input_audio_transcription');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}modalities`,
                label: `The set of modalities the model can respond with. To disable audio, set this to [\"text\"].  - [${labelPrefix}modalities]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}model`,
                label: `The Realtime model used for this session.  - [${labelPrefix}model]`,
                required: true,
                type: 'string',
                choices: [
                    'gpt-4o-realtime-preview',
                    'gpt-4o-realtime-preview-2024-10-01',
                    'gpt-4o-realtime-preview-2024-12-17',
                    'gpt-4o-mini-realtime-preview',
                    'gpt-4o-mini-realtime-preview-2024-12-17',
                ],
            },
            {
                key: `${keyPrefix}instructions`,
                label: `The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.  - [${labelPrefix}instructions]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}voice`,
                label: `The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.  - [${labelPrefix}voice]`,
                type: 'string',
                choices: [
                    'alloy',
                    'ash',
                    'ballad',
                    'coral',
                    'echo',
                    'sage',
                    'shimmer',
                    'verse',
                ],
            },
            {
                key: `${keyPrefix}input_audio_format`,
                label: `The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  - [${labelPrefix}input_audio_format]`,
                type: 'string',
                choices: [
                    'pcm16',
                    'g711_ulaw',
                    'g711_alaw',
                ],
            },
            {
                key: `${keyPrefix}output_audio_format`,
                label: `The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  - [${labelPrefix}output_audio_format]`,
                type: 'string',
                choices: [
                    'pcm16',
                    'g711_ulaw',
                    'g711_alaw',
                ],
            },
            ...RealtimeSession_input_audio_transcription.fields(`${keyPrefix}input_audio_transcription`, isInput),
            ...RealtimeSessionCreateRequest_turn_detection.fields(`${keyPrefix}turn_detection`, isInput),
            {
                key: `${keyPrefix}tools`,
                label: `[${labelPrefix}tools]`,
                children: RealtimeResponseCreateParams_tools_inner.fields(`${keyPrefix}tools${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}tool_choice`,
                label: `How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function.  - [${labelPrefix}tool_choice]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}temperature`,
                label: `Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  - [${labelPrefix}temperature]`,
                type: 'number',
            },
            ...RealtimeResponseCreateParams_max_response_output_tokens.fields(`${keyPrefix}max_response_output_tokens`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'modalities': bundle.inputData?.[`${keyPrefix}modalities`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'instructions': bundle.inputData?.[`${keyPrefix}instructions`],
            'voice': bundle.inputData?.[`${keyPrefix}voice`],
            'input_audio_format': bundle.inputData?.[`${keyPrefix}input_audio_format`],
            'output_audio_format': bundle.inputData?.[`${keyPrefix}output_audio_format`],
            'input_audio_transcription': utils.removeIfEmpty(RealtimeSession_input_audio_transcription.mapping(bundle, `${keyPrefix}input_audio_transcription`)),
            'turn_detection': utils.removeIfEmpty(RealtimeSessionCreateRequest_turn_detection.mapping(bundle, `${keyPrefix}turn_detection`)),
            'tools': utils.childMapping(bundle.inputData?.[`${keyPrefix}tools`], `${keyPrefix}tools`, RealtimeResponseCreateParams_tools_inner),
            'tool_choice': bundle.inputData?.[`${keyPrefix}tool_choice`],
            'temperature': bundle.inputData?.[`${keyPrefix}temperature`],
            'max_response_output_tokens': utils.removeIfEmpty(RealtimeResponseCreateParams_max_response_output_tokens.mapping(bundle, `${keyPrefix}max_response_output_tokens`)),
        }
    },
}
