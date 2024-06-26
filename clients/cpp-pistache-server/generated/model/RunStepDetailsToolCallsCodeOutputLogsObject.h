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
 * RunStepDetailsToolCallsCodeOutputLogsObject.h
 *
 * Text output from the Code Interpreter tool call as part of a run step.
 */

#ifndef RunStepDetailsToolCallsCodeOutputLogsObject_H_
#define RunStepDetailsToolCallsCodeOutputLogsObject_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Text output from the Code Interpreter tool call as part of a run step.
/// </summary>
class  RunStepDetailsToolCallsCodeOutputLogsObject
{
public:
    RunStepDetailsToolCallsCodeOutputLogsObject();
    virtual ~RunStepDetailsToolCallsCodeOutputLogsObject() = default;


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

    bool operator==(const RunStepDetailsToolCallsCodeOutputLogsObject& rhs) const;
    bool operator!=(const RunStepDetailsToolCallsCodeOutputLogsObject& rhs) const;

    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsCodeOutputLogsObject members

    /// <summary>
    /// Always &#x60;logs&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    /// <summary>
    /// The text output from the Code Interpreter tool call.
    /// </summary>
    std::string getLogs() const;
    void setLogs(std::string const& value);

    friend  void to_json(nlohmann::json& j, const RunStepDetailsToolCallsCodeOutputLogsObject& o);
    friend  void from_json(const nlohmann::json& j, RunStepDetailsToolCallsCodeOutputLogsObject& o);
protected:
    std::string m_Type;

    std::string m_Logs;

    
};

} // namespace org::openapitools::server::model

#endif /* RunStepDetailsToolCallsCodeOutputLogsObject_H_ */
