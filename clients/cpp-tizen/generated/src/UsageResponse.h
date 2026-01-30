/*
 * UsageResponse.h
 *
 * 
 */

#ifndef _UsageResponse_H_
#define _UsageResponse_H_


#include <string>
#include "UsageTimeBucket.h"
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

class UsageResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	UsageResponse();
	UsageResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UsageResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::list<UsageTimeBucket> getData();

	/*! \brief Set 
	 */
	void setData(std::list <UsageTimeBucket> data);
	/*! \brief Get 
	 */
	bool getHasMore();

	/*! \brief Set 
	 */
	void setHasMore(bool  has_more);
	/*! \brief Get 
	 */
	std::string getNextPage();

	/*! \brief Set 
	 */
	void setNextPage(std::string  next_page);

private:
	std::string object;
	std::list <UsageTimeBucket>data;
	bool has_more;
	std::string next_page;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UsageResponse_H_ */
