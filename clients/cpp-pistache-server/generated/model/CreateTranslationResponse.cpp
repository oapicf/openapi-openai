/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "CreateTranslationResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateTranslationResponse::CreateTranslationResponse()
{
    m_Text = "";
    
}

void CreateTranslationResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateTranslationResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateTranslationResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateTranslationResponse" : pathPrefix;

        
    return success;
}

bool CreateTranslationResponse::operator==(const CreateTranslationResponse& rhs) const
{
    return
    
    
    (getText() == rhs.getText())
    
    
    ;
}

bool CreateTranslationResponse::operator!=(const CreateTranslationResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateTranslationResponse& o)
{
    j = nlohmann::json::object();
    j["text"] = o.m_Text;
    
}

void from_json(const nlohmann::json& j, CreateTranslationResponse& o)
{
    j.at("text").get_to(o.m_Text);
    
}

std::string CreateTranslationResponse::getText() const
{
    return m_Text;
}
void CreateTranslationResponse::setText(std::string const& value)
{
    m_Text = value;
}


} // namespace org::openapitools::server::model
