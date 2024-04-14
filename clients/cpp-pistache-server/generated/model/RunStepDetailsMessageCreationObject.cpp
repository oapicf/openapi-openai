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


#include "RunStepDetailsMessageCreationObject.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunStepDetailsMessageCreationObject::RunStepDetailsMessageCreationObject()
{
    m_Type = "";
    
}

void RunStepDetailsMessageCreationObject::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunStepDetailsMessageCreationObject::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunStepDetailsMessageCreationObject::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunStepDetailsMessageCreationObject" : pathPrefix;

            
    if (!m_Message_creation.validate()) {
        msg << _pathPrefix << ": Message_creation is invalid;";
        success = false;
    }
    return success;
}

bool RunStepDetailsMessageCreationObject::operator==(const RunStepDetailsMessageCreationObject& rhs) const
{
    return
    
    
    (getType() == rhs.getType())
     &&
    
    (getMessageCreation() == rhs.getMessageCreation())
    
    
    ;
}

bool RunStepDetailsMessageCreationObject::operator!=(const RunStepDetailsMessageCreationObject& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunStepDetailsMessageCreationObject& o)
{
    j = nlohmann::json::object();
    j["type"] = o.m_Type;
    j["message_creation"] = o.m_Message_creation;
    
}

void from_json(const nlohmann::json& j, RunStepDetailsMessageCreationObject& o)
{
    j.at("type").get_to(o.m_Type);
    j.at("message_creation").get_to(o.m_Message_creation);
    
}

std::string RunStepDetailsMessageCreationObject::getType() const
{
    return m_Type;
}
void RunStepDetailsMessageCreationObject::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::RunStepDetailsMessageCreationObject_message_creation RunStepDetailsMessageCreationObject::getMessageCreation() const
{
    return m_Message_creation;
}
void RunStepDetailsMessageCreationObject::setMessageCreation(org::openapitools::server::model::RunStepDetailsMessageCreationObject_message_creation const& value)
{
    m_Message_creation = value;
}


} // namespace org::openapitools::server::model

