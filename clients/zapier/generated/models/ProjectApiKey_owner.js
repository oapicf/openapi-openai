const utils = require('../utils/utils');
const ProjectServiceAccount = require('../models/ProjectServiceAccount');
const ProjectUser = require('../models/ProjectUser');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: ``user` or `service_account` - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'user',
                    'service_account',
                ],
            },
            ...ProjectUser.fields(`${keyPrefix}user`, isInput),
            ...ProjectServiceAccount.fields(`${keyPrefix}service_account`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'user': utils.removeIfEmpty(ProjectUser.mapping(bundle, `${keyPrefix}user`)),
            'service_account': utils.removeIfEmpty(ProjectServiceAccount.mapping(bundle, `${keyPrefix}service_account`)),
        }
    },
}
