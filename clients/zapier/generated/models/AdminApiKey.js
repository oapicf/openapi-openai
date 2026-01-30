const utils = require('../utils/utils');
const AdminApiKey_owner = require('../models/AdminApiKey_owner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}redacted_value`,
                label: `[${labelPrefix}redacted_value]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}value`,
                label: `[${labelPrefix}value]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                type: 'number',
            },
            ...AdminApiKey_owner.fields(`${keyPrefix}owner`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'redacted_value': bundle.inputData?.[`${keyPrefix}redacted_value`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'owner': utils.removeIfEmpty(AdminApiKey_owner.mapping(bundle, `${keyPrefix}owner`)),
        }
    },
}
