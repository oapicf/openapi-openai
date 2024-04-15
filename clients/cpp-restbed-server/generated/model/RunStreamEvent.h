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
 * RunStreamEvent.h
 *
 * 
 */

#ifndef RunStreamEvent_H_
#define RunStreamEvent_H_



#include "RunStreamEvent_oneOf_3.h"
#include "RunStreamEvent_oneOf.h"
#include <string>
#include "RunStreamEvent_oneOf_8.h"
#include "RunObject.h"
#include "RunStreamEvent_oneOf_6.h"
#include "RunStreamEvent_oneOf_1.h"
#include "RunStreamEvent_oneOf_2.h"
#include "RunStreamEvent_oneOf_7.h"
#include "RunStreamEvent_oneOf_4.h"
#include "RunStreamEvent_oneOf_5.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "RunStreamEvent_oneOf.h"
#include "RunStreamEvent_oneOf_1.h"
#include "RunStreamEvent_oneOf_2.h"
#include "RunStreamEvent_oneOf_3.h"
#include "RunStreamEvent_oneOf_4.h"
#include "RunStreamEvent_oneOf_5.h"
#include "RunStreamEvent_oneOf_6.h"
#include "RunStreamEvent_oneOf_7.h"
#include "RunStreamEvent_oneOf_8.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  RunStreamEvent : public RunStreamEvent_oneOf, public RunStreamEvent_oneOf_1, public RunStreamEvent_oneOf_2, public RunStreamEvent_oneOf_3, public RunStreamEvent_oneOf_4, public RunStreamEvent_oneOf_5, public RunStreamEvent_oneOf_6, public RunStreamEvent_oneOf_7, public RunStreamEvent_oneOf_8
{
public:
    RunStreamEvent() = default;
    explicit RunStreamEvent(boost::property_tree::ptree const& pt);
    virtual ~RunStreamEvent() = default;

    RunStreamEvent(const RunStreamEvent& other) = default; // copy constructor
    RunStreamEvent(RunStreamEvent&& other) noexcept = default; // move constructor

    RunStreamEvent& operator=(const RunStreamEvent& other) = default; // copy assignment
    RunStreamEvent& operator=(RunStreamEvent&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStreamEvent members

    /// <summary>
    /// 
    /// </summary>
    std::string getEvent() const;
    void setEvent(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunObject getData() const;
    void setData(RunObject value);

protected:
    std::string m_Event = "";
    RunObject m_Data;
};

std::vector<RunStreamEvent> createRunStreamEventVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStreamEvent>(const RunStreamEvent& val) {
    return val.toPropertyTree();
}

template<>
inline RunStreamEvent fromPt<RunStreamEvent>(const boost::property_tree::ptree& pt) {
    RunStreamEvent ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStreamEvent_H_ */