const utils = require('../utils/utils');
const TranscriptionSegment = require('../models/TranscriptionSegment');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}language`,
                label: `The language of the output translation (always `english`). - [${labelPrefix}language]`,
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
                label: `The translated text. - [${labelPrefix}text]`,
                required: true,
                type: 'string',
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
            'segments': utils.childMapping(bundle.inputData?.[`${keyPrefix}segments`], `${keyPrefix}segments`, TranscriptionSegment),
        }
    },
}
