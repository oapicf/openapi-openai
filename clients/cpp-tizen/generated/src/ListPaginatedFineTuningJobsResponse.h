/*
 * ListPaginatedFineTuningJobsResponse.h
 *
 * 
 */

#ifndef _ListPaginatedFineTuningJobsResponse_H_
#define _ListPaginatedFineTuningJobsResponse_H_


#include <string>
#include "FineTuningJob.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ListPaginatedFineTuningJobsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ListPaginatedFineTuningJobsResponse();
	ListPaginatedFineTuningJobsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ListPaginatedFineTuningJobsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<FineTuningJob> getData();

	/*! \brief Set 
	 */
	void setData(std::list <FineTuningJob> data);
	/*! \brief Get 
	 */
	bool getHasMore();

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
	std::list <FineTuningJob>data;
	bool has_more;
	std::string object;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ListPaginatedFineTuningJobsResponse_H_ */
