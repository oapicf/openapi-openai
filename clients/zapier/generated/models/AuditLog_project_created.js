const utils = require('../utils/utils');
const AuditLog_project_created_data = require('../models/AuditLog_project_created_data');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The project ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...AuditLog_project_created_data.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'data': utils.removeIfEmpty(AuditLog_project_created_data.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
