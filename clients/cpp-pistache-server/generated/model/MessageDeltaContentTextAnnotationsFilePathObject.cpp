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


#include "MessageDeltaContentTextAnnotationsFilePathObject.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MessageDeltaContentTextAnnotationsFilePathObject::MessageDeltaContentTextAnnotationsFilePathObject()
{
    m_Index = 0;
    m_Type = "";
    m_Text = "";
    m_TextIsSet = false;
    m_File_pathIsSet = false;
    m_Start_index = 0;
    m_Start_indexIsSet = false;
    m_End_index = 0;
    m_End_indexIsSet = false;
    
}

void MessageDeltaContentTextAnnotationsFilePathObject::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MessageDeltaContentTextAnnotationsFilePathObject::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MessageDeltaContentTextAnnotationsFilePathObject::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MessageDeltaContentTextAnnotationsFilePathObject" : pathPrefix;

                         
    if (startIndexIsSet())
    {
        const int32_t& value = m_Start_index;
        const std::string currentValuePath = _pathPrefix + ".startIndex";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }

    }
         
    if (endIndexIsSet())
    {
        const int32_t& value = m_End_index;
        const std::string currentValuePath = _pathPrefix + ".endIndex";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }

    }
    
    return success;
}

bool MessageDeltaContentTextAnnotationsFilePathObject::operator==(const MessageDeltaContentTextAnnotationsFilePathObject& rhs) const
{
    return
    
    
    (getIndex() == rhs.getIndex())
     &&
    
    (getType() == rhs.getType())
     &&
    
    
    ((!textIsSet() && !rhs.textIsSet()) || (textIsSet() && rhs.textIsSet() && getText() == rhs.getText())) &&
    
    
    ((!filePathIsSet() && !rhs.filePathIsSet()) || (filePathIsSet() && rhs.filePathIsSet() && getFilePath() == rhs.getFilePath())) &&
    
    
    ((!startIndexIsSet() && !rhs.startIndexIsSet()) || (startIndexIsSet() && rhs.startIndexIsSet() && getStartIndex() == rhs.getStartIndex())) &&
    
    
    ((!endIndexIsSet() && !rhs.endIndexIsSet()) || (endIndexIsSet() && rhs.endIndexIsSet() && getEndIndex() == rhs.getEndIndex()))
    
    ;
}

bool MessageDeltaContentTextAnnotationsFilePathObject::operator!=(const MessageDeltaContentTextAnnotationsFilePathObject& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MessageDeltaContentTextAnnotationsFilePathObject& o)
{
    j = nlohmann::json::object();
    j["index"] = o.m_Index;
    j["type"] = o.m_Type;
    if(o.textIsSet())
        j["text"] = o.m_Text;
    if(o.filePathIsSet())
        j["file_path"] = o.m_File_path;
    if(o.startIndexIsSet())
        j["start_index"] = o.m_Start_index;
    if(o.endIndexIsSet())
        j["end_index"] = o.m_End_index;
    
}

void from_json(const nlohmann::json& j, MessageDeltaContentTextAnnotationsFilePathObject& o)
{
    j.at("index").get_to(o.m_Index);
    j.at("type").get_to(o.m_Type);
    if(j.find("text") != j.end())
    {
        j.at("text").get_to(o.m_Text);
        o.m_TextIsSet = true;
    } 
    if(j.find("file_path") != j.end())
    {
        j.at("file_path").get_to(o.m_File_path);
        o.m_File_pathIsSet = true;
    } 
    if(j.find("start_index") != j.end())
    {
        j.at("start_index").get_to(o.m_Start_index);
        o.m_Start_indexIsSet = true;
    } 
    if(j.find("end_index") != j.end())
    {
        j.at("end_index").get_to(o.m_End_index);
        o.m_End_indexIsSet = true;
    } 
    
}

int32_t MessageDeltaContentTextAnnotationsFilePathObject::getIndex() const
{
    return m_Index;
}
void MessageDeltaContentTextAnnotationsFilePathObject::setIndex(int32_t const value)
{
    m_Index = value;
}
std::string MessageDeltaContentTextAnnotationsFilePathObject::getType() const
{
    return m_Type;
}
void MessageDeltaContentTextAnnotationsFilePathObject::setType(std::string const& value)
{
    m_Type = value;
}
std::string MessageDeltaContentTextAnnotationsFilePathObject::getText() const
{
    return m_Text;
}
void MessageDeltaContentTextAnnotationsFilePathObject::setText(std::string const& value)
{
    m_Text = value;
    m_TextIsSet = true;
}
bool MessageDeltaContentTextAnnotationsFilePathObject::textIsSet() const
{
    return m_TextIsSet;
}
void MessageDeltaContentTextAnnotationsFilePathObject::unsetText()
{
    m_TextIsSet = false;
}
org::openapitools::server::model::MessageDeltaContentTextAnnotationsFilePathObject_file_path MessageDeltaContentTextAnnotationsFilePathObject::getFilePath() const
{
    return m_File_path;
}
void MessageDeltaContentTextAnnotationsFilePathObject::setFilePath(org::openapitools::server::model::MessageDeltaContentTextAnnotationsFilePathObject_file_path const& value)
{
    m_File_path = value;
    m_File_pathIsSet = true;
}
bool MessageDeltaContentTextAnnotationsFilePathObject::filePathIsSet() const
{
    return m_File_pathIsSet;
}
void MessageDeltaContentTextAnnotationsFilePathObject::unsetFile_path()
{
    m_File_pathIsSet = false;
}
int32_t MessageDeltaContentTextAnnotationsFilePathObject::getStartIndex() const
{
    return m_Start_index;
}
void MessageDeltaContentTextAnnotationsFilePathObject::setStartIndex(int32_t const value)
{
    m_Start_index = value;
    m_Start_indexIsSet = true;
}
bool MessageDeltaContentTextAnnotationsFilePathObject::startIndexIsSet() const
{
    return m_Start_indexIsSet;
}
void MessageDeltaContentTextAnnotationsFilePathObject::unsetStart_index()
{
    m_Start_indexIsSet = false;
}
int32_t MessageDeltaContentTextAnnotationsFilePathObject::getEndIndex() const
{
    return m_End_index;
}
void MessageDeltaContentTextAnnotationsFilePathObject::setEndIndex(int32_t const value)
{
    m_End_index = value;
    m_End_indexIsSet = true;
}
bool MessageDeltaContentTextAnnotationsFilePathObject::endIndexIsSet() const
{
    return m_End_indexIsSet;
}
void MessageDeltaContentTextAnnotationsFilePathObject::unsetEnd_index()
{
    m_End_indexIsSet = false;
}


} // namespace org::openapitools::server::model
