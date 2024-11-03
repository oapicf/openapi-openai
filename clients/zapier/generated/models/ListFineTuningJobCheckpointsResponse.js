const utils = require('../utils/utils');
const FineTuningJobCheckpoint = require('../models/FineTuningJobCheckpoint');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                children: FineTuningJobCheckpoint.fields(`${keyPrefix}data${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'list',
                ],
            },
            {
                key: `${keyPrefix}first_id`,
                label: `[${labelPrefix}first_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}last_id`,
                label: `[${labelPrefix}last_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}has_more`,
                label: `[${labelPrefix}has_more]`,
                required: true,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.childMapping(bundle.inputData?.[`${keyPrefix}data`], `${keyPrefix}data`, FineTuningJobCheckpoint),
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'first_id': bundle.inputData?.[`${keyPrefix}first_id`],
            'last_id': bundle.inputData?.[`${keyPrefix}last_id`],
            'has_more': bundle.inputData?.[`${keyPrefix}has_more`],
        }
    },
}
