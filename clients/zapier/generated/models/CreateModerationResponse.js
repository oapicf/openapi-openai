const utils = require('../utils/utils');
const CreateModerationResponse_results_inner = require('../models/CreateModerationResponse_results_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}model`,
                label: `[${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}results`,
                label: `[${labelPrefix}results]`,
                children: CreateModerationResponse_results_inner.fields(`${keyPrefix}results${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'results': utils.childMapping(bundle.inputData?.[`${keyPrefix}results`], `${keyPrefix}results`, CreateModerationResponse_results_inner),
        }
    },
}
