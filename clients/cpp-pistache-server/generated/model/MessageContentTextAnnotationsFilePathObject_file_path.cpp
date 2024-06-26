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


#include "MessageContentTextAnnotationsFilePathObject_file_path.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MessageContentTextAnnotationsFilePathObject_file_path::MessageContentTextAnnotationsFilePathObject_file_path()
{
    m_File_id = "";
    
}

void MessageContentTextAnnotationsFilePathObject_file_path::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MessageContentTextAnnotationsFilePathObject_file_path::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MessageContentTextAnnotationsFilePathObject_file_path::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MessageContentTextAnnotationsFilePathObject_file_path" : pathPrefix;

        
    return success;
}

bool MessageContentTextAnnotationsFilePathObject_file_path::operator==(const MessageContentTextAnnotationsFilePathObject_file_path& rhs) const
{
    return
    
    
    (getFileId() == rhs.getFileId())
    
    
    ;
}

bool MessageContentTextAnnotationsFilePathObject_file_path::operator!=(const MessageContentTextAnnotationsFilePathObject_file_path& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MessageContentTextAnnotationsFilePathObject_file_path& o)
{
    j = nlohmann::json::object();
    j["file_id"] = o.m_File_id;
    
}

void from_json(const nlohmann::json& j, MessageContentTextAnnotationsFilePathObject_file_path& o)
{
    j.at("file_id").get_to(o.m_File_id);
    
}

std::string MessageContentTextAnnotationsFilePathObject_file_path::getFileId() const
{
    return m_File_id;
}
void MessageContentTextAnnotationsFilePathObject_file_path::setFileId(std::string const& value)
{
    m_File_id = value;
}


} // namespace org::openapitools::server::model

