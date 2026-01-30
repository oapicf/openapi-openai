const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `The project name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `The title of the project as seen on the dashboard. - [${labelPrefix}title]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
