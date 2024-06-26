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


#include "CreateTranslationResponseJson.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateTranslationResponseJson::CreateTranslationResponseJson()
{
    m_Text = "";
    
}

void CreateTranslationResponseJson::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateTranslationResponseJson::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateTranslationResponseJson::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateTranslationResponseJson" : pathPrefix;

        
    return success;
}

bool CreateTranslationResponseJson::operator==(const CreateTranslationResponseJson& rhs) const
{
    return
    
    
    (getText() == rhs.getText())
    
    
    ;
}

bool CreateTranslationResponseJson::operator!=(const CreateTranslationResponseJson& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateTranslationResponseJson& o)
{
    j = nlohmann::json::object();
    j["text"] = o.m_Text;
    
}

void from_json(const nlohmann::json& j, CreateTranslationResponseJson& o)
{
    j.at("text").get_to(o.m_Text);
    
}

std::string CreateTranslationResponseJson::getText() const
{
    return m_Text;
}
void CreateTranslationResponseJson::setText(std::string const& value)
{
    m_Text = value;
}


} // namespace org::openapitools::server::model

