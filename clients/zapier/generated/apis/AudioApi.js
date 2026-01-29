const samples = require('../samples/AudioApi');
const CreateSpeechRequest = require('../models/CreateSpeechRequest');
const CreateTranscriptionRequest_model = require('../models/CreateTranscriptionRequest_model');
const createTranscription_200_response = require('../models/createTranscription_200_response');
const createTranslation_200_response = require('../models/createTranslation_200_response');
const utils = require('../utils/utils');
const FormData = require('form-data');
const FormData = require('form-data');

module.exports = {
    createSpeech: {
        key: 'createSpeech',
        noun: 'Audio',
        display: {
            label: 'Generates audio from the input text.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...CreateSpeechRequest.fields(),
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/audio/speech'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/octet-stream',
                    },
                    params: {
                    },
                    body: {
                        ...CreateSpeechRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createSpeech', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    createTranscription: {
        key: 'createTranscription',
        noun: 'Audio',
        display: {
            label: 'Transcribes audio into the input language.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file',
                    label: 'The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ',
                    type: 'file',
                    required: true,
                },
                ...CreateTranscriptionRequest_model.fields(),
                {
                    key: 'language',
                    label: 'The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ',
                    type: 'string',
                },
                {
                    key: 'prompt',
                    label: 'An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. ',
                    type: 'string',
                },
                {
                    key: 'response_format',
                    label: 'The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. ',
                    type: 'string',
                    choices: [
                        'json',
                        'text',
                        'srt',
                        'verbose_json',
                        'vtt',
                    ],
                },
                {
                    key: 'temperature',
                    label: 'The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ',
                    type: 'number',
                },
                {
                    key: 'timestamp_granularities[]',
                    label: 'The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. ',
                    type: 'string',
                }
            ],
            outputFields: [
                ...createTranscription_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['file'].split('/').slice(-1)[0]
                formData.append('file', (await (await z.request({url: bundle.inputData?.['file'], method: 'GET', raw: true})).buffer()), { filename: filename })
                formData.append('model', bundle.inputData?.['model'])
                formData.append('language', bundle.inputData?.['language'])
                formData.append('prompt', bundle.inputData?.['prompt'])
                formData.append('response_format', bundle.inputData?.['response_format'])
                formData.append('temperature', bundle.inputData?.['temperature'])
                formData.append('timestamp_granularities[]', bundle.inputData?.['timestamp_granularities[]'])
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/audio/transcriptions'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: formData,
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createTranscription', response.json);
                    return results;
                })
            },
            sample: samples['createTranscription_200_responseSample']
        }
    },
    createTranslation: {
        key: 'createTranslation',
        noun: 'Audio',
        display: {
            label: 'Translates audio into English.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'file',
                    label: 'The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ',
                    type: 'file',
                    required: true,
                },
                ...CreateTranscriptionRequest_model.fields(),
                {
                    key: 'prompt',
                    label: 'An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. ',
                    type: 'string',
                },
                {
                    key: 'response_format',
                    label: 'The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. ',
                    type: 'string',
                },
                {
                    key: 'temperature',
                    label: 'The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ',
                    type: 'number',
                },
            ],
            outputFields: [
                ...createTranslation_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['file'].split('/').slice(-1)[0]
                formData.append('file', (await (await z.request({url: bundle.inputData?.['file'], method: 'GET', raw: true})).buffer()), { filename: filename })
                formData.append('model', bundle.inputData?.['model'])
                formData.append('prompt', bundle.inputData?.['prompt'])
                formData.append('response_format', bundle.inputData?.['response_format'])
                formData.append('temperature', bundle.inputData?.['temperature'])
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/audio/translations'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: formData,
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'createTranslation', response.json);
                    return results;
                })
            },
            sample: samples['createTranslation_200_responseSample']
        }
    },
}
