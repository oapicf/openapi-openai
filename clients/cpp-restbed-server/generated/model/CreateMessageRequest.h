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
 * CreateMessageRequest.h
 *
 * 
 */

#ifndef CreateMessageRequest_H_
#define CreateMessageRequest_H_



#include <string>
#include <vector>
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
class  CreateMessageRequest 
{
public:
    CreateMessageRequest() = default;
    explicit CreateMessageRequest(boost::property_tree::ptree const& pt);
    virtual ~CreateMessageRequest() = default;

    CreateMessageRequest(const CreateMessageRequest& other) = default; // copy constructor
    CreateMessageRequest(CreateMessageRequest&& other) noexcept = default; // move constructor

    CreateMessageRequest& operator=(const CreateMessageRequest& other) = default; // copy assignment
    CreateMessageRequest& operator=(CreateMessageRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateMessageRequest members

    /// <summary>
    /// The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
    /// </summary>
    std::string getRole() const;
    void setRole(std::string value);

    /// <summary>
    /// The content of the message.
    /// </summary>
    std::string getContent() const;
    void setContent(std::string value);

    /// <summary>
    /// A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access and use files.
    /// </summary>
    std::vector<std::string> getFileIds() const;
    void setFileIds(std::vector<std::string> value);

    /// <summary>
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    /// </summary>
    std::string getMetadata() const;
    void setMetadata(std::string value);

protected:
    std::string m_Role = "";
    std::string m_Content = "";
    std::vector<std::string> m_File_ids;
    std::string m_Metadata = std::string{};
};

std::vector<CreateMessageRequest> createCreateMessageRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateMessageRequest>(const CreateMessageRequest& val) {
    return val.toPropertyTree();
}

template<>
inline CreateMessageRequest fromPt<CreateMessageRequest>(const boost::property_tree::ptree& pt) {
    CreateMessageRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateMessageRequest_H_ */