const utils = require('../utils/utils');
const ThreadObject = require('../models/ThreadObject');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}enabled`,
                label: `Whether to enable input audio transcription. - [${labelPrefix}enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}event`,
                label: `[${labelPrefix}event]`,
                required: true,
                type: 'string',
                choices: [
                    'thread.created',
                ],
            },
            ...ThreadObject.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enabled': bundle.inputData?.[`${keyPrefix}enabled`],
            'event': bundle.inputData?.[`${keyPrefix}event`],
            'data': utils.removeIfEmpty(ThreadObject.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
