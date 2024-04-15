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
 * CreateFineTuningJobRequest_model.h
 *
 * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). 
 */

#ifndef CreateFineTuningJobRequest_model_H_
#define CreateFineTuningJobRequest_model_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). 
/// </summary>
class  CreateFineTuningJobRequest_model 
{
public:
    CreateFineTuningJobRequest_model() = default;
    explicit CreateFineTuningJobRequest_model(boost::property_tree::ptree const& pt);
    virtual ~CreateFineTuningJobRequest_model() = default;

    CreateFineTuningJobRequest_model(const CreateFineTuningJobRequest_model& other) = default; // copy constructor
    CreateFineTuningJobRequest_model(CreateFineTuningJobRequest_model&& other) noexcept = default; // move constructor

    CreateFineTuningJobRequest_model& operator=(const CreateFineTuningJobRequest_model& other) = default; // copy assignment
    CreateFineTuningJobRequest_model& operator=(CreateFineTuningJobRequest_model&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_model members

protected:
};

std::vector<CreateFineTuningJobRequest_model> createCreateFineTuningJobRequest_modelVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateFineTuningJobRequest_model>(const CreateFineTuningJobRequest_model& val) {
    return val.toPropertyTree();
}

template<>
inline CreateFineTuningJobRequest_model fromPt<CreateFineTuningJobRequest_model>(const boost::property_tree::ptree& pt) {
    CreateFineTuningJobRequest_model ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateFineTuningJobRequest_model_H_ */