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
 * ListPaginatedFineTuningJobsResponse.h
 *
 * 
 */

#ifndef ListPaginatedFineTuningJobsResponse_H_
#define ListPaginatedFineTuningJobsResponse_H_



#include "FineTuningJob.h"
#include <string>
#include <vector>
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
/// 
/// </summary>
class  ListPaginatedFineTuningJobsResponse 
{
public:
    ListPaginatedFineTuningJobsResponse() = default;
    explicit ListPaginatedFineTuningJobsResponse(boost::property_tree::ptree const& pt);
    virtual ~ListPaginatedFineTuningJobsResponse() = default;

    ListPaginatedFineTuningJobsResponse(const ListPaginatedFineTuningJobsResponse& other) = default; // copy constructor
    ListPaginatedFineTuningJobsResponse(ListPaginatedFineTuningJobsResponse&& other) noexcept = default; // move constructor

    ListPaginatedFineTuningJobsResponse& operator=(const ListPaginatedFineTuningJobsResponse& other) = default; // copy assignment
    ListPaginatedFineTuningJobsResponse& operator=(ListPaginatedFineTuningJobsResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ListPaginatedFineTuningJobsResponse members

    /// <summary>
    /// 
    /// </summary>
    std::vector<FineTuningJob> getData() const;
    void setData(std::vector<FineTuningJob> value);

    /// <summary>
    /// 
    /// </summary>
    bool isHasMore() const;
    void setHasMore(bool value);

    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

protected:
    std::vector<FineTuningJob> m_Data;
    bool m_Has_more = false;
    std::string m_object = "";
};

std::vector<ListPaginatedFineTuningJobsResponse> createListPaginatedFineTuningJobsResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ListPaginatedFineTuningJobsResponse>(const ListPaginatedFineTuningJobsResponse& val) {
    return val.toPropertyTree();
}

template<>
inline ListPaginatedFineTuningJobsResponse fromPt<ListPaginatedFineTuningJobsResponse>(const boost::property_tree::ptree& pt) {
    ListPaginatedFineTuningJobsResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ListPaginatedFineTuningJobsResponse_H_ */
