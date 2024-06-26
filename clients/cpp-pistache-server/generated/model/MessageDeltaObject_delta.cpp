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


#include "MessageDeltaObject_delta.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MessageDeltaObject_delta::MessageDeltaObject_delta()
{
    m_Role = "";
    m_RoleIsSet = false;
    m_ContentIsSet = false;
    m_File_idsIsSet = false;
    
}

void MessageDeltaObject_delta::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MessageDeltaObject_delta::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MessageDeltaObject_delta::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MessageDeltaObject_delta" : pathPrefix;

             
    if (contentIsSet())
    {
        const std::vector<org::openapitools::server::model::MessageDeltaObject_delta_content_inner>& value = m_Content;
        const std::string currentValuePath = _pathPrefix + ".content";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::MessageDeltaObject_delta_content_inner& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".content") && success;
 
                i++;
            }
        }

    }
         
    if (fileIdsIsSet())
    {
        const std::vector<std::string>& value = m_File_ids;
        const std::string currentValuePath = _pathPrefix + ".fileIds";
                
        
        if (value.size() > 10)
        {
            success = false;
            msg << currentValuePath << ": must have at most 10 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool MessageDeltaObject_delta::operator==(const MessageDeltaObject_delta& rhs) const
{
    return
    
    
    
    ((!roleIsSet() && !rhs.roleIsSet()) || (roleIsSet() && rhs.roleIsSet() && getRole() == rhs.getRole())) &&
    
    
    ((!contentIsSet() && !rhs.contentIsSet()) || (contentIsSet() && rhs.contentIsSet() && getContent() == rhs.getContent())) &&
    
    
    ((!fileIdsIsSet() && !rhs.fileIdsIsSet()) || (fileIdsIsSet() && rhs.fileIdsIsSet() && getFileIds() == rhs.getFileIds()))
    
    ;
}

bool MessageDeltaObject_delta::operator!=(const MessageDeltaObject_delta& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MessageDeltaObject_delta& o)
{
    j = nlohmann::json::object();
    if(o.roleIsSet())
        j["role"] = o.m_Role;
    if(o.contentIsSet() || !o.m_Content.empty())
        j["content"] = o.m_Content;
    if(o.fileIdsIsSet() || !o.m_File_ids.empty())
        j["file_ids"] = o.m_File_ids;
    
}

void from_json(const nlohmann::json& j, MessageDeltaObject_delta& o)
{
    if(j.find("role") != j.end())
    {
        j.at("role").get_to(o.m_Role);
        o.m_RoleIsSet = true;
    } 
    if(j.find("content") != j.end())
    {
        j.at("content").get_to(o.m_Content);
        o.m_ContentIsSet = true;
    } 
    if(j.find("file_ids") != j.end())
    {
        j.at("file_ids").get_to(o.m_File_ids);
        o.m_File_idsIsSet = true;
    } 
    
}

std::string MessageDeltaObject_delta::getRole() const
{
    return m_Role;
}
void MessageDeltaObject_delta::setRole(std::string const& value)
{
    m_Role = value;
    m_RoleIsSet = true;
}
bool MessageDeltaObject_delta::roleIsSet() const
{
    return m_RoleIsSet;
}
void MessageDeltaObject_delta::unsetRole()
{
    m_RoleIsSet = false;
}
std::vector<org::openapitools::server::model::MessageDeltaObject_delta_content_inner> MessageDeltaObject_delta::getContent() const
{
    return m_Content;
}
void MessageDeltaObject_delta::setContent(std::vector<org::openapitools::server::model::MessageDeltaObject_delta_content_inner> const& value)
{
    m_Content = value;
    m_ContentIsSet = true;
}
bool MessageDeltaObject_delta::contentIsSet() const
{
    return m_ContentIsSet;
}
void MessageDeltaObject_delta::unsetContent()
{
    m_ContentIsSet = false;
}
std::vector<std::string> MessageDeltaObject_delta::getFileIds() const
{
    return m_File_ids;
}
void MessageDeltaObject_delta::setFileIds(std::vector<std::string> const& value)
{
    m_File_ids = value;
    m_File_idsIsSet = true;
}
bool MessageDeltaObject_delta::fileIdsIsSet() const
{
    return m_File_idsIsSet;
}
void MessageDeltaObject_delta::unsetFile_ids()
{
    m_File_idsIsSet = false;
}


} // namespace org::openapitools::server::model

