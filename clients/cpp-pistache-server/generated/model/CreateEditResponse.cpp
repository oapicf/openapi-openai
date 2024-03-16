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


#include "CreateEditResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateEditResponse::CreateEditResponse()
{
    m_object = "";
    m_Created = 0;
    
}

void CreateEditResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateEditResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateEditResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateEditResponse" : pathPrefix;

                 
    
    /* Choices */ {
        const std::vector<org::openapitools::server::model::CreateEditResponse_choices_inner>& value = m_Choices;
        const std::string currentValuePath = _pathPrefix + ".choices";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::CreateEditResponse_choices_inner& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".choices") && success;
 
                i++;
            }
        }

    }
        
    if (!m_Usage.validate()) {
        msg << _pathPrefix << ": Usage is invalid;";
        success = false;
    }
    return success;
}

bool CreateEditResponse::operator==(const CreateEditResponse& rhs) const
{
    return
    
    
    (getObject() == rhs.getObject())
     &&
    
    (getCreated() == rhs.getCreated())
     &&
    
    (getChoices() == rhs.getChoices())
     &&
    
    (getUsage() == rhs.getUsage())
    
    
    ;
}

bool CreateEditResponse::operator!=(const CreateEditResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateEditResponse& o)
{
    j = nlohmann::json::object();
    j["object"] = o.m_object;
    j["created"] = o.m_Created;
    j["choices"] = o.m_Choices;
    j["usage"] = o.m_Usage;
    
}

void from_json(const nlohmann::json& j, CreateEditResponse& o)
{
    j.at("object").get_to(o.m_object);
    j.at("created").get_to(o.m_Created);
    j.at("choices").get_to(o.m_Choices);
    j.at("usage").get_to(o.m_Usage);
    
}

std::string CreateEditResponse::getObject() const
{
    return m_object;
}
void CreateEditResponse::setObject(std::string const& value)
{
    m_object = value;
}
int32_t CreateEditResponse::getCreated() const
{
    return m_Created;
}
void CreateEditResponse::setCreated(int32_t const value)
{
    m_Created = value;
}
std::vector<org::openapitools::server::model::CreateEditResponse_choices_inner> CreateEditResponse::getChoices() const
{
    return m_Choices;
}
void CreateEditResponse::setChoices(std::vector<org::openapitools::server::model::CreateEditResponse_choices_inner> const& value)
{
    m_Choices = value;
}
org::openapitools::server::model::CreateCompletionResponse_usage CreateEditResponse::getUsage() const
{
    return m_Usage;
}
void CreateEditResponse::setUsage(org::openapitools::server::model::CreateCompletionResponse_usage const& value)
{
    m_Usage = value;
}


} // namespace org::openapitools::server::model

