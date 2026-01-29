const utils = require('../utils/utils');
const RunObject = require('../models/RunObject');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}event`,
                label: `[${labelPrefix}event]`,
                required: true,
                type: 'string',
                choices: [
                    'thread.run.cancelling',
                ],
            },
            ...RunObject.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event': bundle.inputData?.[`${keyPrefix}event`],
            'data': utils.removeIfEmpty(RunObject.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
