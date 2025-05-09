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


#include "MessageContentTextObject_text_annotations_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MessageContentTextObject_text_annotations_inner::MessageContentTextObject_text_annotations_inner()
{
    m_Type = "";
    m_Text = "";
    m_Start_index = 0;
    m_End_index = 0;
    
}

void MessageContentTextObject_text_annotations_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MessageContentTextObject_text_annotations_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MessageContentTextObject_text_annotations_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MessageContentTextObject_text_annotations_inner" : pathPrefix;

                
    if (!m_File_citation.validate(msg, _pathPrefix + ".fileCitation")) {
        msg << _pathPrefix << ": File_citation is invalid;";
        success = false;
    }     
    
    /* Start_index */ {
        const int32_t& value = m_Start_index;
        const std::string currentValuePath = _pathPrefix + ".startIndex";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }

    }
         
    
    /* End_index */ {
        const int32_t& value = m_End_index;
        const std::string currentValuePath = _pathPrefix + ".endIndex";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }

    }
        
    if (!m_File_path.validate(msg, _pathPrefix + ".filePath")) {
        msg << _pathPrefix << ": File_path is invalid;";
        success = false;
    }
    return success;
}

bool MessageContentTextObject_text_annotations_inner::operator==(const MessageContentTextObject_text_annotations_inner& rhs) const
{
    return
    
    
    (getType() == rhs.getType())
     &&
    
    (getText() == rhs.getText())
     &&
    
    (getFileCitation() == rhs.getFileCitation())
     &&
    
    (getStartIndex() == rhs.getStartIndex())
     &&
    
    (getEndIndex() == rhs.getEndIndex())
     &&
    
    (getFilePath() == rhs.getFilePath())
    
    
    ;
}

bool MessageContentTextObject_text_annotations_inner::operator!=(const MessageContentTextObject_text_annotations_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MessageContentTextObject_text_annotations_inner& o)
{
    j = nlohmann::json::object();
    j["type"] = o.m_Type;
    j["text"] = o.m_Text;
    j["file_citation"] = o.m_File_citation;
    j["start_index"] = o.m_Start_index;
    j["end_index"] = o.m_End_index;
    j["file_path"] = o.m_File_path;
    
}

void from_json(const nlohmann::json& j, MessageContentTextObject_text_annotations_inner& o)
{
    j.at("type").get_to(o.m_Type);
    j.at("text").get_to(o.m_Text);
    j.at("file_citation").get_to(o.m_File_citation);
    j.at("start_index").get_to(o.m_Start_index);
    j.at("end_index").get_to(o.m_End_index);
    j.at("file_path").get_to(o.m_File_path);
    
}

std::string MessageContentTextObject_text_annotations_inner::getType() const
{
    return m_Type;
}
void MessageContentTextObject_text_annotations_inner::setType(std::string const& value)
{
    m_Type = value;
}
std::string MessageContentTextObject_text_annotations_inner::getText() const
{
    return m_Text;
}
void MessageContentTextObject_text_annotations_inner::setText(std::string const& value)
{
    m_Text = value;
}
org::openapitools::server::model::MessageContentTextAnnotationsFileCitationObject_file_citation MessageContentTextObject_text_annotations_inner::getFileCitation() const
{
    return m_File_citation;
}
void MessageContentTextObject_text_annotations_inner::setFileCitation(org::openapitools::server::model::MessageContentTextAnnotationsFileCitationObject_file_citation const& value)
{
    m_File_citation = value;
}
int32_t MessageContentTextObject_text_annotations_inner::getStartIndex() const
{
    return m_Start_index;
}
void MessageContentTextObject_text_annotations_inner::setStartIndex(int32_t const value)
{
    m_Start_index = value;
}
int32_t MessageContentTextObject_text_annotations_inner::getEndIndex() const
{
    return m_End_index;
}
void MessageContentTextObject_text_annotations_inner::setEndIndex(int32_t const value)
{
    m_End_index = value;
}
org::openapitools::server::model::MessageContentTextAnnotationsFilePathObject_file_path MessageContentTextObject_text_annotations_inner::getFilePath() const
{
    return m_File_path;
}
void MessageContentTextObject_text_annotations_inner::setFilePath(org::openapitools::server::model::MessageContentTextAnnotationsFilePathObject_file_path const& value)
{
    m_File_path = value;
}


} // namespace org::openapitools::server::model

