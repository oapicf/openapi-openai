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


#include "MessageDeltaObject_delta_content_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MessageDeltaObject_delta_content_inner::MessageDeltaObject_delta_content_inner()
{
    m_Index = 0;
    m_Type = "";
    m_Image_fileIsSet = false;
    m_TextIsSet = false;
    
}

void MessageDeltaObject_delta_content_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MessageDeltaObject_delta_content_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MessageDeltaObject_delta_content_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MessageDeltaObject_delta_content_inner" : pathPrefix;

                    
    return success;
}

bool MessageDeltaObject_delta_content_inner::operator==(const MessageDeltaObject_delta_content_inner& rhs) const
{
    return
    
    
    (getIndex() == rhs.getIndex())
     &&
    
    (getType() == rhs.getType())
     &&
    
    
    ((!imageFileIsSet() && !rhs.imageFileIsSet()) || (imageFileIsSet() && rhs.imageFileIsSet() && getImageFile() == rhs.getImageFile())) &&
    
    
    ((!textIsSet() && !rhs.textIsSet()) || (textIsSet() && rhs.textIsSet() && getText() == rhs.getText()))
    
    ;
}

bool MessageDeltaObject_delta_content_inner::operator!=(const MessageDeltaObject_delta_content_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MessageDeltaObject_delta_content_inner& o)
{
    j = nlohmann::json::object();
    j["index"] = o.m_Index;
    j["type"] = o.m_Type;
    if(o.imageFileIsSet())
        j["image_file"] = o.m_Image_file;
    if(o.textIsSet())
        j["text"] = o.m_Text;
    
}

void from_json(const nlohmann::json& j, MessageDeltaObject_delta_content_inner& o)
{
    j.at("index").get_to(o.m_Index);
    j.at("type").get_to(o.m_Type);
    if(j.find("image_file") != j.end())
    {
        j.at("image_file").get_to(o.m_Image_file);
        o.m_Image_fileIsSet = true;
    } 
    if(j.find("text") != j.end())
    {
        j.at("text").get_to(o.m_Text);
        o.m_TextIsSet = true;
    } 
    
}

int32_t MessageDeltaObject_delta_content_inner::getIndex() const
{
    return m_Index;
}
void MessageDeltaObject_delta_content_inner::setIndex(int32_t const value)
{
    m_Index = value;
}
std::string MessageDeltaObject_delta_content_inner::getType() const
{
    return m_Type;
}
void MessageDeltaObject_delta_content_inner::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::MessageDeltaContentImageFileObject_image_file MessageDeltaObject_delta_content_inner::getImageFile() const
{
    return m_Image_file;
}
void MessageDeltaObject_delta_content_inner::setImageFile(org::openapitools::server::model::MessageDeltaContentImageFileObject_image_file const& value)
{
    m_Image_file = value;
    m_Image_fileIsSet = true;
}
bool MessageDeltaObject_delta_content_inner::imageFileIsSet() const
{
    return m_Image_fileIsSet;
}
void MessageDeltaObject_delta_content_inner::unsetImage_file()
{
    m_Image_fileIsSet = false;
}
org::openapitools::server::model::MessageDeltaContentTextObject_text MessageDeltaObject_delta_content_inner::getText() const
{
    return m_Text;
}
void MessageDeltaObject_delta_content_inner::setText(org::openapitools::server::model::MessageDeltaContentTextObject_text const& value)
{
    m_Text = value;
    m_TextIsSet = true;
}
bool MessageDeltaObject_delta_content_inner::textIsSet() const
{
    return m_TextIsSet;
}
void MessageDeltaObject_delta_content_inner::unsetText()
{
    m_TextIsSet = false;
}


} // namespace org::openapitools::server::model

