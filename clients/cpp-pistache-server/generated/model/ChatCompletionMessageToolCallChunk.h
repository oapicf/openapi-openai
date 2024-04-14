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
 * ChatCompletionMessageToolCallChunk.h
 *
 * 
 */

#ifndef ChatCompletionMessageToolCallChunk_H_
#define ChatCompletionMessageToolCallChunk_H_


#include "ChatCompletionMessageToolCallChunk_function.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ChatCompletionMessageToolCallChunk
{
public:
    ChatCompletionMessageToolCallChunk();
    virtual ~ChatCompletionMessageToolCallChunk() = default;


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

    bool operator==(const ChatCompletionMessageToolCallChunk& rhs) const;
    bool operator!=(const ChatCompletionMessageToolCallChunk& rhs) const;

    /////////////////////////////////////////////
    /// ChatCompletionMessageToolCallChunk members

    /// <summary>
    /// 
    /// </summary>
    int32_t getIndex() const;
    void setIndex(int32_t const value);
    /// <summary>
    /// The ID of the tool call.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// The type of the tool. Currently, only &#x60;function&#x60; is supported.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    bool typeIsSet() const;
    void unsetType();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ChatCompletionMessageToolCallChunk_function getFunction() const;
    void setFunction(org::openapitools::server::model::ChatCompletionMessageToolCallChunk_function const& value);
    bool functionIsSet() const;
    void unsetFunction();

    friend  void to_json(nlohmann::json& j, const ChatCompletionMessageToolCallChunk& o);
    friend  void from_json(const nlohmann::json& j, ChatCompletionMessageToolCallChunk& o);
protected:
    int32_t m_Index;

    std::string m_Id;
    bool m_IdIsSet;
    std::string m_Type;
    bool m_TypeIsSet;
    org::openapitools::server::model::ChatCompletionMessageToolCallChunk_function m_Function;
    bool m_FunctionIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* ChatCompletionMessageToolCallChunk_H_ */
