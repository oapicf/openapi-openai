/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.h
 *
 * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 */

#ifndef CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier_H_
#define CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
/// </summary>
class  CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier 
{
public:
    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier() = default;
    explicit CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier(boost::property_tree::ptree const& pt);
    virtual ~CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier() = default;

    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier(const CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier& other) = default; // copy constructor
    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier(CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier&& other) noexcept = default; // move constructor

    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier& operator=(const CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier& other) = default; // copy assignment
    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier& operator=(CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier members

protected:
};

std::vector<CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier> createCreateFineTuningJobRequest_hyperparameters_learning_rate_multiplierVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier>(const CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier& val) {
    return val.toPropertyTree();
}

template<>
inline CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier fromPt<CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier>(const boost::property_tree::ptree& pt) {
    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier_H_ */
