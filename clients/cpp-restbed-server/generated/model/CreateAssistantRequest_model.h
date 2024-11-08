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
 * CreateAssistantRequest_model.h
 *
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 */

#ifndef CreateAssistantRequest_model_H_
#define CreateAssistantRequest_model_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
/// </summary>
class  CreateAssistantRequest_model 
{
public:
    CreateAssistantRequest_model() = default;
    explicit CreateAssistantRequest_model(boost::property_tree::ptree const& pt);
    virtual ~CreateAssistantRequest_model() = default;

    CreateAssistantRequest_model(const CreateAssistantRequest_model& other) = default; // copy constructor
    CreateAssistantRequest_model(CreateAssistantRequest_model&& other) noexcept = default; // move constructor

    CreateAssistantRequest_model& operator=(const CreateAssistantRequest_model& other) = default; // copy assignment
    CreateAssistantRequest_model& operator=(CreateAssistantRequest_model&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateAssistantRequest_model members

protected:
};

std::vector<CreateAssistantRequest_model> createCreateAssistantRequest_modelVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateAssistantRequest_model>(const CreateAssistantRequest_model& val) {
    return val.toPropertyTree();
}

template<>
inline CreateAssistantRequest_model fromPt<CreateAssistantRequest_model>(const boost::property_tree::ptree& pt) {
    CreateAssistantRequest_model ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateAssistantRequest_model_H_ */
