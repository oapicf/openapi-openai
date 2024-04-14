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
 * RunStepDeltaObject_delta.h
 *
 * The delta containing the fields that have changed on the run step.
 */

#ifndef RunStepDeltaObject_delta_H_
#define RunStepDeltaObject_delta_H_



#include "RunStepDeltaObject_delta_step_details.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// The delta containing the fields that have changed on the run step.
/// </summary>
class  RunStepDeltaObject_delta 
{
public:
    RunStepDeltaObject_delta() = default;
    explicit RunStepDeltaObject_delta(boost::property_tree::ptree const& pt);
    virtual ~RunStepDeltaObject_delta() = default;

    RunStepDeltaObject_delta(const RunStepDeltaObject_delta& other) = default; // copy constructor
    RunStepDeltaObject_delta(RunStepDeltaObject_delta&& other) noexcept = default; // move constructor

    RunStepDeltaObject_delta& operator=(const RunStepDeltaObject_delta& other) = default; // copy assignment
    RunStepDeltaObject_delta& operator=(RunStepDeltaObject_delta&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepDeltaObject_delta members

    /// <summary>
    /// 
    /// </summary>
    RunStepDeltaObject_delta_step_details getStepDetails() const;
    void setStepDetails(RunStepDeltaObject_delta_step_details value);

protected:
    RunStepDeltaObject_delta_step_details m_Step_details;
};

std::vector<RunStepDeltaObject_delta> createRunStepDeltaObject_deltaVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepDeltaObject_delta>(const RunStepDeltaObject_delta& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepDeltaObject_delta fromPt<RunStepDeltaObject_delta>(const boost::property_tree::ptree& pt) {
    RunStepDeltaObject_delta ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepDeltaObject_delta_H_ */
