/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateEmbeddingRequest_model.h
 *
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 */

#ifndef CreateEmbeddingRequest_model_H_
#define CreateEmbeddingRequest_model_H_



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
class  CreateEmbeddingRequest_model 
{
public:
    CreateEmbeddingRequest_model() = default;
    explicit CreateEmbeddingRequest_model(boost::property_tree::ptree const& pt);
    virtual ~CreateEmbeddingRequest_model() = default;

    CreateEmbeddingRequest_model(const CreateEmbeddingRequest_model& other) = default; // copy constructor
    CreateEmbeddingRequest_model(CreateEmbeddingRequest_model&& other) noexcept = default; // move constructor

    CreateEmbeddingRequest_model& operator=(const CreateEmbeddingRequest_model& other) = default; // copy assignment
    CreateEmbeddingRequest_model& operator=(CreateEmbeddingRequest_model&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateEmbeddingRequest_model members

protected:
};

std::vector<CreateEmbeddingRequest_model> createCreateEmbeddingRequest_modelVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateEmbeddingRequest_model>(const CreateEmbeddingRequest_model& val) {
    return val.toPropertyTree();
}

template<>
inline CreateEmbeddingRequest_model fromPt<CreateEmbeddingRequest_model>(const boost::property_tree::ptree& pt) {
    CreateEmbeddingRequest_model ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateEmbeddingRequest_model_H_ */
