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
/*
 * ChatCompletionStreamResponseDelta.h
 *
 * 
 */

#ifndef ChatCompletionStreamResponseDelta_H_
#define ChatCompletionStreamResponseDelta_H_


#include "ChatCompletionRequestMessage_function_call.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ChatCompletionStreamResponseDelta
{
public:
    ChatCompletionStreamResponseDelta();
    virtual ~ChatCompletionStreamResponseDelta() = default;


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

    bool operator==(const ChatCompletionStreamResponseDelta& rhs) const;
    bool operator!=(const ChatCompletionStreamResponseDelta& rhs) const;

    /////////////////////////////////////////////
    /// ChatCompletionStreamResponseDelta members

    /// <summary>
    /// The role of the author of this message.
    /// </summary>
    std::string getRole() const;
    void setRole(std::string const& value);
    bool roleIsSet() const;
    void unsetRole();
    /// <summary>
    /// The contents of the chunk message.
    /// </summary>
    std::string getContent() const;
    void setContent(std::string const& value);
    bool contentIsSet() const;
    void unsetContent();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ChatCompletionRequestMessage_function_call getFunctionCall() const;
    void setFunctionCall(org::openapitools::server::model::ChatCompletionRequestMessage_function_call const& value);
    bool functionCallIsSet() const;
    void unsetFunction_call();

    friend  void to_json(nlohmann::json& j, const ChatCompletionStreamResponseDelta& o);
    friend  void from_json(const nlohmann::json& j, ChatCompletionStreamResponseDelta& o);
protected:
    std::string m_Role;
    bool m_RoleIsSet;
    std::string m_Content;
    bool m_ContentIsSet;
    org::openapitools::server::model::ChatCompletionRequestMessage_function_call m_Function_call;
    bool m_Function_callIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* ChatCompletionStreamResponseDelta_H_ */
