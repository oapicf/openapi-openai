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


#include "CreateThreadAndRunRequest_tools_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateThreadAndRunRequest_tools_inner::CreateThreadAndRunRequest_tools_inner()
{
    m_Type = "";
    
}

void CreateThreadAndRunRequest_tools_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateThreadAndRunRequest_tools_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateThreadAndRunRequest_tools_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateThreadAndRunRequest_tools_inner" : pathPrefix;

            
    if (!m_Function.validate(msg, _pathPrefix + ".function")) {
        msg << _pathPrefix << ": Function is invalid;";
        success = false;
    }
    return success;
}

bool CreateThreadAndRunRequest_tools_inner::operator==(const CreateThreadAndRunRequest_tools_inner& rhs) const
{
    return
    
    
    (getType() == rhs.getType())
     &&
    
    (getFunction() == rhs.getFunction())
    
    
    ;
}

bool CreateThreadAndRunRequest_tools_inner::operator!=(const CreateThreadAndRunRequest_tools_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateThreadAndRunRequest_tools_inner& o)
{
    j = nlohmann::json::object();
    j["type"] = o.m_Type;
    j["function"] = o.m_Function;
    
}

void from_json(const nlohmann::json& j, CreateThreadAndRunRequest_tools_inner& o)
{
    j.at("type").get_to(o.m_Type);
    j.at("function").get_to(o.m_Function);
    
}

std::string CreateThreadAndRunRequest_tools_inner::getType() const
{
    return m_Type;
}
void CreateThreadAndRunRequest_tools_inner::setType(std::string const& value)
{
    m_Type = value;
}
org::openapitools::server::model::FunctionObject CreateThreadAndRunRequest_tools_inner::getFunction() const
{
    return m_Function;
}
void CreateThreadAndRunRequest_tools_inner::setFunction(org::openapitools::server::model::FunctionObject const& value)
{
    m_Function = value;
}


} // namespace org::openapitools::server::model

