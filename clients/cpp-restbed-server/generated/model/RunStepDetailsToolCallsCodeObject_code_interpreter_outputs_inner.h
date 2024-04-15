/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h
 *
 * 
 */

#ifndef RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_
#define RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_



#include "RunStepDetailsToolCallsCodeOutputImageObject_image.h"
#include <string>
#include "RunStepDetailsToolCallsCodeOutputLogsObject.h"
#include "RunStepDetailsToolCallsCodeOutputImageObject.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "RunStepDetailsToolCallsCodeOutputLogsObject.h"
#include "RunStepDetailsToolCallsCodeOutputImageObject.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner : public RunStepDetailsToolCallsCodeOutputLogsObject, public RunStepDetailsToolCallsCodeOutputImageObject
{
public:
    RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner() = default;
    explicit RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(boost::property_tree::ptree const& pt);
    virtual ~RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner() = default;

    RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(const RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner& other) = default; // copy constructor
    RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner&& other) noexcept = default; // move constructor

    RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner& operator=(const RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner& other) = default; // copy assignment
    RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner& operator=(RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner members

    /// <summary>
    /// Always &#x60;logs&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// The text output from the Code Interpreter tool call.
    /// </summary>
    std::string getLogs() const;
    void setLogs(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunStepDetailsToolCallsCodeOutputImageObject_image getImage() const;
    void setImage(RunStepDetailsToolCallsCodeOutputImageObject_image value);

protected:
    std::string m_Type = "";
    std::string m_Logs = "";
    RunStepDetailsToolCallsCodeOutputImageObject_image m_Image;
};

std::vector<RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> createRunStepDetailsToolCallsCodeObject_code_interpreter_outputs_innerVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>(const RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner fromPt<RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>(const boost::property_tree::ptree& pt) {
    RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_ */