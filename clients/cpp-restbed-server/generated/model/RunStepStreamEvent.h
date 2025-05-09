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
 * RunStepStreamEvent.h
 *
 * 
 */

#ifndef RunStepStreamEvent_H_
#define RunStepStreamEvent_H_



#include "RunStepObject.h"
#include "RunStepStreamEvent_oneOf_3.h"
#include "RunStepStreamEvent_oneOf_1.h"
#include "RunStepStreamEvent_oneOf_2.h"
#include "RunStepStreamEvent_oneOf_4.h"
#include "RunStepStreamEvent_oneOf_5.h"
#include <string>
#include "RunStepStreamEvent_oneOf_6.h"
#include "RunStepStreamEvent_oneOf.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "RunStepStreamEvent_oneOf.h"
#include "RunStepStreamEvent_oneOf_1.h"
#include "RunStepStreamEvent_oneOf_2.h"
#include "RunStepStreamEvent_oneOf_3.h"
#include "RunStepStreamEvent_oneOf_4.h"
#include "RunStepStreamEvent_oneOf_5.h"
#include "RunStepStreamEvent_oneOf_6.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  RunStepStreamEvent : public RunStepStreamEvent_oneOf, public RunStepStreamEvent_oneOf_1, public RunStepStreamEvent_oneOf_2, public RunStepStreamEvent_oneOf_3, public RunStepStreamEvent_oneOf_4, public RunStepStreamEvent_oneOf_5, public RunStepStreamEvent_oneOf_6
{
public:
    RunStepStreamEvent() = default;
    explicit RunStepStreamEvent(boost::property_tree::ptree const& pt);
    virtual ~RunStepStreamEvent() = default;

    RunStepStreamEvent(const RunStepStreamEvent& other) = default; // copy constructor
    RunStepStreamEvent(RunStepStreamEvent&& other) noexcept = default; // move constructor

    RunStepStreamEvent& operator=(const RunStepStreamEvent& other) = default; // copy assignment
    RunStepStreamEvent& operator=(RunStepStreamEvent&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepStreamEvent members

    /// <summary>
    /// 
    /// </summary>
    std::string getEvent() const;
    void setEvent(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunStepObject getData() const;
    void setData(RunStepObject value);

protected:
    std::string m_Event = "";
    RunStepObject m_Data;
};

std::vector<RunStepStreamEvent> createRunStepStreamEventVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepStreamEvent>(const RunStepStreamEvent& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepStreamEvent fromPt<RunStepStreamEvent>(const boost::property_tree::ptree& pt) {
    RunStepStreamEvent ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepStreamEvent_H_ */
