const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status_code`,
                label: `The HTTP status code of the response - [${labelPrefix}status_code]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}request_id`,
                label: `An unique identifier for the OpenAI API request. Please include this request ID when contacting support. - [${labelPrefix}request_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}body`,
                label: `The JSON body of the response - [${labelPrefix}body]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status_code': bundle.inputData?.[`${keyPrefix}status_code`],
            'request_id': bundle.inputData?.[`${keyPrefix}request_id`],
            'body': bundle.inputData?.[`${keyPrefix}body`],
        }
    },
}
