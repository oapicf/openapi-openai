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
 * RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h
 *
 * 
 */

#ifndef RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_
#define RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_



#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h"
#include <string>
#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h"
#include "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.h"
#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner : public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject, public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
{
public:
    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner() = default;
    explicit RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(boost::property_tree::ptree const& pt);
    virtual ~RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner() = default;

    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(const RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner& other) = default; // copy constructor
    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner&& other) noexcept = default; // move constructor

    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner& operator=(const RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner& other) = default; // copy assignment
    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner& operator=(RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner members

    /// <summary>
    /// The index of the output in the outputs array.
    /// </summary>
    int32_t getIndex() const;
    void setIndex(int32_t value);

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
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image getImage() const;
    void setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image value);

protected:
    int32_t m_Index = 0;
    std::string m_Type = "";
    std::string m_Logs = "";
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image m_Image;
};

std::vector<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> createRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_innerVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>(const RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner fromPt<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>(const boost::property_tree::ptree& pt) {
    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_ */
