const utils = require('../utils/utils');
const AuditLog_user_added_data = require('../models/AuditLog_user_added_data');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The user ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...AuditLog_user_added_data.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'data': utils.removeIfEmpty(AuditLog_user_added_data.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
