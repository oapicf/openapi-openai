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
 * ChatCompletionRequestToolMessage.h
 *
 * 
 */

#ifndef ChatCompletionRequestToolMessage_H_
#define ChatCompletionRequestToolMessage_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ChatCompletionRequestToolMessage
{
public:
    ChatCompletionRequestToolMessage();
    virtual ~ChatCompletionRequestToolMessage() = default;


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

    bool operator==(const ChatCompletionRequestToolMessage& rhs) const;
    bool operator!=(const ChatCompletionRequestToolMessage& rhs) const;

    /////////////////////////////////////////////
    /// ChatCompletionRequestToolMessage members

    /// <summary>
    /// The role of the messages author, in this case &#x60;tool&#x60;.
    /// </summary>
    std::string getRole() const;
    void setRole(std::string const& value);
    /// <summary>
    /// The contents of the tool message.
    /// </summary>
    std::string getContent() const;
    void setContent(std::string const& value);
    /// <summary>
    /// Tool call that this message is responding to.
    /// </summary>
    std::string getToolCallId() const;
    void setToolCallId(std::string const& value);

    friend  void to_json(nlohmann::json& j, const ChatCompletionRequestToolMessage& o);
    friend  void from_json(const nlohmann::json& j, ChatCompletionRequestToolMessage& o);
protected:
    std::string m_Role;

    std::string m_Content;

    std::string m_Tool_call_id;

    
};

} // namespace org::openapitools::server::model

#endif /* ChatCompletionRequestToolMessage_H_ */
