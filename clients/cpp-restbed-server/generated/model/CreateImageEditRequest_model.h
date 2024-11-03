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
 * CreateImageEditRequest_model.h
 *
 * The model to use for image generation. Only &#x60;dall-e-2&#x60; is supported at this time.
 */

#ifndef CreateImageEditRequest_model_H_
#define CreateImageEditRequest_model_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// The model to use for image generation. Only &#x60;dall-e-2&#x60; is supported at this time.
/// </summary>
class  CreateImageEditRequest_model 
{
public:
    CreateImageEditRequest_model() = default;
    explicit CreateImageEditRequest_model(boost::property_tree::ptree const& pt);
    virtual ~CreateImageEditRequest_model() = default;

    CreateImageEditRequest_model(const CreateImageEditRequest_model& other) = default; // copy constructor
    CreateImageEditRequest_model(CreateImageEditRequest_model&& other) noexcept = default; // move constructor

    CreateImageEditRequest_model& operator=(const CreateImageEditRequest_model& other) = default; // copy assignment
    CreateImageEditRequest_model& operator=(CreateImageEditRequest_model&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateImageEditRequest_model members

protected:
};

std::vector<CreateImageEditRequest_model> createCreateImageEditRequest_modelVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateImageEditRequest_model>(const CreateImageEditRequest_model& val) {
    return val.toPropertyTree();
}

template<>
inline CreateImageEditRequest_model fromPt<CreateImageEditRequest_model>(const boost::property_tree::ptree& pt) {
    CreateImageEditRequest_model ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateImageEditRequest_model_H_ */
