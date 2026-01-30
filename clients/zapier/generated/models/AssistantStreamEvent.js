const utils = require('../utils/utils');
const DoneEvent = require('../models/DoneEvent');
const ErrorEvent = require('../models/ErrorEvent');
const MessageStreamEvent = require('../models/MessageStreamEvent');
const RunStepStreamEvent = require('../models/RunStepStreamEvent');
const RunStreamEvent = require('../models/RunStreamEvent');
const ThreadStreamEvent = require('../models/ThreadStreamEvent');

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
                    'done',
                ],
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                required: true,
                type: 'string',
                choices: [
                    '[DONE]',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enabled': bundle.inputData?.[`${keyPrefix}enabled`],
            'event': bundle.inputData?.[`${keyPrefix}event`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
        }
    },
}
