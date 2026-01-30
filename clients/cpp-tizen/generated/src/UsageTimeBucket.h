/*
 * UsageTimeBucket.h
 *
 * 
 */

#ifndef _UsageTimeBucket_H_
#define _UsageTimeBucket_H_


#include <string>
#include "UsageTimeBucket_result_inner.h"
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

class UsageTimeBucket : public Object {
public:
	/*! \brief Constructor.
	 */
	UsageTimeBucket();
	UsageTimeBucket(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UsageTimeBucket();

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
	int getStartTime();

	/*! \brief Set 
	 */
	void setStartTime(int  start_time);
	/*! \brief Get 
	 */
	int getEndTime();

	/*! \brief Set 
	 */
	void setEndTime(int  end_time);
	/*! \brief Get 
	 */
	std::list<UsageTimeBucket_result_inner> getResult();

	/*! \brief Set 
	 */
	void setResult(std::list <UsageTimeBucket_result_inner> result);

private:
	std::string object;
	int start_time;
	int end_time;
	std::list <UsageTimeBucket_result_inner>result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UsageTimeBucket_H_ */
