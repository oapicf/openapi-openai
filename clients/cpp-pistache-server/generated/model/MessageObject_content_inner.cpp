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


#include "MessageObject_content_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MessageObject_content_inner::MessageObject_content_inner()
{
    m_Type = "";
    
}

void MessageObject_content_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MessageObject_content_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MessageObject_content_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MessageObject_content_inner" : pathPrefix;

            
    if (!m_Image_file.validate(msg, _pathPrefix + ".imageFile")) {
        msg << _pathPrefix << ": Image_file is invalid;";
        success = false;
    }    
    if (!m_Text.validate(msg, _pathPrefix + ".text")) {
        msg << _pathPrefix << ": Text is invalid;";
        success = false;
    }
    return success;
}

bool MessageObject_content_inner::operator==(const MessageObject_content_inner& rhs) const
{
    return
    
    
    (getType() == rhs.getType())
     &&
    
    (getImageFile() == rhs.getImageFile())
     &&
    
    (getText() == rhs.getText())
    
    
    ;
}

bool MessageObject_content_inner::operator!=(const MessageObject_content_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MessageObject_content_inner& o)
{
    j = nlohmann::json::object();
    j["type"] = o.m_Type;
    j["image_file"] = o.m_Image_file;
    j["text"] = o.m_Text;
    
}

void from_json(const nlohmann::json& j, MessageObject_content_inner& o)
{
    j.at("type").get_to(o.m_Type);
    j.at("image_file").get_to(o.m_Image_file);
    j.at("text").get_to(o.m_Text);
    
}

std::string MessageObject_content_inner::getType() const
{
    return m_Type;
}
void MessageObject_content_inner::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::MessageContentImageFileObject_image_file MessageObject_content_inner::getImageFile() const
{
    return m_Image_file;
}
void MessageObject_content_inner::setImageFile(org::openapitools::server::model::MessageContentImageFileObject_image_file const& value)
{
    m_Image_file = value;
}
org::openapitools::server::model::MessageContentTextObject_text MessageObject_content_inner::getText() const
{
    return m_Text;
}
void MessageObject_content_inner::setText(org::openapitools::server::model::MessageContentTextObject_text const& value)
{
    m_Text = value;
}


} // namespace org::openapitools::server::model

