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


#include "CreateChatCompletionRequest_model.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateChatCompletionRequest_model::CreateChatCompletionRequest_model()
{
    
}

void CreateChatCompletionRequest_model::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateChatCompletionRequest_model::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateChatCompletionRequest_model::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateChatCompletionRequest_model" : pathPrefix;

    
    return success;
}

bool CreateChatCompletionRequest_model::operator==(const CreateChatCompletionRequest_model& rhs) const
{
    return
    
    
    ;
}

bool CreateChatCompletionRequest_model::operator!=(const CreateChatCompletionRequest_model& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateChatCompletionRequest_model& o)
{
    j = nlohmann::json::object();
    
}

void from_json(const nlohmann::json& j, CreateChatCompletionRequest_model& o)
{
    
}



} // namespace org::openapitools::server::model
