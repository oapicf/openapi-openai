const utils = require('../utils/utils');
const TranscriptionSegment = require('../models/TranscriptionSegment');
const TranscriptionWord = require('../models/TranscriptionWord');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}language`,
                label: `The language of the input audio. - [${labelPrefix}language]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}duration`,
                label: `The duration of the input audio. - [${labelPrefix}duration]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}text`,
                label: `The transcribed text. - [${labelPrefix}text]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}words`,
                label: `[${labelPrefix}words]`,
                children: TranscriptionWord.fields(`${keyPrefix}words${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}segments`,
                label: `[${labelPrefix}segments]`,
                children: TranscriptionSegment.fields(`${keyPrefix}segments${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'language': bundle.inputData?.[`${keyPrefix}language`],
            'duration': bundle.inputData?.[`${keyPrefix}duration`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'words': utils.childMapping(bundle.inputData?.[`${keyPrefix}words`], `${keyPrefix}words`, TranscriptionWord),
            'segments': utils.childMapping(bundle.inputData?.[`${keyPrefix}segments`], `${keyPrefix}segments`, TranscriptionSegment),
        }
    },
}
