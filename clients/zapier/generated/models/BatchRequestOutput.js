const utils = require('../utils/utils');
const BatchRequestOutput_error = require('../models/BatchRequestOutput_error');
const BatchRequestOutput_response = require('../models/BatchRequestOutput_response');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_id`,
                label: `A developer-provided per-request id that will be used to match outputs to inputs. - [${labelPrefix}custom_id]`,
                type: 'string',
            },
            ...BatchRequestOutput_response.fields(`${keyPrefix}response`, isInput),
            ...BatchRequestOutput_error.fields(`${keyPrefix}error`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'custom_id': bundle.inputData?.[`${keyPrefix}custom_id`],
            'response': utils.removeIfEmpty(BatchRequestOutput_response.mapping(bundle, `${keyPrefix}response`)),
            'error': utils.removeIfEmpty(BatchRequestOutput_error.mapping(bundle, `${keyPrefix}error`)),
        }
    },
}
