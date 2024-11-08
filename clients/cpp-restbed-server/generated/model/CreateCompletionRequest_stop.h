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
 * CreateCompletionRequest_stop.h
 *
 * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
 */

#ifndef CreateCompletionRequest_stop_H_
#define CreateCompletionRequest_stop_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
/// </summary>
class  CreateCompletionRequest_stop 
{
public:
    CreateCompletionRequest_stop() = default;
    explicit CreateCompletionRequest_stop(boost::property_tree::ptree const& pt);
    virtual ~CreateCompletionRequest_stop() = default;

    CreateCompletionRequest_stop(const CreateCompletionRequest_stop& other) = default; // copy constructor
    CreateCompletionRequest_stop(CreateCompletionRequest_stop&& other) noexcept = default; // move constructor

    CreateCompletionRequest_stop& operator=(const CreateCompletionRequest_stop& other) = default; // copy assignment
    CreateCompletionRequest_stop& operator=(CreateCompletionRequest_stop&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateCompletionRequest_stop members

protected:
};

std::vector<CreateCompletionRequest_stop> createCreateCompletionRequest_stopVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateCompletionRequest_stop>(const CreateCompletionRequest_stop& val) {
    return val.toPropertyTree();
}

template<>
inline CreateCompletionRequest_stop fromPt<CreateCompletionRequest_stop>(const boost::property_tree::ptree& pt) {
    CreateCompletionRequest_stop ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateCompletionRequest_stop_H_ */
