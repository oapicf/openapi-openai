/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * RunStepStreamEvent_oneOf_2.h
 *
 * Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
 */

#ifndef RunStepStreamEvent_oneOf_2_H_
#define RunStepStreamEvent_oneOf_2_H_



#include <string>
#include "RunStepDeltaObject.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
/// </summary>
class  RunStepStreamEvent_oneOf_2 
{
public:
    RunStepStreamEvent_oneOf_2() = default;
    explicit RunStepStreamEvent_oneOf_2(boost::property_tree::ptree const& pt);
    virtual ~RunStepStreamEvent_oneOf_2() = default;

    RunStepStreamEvent_oneOf_2(const RunStepStreamEvent_oneOf_2& other) = default; // copy constructor
    RunStepStreamEvent_oneOf_2(RunStepStreamEvent_oneOf_2&& other) noexcept = default; // move constructor

    RunStepStreamEvent_oneOf_2& operator=(const RunStepStreamEvent_oneOf_2& other) = default; // copy assignment
    RunStepStreamEvent_oneOf_2& operator=(RunStepStreamEvent_oneOf_2&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepStreamEvent_oneOf_2 members

    /// <summary>
    /// 
    /// </summary>
    std::string getEvent() const;
    void setEvent(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunStepDeltaObject getData() const;
    void setData(RunStepDeltaObject value);

protected:
    std::string m_Event = "";
    RunStepDeltaObject m_Data;
};

std::vector<RunStepStreamEvent_oneOf_2> createRunStepStreamEvent_oneOf_2VectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepStreamEvent_oneOf_2>(const RunStepStreamEvent_oneOf_2& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepStreamEvent_oneOf_2 fromPt<RunStepStreamEvent_oneOf_2>(const boost::property_tree::ptree& pt) {
    RunStepStreamEvent_oneOf_2 ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepStreamEvent_oneOf_2_H_ */
