
/*
 * ListPaginatedFineTuningJobsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ListPaginatedFineTuningJobsResponse_H_
#define TINY_CPP_CLIENT_ListPaginatedFineTuningJobsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FineTuningJob.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ListPaginatedFineTuningJobsResponse{
public:

    /*! \brief Constructor.
	 */
    ListPaginatedFineTuningJobsResponse();
    ListPaginatedFineTuningJobsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ListPaginatedFineTuningJobsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<FineTuningJob> getData();

	/*! \brief Set 
	 */
	void setData(std::list <FineTuningJob> data);
	/*! \brief Get 
	 */
	bool isHasMore();

	/*! \brief Set 
	 */
	void setHasMore(bool  has_more);
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);


    private:
    std::list<FineTuningJob> data;
    bool has_more{};
    std::string object{};
};
}

#endif /* TINY_CPP_CLIENT_ListPaginatedFineTuningJobsResponse_H_ */
