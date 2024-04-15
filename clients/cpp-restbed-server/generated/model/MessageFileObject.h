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
 * MessageFileObject.h
 *
 * A list of files attached to a &#x60;message&#x60;.
 */

#ifndef MessageFileObject_H_
#define MessageFileObject_H_



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
/// A list of files attached to a &#x60;message&#x60;.
/// </summary>
class  MessageFileObject 
{
public:
    MessageFileObject() = default;
    explicit MessageFileObject(boost::property_tree::ptree const& pt);
    virtual ~MessageFileObject() = default;

    MessageFileObject(const MessageFileObject& other) = default; // copy constructor
    MessageFileObject(MessageFileObject&& other) noexcept = default; // move constructor

    MessageFileObject& operator=(const MessageFileObject& other) = default; // copy assignment
    MessageFileObject& operator=(MessageFileObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MessageFileObject members

    /// <summary>
    /// The identifier, which can be referenced in API endpoints.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The object type, which is always &#x60;thread.message.file&#x60;.
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the message file was created.
    /// </summary>
    int32_t getCreatedAt() const;
    void setCreatedAt(int32_t value);

    /// <summary>
    /// The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
    /// </summary>
    std::string getMessageId() const;
    void setMessageId(std::string value);

protected:
    std::string m_Id = "";
    std::string m_object = "";
    int32_t m_Created_at = 0;
    std::string m_Message_id = "";
};

std::vector<MessageFileObject> createMessageFileObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MessageFileObject>(const MessageFileObject& val) {
    return val.toPropertyTree();
}

template<>
inline MessageFileObject fromPt<MessageFileObject>(const boost::property_tree::ptree& pt) {
    MessageFileObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MessageFileObject_H_ */