const utils = require('../utils/utils');
const CostsResult_amount = require('../models/CostsResult_amount');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'organization.costs.result',
                ],
            },
            ...CostsResult_amount.fields(`${keyPrefix}amount`, isInput),
            {
                key: `${keyPrefix}line_item`,
                label: `When `group_by=line_item`, this field provides the line item of the grouped costs result. - [${labelPrefix}line_item]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}project_id`,
                label: `When `group_by=project_id`, this field provides the project ID of the grouped costs result. - [${labelPrefix}project_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'amount': utils.removeIfEmpty(CostsResult_amount.mapping(bundle, `${keyPrefix}amount`)),
            'line_item': bundle.inputData?.[`${keyPrefix}line_item`],
            'project_id': bundle.inputData?.[`${keyPrefix}project_id`],
        }
    },
}
