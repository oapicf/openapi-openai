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
 * CreateChatCompletionRequest_stop.h
 *
 * Up to 4 sequences where the API will stop generating further tokens. 
 */

#ifndef CreateChatCompletionRequest_stop_H_
#define CreateChatCompletionRequest_stop_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Up to 4 sequences where the API will stop generating further tokens. 
/// </summary>
class  CreateChatCompletionRequest_stop
{
public:
    CreateChatCompletionRequest_stop();
    virtual ~CreateChatCompletionRequest_stop() = default;


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

    bool operator==(const CreateChatCompletionRequest_stop& rhs) const;
    bool operator!=(const CreateChatCompletionRequest_stop& rhs) const;

    /////////////////////////////////////////////
    /// CreateChatCompletionRequest_stop members


    friend  void to_json(nlohmann::json& j, const CreateChatCompletionRequest_stop& o);
    friend  void from_json(const nlohmann::json& j, CreateChatCompletionRequest_stop& o);
protected:
    
};

} // namespace org::openapitools::server::model

#endif /* CreateChatCompletionRequest_stop_H_ */
