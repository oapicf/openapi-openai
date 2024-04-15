/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateFineTuningJobRequest_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job.
 */

#ifndef CreateFineTuningJobRequest_hyperparameters_H_
#define CreateFineTuningJobRequest_hyperparameters_H_



#include "CreateFineTuningJobRequest_hyperparameters_batch_size.h"
#include "CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.h"
#include "CreateFineTuningJobRequest_hyperparameters_n_epochs.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// The hyperparameters used for the fine-tuning job.
/// </summary>
class  CreateFineTuningJobRequest_hyperparameters 
{
public:
    CreateFineTuningJobRequest_hyperparameters() = default;
    explicit CreateFineTuningJobRequest_hyperparameters(boost::property_tree::ptree const& pt);
    virtual ~CreateFineTuningJobRequest_hyperparameters() = default;

    CreateFineTuningJobRequest_hyperparameters(const CreateFineTuningJobRequest_hyperparameters& other) = default; // copy constructor
    CreateFineTuningJobRequest_hyperparameters(CreateFineTuningJobRequest_hyperparameters&& other) noexcept = default; // move constructor

    CreateFineTuningJobRequest_hyperparameters& operator=(const CreateFineTuningJobRequest_hyperparameters& other) = default; // copy assignment
    CreateFineTuningJobRequest_hyperparameters& operator=(CreateFineTuningJobRequest_hyperparameters&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_hyperparameters members

    /// <summary>
    /// 
    /// </summary>
    CreateFineTuningJobRequest_hyperparameters_batch_size getBatchSize() const;
    void setBatchSize(CreateFineTuningJobRequest_hyperparameters_batch_size value);

    /// <summary>
    /// 
    /// </summary>
    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier getLearningRateMultiplier() const;
    void setLearningRateMultiplier(CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier value);

    /// <summary>
    /// 
    /// </summary>
    CreateFineTuningJobRequest_hyperparameters_n_epochs getNEpochs() const;
    void setNEpochs(CreateFineTuningJobRequest_hyperparameters_n_epochs value);

protected:
    CreateFineTuningJobRequest_hyperparameters_batch_size m_Batch_size;
    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier m_Learning_rate_multiplier;
    CreateFineTuningJobRequest_hyperparameters_n_epochs m_N_epochs;
};

std::vector<CreateFineTuningJobRequest_hyperparameters> createCreateFineTuningJobRequest_hyperparametersVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateFineTuningJobRequest_hyperparameters>(const CreateFineTuningJobRequest_hyperparameters& val) {
    return val.toPropertyTree();
}

template<>
inline CreateFineTuningJobRequest_hyperparameters fromPt<CreateFineTuningJobRequest_hyperparameters>(const boost::property_tree::ptree& pt) {
    CreateFineTuningJobRequest_hyperparameters ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateFineTuningJobRequest_hyperparameters_H_ */