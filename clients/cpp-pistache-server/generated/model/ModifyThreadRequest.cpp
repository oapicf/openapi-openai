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


#include "ModifyThreadRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ModifyThreadRequest::ModifyThreadRequest()
{
    m_MetadataIsSet = false;
    
}

void ModifyThreadRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ModifyThreadRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ModifyThreadRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ModifyThreadRequest" : pathPrefix;

        
    return success;
}

bool ModifyThreadRequest::operator==(const ModifyThreadRequest& rhs) const
{
    return
    
    
    
    ((!metadataIsSet() && !rhs.metadataIsSet()) || (metadataIsSet() && rhs.metadataIsSet() && getMetadata() == rhs.getMetadata()))
    
    ;
}

bool ModifyThreadRequest::operator!=(const ModifyThreadRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ModifyThreadRequest& o)
{
    j = nlohmann::json::object();
    if(o.metadataIsSet())
        j["metadata"] = o.m_Metadata;
    
}

void from_json(const nlohmann::json& j, ModifyThreadRequest& o)
{
    if(j.find("metadata") != j.end())
    {
        j.at("metadata").get_to(o.m_Metadata);
        o.m_MetadataIsSet = true;
    } 
    
}

nlohmann::json ModifyThreadRequest::getMetadata() const
{
    return m_Metadata;
}
void ModifyThreadRequest::setMetadata(nlohmann::json const& value)
{
    m_Metadata = value;
    m_MetadataIsSet = true;
}
bool ModifyThreadRequest::metadataIsSet() const
{
    return m_MetadataIsSet;
}
void ModifyThreadRequest::unsetMetadata()
{
    m_MetadataIsSet = false;
}


} // namespace org::openapitools::server::model

