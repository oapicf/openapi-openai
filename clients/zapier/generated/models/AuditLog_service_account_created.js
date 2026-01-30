const utils = require('../utils/utils');
const AuditLog_service_account_created_data = require('../models/AuditLog_service_account_created_data');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The service account ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...AuditLog_service_account_created_data.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'data': utils.removeIfEmpty(AuditLog_service_account_created_data.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
