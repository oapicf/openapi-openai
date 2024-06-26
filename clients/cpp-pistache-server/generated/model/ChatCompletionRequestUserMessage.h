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
 * ChatCompletionRequestUserMessage.h
 *
 * 
 */

#ifndef ChatCompletionRequestUserMessage_H_
#define ChatCompletionRequestUserMessage_H_


#include <string>
#include "ChatCompletionRequestUserMessage_content.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ChatCompletionRequestUserMessage
{
public:
    ChatCompletionRequestUserMessage();
    virtual ~ChatCompletionRequestUserMessage() = default;


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

    bool operator==(const ChatCompletionRequestUserMessage& rhs) const;
    bool operator!=(const ChatCompletionRequestUserMessage& rhs) const;

    /////////////////////////////////////////////
    /// ChatCompletionRequestUserMessage members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ChatCompletionRequestUserMessage_content getContent() const;
    void setContent(org::openapitools::server::model::ChatCompletionRequestUserMessage_content const& value);
    /// <summary>
    /// The role of the messages author, in this case &#x60;user&#x60;.
    /// </summary>
    std::string getRole() const;
    void setRole(std::string const& value);
    /// <summary>
    /// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();

    friend  void to_json(nlohmann::json& j, const ChatCompletionRequestUserMessage& o);
    friend  void from_json(const nlohmann::json& j, ChatCompletionRequestUserMessage& o);
protected:
    org::openapitools::server::model::ChatCompletionRequestUserMessage_content m_Content;

    std::string m_Role;

    std::string m_Name;
    bool m_NameIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* ChatCompletionRequestUserMessage_H_ */
