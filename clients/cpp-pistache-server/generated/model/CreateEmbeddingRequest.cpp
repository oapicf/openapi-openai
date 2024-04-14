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


#include "CreateEmbeddingRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateEmbeddingRequest::CreateEmbeddingRequest()
{
    m_User = "";
    m_UserIsSet = false;
    
}

void CreateEmbeddingRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateEmbeddingRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateEmbeddingRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateEmbeddingRequest" : pathPrefix;

        
    if (!m_Model.validate()) {
        msg << _pathPrefix << ": Model is invalid;";
        success = false;
    }    
    if (!m_Input.validate()) {
        msg << _pathPrefix << ": Input is invalid;";
        success = false;
    }    
    return success;
}

bool CreateEmbeddingRequest::operator==(const CreateEmbeddingRequest& rhs) const
{
    return
    
    
    (getModel() == rhs.getModel())
     &&
    
    (getInput() == rhs.getInput())
     &&
    
    
    ((!userIsSet() && !rhs.userIsSet()) || (userIsSet() && rhs.userIsSet() && getUser() == rhs.getUser()))
    
    ;
}

bool CreateEmbeddingRequest::operator!=(const CreateEmbeddingRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateEmbeddingRequest& o)
{
    j = nlohmann::json::object();
    j["model"] = o.m_Model;
    j["input"] = o.m_Input;
    if(o.userIsSet())
        j["user"] = o.m_User;
    
}

void from_json(const nlohmann::json& j, CreateEmbeddingRequest& o)
{
    j.at("model").get_to(o.m_Model);
    j.at("input").get_to(o.m_Input);
    if(j.find("user") != j.end())
    {
        j.at("user").get_to(o.m_User);
        o.m_UserIsSet = true;
    } 
    
}

org::openapitools::server::model::CreateEmbeddingRequest_model CreateEmbeddingRequest::getModel() const
{
    return m_Model;
}
void CreateEmbeddingRequest::setModel(org::openapitools::server::model::CreateEmbeddingRequest_model const& value)
{
    m_Model = value;
}
org::openapitools::server::model::CreateEmbeddingRequest_input CreateEmbeddingRequest::getInput() const
{
    return m_Input;
}
void CreateEmbeddingRequest::setInput(org::openapitools::server::model::CreateEmbeddingRequest_input const& value)
{
    m_Input = value;
}
std::string CreateEmbeddingRequest::getUser() const
{
    return m_User;
}
void CreateEmbeddingRequest::setUser(std::string const& value)
{
    m_User = value;
    m_UserIsSet = true;
}
bool CreateEmbeddingRequest::userIsSet() const
{
    return m_UserIsSet;
}
void CreateEmbeddingRequest::unsetUser()
{
    m_UserIsSet = false;
}


} // namespace org::openapitools::server::model
