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


#include "DeleteAssistantResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

DeleteAssistantResponse::DeleteAssistantResponse()
{
    m_Id = "";
    m_Deleted = false;
    m_object = "";
    
}

void DeleteAssistantResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool DeleteAssistantResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool DeleteAssistantResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "DeleteAssistantResponse" : pathPrefix;

                
    return success;
}

bool DeleteAssistantResponse::operator==(const DeleteAssistantResponse& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    (isDeleted() == rhs.isDeleted())
     &&
    
    (getObject() == rhs.getObject())
    
    
    ;
}

bool DeleteAssistantResponse::operator!=(const DeleteAssistantResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const DeleteAssistantResponse& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    j["deleted"] = o.m_Deleted;
    j["object"] = o.m_object;
    
}

void from_json(const nlohmann::json& j, DeleteAssistantResponse& o)
{
    j.at("id").get_to(o.m_Id);
    j.at("deleted").get_to(o.m_Deleted);
    j.at("object").get_to(o.m_object);
    
}

std::string DeleteAssistantResponse::getId() const
{
    return m_Id;
}
void DeleteAssistantResponse::setId(std::string const& value)
{
    m_Id = value;
}
bool DeleteAssistantResponse::isDeleted() const
{
    return m_Deleted;
}
void DeleteAssistantResponse::setDeleted(bool const value)
{
    m_Deleted = value;
}
std::string DeleteAssistantResponse::getObject() const
{
    return m_object;
}
void DeleteAssistantResponse::setObject(std::string const& value)
{
    m_object = value;
}


} // namespace org::openapitools::server::model

