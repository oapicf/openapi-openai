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


#include "CreateAssistantFileRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateAssistantFileRequest::CreateAssistantFileRequest()
{
    m_File_id = "";
    
}

void CreateAssistantFileRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateAssistantFileRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateAssistantFileRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateAssistantFileRequest" : pathPrefix;

        
    return success;
}

bool CreateAssistantFileRequest::operator==(const CreateAssistantFileRequest& rhs) const
{
    return
    
    
    (getFileId() == rhs.getFileId())
    
    
    ;
}

bool CreateAssistantFileRequest::operator!=(const CreateAssistantFileRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateAssistantFileRequest& o)
{
    j = nlohmann::json::object();
    j["file_id"] = o.m_File_id;
    
}

void from_json(const nlohmann::json& j, CreateAssistantFileRequest& o)
{
    j.at("file_id").get_to(o.m_File_id);
    
}

std::string CreateAssistantFileRequest::getFileId() const
{
    return m_File_id;
}
void CreateAssistantFileRequest::setFileId(std::string const& value)
{
    m_File_id = value;
}


} // namespace org::openapitools::server::model

