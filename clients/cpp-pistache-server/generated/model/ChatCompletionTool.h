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
 * ChatCompletionTool.h
 *
 * 
 */

#ifndef ChatCompletionTool_H_
#define ChatCompletionTool_H_


#include "FunctionObject.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ChatCompletionTool
{
public:
    ChatCompletionTool();
    virtual ~ChatCompletionTool() = default;


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

    bool operator==(const ChatCompletionTool& rhs) const;
    bool operator!=(const ChatCompletionTool& rhs) const;

    /////////////////////////////////////////////
    /// ChatCompletionTool members

    /// <summary>
    /// The type of the tool. Currently, only &#x60;function&#x60; is supported.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::FunctionObject getFunction() const;
    void setFunction(org::openapitools::server::model::FunctionObject const& value);

    friend  void to_json(nlohmann::json& j, const ChatCompletionTool& o);
    friend  void from_json(const nlohmann::json& j, ChatCompletionTool& o);
protected:
    std::string m_Type;

    org::openapitools::server::model::FunctionObject m_Function;

    
};

} // namespace org::openapitools::server::model

#endif /* ChatCompletionTool_H_ */
