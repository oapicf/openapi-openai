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


#include "ModifyAssistantRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ModifyAssistantRequest::ModifyAssistantRequest()
{
    m_Model = "";
    m_ModelIsSet = false;
    m_Name = "";
    m_NameIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_Instructions = "";
    m_InstructionsIsSet = false;
    m_ToolsIsSet = false;
    m_File_idsIsSet = false;
    m_MetadataIsSet = false;
    
}

void ModifyAssistantRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ModifyAssistantRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ModifyAssistantRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ModifyAssistantRequest" : pathPrefix;

             
    if (nameIsSet())
    {
        const std::string& value = m_Name;
        const std::string currentValuePath = _pathPrefix + ".name";
                
        
        if (value.length() > 256)
        {
            success = false;
            msg << currentValuePath << ": must be at most 256 characters long;";
        }

    }
         
    if (descriptionIsSet())
    {
        const std::string& value = m_Description;
        const std::string currentValuePath = _pathPrefix + ".description";
                
        
        if (value.length() > 512)
        {
            success = false;
            msg << currentValuePath << ": must be at most 512 characters long;";
        }

    }
         
    if (instructionsIsSet())
    {
        const std::string& value = m_Instructions;
        const std::string currentValuePath = _pathPrefix + ".instructions";
                
        
        if (value.length() > 256000)
        {
            success = false;
            msg << currentValuePath << ": must be at most 256000 characters long;";
        }

    }
         
    if (toolsIsSet())
    {
        const std::vector<org::openapitools::server::model::AssistantObject_tools_inner>& value = m_Tools;
        const std::string currentValuePath = _pathPrefix + ".tools";
                
        
        if (value.size() > 128)
        {
            success = false;
            msg << currentValuePath << ": must have at most 128 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::AssistantObject_tools_inner& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".tools") && success;
 
                i++;
            }
        }

    }
         
    if (fileIdsIsSet())
    {
        const std::vector<std::string>& value = m_File_ids;
        const std::string currentValuePath = _pathPrefix + ".fileIds";
                
        
        if (value.size() > 20)
        {
            success = false;
            msg << currentValuePath << ": must have at most 20 elements;";
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

bool ModifyAssistantRequest::operator==(const ModifyAssistantRequest& rhs) const
{
    return
    
    
    
    ((!modelIsSet() && !rhs.modelIsSet()) || (modelIsSet() && rhs.modelIsSet() && getModel() == rhs.getModel())) &&
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!descriptionIsSet() && !rhs.descriptionIsSet()) || (descriptionIsSet() && rhs.descriptionIsSet() && getDescription() == rhs.getDescription())) &&
    
    
    ((!instructionsIsSet() && !rhs.instructionsIsSet()) || (instructionsIsSet() && rhs.instructionsIsSet() && getInstructions() == rhs.getInstructions())) &&
    
    
    ((!toolsIsSet() && !rhs.toolsIsSet()) || (toolsIsSet() && rhs.toolsIsSet() && getTools() == rhs.getTools())) &&
    
    
    ((!fileIdsIsSet() && !rhs.fileIdsIsSet()) || (fileIdsIsSet() && rhs.fileIdsIsSet() && getFileIds() == rhs.getFileIds())) &&
    
    
    ((!metadataIsSet() && !rhs.metadataIsSet()) || (metadataIsSet() && rhs.metadataIsSet() && getMetadata() == rhs.getMetadata()))
    
    ;
}

bool ModifyAssistantRequest::operator!=(const ModifyAssistantRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ModifyAssistantRequest& o)
{
    j = nlohmann::json::object();
    if(o.modelIsSet())
        j["model"] = o.m_Model;
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    if(o.instructionsIsSet())
        j["instructions"] = o.m_Instructions;
    if(o.toolsIsSet() || !o.m_Tools.empty())
        j["tools"] = o.m_Tools;
    if(o.fileIdsIsSet() || !o.m_File_ids.empty())
        j["file_ids"] = o.m_File_ids;
    if(o.metadataIsSet())
        j["metadata"] = o.m_Metadata;
    
}

