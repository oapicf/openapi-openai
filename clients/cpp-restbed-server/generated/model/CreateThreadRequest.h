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
 * CreateThreadRequest.h
 *
 * 
 */

#ifndef CreateThreadRequest_H_
#define CreateThreadRequest_H_



#include <string>
#include "CreateMessageRequest.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  CreateThreadRequest 
{
public:
    CreateThreadRequest() = default;
    explicit CreateThreadRequest(boost::property_tree::ptree const& pt);
    virtual ~CreateThreadRequest() = default;

    CreateThreadRequest(const CreateThreadRequest& other) = default; // copy constructor
    CreateThreadRequest(CreateThreadRequest&& other) noexcept = default; // move constructor

    CreateThreadRequest& operator=(const CreateThreadRequest& other) = default; // copy assignment
    CreateThreadRequest& operator=(CreateThreadRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateThreadRequest members

    /// <summary>
    /// A list of [messages](/docs/api-reference/messages) to start the thread with.
    /// </summary>
    std::vector<CreateMessageRequest> getMessages() const;
    void setMessages(std::vector<CreateMessageRequest> value);

    /// <summary>
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    /// </summary>
    std::string getMetadata() const;
    void setMetadata(std::string value);

protected:
    std::vector<CreateMessageRequest> m_Messages;
    std::string m_Metadata = std::string{};
};

std::vector<CreateThreadRequest> createCreateThreadRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateThreadRequest>(const CreateThreadRequest& val) {
    return val.toPropertyTree();
}

template<>
inline CreateThreadRequest fromPt<CreateThreadRequest>(const boost::property_tree::ptree& pt) {
    CreateThreadRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateThreadRequest_H_ */
