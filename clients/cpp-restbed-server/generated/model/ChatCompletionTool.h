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
 * ChatCompletionTool.h
 *
 * 
 */

#ifndef ChatCompletionTool_H_
#define ChatCompletionTool_H_



#include "FunctionObject.h"
#include <string>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ChatCompletionTool 
{
public:
    ChatCompletionTool() = default;
    explicit ChatCompletionTool(boost::property_tree::ptree const& pt);
    virtual ~ChatCompletionTool() = default;

    ChatCompletionTool(const ChatCompletionTool& other) = default; // copy constructor
    ChatCompletionTool(ChatCompletionTool&& other) noexcept = default; // move constructor

    ChatCompletionTool& operator=(const ChatCompletionTool& other) = default; // copy assignment
    ChatCompletionTool& operator=(ChatCompletionTool&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ChatCompletionTool members

    /// <summary>
    /// The type of the tool. Currently, only &#x60;function&#x60; is supported.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    FunctionObject getFunction() const;
    void setFunction(FunctionObject value);

protected:
    std::string m_Type = "";
    FunctionObject m_Function;
};

std::vector<ChatCompletionTool> createChatCompletionToolVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatCompletionTool>(const ChatCompletionTool& val) {
    return val.toPropertyTree();
}

template<>
inline ChatCompletionTool fromPt<ChatCompletionTool>(const boost::property_tree::ptree& pt) {
    ChatCompletionTool ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatCompletionTool_H_ */
