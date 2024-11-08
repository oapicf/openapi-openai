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
 * ChatCompletionMessageToolCall_function.h
 *
 * The function that the model called.
 */

#ifndef ChatCompletionMessageToolCall_function_H_
#define ChatCompletionMessageToolCall_function_H_



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
/// The function that the model called.
/// </summary>
class  ChatCompletionMessageToolCall_function 
{
public:
    ChatCompletionMessageToolCall_function() = default;
    explicit ChatCompletionMessageToolCall_function(boost::property_tree::ptree const& pt);
    virtual ~ChatCompletionMessageToolCall_function() = default;

    ChatCompletionMessageToolCall_function(const ChatCompletionMessageToolCall_function& other) = default; // copy constructor
    ChatCompletionMessageToolCall_function(ChatCompletionMessageToolCall_function&& other) noexcept = default; // move constructor

    ChatCompletionMessageToolCall_function& operator=(const ChatCompletionMessageToolCall_function& other) = default; // copy assignment
    ChatCompletionMessageToolCall_function& operator=(ChatCompletionMessageToolCall_function&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ChatCompletionMessageToolCall_function members

    /// <summary>
    /// The name of the function to call.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
    /// </summary>
    std::string getArguments() const;
    void setArguments(std::string value);

protected:
    std::string m_Name = "";
    std::string m_Arguments = "";
};

std::vector<ChatCompletionMessageToolCall_function> createChatCompletionMessageToolCall_functionVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatCompletionMessageToolCall_function>(const ChatCompletionMessageToolCall_function& val) {
    return val.toPropertyTree();
}

template<>
inline ChatCompletionMessageToolCall_function fromPt<ChatCompletionMessageToolCall_function>(const boost::property_tree::ptree& pt) {
    ChatCompletionMessageToolCall_function ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatCompletionMessageToolCall_function_H_ */
