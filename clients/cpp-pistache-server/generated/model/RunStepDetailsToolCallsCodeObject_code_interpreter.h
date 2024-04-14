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
 * RunStepDetailsToolCallsCodeObject_code_interpreter.h
 *
 * The Code Interpreter tool call definition.
 */

#ifndef RunStepDetailsToolCallsCodeObject_code_interpreter_H_
#define RunStepDetailsToolCallsCodeObject_code_interpreter_H_


#include <string>
#include "RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// The Code Interpreter tool call definition.
/// </summary>
class  RunStepDetailsToolCallsCodeObject_code_interpreter
{
public:
    RunStepDetailsToolCallsCodeObject_code_interpreter();
    virtual ~RunStepDetailsToolCallsCodeObject_code_interpreter() = default;


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

    bool operator==(const RunStepDetailsToolCallsCodeObject_code_interpreter& rhs) const;
    bool operator!=(const RunStepDetailsToolCallsCodeObject_code_interpreter& rhs) const;

    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsCodeObject_code_interpreter members

    /// <summary>
    /// The input to the Code Interpreter tool call.
    /// </summary>
    std::string getInput() const;
    void setInput(std::string const& value);
    /// <summary>
    /// The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type.
    /// </summary>
    std::vector<org::openapitools::server::model::RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> getOutputs() const;
    void setOutputs(std::vector<org::openapitools::server::model::RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> const& value);

    friend  void to_json(nlohmann::json& j, const RunStepDetailsToolCallsCodeObject_code_interpreter& o);
    friend  void from_json(const nlohmann::json& j, RunStepDetailsToolCallsCodeObject_code_interpreter& o);
protected:
    std::string m_Input;

    std::vector<org::openapitools::server::model::RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> m_Outputs;

    
};

} // namespace org::openapitools::server::model

#endif /* RunStepDetailsToolCallsCodeObject_code_interpreter_H_ */