void from_json(const nlohmann::json& j, ModifyAssistantRequest& o)
{
    if(j.find("model") != j.end())
    {
        j.at("model").get_to(o.m_Model);
        o.m_ModelIsSet = true;
    } 
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
    } 
    if(j.find("instructions") != j.end())
    {
        j.at("instructions").get_to(o.m_Instructions);
        o.m_InstructionsIsSet = true;
    } 
    if(j.find("tools") != j.end())
    {
        j.at("tools").get_to(o.m_Tools);
        o.m_ToolsIsSet = true;
    } 
    if(j.find("file_ids") != j.end())
    {
        j.at("file_ids").get_to(o.m_File_ids);
        o.m_File_idsIsSet = true;
    } 
    if(j.find("metadata") != j.end())
    {
        j.at("metadata").get_to(o.m_Metadata);
        o.m_MetadataIsSet = true;
    } 
    
}

std::string ModifyAssistantRequest::getModel() const
{
    return m_Model;
}
void ModifyAssistantRequest::setModel(std::string const& value)
{
    m_Model = value;
    m_ModelIsSet = true;
}
bool ModifyAssistantRequest::modelIsSet() const
{
    return m_ModelIsSet;
}
void ModifyAssistantRequest::unsetModel()
{
    m_ModelIsSet = false;
}
std::string ModifyAssistantRequest::getName() const
{
    return m_Name;
}
void ModifyAssistantRequest::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool ModifyAssistantRequest::nameIsSet() const
{
    return m_NameIsSet;
}
void ModifyAssistantRequest::unsetName()
{
    m_NameIsSet = false;
}
std::string ModifyAssistantRequest::getDescription() const
{
    return m_Description;
}
void ModifyAssistantRequest::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool ModifyAssistantRequest::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void ModifyAssistantRequest::unsetDescription()
{
    m_DescriptionIsSet = false;
}
std::string ModifyAssistantRequest::getInstructions() const
{
    return m_Instructions;
}
void ModifyAssistantRequest::setInstructions(std::string const& value)
{
    m_Instructions = value;
    m_InstructionsIsSet = true;
}
bool ModifyAssistantRequest::instructionsIsSet() const
{
    return m_InstructionsIsSet;
}
void ModifyAssistantRequest::unsetInstructions()
{
    m_InstructionsIsSet = false;
}
std::vector<org::openapitools::server::model::AssistantObject_tools_inner> ModifyAssistantRequest::getTools() const
{
    return m_Tools;
}
void ModifyAssistantRequest::setTools(std::vector<org::openapitools::server::model::AssistantObject_tools_inner> const& value)
{
    m_Tools = value;
    m_ToolsIsSet = true;
}
bool ModifyAssistantRequest::toolsIsSet() const
{
    return m_ToolsIsSet;
}
void ModifyAssistantRequest::unsetTools()
{
    m_ToolsIsSet = false;
}
std::vector<std::string> ModifyAssistantRequest::getFileIds() const
{
    return m_File_ids;
}
void ModifyAssistantRequest::setFileIds(std::vector<std::string> const& value)
{
    m_File_ids = value;
    m_File_idsIsSet = true;
}
bool ModifyAssistantRequest::fileIdsIsSet() const
{
    return m_File_idsIsSet;
}
void ModifyAssistantRequest::unsetFile_ids()
{
    m_File_idsIsSet = false;
}
nlohmann::json ModifyAssistantRequest::getMetadata() const
{
    return m_Metadata;
}
void ModifyAssistantRequest::setMetadata(nlohmann::json const& value)
{
    m_Metadata = value;
    m_MetadataIsSet = true;
}
bool ModifyAssistantRequest::metadataIsSet() const
{
    return m_MetadataIsSet;
}
void ModifyAssistantRequest::unsetMetadata()
{
    m_MetadataIsSet = false;
}


} // namespace org::openapitools::server::model

