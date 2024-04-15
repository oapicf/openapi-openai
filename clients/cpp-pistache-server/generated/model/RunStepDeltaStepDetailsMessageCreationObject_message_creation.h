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
 * RunStepDeltaStepDetailsMessageCreationObject_message_creation.h
 *
 * 
 */

#ifndef RunStepDeltaStepDetailsMessageCreationObject_message_creation_H_
#define RunStepDeltaStepDetailsMessageCreationObject_message_creation_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  RunStepDeltaStepDetailsMessageCreationObject_message_creation
{
public:
    RunStepDeltaStepDetailsMessageCreationObject_message_creation();
    virtual ~RunStepDeltaStepDetailsMessageCreationObject_message_creation() = default;


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

    bool operator==(const RunStepDeltaStepDetailsMessageCreationObject_message_creation& rhs) const;
    bool operator!=(const RunStepDeltaStepDetailsMessageCreationObject_message_creation& rhs) const;

    /////////////////////////////////////////////
    /// RunStepDeltaStepDetailsMessageCreationObject_message_creation members

    /// <summary>
    /// The ID of the message that was created by this run step.
    /// </summary>
    std::string getMessageId() const;
    void setMessageId(std::string const& value);
    bool messageIdIsSet() const;
    void unsetMessage_id();

    friend  void to_json(nlohmann::json& j, const RunStepDeltaStepDetailsMessageCreationObject_message_creation& o);
    friend  void from_json(const nlohmann::json& j, RunStepDeltaStepDetailsMessageCreationObject_message_creation& o);
protected:
    std::string m_Message_id;
    bool m_Message_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* RunStepDeltaStepDetailsMessageCreationObject_message_creation_H_ */