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
 * MessageStreamEvent_oneOf.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) is created.
 */

#ifndef MessageStreamEvent_oneOf_H_
#define MessageStreamEvent_oneOf_H_


#include <string>
#include "MessageObject.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Occurs when a [message](/docs/api-reference/messages/object) is created.
/// </summary>
class  MessageStreamEvent_oneOf
{
public:
    MessageStreamEvent_oneOf();
    virtual ~MessageStreamEvent_oneOf() = default;


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

    bool operator==(const MessageStreamEvent_oneOf& rhs) const;
    bool operator!=(const MessageStreamEvent_oneOf& rhs) const;

    /////////////////////////////////////////////
    /// MessageStreamEvent_oneOf members

    /// <summary>
    /// 
    /// </summary>
    std::string getEvent() const;
    void setEvent(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::MessageObject getData() const;
    void setData(org::openapitools::server::model::MessageObject const& value);

    friend  void to_json(nlohmann::json& j, const MessageStreamEvent_oneOf& o);
    friend  void from_json(const nlohmann::json& j, MessageStreamEvent_oneOf& o);
protected:
    std::string m_Event;

    org::openapitools::server::model::MessageObject m_Data;

    
};

} // namespace org::openapitools::server::model

#endif /* MessageStreamEvent_oneOf_H_ */
