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


#include "CreateChatCompletionFunctionResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateChatCompletionFunctionResponse::CreateChatCompletionFunctionResponse()
{
    m_Id = "";
    m_Created = 0;
    m_Model = "";
    m_System_fingerprint = "";
    m_System_fingerprintIsSet = false;
    m_object = "";
    m_UsageIsSet = false;
    
}

void CreateChatCompletionFunctionResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateChatCompletionFunctionResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateChatCompletionFunctionResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateChatCompletionFunctionResponse" : pathPrefix;

             
    
    /* Choices */ {
        const std::vector<org::openapitools::server::model::CreateChatCompletionFunctionResponse_choices_inner>& value = m_Choices;
        const std::string currentValuePath = _pathPrefix + ".choices";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::CreateChatCompletionFunctionResponse_choices_inner& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".choices") && success;
 
                i++;
            }
        }

    }
                        
    return success;
}

bool CreateChatCompletionFunctionResponse::operator==(const CreateChatCompletionFunctionResponse& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    (getChoices() == rhs.getChoices())
     &&
    
    (getCreated() == rhs.getCreated())
     &&
    
    (getModel() == rhs.getModel())
     &&
    
    
    ((!systemFingerprintIsSet() && !rhs.systemFingerprintIsSet()) || (systemFingerprintIsSet() && rhs.systemFingerprintIsSet() && getSystemFingerprint() == rhs.getSystemFingerprint())) &&
    
    (getObject() == rhs.getObject())
     &&
    
    
    ((!usageIsSet() && !rhs.usageIsSet()) || (usageIsSet() && rhs.usageIsSet() && getUsage() == rhs.getUsage()))
    
    ;
}

bool CreateChatCompletionFunctionResponse::operator!=(const CreateChatCompletionFunctionResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateChatCompletionFunctionResponse& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    j["choices"] = o.m_Choices;
    j["created"] = o.m_Created;
    j["model"] = o.m_Model;
    if(o.systemFingerprintIsSet())
        j["system_fingerprint"] = o.m_System_fingerprint;
    j["object"] = o.m_object;
    if(o.usageIsSet())
        j["usage"] = o.m_Usage;
    
}

void from_json(const nlohmann::json& j, CreateChatCompletionFunctionResponse& o)
{
    j.at("id").get_to(o.m_Id);
    j.at("choices").get_to(o.m_Choices);
    j.at("created").get_to(o.m_Created);
    j.at("model").get_to(o.m_Model);
    if(j.find("system_fingerprint") != j.end())
    {
        j.at("system_fingerprint").get_to(o.m_System_fingerprint);
        o.m_System_fingerprintIsSet = true;
    } 
    j.at("object").get_to(o.m_object);
    if(j.find("usage") != j.end())
    {
        j.at("usage").get_to(o.m_Usage);
        o.m_UsageIsSet = true;
    } 
    
}

std::string CreateChatCompletionFunctionResponse::getId() const
{
    return m_Id;
}
void CreateChatCompletionFunctionResponse::setId(std::string const& value)
{
    m_Id = value;
}
std::vector<org::openapitools::server::model::CreateChatCompletionFunctionResponse_choices_inner> CreateChatCompletionFunctionResponse::getChoices() const
{
    return m_Choices;
}
void CreateChatCompletionFunctionResponse::setChoices(std::vector<org::openapitools::server::model::CreateChatCompletionFunctionResponse_choices_inner> const& value)
{
    m_Choices = value;
}
int32_t CreateChatCompletionFunctionResponse::getCreated() const
{
    return m_Created;
}
void CreateChatCompletionFunctionResponse::setCreated(int32_t const value)
{
    m_Created = value;
}
std::string CreateChatCompletionFunctionResponse::getModel() const
{
    return m_Model;
}
void CreateChatCompletionFunctionResponse::setModel(std::string const& value)
{
    m_Model = value;
}
std::string CreateChatCompletionFunctionResponse::getSystemFingerprint() const
{
    return m_System_fingerprint;
}
void CreateChatCompletionFunctionResponse::setSystemFingerprint(std::string const& value)
{
    m_System_fingerprint = value;
    m_System_fingerprintIsSet = true;
}
bool CreateChatCompletionFunctionResponse::systemFingerprintIsSet() const
{
    return m_System_fingerprintIsSet;
}
void CreateChatCompletionFunctionResponse::unsetSystem_fingerprint()
{
    m_System_fingerprintIsSet = false;
}
std::string CreateChatCompletionFunctionResponse::getObject() const
{
    return m_object;
}
void CreateChatCompletionFunctionResponse::setObject(std::string const& value)
{
    m_object = value;
}
org::openapitools::server::model::CompletionUsage CreateChatCompletionFunctionResponse::getUsage() const
{
    return m_Usage;
}
void CreateChatCompletionFunctionResponse::setUsage(org::openapitools::server::model::CompletionUsage const& value)
{
    m_Usage = value;
    m_UsageIsSet = true;
}
bool CreateChatCompletionFunctionResponse::usageIsSet() const
{
    return m_UsageIsSet;
}
void CreateChatCompletionFunctionResponse::unsetUsage()
{
    m_UsageIsSet = false;
}


} // namespace org::openapitools::server::model
