const utils = require('../utils/utils');
const CreateModerationResponse_results_inner_categories = require('../models/CreateModerationResponse_results_inner_categories');
const CreateModerationResponse_results_inner_category_applied_input_types = require('../models/CreateModerationResponse_results_inner_category_applied_input_types');
const CreateModerationResponse_results_inner_category_scores = require('../models/CreateModerationResponse_results_inner_category_scores');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}flagged`,
                label: `Whether any of the below categories are flagged. - [${labelPrefix}flagged]`,
                required: true,
                type: 'boolean',
            },
            ...CreateModerationResponse_results_inner_categories.fields(`${keyPrefix}categories`, isInput),
            ...CreateModerationResponse_results_inner_category_scores.fields(`${keyPrefix}category_scores`, isInput),
            ...CreateModerationResponse_results_inner_category_applied_input_types.fields(`${keyPrefix}category_applied_input_types`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'flagged': bundle.inputData?.[`${keyPrefix}flagged`],
            'categories': utils.removeIfEmpty(CreateModerationResponse_results_inner_categories.mapping(bundle, `${keyPrefix}categories`)),
            'category_scores': utils.removeIfEmpty(CreateModerationResponse_results_inner_category_scores.mapping(bundle, `${keyPrefix}category_scores`)),
            'category_applied_input_types': utils.removeIfEmpty(CreateModerationResponse_results_inner_category_applied_input_types.mapping(bundle, `${keyPrefix}category_applied_input_types`)),
        }
    },
}
