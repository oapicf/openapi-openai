/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "MessageFileObject.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MessageFileObject::MessageFileObject()
{
    m_Id = "";
    m_object = "";
    m_Created_at = 0;
    m_Message_id = "";
    
}

void MessageFileObject::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MessageFileObject::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MessageFileObject::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MessageFileObject" : pathPrefix;

                    
    return success;
}

bool MessageFileObject::operator==(const MessageFileObject& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    (getObject() == rhs.getObject())
     &&
    
    (getCreatedAt() == rhs.getCreatedAt())
     &&
    
    (getMessageId() == rhs.getMessageId())
    
    
    ;
}

bool MessageFileObject::operator!=(const MessageFileObject& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MessageFileObject& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    j["object"] = o.m_object;
    j["created_at"] = o.m_Created_at;
    j["message_id"] = o.m_Message_id;
    
}

void from_json(const nlohmann::json& j, MessageFileObject& o)
{
    j.at("id").get_to(o.m_Id);
    j.at("object").get_to(o.m_object);
    j.at("created_at").get_to(o.m_Created_at);
    j.at("message_id").get_to(o.m_Message_id);
    
}

std::string MessageFileObject::getId() const
{
    return m_Id;
}
void MessageFileObject::setId(std::string const& value)
{
    m_Id = value;
}
std::string MessageFileObject::getObject() const
{
    return m_object;
}
void MessageFileObject::setObject(std::string const& value)
{
    m_object = value;
}
int32_t MessageFileObject::getCreatedAt() const
{
    return m_Created_at;
}
void MessageFileObject::setCreatedAt(int32_t const value)
{
    m_Created_at = value;
}
std::string MessageFileObject::getMessageId() const
{
    return m_Message_id;
}
void MessageFileObject::setMessageId(std::string const& value)
{
    m_Message_id = value;
}


} // namespace org::openapitools::server::model

