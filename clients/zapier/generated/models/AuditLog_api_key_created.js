const utils = require('../utils/utils');
const AuditLog_api_key_created_data = require('../models/AuditLog_api_key_created_data');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The tracking ID of the API key. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...AuditLog_api_key_created_data.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'data': utils.removeIfEmpty(AuditLog_api_key_created_data.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
