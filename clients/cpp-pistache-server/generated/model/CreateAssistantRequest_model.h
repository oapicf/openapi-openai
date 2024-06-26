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
/*
 * CreateAssistantRequest_model.h
 *
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 */

#ifndef CreateAssistantRequest_model_H_
#define CreateAssistantRequest_model_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
/// </summary>
class  CreateAssistantRequest_model
{
public:
    CreateAssistantRequest_model();
    virtual ~CreateAssistantRequest_model() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CreateAssistantRequest_model& rhs) const;
    bool operator!=(const CreateAssistantRequest_model& rhs) const;

    /////////////////////////////////////////////
    /// CreateAssistantRequest_model members


    friend  void to_json(nlohmann::json& j, const CreateAssistantRequest_model& o);
    friend  void from_json(const nlohmann::json& j, CreateAssistantRequest_model& o);
protected:
    
};

} // namespace org::openapitools::server::model

#endif /* CreateAssistantRequest_model_H_ */
