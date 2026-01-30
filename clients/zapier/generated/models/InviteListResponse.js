const utils = require('../utils/utils');
const Invite = require('../models/Invite');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `list` - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'list',
                ],
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                children: Invite.fields(`${keyPrefix}data${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}first_id`,
                label: `The first `invite_id` in the retrieved `list` - [${labelPrefix}first_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}last_id`,
                label: `The last `invite_id` in the retrieved `list` - [${labelPrefix}last_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}has_more`,
                label: `The `has_more` property is used for pagination to indicate there are additional results. - [${labelPrefix}has_more]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'data': utils.childMapping(bundle.inputData?.[`${keyPrefix}data`], `${keyPrefix}data`, Invite),
            'first_id': bundle.inputData?.[`${keyPrefix}first_id`],
            'last_id': bundle.inputData?.[`${keyPrefix}last_id`],
            'has_more': bundle.inputData?.[`${keyPrefix}has_more`],
        }
    },
}
