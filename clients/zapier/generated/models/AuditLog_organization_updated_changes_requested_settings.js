const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}threads_ui_visibility`,
                label: `Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`. - [${labelPrefix}threads_ui_visibility]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}usage_dashboard_visibility`,
                label: `Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`. - [${labelPrefix}usage_dashboard_visibility]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'threads_ui_visibility': bundle.inputData?.[`${keyPrefix}threads_ui_visibility`],
            'usage_dashboard_visibility': bundle.inputData?.[`${keyPrefix}usage_dashboard_visibility`],
        }
    },
}
