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
 * RunStepDetailsMessageCreationObject.h
 *
 * Details of the message creation by the run step.
 */

#ifndef RunStepDetailsMessageCreationObject_H_
#define RunStepDetailsMessageCreationObject_H_


#include "RunStepDetailsMessageCreationObject_message_creation.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Details of the message creation by the run step.
/// </summary>
class  RunStepDetailsMessageCreationObject
{
public:
    RunStepDetailsMessageCreationObject();
    virtual ~RunStepDetailsMessageCreationObject() = default;


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

    bool operator==(const RunStepDetailsMessageCreationObject& rhs) const;
    bool operator!=(const RunStepDetailsMessageCreationObject& rhs) const;

    /////////////////////////////////////////////
    /// RunStepDetailsMessageCreationObject members

    /// <summary>
    /// Always &#x60;message_creation&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RunStepDetailsMessageCreationObject_message_creation getMessageCreation() const;
    void setMessageCreation(org::openapitools::server::model::RunStepDetailsMessageCreationObject_message_creation const& value);

    friend  void to_json(nlohmann::json& j, const RunStepDetailsMessageCreationObject& o);
    friend  void from_json(const nlohmann::json& j, RunStepDetailsMessageCreationObject& o);
protected:
    std::string m_Type;

    org::openapitools::server::model::RunStepDetailsMessageCreationObject_message_creation m_Message_creation;

    
};

} // namespace org::openapitools::server::model

#endif /* RunStepDetailsMessageCreationObject_H_ */