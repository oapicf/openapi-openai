const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ranker`,
                label: `The ranker used for the file search. - [${labelPrefix}ranker]`,
                required: true,
                type: 'string',
                choices: [
                    'default_2024_08_21',
                ],
            },
            {
                key: `${keyPrefix}score_threshold`,
                label: `The score threshold for the file search. All values must be a floating point number between 0 and 1. - [${labelPrefix}score_threshold]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ranker': bundle.inputData?.[`${keyPrefix}ranker`],
            'score_threshold': bundle.inputData?.[`${keyPrefix}score_threshold`],
        }
    },
}
