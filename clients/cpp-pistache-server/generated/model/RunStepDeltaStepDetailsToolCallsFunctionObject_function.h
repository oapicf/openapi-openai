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
 * RunStepDeltaStepDetailsToolCallsFunctionObject_function.h
 *
 * The definition of the function that was called.
 */

#ifndef RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_
#define RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// The definition of the function that was called.
/// </summary>
class  RunStepDeltaStepDetailsToolCallsFunctionObject_function
{
public:
    RunStepDeltaStepDetailsToolCallsFunctionObject_function();
    virtual ~RunStepDeltaStepDetailsToolCallsFunctionObject_function() = default;


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

    bool operator==(const RunStepDeltaStepDetailsToolCallsFunctionObject_function& rhs) const;
    bool operator!=(const RunStepDeltaStepDetailsToolCallsFunctionObject_function& rhs) const;

    /////////////////////////////////////////////
    /// RunStepDeltaStepDetailsToolCallsFunctionObject_function members

    /// <summary>
    /// The name of the function.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// The arguments passed to the function.
    /// </summary>
    std::string getArguments() const;
    void setArguments(std::string const& value);
    bool argumentsIsSet() const;
    void unsetArguments();
    /// <summary>
    /// The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
    /// </summary>
    std::string getOutput() const;
    void setOutput(std::string const& value);
    bool outputIsSet() const;
    void unsetOutput();

    friend  void to_json(nlohmann::json& j, const RunStepDeltaStepDetailsToolCallsFunctionObject_function& o);
    friend  void from_json(const nlohmann::json& j, RunStepDeltaStepDetailsToolCallsFunctionObject_function& o);
protected:
    std::string m_Name;
    bool m_NameIsSet;
    std::string m_Arguments;
    bool m_ArgumentsIsSet;
    std::string m_Output;
    bool m_OutputIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_ */
