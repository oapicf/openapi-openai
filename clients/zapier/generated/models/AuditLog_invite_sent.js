const utils = require('../utils/utils');
const AuditLog_invite_sent_data = require('../models/AuditLog_invite_sent_data');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The ID of the invite. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...AuditLog_invite_sent_data.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'data': utils.removeIfEmpty(AuditLog_invite_sent_data.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
