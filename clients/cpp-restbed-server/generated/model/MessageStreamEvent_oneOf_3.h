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
 * MessageStreamEvent_oneOf_3.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 */

#ifndef MessageStreamEvent_oneOf_3_H_
#define MessageStreamEvent_oneOf_3_H_



#include <string>
#include "MessageObject.h"
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
/// Occurs when a [message](/docs/api-reference/messages/object) is completed.
/// </summary>
class  MessageStreamEvent_oneOf_3 
{
public:
    MessageStreamEvent_oneOf_3() = default;
    explicit MessageStreamEvent_oneOf_3(boost::property_tree::ptree const& pt);
    virtual ~MessageStreamEvent_oneOf_3() = default;

    MessageStreamEvent_oneOf_3(const MessageStreamEvent_oneOf_3& other) = default; // copy constructor
    MessageStreamEvent_oneOf_3(MessageStreamEvent_oneOf_3&& other) noexcept = default; // move constructor

    MessageStreamEvent_oneOf_3& operator=(const MessageStreamEvent_oneOf_3& other) = default; // copy assignment
    MessageStreamEvent_oneOf_3& operator=(MessageStreamEvent_oneOf_3&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MessageStreamEvent_oneOf_3 members

    /// <summary>
    /// 
    /// </summary>
    std::string getEvent() const;
    void setEvent(std::string value);

    /// <summary>
    /// 
    /// </summary>
    MessageObject getData() const;
    void setData(MessageObject value);

protected:
    std::string m_Event = "";
    MessageObject m_Data;
};

std::vector<MessageStreamEvent_oneOf_3> createMessageStreamEvent_oneOf_3VectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MessageStreamEvent_oneOf_3>(const MessageStreamEvent_oneOf_3& val) {
    return val.toPropertyTree();
}

template<>
inline MessageStreamEvent_oneOf_3 fromPt<MessageStreamEvent_oneOf_3>(const boost::property_tree::ptree& pt) {
    MessageStreamEvent_oneOf_3 ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MessageStreamEvent_oneOf_3_H_ */
