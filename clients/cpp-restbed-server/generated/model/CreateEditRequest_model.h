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
 * CreateEditRequest_model.h
 *
 * ID of the model to use. You can use the &#x60;text-davinci-edit-001&#x60; or &#x60;code-davinci-edit-001&#x60; model with this endpoint.
 */

#ifndef CreateEditRequest_model_H_
#define CreateEditRequest_model_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// ID of the model to use. You can use the &#x60;text-davinci-edit-001&#x60; or &#x60;code-davinci-edit-001&#x60; model with this endpoint.
/// </summary>
class  CreateEditRequest_model 
{
public:
    CreateEditRequest_model() = default;
    explicit CreateEditRequest_model(boost::property_tree::ptree const& pt);
    virtual ~CreateEditRequest_model() = default;

    CreateEditRequest_model(const CreateEditRequest_model& other) = default; // copy constructor
    CreateEditRequest_model(CreateEditRequest_model&& other) noexcept = default; // move constructor

    CreateEditRequest_model& operator=(const CreateEditRequest_model& other) = default; // copy assignment
    CreateEditRequest_model& operator=(CreateEditRequest_model&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateEditRequest_model members

protected:
};

std::vector<CreateEditRequest_model> createCreateEditRequest_modelVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateEditRequest_model>(const CreateEditRequest_model& val) {
    return val.toPropertyTree();
}

template<>
inline CreateEditRequest_model fromPt<CreateEditRequest_model>(const boost::property_tree::ptree& pt) {
    CreateEditRequest_model ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateEditRequest_model_H_ */
