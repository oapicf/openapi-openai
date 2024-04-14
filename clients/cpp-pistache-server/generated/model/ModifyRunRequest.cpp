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


#include "ModifyRunRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ModifyRunRequest::ModifyRunRequest()
{
    m_MetadataIsSet = false;
    
}

void ModifyRunRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ModifyRunRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ModifyRunRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ModifyRunRequest" : pathPrefix;

        
    return success;
}

bool ModifyRunRequest::operator==(const ModifyRunRequest& rhs) const
{
    return
    
    
    
    ((!metadataIsSet() && !rhs.metadataIsSet()) || (metadataIsSet() && rhs.metadataIsSet() && getMetadata() == rhs.getMetadata()))
    
    ;
}

bool ModifyRunRequest::operator!=(const ModifyRunRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ModifyRunRequest& o)
{
    j = nlohmann::json::object();
    if(o.metadataIsSet())
        j["metadata"] = o.m_Metadata;
    
}

void from_json(const nlohmann::json& j, ModifyRunRequest& o)
{
    if(j.find("metadata") != j.end())
    {
        j.at("metadata").get_to(o.m_Metadata);
        o.m_MetadataIsSet = true;
    } 
    
}

org::openapitools::server::model::Object ModifyRunRequest::getMetadata() const
{
    return m_Metadata;
}
void ModifyRunRequest::setMetadata(org::openapitools::server::model::Object const& value)
{
    m_Metadata = value;
    m_MetadataIsSet = true;
}
bool ModifyRunRequest::metadataIsSet() const
{
    return m_MetadataIsSet;
}
void ModifyRunRequest::unsetMetadata()
{
    m_MetadataIsSet = false;
}


} // namespace org::openapitools::server::model

