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
 * CreateTranscriptionRequest_model.h
 *
 * ID of the model to use. Only &#x60;whisper-1&#x60; is currently available. 
 */

#ifndef CreateTranscriptionRequest_model_H_
#define CreateTranscriptionRequest_model_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// ID of the model to use. Only &#x60;whisper-1&#x60; is currently available. 
/// </summary>
class  CreateTranscriptionRequest_model 
{
public:
    CreateTranscriptionRequest_model() = default;
    explicit CreateTranscriptionRequest_model(boost::property_tree::ptree const& pt);
    virtual ~CreateTranscriptionRequest_model() = default;

    CreateTranscriptionRequest_model(const CreateTranscriptionRequest_model& other) = default; // copy constructor
    CreateTranscriptionRequest_model(CreateTranscriptionRequest_model&& other) noexcept = default; // move constructor

    CreateTranscriptionRequest_model& operator=(const CreateTranscriptionRequest_model& other) = default; // copy assignment
    CreateTranscriptionRequest_model& operator=(CreateTranscriptionRequest_model&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateTranscriptionRequest_model members

protected:
};

std::vector<CreateTranscriptionRequest_model> createCreateTranscriptionRequest_modelVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateTranscriptionRequest_model>(const CreateTranscriptionRequest_model& val) {
    return val.toPropertyTree();
}

template<>
inline CreateTranscriptionRequest_model fromPt<CreateTranscriptionRequest_model>(const boost::property_tree::ptree& pt) {
    CreateTranscriptionRequest_model ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateTranscriptionRequest_model_H_ */
