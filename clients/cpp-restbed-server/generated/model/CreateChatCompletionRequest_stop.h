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
 * CreateChatCompletionRequest_stop.h
 *
 * Up to 4 sequences where the API will stop generating further tokens. 
 */

#ifndef CreateChatCompletionRequest_stop_H_
#define CreateChatCompletionRequest_stop_H_



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
/// Up to 4 sequences where the API will stop generating further tokens. 
/// </summary>
class  CreateChatCompletionRequest_stop 
{
public:
    CreateChatCompletionRequest_stop() = default;
    explicit CreateChatCompletionRequest_stop(boost::property_tree::ptree const& pt);
    virtual ~CreateChatCompletionRequest_stop() = default;

    CreateChatCompletionRequest_stop(const CreateChatCompletionRequest_stop& other) = default; // copy constructor
    CreateChatCompletionRequest_stop(CreateChatCompletionRequest_stop&& other) noexcept = default; // move constructor

    CreateChatCompletionRequest_stop& operator=(const CreateChatCompletionRequest_stop& other) = default; // copy assignment
    CreateChatCompletionRequest_stop& operator=(CreateChatCompletionRequest_stop&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateChatCompletionRequest_stop members

protected:
};

std::vector<CreateChatCompletionRequest_stop> createCreateChatCompletionRequest_stopVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateChatCompletionRequest_stop>(const CreateChatCompletionRequest_stop& val) {
    return val.toPropertyTree();
}

template<>
inline CreateChatCompletionRequest_stop fromPt<CreateChatCompletionRequest_stop>(const boost::property_tree::ptree& pt) {
    CreateChatCompletionRequest_stop ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateChatCompletionRequest_stop_H_ */
